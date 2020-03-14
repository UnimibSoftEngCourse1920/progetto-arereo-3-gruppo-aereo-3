package dataManagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import controller.Controller;
import dominio.Prenotazione;
import dominio.Volo;

public class GestioneVoloDatabase extends GestioneDatabase {
	private static Log logger=LogFactory.getLog(GestioneAeroportoDatabase.class);

	
	public static List <Volo> getListaVoliDisponibili(){
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Volo> voli = query.getResultList();
		
			
		return voli;
	}
	
	public static Volo getVolo(int idVolo) {
		String jpqlVolo = "SELECT v FROM Volo as v WHERE v.idVolo=:idVolo";
		Query queryVolo = entityManager.createQuery(jpqlVolo);
		queryVolo.setParameter("idVolo", idVolo);
		@SuppressWarnings("unchecked")
		List <Volo> v = queryVolo.getResultList();
		return v.get(0);
	}
	
	public static List<String> getDestinazioniDisponibili(){
				
	
		String jpql = "SELECT DISTINCT a.denominazione FROM Volo v, Aeroporto a WHERE v.destinazione=a.idAeroporto ";
		Query query = entityManager.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<String> destinazioni = query.getResultList();
		System.out.println(destinazioni);
		return destinazioni;
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> getPartenzeDisponibili(){
		
		
		String jpql = "SELECT DISTINCT a.denominazione FROM Volo v, Aeroporto a WHERE v.partenza=a.idAeroporto ";
		Query query = entityManager.createQuery(jpql);
		List<String> partenze = query.getResultList();
		
		System.out.println(partenze);
		return partenze;
	}
	
	
	
	public static List<Volo> getListInfo(Volo volo){
		
		List<Volo> listaVoli=getListaVoliDisponibili();
		List<String> listaPartenze=getPartenzeDisponibili();
		List<String> listaDestinazioni=getDestinazioniDisponibili();
		List<Volo> listaInfoVoli=new ArrayList<Volo>();

		DateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy");
		outputFormatter.setTimeZone(TimeZone.getTimeZone("GMT"));

		String datapartenza2 = outputFormatter.format(volo.getDataPartenza());
		String dataarrivo2 = outputFormatter.format(volo.getDataArrivo());

		
		for(Volo v: listaVoli) {
			
			String datapartenza1 = outputFormatter.format(v.getDataPartenza());
			String dataarrivo1= outputFormatter.format(v.getDataArrivo());
			if(datapartenza1.equals(datapartenza2) && dataarrivo1.equals(dataarrivo2))
				if(v.getDestinazione().equals(volo.getDestinazione()))
					if(v.getDestinazione().contentEquals(volo.getDestinazione()))
						listaInfoVoli.add(v);
		}
		
		return listaInfoVoli;
		
	}

	public static void insertVolo(Volo volo, String oraPartenza, String minutiPartenza, String oraArrivo, String minutiArrivo) {	
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		dataFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		StringBuilder data= new StringBuilder();

		String dataPartenza= dataFormat.format(volo.getDataPartenza());
		data.append(dataPartenza.substring(0,11)).append(oraPartenza).append(":").append(minutiPartenza);
		Date nuovaDataP=null;
		try {
			nuovaDataP = dataFormat.parse(data.toString());
		} catch (ParseException e) {
			logger.error(e);
		}
		volo.setDataPartenza(nuovaDataP);
		data= new StringBuilder();
		
		String dataArrivo= dataFormat.format(volo.getDataArrivo());
		data.append(dataArrivo.substring(0,11)).append(oraArrivo).append(":").append(minutiArrivo);
		Date nuovaDataA=null;
		
		try {
			nuovaDataA = dataFormat.parse(data.toString());
		} catch (ParseException e) {
			logger.error(e);
		}
		volo.setDataArrivo(nuovaDataA);
		
		String  denominazione= GestioneAeroportoDatabase.parserCodiceAeroporto(volo.getDestinazione());
		volo.setDestinazione(denominazione);
		denominazione=GestioneAeroportoDatabase.parserCodiceAeroporto(volo.getPartenza());
		volo.setPartenza(denominazione);
		
		
		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();
		
		entityManager.persist(volo);
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	
	public static Volo getVoloDiPrenotazione(Prenotazione prenotazione) {
		String jpql="SELECT v FROM Volo as v, Prenotazione as p WHERE v.idVolo=p.idVolo";
		Query query=entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Volo> volo=query.getResultList();
		return volo.get(0);
				
	}


	public static List<Volo> getListaVoliAndata(Date dataPartenza, String partenza, String destinazione ){
		List <Volo> lista = getVoloPartenzaDestinazione(partenza, destinazione);
					
		
		List <Volo> risultato=new ArrayList<Volo>();
//		Date dataP=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yy");
		SimpleDateFormat dTFormat=new SimpleDateFormat(" HH:mm");
//		dTFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

		String dataPartenzaDaPrenotare= dateFormat.format(dataPartenza);
		for(Volo volo: lista) {
			String dataDaConfrontare=dateFormat.format(volo.getDataPartenza());
			
			if(dataDaConfrontare.equalsIgnoreCase(dataPartenzaDaPrenotare)) {

			risultato.add(volo);
			}
			System.out.println(volo.toString());
		}

		return risultato;
		
		
	}	
	
		public static List<Volo> getVoloPartenzaDestinazione(String partenza, String destinazione) {
			String jpqlDestinazione = "SELECT v FROM Volo as v, Aeroporto as a WHERE  v.destinazione=a.idAeroporto and a.denominazione=:destinazione";
			String jpqlPartenza="SELECT v FROM Volo as v, Aeroporto as a WHERE v.partenza=a.idAeroporto and a.denominazione=:partenza";
			Query queryDestinazione = entityManager.createQuery(jpqlDestinazione);
			Query queryPartenza= entityManager.createQuery(jpqlPartenza);
			queryPartenza.setParameter("partenza", partenza);
			queryDestinazione.setParameter("destinazione", destinazione);
			
			
			@SuppressWarnings("unchecked")
			List<Volo> listaVoli1=queryDestinazione.getResultList();
			@SuppressWarnings("unchecked")
			List<Volo> listaVoli2=queryPartenza.getResultList();
			List <Volo> lista=new ArrayList<Volo>();

			for(Volo v: listaVoli1)
				for(Volo v1:listaVoli2)
					if(v1.getIdVolo()==v.getIdVolo())
						lista.add(v);
			System.out.println(lista);
			return lista;
		}
		
		
		public static String convertiData(Date data) {
			SimpleDateFormat dtFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm");
			dtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
			String dataStringa= dtFormat.format(data);
			return dataStringa;
		}



	
}


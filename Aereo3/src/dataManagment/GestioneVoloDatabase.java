package dataManagment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Query;
import javax.xml.crypto.Data;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dominio.Prenotazione;
import dominio.Volo;

public class GestioneVoloDatabase extends GestioneDatabase {
	
//Clark: Per debug
//	public static void main(String [] args) throws ParseException	{
//		Volo volo=new Volo();
//		SimpleDateFormat dateformat2= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		 String strdate2 = "11-03-2020 12:00:00";
//		 String ritorno="11-03-2020 12:40:00";
//		volo.setDataPartenza(dateformat2.parse(strdate2));
//		volo.setDataArrivo(dateformat2.parse(ritorno));
//		volo.setGate("B3");	
//		volo.setDestinazione("BS75");
//		volo.setPartenza("MI95");
//		volo.setNumeroPosti(5);
//		volo.setPromo(null);
//		List <String> orari =getOrariPartenzaVolo(volo);
//		for(String o: orari)
//			System.out.println(o);
//		
//	}
	
	
	public static List <Volo> getListaVoliDisponibili(){
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		List<Volo> voli = query.getResultList();
		return voli;
	}
	
	
	public static Volo getVolo(int idVolo) {
		String jpqlVolo = "SELECT v FROM Volo as v WHERE v.idVolo=:idVolo";
		Query queryVolo = entityManager.createQuery(jpqlVolo);
		queryVolo.setParameter("idVolo", idVolo);
		List <Volo> v = queryVolo.getResultList();
		return v.get(0);
	}
	
	
	public static List<String> getDestinazioniDisponibili(){
				
	
		String jpql = "SELECT DISTINCT a.denominazione FROM Volo v, Aereoporto a WHERE v.destinazione=a.idAereoporto ";
		Query query = entityManager.createQuery(jpql);

		List<String> destinazioni = query.getResultList();
		System.out.println(destinazioni);
		return destinazioni;
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> getPartenzeDisponibili(){
		
		
		String jpql = "SELECT DISTINCT a.denominazione FROM Volo v, Aereoporto a WHERE v.partenza=a.idAereoporto ";
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

		String datapartenza2 = outputFormatter.format(volo.getDataPartenza());
		String dataarrivo2 = outputFormatter.format(volo.getDataArrivo());

		
		for(Volo v: listaVoli) {
			
			String datapartenza1 = outputFormatter.format(v.getDataPartenza());
			String dataarrivo1= outputFormatter.format(v.getDataArrivo());
			if(datapartenza1.equals(datapartenza2) && dataarrivo1.equals(dataarrivo2))
				if(v.getDestinazione().equals(volo.getDestinazione()))
					if(v.getDestinazione().contentEquals(volo.getDestinazione()))
						listaInfoVoli.add(v);
//			{
//				listaPartenze.add(v.getPartenza());
//				listaDestinazioni.add(v.getDestinazione());
//			}
		}
		
		return listaInfoVoli;
		
	}
	
	private static Log logger=LogFactory.getLog(GestioneAereoportoDatabase.class);

	
	public static void insertVolo(Volo volo, String oraPartenza, String minutiPartenza, String oraArrivo,
			String minutiArrivo) {	
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
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
		
		String  denominazione= GestioneAereoportoDatabase.parserCodiceAereoporto(volo.getDestinazione());
		volo.setDestinazione(denominazione);
		denominazione=GestioneAereoportoDatabase.parserCodiceAereoporto(volo.getPartenza());
		volo.setPartenza(denominazione);
		
		
		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();
		
		entityManager.persist(volo);
		entityManager.getTransaction().commit();
		entityManager.clear();

//		entityManager.getTransaction().rollback();
	}
	
	
	public static Volo getVoloDiPrenotazione(Prenotazione prenotazione) {
		String jpql="SELECT v FROM Volo as v, Prenotazione as p WHERE v.idVolo=p.idVolo";
		Query query=entityManager.createQuery(jpql);
		List<Volo> volo=query.getResultList();
		return volo.get(0);
				
	}

	//Clark: Se vuoi i voli di ritorno dai al contrario i parametri.
	public static List<Volo> getListaVoliAndata(Date dataPartenza, String partenza, String destinazione ){
		String jpqlDestinazione = "SELECT v FROM Volo as v, Aereoporto as a WHERE  v.destinazione=a.idAereoporto and a.denominazione=:destinazione";
		String jpqlPartenza="SELECT v FROM Volo as v, Aereoporto as a WHERE v.partenza=a.idAereoporto and a.denominazione=:partenza";
		Query queryDestinazione = entityManager.createQuery(jpqlDestinazione);
		Query queryPartenza= entityManager.createQuery(jpqlPartenza);
		queryPartenza.setParameter("partenza", partenza);
		queryDestinazione.setParameter("destinazione", destinazione);
		
		
		@SuppressWarnings("unchecked")
		List<Volo> listaVoli1=queryDestinazione.getResultList();
		List<Volo> listaVoli2=queryPartenza.getResultList();
		List <Volo> lista=new ArrayList<Volo>();

		for(Volo v: listaVoli1)
			for(Volo v1:listaVoli2)
				if(v1.getIdVolo()==v.getIdVolo())
					lista.add(v);
					
		
		List <Volo> risultato=new ArrayList<Volo>();
		Date dataP=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh:mm");
		String dataPartenzaDaPrenotare= dateformat.format(dataPartenza).substring(0, 8);
		for(Volo volo: lista) {
			String dataDaConfrontare=dateformat.format(volo.getDataPartenza()).substring(0, 8);
			if(dataDaConfrontare.equalsIgnoreCase(dataPartenzaDaPrenotare))
				risultato.add(volo);
			System.out.println(volo.toString());
		}
		
		return risultato;
		
		
	}
	
	
	
	
	
	
//	
//	static SimpleDateFormat dFormat= new SimpleDateFormat ("dd-MM-yyyy");
//	static SimpleDateFormat tFormat= new SimpleDateFormat("HH:mm");
//	
//	public static List <String> getOrariPartenzaVolo(Volo volo){
//		
//	String jpql="SELECT v.dataPartenza FROM Volo as v  WHERE v.partenza=:partenza AND v.destinazione=:destinazione";
//	Query query=entityManager.createQuery(jpql);
//	query.setParameter("partenza", volo.getPartenza());
//	query.setParameter("destinazione", volo.getDestinazione());
//	 tFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//
//	List <Date> listaDateDaParsare=query.getResultList();
//	
//
//	List<String> listaOrari= new ArrayList<String>();
//	for (Date d:listaDateDaParsare) {
//		String data= dFormat.format(d);
//		if(dFormat.format(volo.getDataPartenza()).equals(data));
//			listaOrari.add(tFormat.format(d));
//	}
//	
//	return listaOrari;
//		
//	}
//	
//	public static List <String> getOrariArrivoVolo(Volo volo){
//		
//	String jpql="SELECT v.dataArrivo FROM Volo as v  WHERE v.partenza=:partenza AND v.destinazione=:destinazione";
//	Query query=entityManager.createQuery(jpql);
//	query.setParameter("partenza", volo.getPartenza());
//	query.setParameter("destinazione", volo.getDestinazione());
//	
//	List <Date> listaDateDaParsare=query.getResultList();
//
//	tFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
//
//	List<String> listaOrari= new ArrayList<String>();
//	for (Date d:listaDateDaParsare) {
//		String data= dFormat.format(d);
//		if(dFormat.format(volo.getDataArrivo()).equals(data));
//			listaOrari.add(tFormat.format(d));
//	}
//	
//	return listaOrari;
//		
//	}
	
	
}


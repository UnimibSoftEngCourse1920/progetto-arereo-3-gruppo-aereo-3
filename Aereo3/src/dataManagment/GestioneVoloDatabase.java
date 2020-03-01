package dataManagment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.xml.crypto.Data;

import dominio.Prenotazione;
import dominio.Volo;

public class GestioneVoloDatabase extends GestioneDatabase {
	
//Clark: Per debug
//	public static void main(String [] args)	{
//		SimpleDateFormat dateformat2= new SimpleDateFormat("dd-M-yyyy hh:mm");
//		 String strdate2 = "14-09-2021";
//	Date dataPartenza=null;
//	try {
//		dataPartenza = dateformat2.parse(strdate2);
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//
//	String	partenza="Aereoporto Napoli";
//	String	destinazione="Aereoporto Sofia";
//	
//		List<Volo>v= getListaVoliAndataORitorno(dataPartenza, partenza, destinazione);
//		System.out.println(v);
//		
//	}
//	
	
	public static List <Volo> getListaVoliDisponibili(){
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		List<Volo> voli = query.getResultList();
		return voli;
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
	
	
	//Parametro Volo senza mettere la data
	public static void insertVolo(Volo volo, String oraPartenza, String minutiPartenza, String oraArrivo,
			String minutiArrivo) {	
		
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
	public static List<Volo> getListaVoliAndataORitorno(Date dataPartenza, String partenza, String destinazione ){
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


	
	

	
	
}


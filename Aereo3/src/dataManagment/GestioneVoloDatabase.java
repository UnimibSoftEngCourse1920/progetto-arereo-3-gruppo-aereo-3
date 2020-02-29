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
//		 String strdate2 = "14-09-2021 8:00";
//	Date dataPartenza=null;
//	try {
//		dataPartenza = dateformat2.parse(strdate2);
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//
//	String	partenza="NA08";
//	String	destinazione="BS75";
//	
//		List<Volo>v= getListaVoliAndataORitorno(dataPartenza, partenza, destinazione);
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
	
	public static void insertVolo(Volo volo) {
		
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
		String jpql = "SELECT v FROM Volo as v WHERE  v.idVolo=a.idVolo and v.destinazione=:destinazione";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("partenza", partenza);
		query.setParameter("destinazione", destinazione);
		
		@SuppressWarnings("unchecked")
		List<Volo> listaVoliAndata=query.getResultList();
		
		List <Volo> risultato=new ArrayList<Volo>();
	
		Date dataP=new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh:mm");
		String dataPartenzaDaPrenotare= dateformat.format(dataPartenza).substring(0, 8);
		for(Volo volo: listaVoliAndata) {
			String dataDaConfrontare=dateformat.format(volo.getDataPartenza()).substring(0, 8);
			if(dataDaConfrontare.equalsIgnoreCase(dataPartenzaDaPrenotare))
				risultato.add(volo);
			System.out.println(volo.toString());
		}
		
		return listaVoliAndata;
		
		
	}
	
//	public static void cancellaVolo(Date dataPartenza) {
//		
//	}
	
	
	
}
	//Clark:DA USARE PER DEBUG

//	public static void main(String [] args) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestioneDB");
//		EntityManager entityManager = factory.createEntityManager();		
//		
//		String jpql = "SELECT v FROM Cliente as v";
//		Query query = entityManager.createQuery(jpql);
//		List<Cliente> clienti = query.getResultList();
//		System.out.println("Lista Clienti :");
//		for(Cliente c : clienti)
//		{
//			System.out.println(c.getCognome()+" "+c.getNome());
//		}
//	}


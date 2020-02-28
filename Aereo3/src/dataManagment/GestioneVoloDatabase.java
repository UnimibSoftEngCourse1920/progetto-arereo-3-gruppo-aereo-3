package dataManagment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import dominio.Volo;

public class GestioneVoloDatabase extends GestioneDatabase {
		

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
		return destinazioni;
	}
	
	public static List<String> getPartenzeDisponibili(){
		
		
		String jpql = "SELECT a.denominazione FROM Volo v, Aereoporto a WHERE v.partenza=a.idAereoporto ";
		Query query = entityManager.createQuery(jpql);
		List<String> partenze = query.getResultList();
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
		
		entityManager.getTransaction().begin();
		entityManager.persist(volo);
		entityManager.getTransaction().commit();
		entityManager.clear();

//		entityManager.getTransaction().rollback();
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
}

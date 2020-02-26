package dataManagment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Volo;

public class GestioneVoloDatabase {
		
	
	/*public List <Volo> getListaVoliDisponibili(){
		
//		List<Volo> listaVoli= new ArrayList<Volo>();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CilacapUnit");
		EntityManager entityManager = factory.createEntityManager();		
		
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		List<Volo> voli = query.getResultList();
		return voli;
	}*/
	
	//Clark:TEST LETTURA VOLI -> FUNZIONA
	
	public static void main(String [] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("GestioneDB");
		EntityManager entityManager = factory.createEntityManager();		
		
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		List<Volo> voli = query.getResultList();
		for (Volo v : voli)
			System.out.println(v.getPartenza());
	}
}

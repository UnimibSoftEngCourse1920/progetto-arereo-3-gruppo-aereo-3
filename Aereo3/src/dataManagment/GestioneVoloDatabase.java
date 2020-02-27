package dataManagment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Cliente;
import dominio.Volo;

public class GestioneVoloDatabase extends GestioneDatabase {
		
	
	public static List <Volo> getListaVoliDisponibili(){
				
	
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		List<Volo> voli = query.getResultList();
		return voli;
	}
	
	
	public static List<String> getDestinazioniDisponibili(){
				
	
		String jpql = "SELECT a.denominazione FROM Volo v, Aereoporto a WHERE v.destinazione=a.idAereoporto ";
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

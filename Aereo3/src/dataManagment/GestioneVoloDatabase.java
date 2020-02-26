package dataManagment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Cliente;
import dominio.Volo;

public class GestioneVoloDatabase {
		
	
	public static List <Volo> getListaVoliDisponibili(){
				
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CilacapUnit");
		EntityManager entityManager = factory.createEntityManager();		
		
		String jpql = "SELECT v FROM Volo as v ";
		Query query = entityManager.createQuery(jpql);
		List<Volo> voli = query.getResultList();
		return voli;
	}
	
	//Clark:TEST LETTURA VOLI -> FUNZIONA

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

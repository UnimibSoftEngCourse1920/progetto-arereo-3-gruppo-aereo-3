package dataManagment;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Cliente;

public class GestioneClienteDatabase extends GestioneDatabase {
	
	

//	public static void main(String [] args) {
//		
//        Cliente cliente = new Cliente();
//        cliente.setCodCliente("cod35");
//        cliente.setEmail("aaab@llfefe.com");
//        cliente.setCognome("ciccio");
//        LocalDate localDate = LocalDate.of(2016, 1, 1);
//        cliente.setDataDiNascita(localDate);
//        cliente.setIndirizzo("ciaociao");
//        cliente.setNome("alex");
//        //insertCliente(cliente);
//        boolean login = login("ale.fiore@example.com", "pwd123");
//		System.out.println("Login = "+login);
//	}
	
	public static void insertCliente(Cliente cliente)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
        entityManager.getTransaction().commit();
 
        entityManager.clear();
        System.out.println("Record Successfully Inserted In The Database");
	}
	
	public static boolean login(String email, String pwd)
	{
		String jpql = "SELECT c FROM Cliente as c where c.email=:email and c.password=:pwd";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("email", email);
        query.setParameter("pwd", pwd);
		List<Cliente> clienti = query.getResultList();
		if(clienti.size() == 1)
			return true;
		return false;
	}
	
	public static void signToLoyalty(Cliente cliente)
	{
		
	}
}

package dataManagment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import dominio.Cliente;
import dominio.ClienteFedele;

public class GestioneClienteDatabase extends GestioneDatabase {
	

	public static void main(String [] args) {
		ArrayList<Cliente> clienti = new ArrayList<Cliente>();
		
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente.setEmail("test322@llfefe.com");
        cliente.setCognome("ciccio");
        LocalDate localDate = LocalDate.of(2016, 1, 1);
        cliente.setDataDiNascita(localDate);
        cliente.setIndirizzo("ciaociao");
        cliente.setNome("alex");
        cliente.setPassword("pwd123");
        
        cliente2.setEmail("test367@llfefe.com");
        cliente2.setCognome("ciccio");
        cliente2.setDataDiNascita(localDate);
        cliente2.setIndirizzo("ciaociao");
        cliente2.setNome("alex");
        cliente2.setPassword("pwd123");
        
        clienti.add(cliente);
        clienti.add(cliente2);
        //insertClienti(clienti);
        //insertCliente(cliente);
        //boolean login = login("test@llfefe.com", "pwd123");
		//System.out.println("Login = "+login);
        
        List<Cliente> listaClienti = getClienti();
        List<ClienteFedele> clientiFedeli = getClientiFedeli();
        
        for(Cliente c : listaClienti)
        {
        	System.out.println("Codice Cliente : "+c.getCodCliente());
        }
        for(ClienteFedele c : clientiFedeli)
        {
        	System.out.println("Codice Cliente Fedele : "+c.getCodCliente());
        }
	}
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
	
	public static void insertClienti(ArrayList<Cliente> clienti)
	{
		entityManager.getTransaction().begin();
		for(Cliente c : clienti)
		{
			System.out.println(c.getEmail());
			entityManager.persist(c);
		}
		entityManager.getTransaction().commit();
        entityManager.clear();
        
        System.out.println("Records Successfully Inserted In The Database");
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
		/*Transaction tx = session.beginTransaction();

        Student student = new Student();
        student.setId(111);
        student.setName("chandra shekhar");
        student.setRollNumber(8469);
        session.update(student);
        tx.commit();
        session.close();*/
	}
	
	public static List<Cliente> getClienti()
	{
		String jpql = "SELECT c FROM Cliente as c ";
		Query query = entityManager.createQuery(jpql);
		List<Cliente> clienti = query.getResultList();
		return clienti;
	}
	
	public static List<ClienteFedele> getClientiFedeli()
	{
		String jpql = "SELECT c FROM ClienteFedele as c ";
		Query query = entityManager.createQuery(jpql);
		List<ClienteFedele> clientiFedeli = query.getResultList();
		return clientiFedeli;
	}
}

package dataManagment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transaction;

import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Prenotazione;

public class GestioneClienteDatabase extends GestioneDatabase {


//	public static void main(String[] args) {
//		ArrayList<Cliente> clienti = new ArrayList<Cliente>();
//
//		Cliente cliente = new Cliente();
//		Cliente cliente2 = new Cliente();
//		cliente.setEmail("ale@gmail.com");
//		cliente.setCognome("ciccio");
//		LocalDate localDate = LocalDate.of(2016, 1, 1);
//		cliente.setDataDiNascita(localDate);
//		cliente.setIndirizzo("ciaociao");
//		cliente.setNome("alex");
//		cliente.setPassword("pwd123");
//
//		cliente2.setEmail("test367@llfefe.com");
//		cliente2.setCognome("ciccio");
//		cliente2.setDataDiNascita(localDate);
//		cliente2.setIndirizzo("ciaociao");
//		cliente2.setNome("alex");
//		cliente2.setPassword("pwd123");
//
//		clienti.add(cliente);
//		clienti.add(cliente2);
//
//		List<Cliente> listaClienti = getClienti();
//		List<ClienteFedele> clientiFedeli = getClientiFedeli();
//		
//		String email="test@example.com";
//		String jpql = "SELECT c FROM Cliente as c where c.email=:email";
//		Query query = entityManager.createQuery(jpql);
//		query.setParameter("email", email);
//		Cliente ale = (Cliente) query.getSingleResult();
//		entityManager.clear();
//
//		for (Cliente c : listaClienti) {
//			System.out.println("Codice Cliente : " + c.getCodCliente());
//		}
//		for (ClienteFedele c : clientiFedeli) {
//			System.out.println("Codice Cliente Fedele : " + c.getCodCliente());
//		}
//		
//		System.out.println(login("ale@gmail.com","pwd123").getCodCliente());
//		signToLoyalty(ale, "", "", "", new Date(), email);
//	}

	public static void insertCliente(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();

		entityManager.clear();
		System.out.println("Record Successfully Inserted In The Database");
	}

	public static void insertClienti(ArrayList<Cliente> clienti) {
		entityManager.getTransaction().begin();
		for (Cliente c : clienti) {
			System.out.println(c.getEmail());
			entityManager.persist(c);
		}
		entityManager.getTransaction().commit();
		entityManager.clear();

		System.out.println("Records Successfully Inserted In The Database");
	}

	public static Cliente login(String email, String pwd) {
		String jpql = "SELECT c FROM Cliente as c where c.email=:email and c.password=:pwd";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", pwd);
		List<Cliente> clienti = query.getResultList();
		if (clienti.size() == 1)
			return clienti.get(0);
		return null;
	}
	
	public static Prenotazione loginCliente(int idPrenotazione, String email ) {
		String jpql= "SELECT p FROM Cliente as c, Prenotazione as p WHERE p.codCliente=c.codCliente AND c.email=:email AND p.id=:idP";
		Query query = entityManager.createQuery(jpql).setParameter("email", email).setParameter("idP", idPrenotazione);
		List <Prenotazione> lista= query.getResultList();
		return lista.get(0);
		
		
	}

	public static void signToLoyalty(Cliente cliente, String nome, String cognome, String indirizzo,
			Date date, String email) {

		System.out.println(cliente.getCognome());
		ClienteFedele cf = new ClienteFedele();
		//cf.setCodCliente(cliente.getCodCliente());
		cf.setPunti(0);
		cf.setDataIscrizione(new Date());
		cf.setCognome("aaaa");
		cf.setDataDiNascita(cliente.getDataDiNascita());
		cf.setEmail(cliente.getEmail());
		cf.setIndirizzo(cliente.getIndirizzo());
		cf.setNome("provaa");
		cf.setUltimoBiglietto(new Date());
		// da fare se si vuole dare la possibilità di aggiornare i propri dati
		/*cf.setNome(nome);
		cf.setCognome(cognome);
		cf.setIndirizzo(indirizzo);
		cf.setDataDiNascita(dataDiNascita);
		cf.setEmail(email);*/
		entityManager.getTransaction().begin();
		entityManager.merge(cf);
		entityManager.getTransaction().commit();
		entityManager.clear();

		System.out.println("Client with id "+cliente.getCodCliente()+" signed to the Loyalty program!");
	}

	public static void addPunti(ClienteFedele cliente, int punti) {

	}

	public static int getPuntiFedelta(ClienteFedele cliente) {
		return 0;
	}

	public static void deleteCliente(Cliente cliente) {
		entityManager.remove(cliente);
		flushAndClear();
		System.out.println("Cliente con email " + cliente.getEmail() + " eliminato!");
	}

	public static List<Cliente> getClienti() {
		String jpql = "SELECT c FROM Cliente as c ";
		Query query = entityManager.createQuery(jpql);
		List<Cliente> clienti = query.getResultList();
		return clienti;
	}

	public static List<ClienteFedele> getClientiFedeli() {
		String jpql = "SELECT c FROM ClienteFedele as c ";
		Query query = entityManager.createQuery(jpql);
		List<ClienteFedele> clientiFedeli = query.getResultList();
		return clientiFedeli;
	}
}

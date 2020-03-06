package dataManagment;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Prenotazione;

public class GestioneClienteDatabase extends GestioneDatabase {


	public static void main(String[] args) throws ParseException {
		ArrayList <Cliente> clienti = new ArrayList<Cliente>();

		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente.setEmail("ale4@gmail.com");
		cliente.setCognome("ciccio");
		cliente.setDataDiNascita(new Date());
		cliente.setIndirizzo("ciaociao");
		cliente.setNome("alex");

		cliente2.setEmail("test367@llfefe.com");
		cliente2.setCognome("ciccio");
		cliente2.setDataDiNascita(new Date());
		cliente2.setIndirizzo("ciaociao");
		cliente2.setNome("alex");

		clienti.add(cliente);
		clienti.add(cliente2);
		
		//insertCliente(cliente);

		List<Cliente> listaClienti = getClienti();
		List<ClienteFedele> clientiFedeli = getClientiFedeli();

		for (Cliente c : listaClienti) {
			System.out.println("Codice Cliente : " + c.getCodCliente());
		}
		for (ClienteFedele c : clientiFedeli) {
			System.out.println("Codice Cliente Fedele : " + c.getCodCliente());
		}
		
		ClienteFedele ale2 = login("ale@gmail.com", "testpwd");
		if(ale2 != null)
			System.out.println("User with id "+ale2.getCodCliente()+" has logged in!");
		else {
			System.out.println("Incorrect Login data");
		}
		
		//DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//Date date = format.parse("2020-03-03");
		 
		//signToLoyalty("ALEFEDELE", "FIOREFEDELE", "via dellavia 22", date , "ale@fedele.com", "fedelissimo");
		//addPunti(ale2, 3000);
		//Cliente ale4 = entityManager.find(Cliente.class, 24);
		//deleteCliente(ale4);
		
		HashMap<Integer, Integer> puntiMap = getPuntiFedelta(12);
		Iterator it = puntiMap.entrySet().iterator();
		int tot=0;
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        tot = tot + (Integer) pair.getValue();
	        System.out.println("Volo "+pair.getKey() + " ha fornito " + pair.getValue()+ " punti");
	    }
	    System.out.println("Punti totali del cliente : "+tot);
	}

	public static void insertCliente(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();

		entityManager.clear();
	}
	
	public static void insertClienteFedele(ClienteFedele cliente) {
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();

		entityManager.clear();
		System.out.println("Record Successfully Inserted In The Database");
	}

	public static void insertClienti(ArrayList<Cliente> clienti) {
		entityManager.getTransaction().begin();
		for (Cliente c : clienti) {
			entityManager.persist(c);
		}
		entityManager.getTransaction().commit();
		entityManager.clear();
	}


	public static ClienteFedele login(String email, String pwd) {
		String jpql = "SELECT c FROM ClienteFedele as c where c.email=:email and c.psw=:pwd";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", pwd);
		List<ClienteFedele> clientiFedeli = query.getResultList();
		if (clientiFedeli.size() == 1)
			return clientiFedeli.get(0);
		return null;
	}
	
	public static Prenotazione loginCliente(int idPrenotazione, String email ) {
		String jpql= "SELECT p FROM Cliente as c, Prenotazione as p WHERE p.codCliente=c.codCliente AND c.email=:email AND p.id=:idP";
		Query query = entityManager.createQuery(jpql).setParameter("email", email).setParameter("idP", idPrenotazione);
		List <Prenotazione> lista= query.getResultList();
		return lista.get(0);
		
		
	}

	public static ClienteFedele signToLoyalty(String nome, String cognome,
			String indirizzo, Date date, String pwd) {

		ClienteFedele cf = new ClienteFedele();

		cf.setNome(nome);
		cf.setCognome(cognome);
		cf.setDataDiNascita(date);
		cf.setIndirizzo(indirizzo);
		cf.setPsw(pwd);
		cf.setPunti(0);
		cf.setDataIscrizione(new Date());

		
		entityManager.getTransaction().begin();
		entityManager.persist(cf);
		entityManager.getTransaction().commit();
		entityManager.clear();
		
		System.out.println("Cliente registrato al programma Fedeltà!");
		return cf;
	}

	public static void addPunti(int codiceCliente, int punti) {

		ClienteFedele cf = entityManager.find(ClienteFedele.class, codiceCliente);
		entityManager.getTransaction().begin();
		cf.setPunti(cf.getPunti()+punti);
		entityManager.getTransaction().commit();
		
	}

	public static void deleteCliente(Cliente cliente) {
		
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
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
	

	public static HashMap<Integer, Integer> getPuntiFedelta(int codiceCliente) {
		
		ClienteFedele cf = entityManager.find(ClienteFedele.class, codiceCliente);
		HashMap<Integer, Integer> estrattoPunti = new HashMap<Integer, Integer>();
		int codCliente = cf.getCodCliente();
		
		String jpql = "SELECT p FROM Prenotazione as p where p.codCliente=:codCliente";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("codCliente", codCliente);
		List<Prenotazione> prenotazioni = query.getResultList();
		
		System.out.println("Lista voli per cliente con id "+codCliente);
		for(Prenotazione p : prenotazioni)
		{
			estrattoPunti.put(p.getIdVolo(), p.getPuntiTotali());
		}
		return estrattoPunti;
	}
	
	public static boolean trovaMail (String email) {
		String jpql = "SELECT c FROM Cliente as c WHERE c.email=:email";
		Query query =entityManager.createQuery(jpql).setParameter("email", email);
		List <Cliente> ris = query.getResultList();
		if(ris == null || ris.isEmpty())
			return false;
		else
			return true;
	}
	
	public static Cliente getCliente(String email) {
		String jpql = "SELECT c FROM Cliente as c WHERE c.email=:email";
		Query query = entityManager.createQuery(jpql).setParameter("email", email);
		List <Cliente> ris = query.getResultList();
		return ris.get(0);
	}
	
	public static boolean isFedele(Cliente c) {
		String jpql = "SELECT c FROM ClienteFedele as c WHERE c.codCliente=:codice";
		Query query = entityManager.createQuery(jpql).setParameter("codice", c.getCodCliente());
		List <Cliente> ris = query.getResultList();
		if(ris == null || ris.isEmpty())
			return false;
		
			return true;
	}
}

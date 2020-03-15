package dataManagement;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.persistence.Query;

import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Prenotazione;

public class GestioneClienteDatabase extends GestioneDatabase {

	public static void insertCliente(Cliente cliente) {
		entityManagerCET.getTransaction().begin();
		entityManagerCET.persist(cliente);
		entityManagerCET.getTransaction().commit();

		entityManagerCET.clear();
	}
	
	public static void insertClienteFedele(ClienteFedele cliente) {
		entityManagerCET.getTransaction().begin();
		entityManagerCET.persist(cliente);
		entityManagerCET.getTransaction().commit();

		entityManagerCET.clear();
		System.out.println("Record Successfully Inserted In The Database");
	}

	public static ClienteFedele login(String email, String pwd) {
		String jpql = "SELECT c FROM ClienteFedele as c where c.email=:email and c.psw=:pwd";
		Query query = entityManagerCET.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", pwd);
		List<ClienteFedele> clientiFedeli = query.getResultList();
		if (clientiFedeli.size() == 1)
			return clientiFedeli.get(0);
		return null;
	}
	
	public static Prenotazione loginCliente(int idPrenotazione, String email) {
		String jpql= "SELECT p FROM Cliente as c, Prenotazione as p WHERE p.codCliente=c.codCliente AND c.email=:email AND p.id=:idP";
		Query query = entityManagerCET.createQuery(jpql).setParameter("email", email).setParameter("idP", idPrenotazione);
		List <Prenotazione> lista= query.getResultList();
		if(lista == null || lista.isEmpty())
			return null;
		else
			return lista.get(0);
	}

	public static ClienteFedele signToLoyalty(Cliente c, String indirizzo, String pwd) {
		
		String jpql = "INSERT INTO cliente_fedele (cod_cliente, password, punti, data_iscrizione, data_ultimo_biglietto, infedele, indirizzo)"
				+ " VALUES (?1, ?2, 0, ?3, ?4, ?5, ?6)";
		Query query = entityManagerGMT.createNativeQuery(jpql);
		query.setParameter(1, c.getCodCliente());
		System.out.println(jpql.toString());
		query.setParameter(2, pwd);
		query.setParameter(3, new Date());
		query.setParameter(4, new Date());
		query.setParameter(6, indirizzo);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 2);
		Date infedele = cal.getTime();
		query.setParameter(5, infedele);
		
		entityManagerGMT.getTransaction().begin();
		query.executeUpdate();
		entityManagerGMT.getTransaction().commit();
		entityManagerGMT.clear();
		
		System.out.println("Cliente registrato al programma Fedeltà!");
		return GestioneClienteDatabase.login(c.getEmail(), pwd);
	}

	public static void addPunti(int codiceCliente, int punti) {

		ClienteFedele cf = entityManagerGMT.find(ClienteFedele.class, codiceCliente);
		entityManagerGMT.getTransaction().begin();
		cf.setPunti(cf.getPunti()+punti);
		entityManagerGMT.getTransaction().commit();
		
	}

	public static void deleteCliente(Cliente cliente) {
		entityManagerGMT.getTransaction().begin();
		entityManagerGMT.remove(cliente);
		entityManagerGMT.getTransaction().commit();
		System.out.println("Cliente con email " + cliente.getEmail() + " eliminato!");
	}

	public static List<Cliente> getClienti() {
		String jpql = "SELECT c FROM Cliente as c ";
		Query query = entityManagerCET.createQuery(jpql);
		List<Cliente> clienti = query.getResultList();
		return clienti;
	}

	public static List<ClienteFedele> getClientiFedeli() {
		String jpql = "SELECT c FROM ClienteFedele as c ";
		Query query = entityManagerCET.createQuery(jpql);
		List<ClienteFedele> clientiFedeli = query.getResultList();
		return clientiFedeli;
	}
	
	public static HashMap<Integer, Integer> getPuntiFedelta(int codiceCliente) {
		
		ClienteFedele cf = entityManagerCET.find(ClienteFedele.class, codiceCliente);
		HashMap<Integer, Integer> estrattoPunti = new HashMap<Integer, Integer>();
		int codCliente = cf.getCodCliente();
		
		String jpql = "SELECT p FROM Prenotazione as p where p.codCliente=:codCliente and p.pagato=1";
		Query query = entityManagerCET.createQuery(jpql);
		query.setParameter("codCliente", codCliente);
		List<Prenotazione> prenotazioni = query.getResultList();
		
		for(Prenotazione p : prenotazioni)
		{
			estrattoPunti.put(p.getIdVolo(), p.getPuntiTotali());
		}
		return estrattoPunti;
	}
	
	public static boolean trovaMail (String email) {
		String jpql = "SELECT c FROM Cliente as c WHERE c.email=:email";
		Query query =entityManagerCET.createQuery(jpql).setParameter("email", email);
		List <Cliente> ris = query.getResultList();
		if(ris == null || ris.isEmpty())
			return false;
		else
			return true;
	}
	
	public static Cliente getCliente(String email) {
		String jpql = "SELECT c FROM Cliente as c WHERE c.email=:email";
		Query query = entityManagerCET.createQuery(jpql).setParameter("email", email);
		List <Cliente> ris = query.getResultList();
		if(ris == null || ris.isEmpty())
			return null;
		
		return ris.get(0);
	}
	
	public static ClienteFedele getClienteFedele(String email) {
		String jpql = "SELECT c FROM ClienteFedele as c WHERE c.email=:email";
		Query query = entityManagerCET.createQuery(jpql).setParameter("email", email);
		List <ClienteFedele> ris = query.getResultList();
		if(ris == null || ris.isEmpty())
			return null;
		
		return ris.get(0);
	}
	
	public static boolean isFedele(Cliente c) {
		String jpql = "SELECT c FROM ClienteFedele as c WHERE c.codCliente=:codice";
		Query query = entityManagerCET.createQuery(jpql).setParameter("codice", c.getCodCliente());
		List <Cliente> ris = query.getResultList();
		if(ris == null || ris.isEmpty())
			return false;
		
			return true;
	}
	
	public static Cliente getCliente(int id) {
		String jpql = "SELECT c FROM Cliente as c WHERE c.codCliente=:cod";
		Query query = entityManagerCET.createQuery(jpql).setParameter("cod", id);
		List <Cliente> ris = query.getResultList();
		return ris.get(0);
	}
	
	public static List<ClienteFedele> getClientiInfedeli() {
		List <ClienteFedele> lista = GestioneClienteDatabase.getClientiFedeli();
		List <ClienteFedele> ris = new ArrayList<ClienteFedele>();
		Date data = new Date();
		System.out.println(data);
		for(ClienteFedele c : lista) {
			if(c.getInfedele().getDate()==data.getDate() && c.getInfedele().getMonth()==data.getMonth() && c.getInfedele().getYear()==data.getYear())
				ris.add(c);
		}
		return ris;
	}
	
	public static void updateInfedelta(ClienteFedele c, Date newInfedele, Date ultimoBiglietto) {
		entityManagerGMT.getTransaction().begin();
		String jpql = "UPDATE ClienteFedele SET infedele=:inf, ultimoBiglietto=:ub WHERE codCliente=:cod";
		Query query = entityManagerGMT.createQuery(jpql).setParameter("inf", newInfedele).setParameter("ub", ultimoBiglietto).setParameter("cod", c.getCodCliente());
		query.executeUpdate();
		entityManagerGMT.getTransaction().commit();
		entityManagerGMT.clear();
	}
	
	public static List<ClienteFedele> getClientiDaRimuovere() {
		List <ClienteFedele> lista = GestioneClienteDatabase.getClientiFedeli();
		List <ClienteFedele> ris = new ArrayList<ClienteFedele>();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -1);
		Date data = cal.getTime();
		for(ClienteFedele c : lista) {
			if(c.getInfedele().getDate()==data.getDate() && c.getInfedele().getMonth()==data.getMonth() && c.getInfedele().getYear()==data.getYear())
				ris.add(c);
		}
		return ris;
	}
}

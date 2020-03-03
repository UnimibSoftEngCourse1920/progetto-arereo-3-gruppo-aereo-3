package dataManagment;



import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

import dominio.Cliente;
import dominio.Posto;
import dominio.Prenotazione;

public class GestionePrenotazioneDatabase extends GestioneDatabase {

	public static List<Prenotazione> getPrenotazioniPerCliente(int codCliente){
		
		String jpql = "SELECT p FROM Prenotazione as p WHERE codCliente = " + codCliente;
		Query query = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}
	
	public static List<Prenotazione> getPrenotazioniPerVolo(String idVolo){
		
		String jpql = "SELECT p FROM Prenotazione as p WHERE idVolo = " + idVolo;
		Query query = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}

	public static void insertPrenotazione(Cliente c, int v, List<Posto> posti) {
		
		Prenotazione p = new Prenotazione();
		p.setPagato(false);
		p.setCodCliente(c.getCodCliente());
		p.setIdVolo(v);
		p.setListaBiglietti(posti);
		
		entityManager.getTransaction().begin();
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.clear();
	}

	
	public static List<Prenotazione> getPrenotazioniInScadenza(){
		Date currentDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 4);
		Date expiry = cal.getTime();
		String jpql = "SELECT p FROM Prenotazione as p JOIN Volo as v ON p.id_volo = v.id_volo  WHERE v.data_partenza = " + expiry.toString();
		Query query = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}
	
	public static Prenotazione getPrenotazioneDaId(int id) {
		String jpql="SELECT p FROM Prenotazione as p WHERE  p.id=:id";
		Query query = entityManager.createQuery(jpql).setParameter("id", id);
		@SuppressWarnings("unchecked")
		List <Prenotazione>  lista= query.getResultList();
		return lista.get(0);
		
	}
	

	public static int getIdPrenotazione(Cliente c, int v, List<Posto> posti) {
		String jpql = "SELECT p.id FROM Prenotazione as p WHERE codCliente like " + c.getCodCliente();
		Query query = entityManager.createQuery(jpql);
		List<Integer>prenotazione = query.getResultList();
		Integer value = prenotazione.get(0);
		int risultato = value.intValue();
		System.out.println(risultato);
		return risultato;
	}
	
	public static void deletePrenotazione(int id) {
		String jpql = "DELETE Prenotazione p WHERE p.idPrenotazione = :idp";
		Query query = entityManager.createQuery(jpql).setParameter("idp", id);
		query.executeUpdate();
	}
	
	/*****************BRANCH CLARK************************************/

	public static void pagamentoPrenotazione(Prenotazione prenotazione) {

		String jpql ="UPDATE Prenotazione SET pagato=:pagato WHERE id=:id ";
		Query query= entityManager.createQuery(jpql).setParameter("pagato", true).setParameter("id", prenotazione.getId());	
		query.executeUpdate();
	}

		
}

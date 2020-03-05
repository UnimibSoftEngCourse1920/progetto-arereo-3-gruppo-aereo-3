package dataManagment;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Query;

import dominio.Cliente;
import dominio.Posto;
import dominio.Prenotazione;
import dominio.Volo;

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
		
		String jpql = "SELECT p FROM Prenotazione as p WHERE p.pagato=0";
		Query query = entityManager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Prenotazione> prenotazioni = query.getResultList();
		List<Prenotazione> res = new ArrayList<Prenotazione>();
		for(Prenotazione p : prenotazioni) {
			Volo v = GestioneVoloDatabase.getVolo(p.getIdVolo());
			if(v.getDataPartenza().getDate()==expiry.getDate() && v.getDataPartenza().getMonth()==expiry.getMonth() && v.getDataPartenza().getYear()==expiry.getYear())
				res.add(p);
		}
		return res;
	}
	
	public static int getIdPrenotazione(Cliente c, int v, List<Posto> posti) {
		String jpql = "SELECT p.id FROM Prenotazione as p WHERE p.codCliente=:codCliente and p.idVolo=:idVolo";
		Query query = entityManager.createQuery(jpql).setParameter("codCliente", c.getCodCliente()).setParameter("idVolo", v);
		List<Integer>prenotazione = query.getResultList();
		Integer value = prenotazione.get(0);
		int risultato = value.intValue();
		return risultato;
	}
	
	public static void deletePrenotazione(Prenotazione p) {
		entityManager.getTransaction().begin();
		entityManager.remove(p);
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	/*****************BRANCH CLARK************************************/

	public static void pagamentoPrenotazione(Prenotazione prenotazione) {

		String jpql ="UPDATE Prenotazione SET pagato=:pagato WHERE id=:id ";
		Query query= entityManager.createQuery(jpql).setParameter("pagato", true).setParameter("id", prenotazione.getId());	
		query.executeUpdate();
	}
	
	public static boolean trovaCliente(int codCliente, int idVolo) {
		String jpql = "SELECT p FROM Prenotazione as p WHERE p.codCliente=:codCliente and p.idVolo=:idVolo";
		Query query = entityManager.createQuery(jpql).setParameter("codCliente", codCliente).setParameter("idVolo", idVolo);
		List <Prenotazione> ris = query.getResultList();
		//System.out.println(ris);
		if(ris == null || ris.size() == 0)
			return false;
		else 
			return true;
	}
	
	public static Prenotazione getPrenotazioneId(int id) {
		String jpql = "SELECT p FROM Prenotazione as p WHERE p.id =: id";
		Query query = entityManager.createQuery(jpql).setParameter("id", id);
		@SuppressWarnings("unchecked")
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni.get(0);
	}

		
}

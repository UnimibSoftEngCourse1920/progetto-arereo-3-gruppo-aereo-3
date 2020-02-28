package dataManagment;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Prenotazione;

public class GestionePrenotazioneDatabase extends GestioneDatabase {
	public static List<Prenotazione> getPrenotazioniPerCliente(String codCliente){
		
		String jpql = "SELECT p FROM Prenotazione as p WHERE codCliente like " + codCliente;
		Query query = entityManager.createQuery(jpql);
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}
	
	public static List<Prenotazione> getPrenotazioniPerVolo(String idVolo){
		
		String jpql = "SELECT p FROM Prenotazione as p WHERE idVolo like " + idVolo;
		Query query = entityManager.createQuery(jpql);
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}

	public static void insertPrenotazione(Prenotazione p) {
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
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}
	
}

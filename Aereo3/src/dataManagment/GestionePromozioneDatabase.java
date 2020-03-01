package dataManagment;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import dominio.Prenotazione;
import dominio.Promozione;
import dominio.Volo;

public class GestionePromozioneDatabase extends GestioneDatabase {
	
	public static List<Promozione> getPromozioni(){
		String jpql = "SELECT p FROM Promozione as p";
		Query query = entityManager.createQuery(jpql);
		List<Promozione> promozioni = query.getResultList();
		return promozioni;
	}
	
	public static void insertPromozione(Date inizio, Date fine, String msg, Volo v) {
		Promozione p = new Promozione();
		p.setDataInizio(inizio);
		p.setDataFine(fine);
		p.setMessaggio(msg);
		p.setIdVolo(v.getIdVolo());
		
		entityManager.getTransaction().begin();
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
}

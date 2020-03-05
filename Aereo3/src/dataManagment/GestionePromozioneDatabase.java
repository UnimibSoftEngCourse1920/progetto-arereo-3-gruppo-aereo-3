package dataManagment;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import dominio.Prenotazione;
import dominio.Promozione;
import dominio.Volo;

public class GestionePromozioneDatabase extends GestioneDatabase {
	
	public static List<Promozione> getAllPromozioni(){
		String jpql = "SELECT p FROM Promozione as p";
		Query query = entityManager.createQuery(jpql);
		List<Promozione> promozioni = query.getResultList();
		return promozioni;
	}
	
	public static void insertPromozione(Date inizio, Date fine, String partenza, String arrivo, double sconto, boolean perFedele) {
		Promozione p = new Promozione();
		p.setDataInizio(inizio);
		p.setDataFine(fine);
		p.setSconto(sconto);
		p.setPartenza(partenza);
		p.setDestinazione(arrivo);
		p.setFedele(perFedele);
		entityManager.getTransaction().begin();
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	public static Promozione getPromozione(int codPromo){
		String jpql = "SELECT p FROM Promozione as p WHERE idPromozione = :cp";
		Query query = entityManager.createQuery(jpql).setParameter("cp", codPromo);
		Promozione promo = (Promozione) query.getResultList().get(0);
		return promo;
	}
}

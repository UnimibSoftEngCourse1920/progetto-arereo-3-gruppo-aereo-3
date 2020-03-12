package dataManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sun.istack.logging.Logger;

import controller.Controller;
import dominio.Prenotazione;
import dominio.Promozione;
import dominio.Volo;

public class GestionePromozioneDatabase extends GestioneDatabase {
		
	
	private static Log logger=LogFactory.getLog(GestionePrenotazioneDatabase.class);
	
	public static List<Promozione> getAllPromozioni(Date now){
		String jpql = "SELECT p FROM Promozione as p WHERE p.dataFine>:now";
		Query query = entityManager.createQuery(jpql).setParameter("now", now);
		@SuppressWarnings("unchecked")
		List<Promozione> promozioni = query.getResultList();
		return promozioni;
	}
	
	public static void insertPromozione(Date inizio, Date fine, String partenza, String arrivo, double sconto, boolean perFedele) {
		SimpleDateFormat dtFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm");
		dtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Promozione p = new Promozione();
		try {
			p.setDataInizio(dtFormat.parse(Controller.convertiData(inizio)));
			p.setDataFine(dtFormat.parse(Controller.convertiData(fine)));
		} catch (ParseException e) {
			logger.error(e);
		}
		
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
	
	
	
	public static double applyPromozione(int codPromo,Volo v, double prezzoTot) {
		
		String jpql="SELECT p FROM Promozione as p WHERE p.idPromozione=:id";
		Query query=entityManager.createQuery(jpql).setParameter("id", codPromo);
		@SuppressWarnings("unchecked")
		List <Promozione> listaP=query.getResultList();
		
		Promozione p=listaP.get(0);
	
		if(p==null||!(v.getPartenza().equals(p.getPartenza())) || !( v.getDestinazione().equals(p.getDestinazione()))|| v.getDataPartenza().before(p.getDataInizio()) )		
				return 0;	

		String jpql2="SELECT p.sconto FROM Promozione as p WHERE p.idPromozione=:id ";
		Query query2=entityManager.createQuery(jpql2).setParameter("id", codPromo);
		@SuppressWarnings("unchecked")
		List<Double> listaSconto= query2.getResultList();
		double sconto= listaSconto.get(0);
		double newPrezzo= prezzoTot*(100-sconto)/100;
		return newPrezzo;
	}
}

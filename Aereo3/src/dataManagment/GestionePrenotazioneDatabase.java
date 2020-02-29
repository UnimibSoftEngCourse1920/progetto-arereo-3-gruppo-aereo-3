package dataManagment;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Cliente;
import dominio.Posto;
import dominio.Prenotazione;
import dominio.Volo;
import net.bytebuddy.asm.Advice.This;

public class GestionePrenotazioneDatabase extends GestioneDatabase {
	public static List<Prenotazione> getPrenotazioniPerCliente(int codCliente){
		
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

	public static void insertPrenotazione(Cliente c, Volo v, List<Posto> posti) {
		
		Prenotazione p = new Prenotazione();
		p.setPagato(false);
		p.setCodCliente(c.getCodCliente());
		p.setIdVolo(v.getIdVolo());
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
		List<Prenotazione> prenotazioni = query.getResultList();
		return prenotazioni;
	}
	
	
	/*****************BRANCH CLARK************************************/
	//TODO:Clark:da testare 
	public static void pagamentoPrenotazione(Prenotazione prenotazione) {
		prenotazione.setPagato(true);
		if(!(entityManager.getTransaction().isActive()))
		entityManager.getTransaction().begin();
		
		entityManager.refresh(prenotazione);
		entityManager.getTransaction().commit();
		entityManager.clear();		
	}
	
	public static void aggiornaPrenotazioneData(Prenotazione prenotazione,Date data, boolean isArrivo) {
		Volo voloDaAggiornare=GestioneVoloDatabase.getVoloDiPrenotazione( prenotazione);
		
		if(isArrivo)
		voloDaAggiornare.setDataArrivo(data);
		else
		voloDaAggiornare.setDataPartenza(data);
		
		if(!(entityManager.getTransaction().isActive()))
		entityManager.getTransaction().begin();
		
		entityManager.refresh(voloDaAggiornare);
		entityManager.getTransaction().commit();
		entityManager.clear();		
		
	}
	
	
	//TODO: l'orario di che tipo è ? Come modificare solo l' orario di un date?, da testare
	public static void aggiornaPrenotazioneOrario(Prenotazione prenotazione, String orario, boolean isArrivo) {
		Volo voloDaAggiornare=GestioneVoloDatabase.getVoloDiPrenotazione( prenotazione);
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh:mm");
		Date dataDaAggiornare =null;

		if(isArrivo) 
			dataDaAggiornare= voloDaAggiornare.getDataArrivo();
		else
			dataDaAggiornare= voloDaAggiornare.getDataPartenza();

		StringBuilder str=new StringBuilder (dateformat.format(dataDaAggiornare));
		str.delete(9,str.length());
		str.append(orario);
		Date data=null;

		try {
			data = dateformat.parse(str.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		if(isArrivo)
		voloDaAggiornare.setDataArrivo(data);
		else
		voloDaAggiornare.setDataPartenza(data);
		
		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();
			
			entityManager.refresh(voloDaAggiornare);
			entityManager.getTransaction().commit();
			entityManager.clear();	
			
			
	}
	
	public static void aggiornaPrenotazioneDataOrario(Prenotazione prenotazione, String orario, Date data, boolean isArrivo) {
		
		Volo voloDaAggiornare=GestioneVoloDatabase.getVoloDiPrenotazione( prenotazione);

		Date nuovaData=null;
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh:mm");
		
		StringBuilder str=new StringBuilder(dateformat.format(data));
		
		str.delete(9,str.length()).append(orario);
		
		try {
			nuovaData= dateformat.parse(str.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if(isArrivo)
			voloDaAggiornare.setDataArrivo(nuovaData);
		else
			voloDaAggiornare.setDataPartenza(nuovaData);
		
		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();
			
			entityManager.refresh(voloDaAggiornare);
			entityManager.getTransaction().commit();
			entityManager.clear();	
	}
}

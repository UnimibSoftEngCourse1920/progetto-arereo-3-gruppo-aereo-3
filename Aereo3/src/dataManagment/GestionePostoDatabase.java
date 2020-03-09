package dataManagment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import dominio.Posto;
import dominio.Prenotazione;
import dominio.Volo;

public class GestionePostoDatabase extends GestioneDatabase {

	public static void main(String...strings) {
		System.out.println(getPosto('A', 1, 1));
		
		
	}
	
	
	public static void insertPostiVolo(Volo volo, double prezzoPosto, int puntiPosto) {
		
		List <Posto> listaPosti=new ArrayList<Posto>();
		
		Posto postoDaInserire =null;
		
		int fila = 0;
		for (int i = 0; i < volo.getNumeroPosti() ; i++) {
			fila++;
			for (int j = 0; j < 5; j++) {
				postoDaInserire = new Posto();
				postoDaInserire.getChiaveComposta().setFile(fila);
				postoDaInserire.getChiaveComposta().setLettera((char) (65 + j));
				postoDaInserire.setPrezzo(prezzoPosto);
				postoDaInserire.setPrezzoPunti(puntiPosto*10);
				postoDaInserire.setPunti(puntiPosto);
				postoDaInserire.getChiaveComposta().setIdVolo(volo.getIdVolo());
				listaPosti.add(postoDaInserire);
				i++;
				if (i >= volo.getNumeroPosti()) {
					break;
				}
			}

		}
			
		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();

		for(Posto posto:listaPosti) {
		entityManager.persist(posto);
//		entityManager.close();	
//		entityManager.getTransaction().rollback();
		}
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	
	public static List<Posto> getPostiPerPrenotazione(int idPrenotazione){
		String jpql = "SELECT p FROM Posto as p  WHERE p.idPrenotazione=:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", idPrenotazione);
		List<Posto> listaPosti = query.getResultList();
		return listaPosti;
	}
	
	public static int getNumPostiPerPrenotazione(int idPrenotazione) {
		String jpql = "SELECT count(*) FROM Posto as p  WHERE p.idPrenotazione=:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", idPrenotazione);
		int nPosti = (int) query.getResultList().get(0);
		return nPosti;
	}
	
	public static List <Posto> getListaPostiDisponibili(int idVolo){
		
		String jpql = "SELECT p FROM Posto as p  WHERE p.chiaveComposta.idVolo=:id  and p.idPrenotazione=NULL";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", idVolo);
		List<Posto> listaPosti = query.getResultList();
	
		return listaPosti;
		
	}
	
	public static Posto getPosto(char lettera, int fila, int idVolo) {
		String jpql = "SELECT p FROM Posto as p , Volo as v WHERE p.chiaveComposta.idVolo=:idVolo  and p.chiaveComposta.lettera=: let and p.chiaveComposta.fila=:fila";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("fila", fila);
		query.setParameter("idVolo", idVolo);
		query.setParameter("let", lettera);
		List<Posto> posto = query.getResultList();
	
		return posto.get(0);
		
		
	}
	
	public static void aggiornaPostiPrenotati(List <Posto> listaPosti, int idPrenotazione){
		String jpql=null;
		Query query=null;
		entityManager.getTransaction().begin();
		for(Posto p: listaPosti) {
			jpql="UPDATE Posto SET idPrenotazione=:id WHERE fila=:fila and lettera=:lettera and chiaveComposta.idVolo=:idVolo";
			query=entityManager.createQuery(jpql);
			query.setParameter("id", idPrenotazione);
			query.setParameter("fila", p.getChiaveComposta().getFila());
			query.setParameter("lettera", p.getChiaveComposta().getLettera());
			query.setParameter("idVolo", p.getChiaveComposta().getIdVolo());
			query.executeUpdate();
		}
		
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	public static void modificaPrezzoPosti(List<Posto>listaPosti, double prezzo) {
		String jpql = null;
		Query query = null;
		entityManager.getTransaction().begin();
		for(Posto p: listaPosti) {
			jpql="UPDATE Posto SET prezzo=:prezzo WHERE fila=:fila and lettera=:lettera and chiaveComposta.idVolo=:idVolo";
			query=entityManager.createQuery(jpql);
			query.setParameter("prezzo", prezzo);
			query.setParameter("fila", p.getChiaveComposta().getFila());
			query.setParameter("lettera", p.getChiaveComposta().getLettera());
			query.setParameter("idVolo", p.getChiaveComposta().getIdVolo());
			query.executeUpdate();
		}
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	public static void modificaPuntiPosti(List<Posto>listaPosti, int punti) {
		String jpql = null;
		Query query = null;
		entityManager.getTransaction().begin();
		for(Posto p: listaPosti) {
			jpql="UPDATE Posto SET punti=:punti WHERE fila=:fila and lettera=:lettera and chiaveComposta.idVolo=:idVolo";
			query=entityManager.createQuery(jpql);
			query.setParameter("punti", punti);
			query.setParameter("fila", p.getChiaveComposta().getFila());
			query.setParameter("lettera", p.getChiaveComposta().getLettera());
			query.setParameter("idVolo", p.getChiaveComposta().getIdVolo());
			query.executeUpdate();
		}
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
//	public static void  aggiornaPostiPrenotati(List <Posto> listaPostiDaAggiornare) {
//		
//		
//	}
	
}

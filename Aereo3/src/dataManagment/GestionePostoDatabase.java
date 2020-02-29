package dataManagment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import dominio.Posto;
import dominio.Volo;

public class GestionePostoDatabase extends GestioneDatabase {

	public static void main(String...strings) {
		System.out.println(getPosto('A', 1, 1));
		
		
	}
	
	
	public static void insertPostiVolo(Volo volo) {
		
		List <Posto> listaPosti=new ArrayList<Posto>();
		
		Posto postoDaInserire =null;
		
		int fila = 0;
		for (int i = 0; i < volo.getNumeroPosti() ; i++) {
			fila++;
			for (int j = 0; j < 5; j++) {
				postoDaInserire = new Posto();
				postoDaInserire.getChiaveComposta().setFile(fila);
				postoDaInserire.getChiaveComposta().setLettera((char) (65 + j));
				postoDaInserire.setPrezzo(50.00);
				postoDaInserire.setPrezzoPunti(500);
				postoDaInserire.setPunti(50);
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
	
//	public static void  aggiornaPostiPrenotati(List <Posto> listaPostiDaAggiornare) {
//		
//		
//	}
	
}

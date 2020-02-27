package dataManagment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import dominio.Posto;
import dominio.Volo;

public class GestionePostoDatabase extends GestioneDatabase {

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
				postoDaInserire.setPrenotato(false);
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
			
		entityManager.getTransaction().begin();
		for(Posto posto:listaPosti) {
		entityManager.persist(posto);
//		entityManager.close();	
//		entityManager.getTransaction().rollback();
		}
		entityManager.getTransaction().commit();
		entityManager.clear();
	}
	
	public static List <Posto> getListaPostiDisponibili(Volo volo){
		
		String jpql = "SELECT p FROM Posto as p , Volo as v WHERE v.idVolo=p.idVolo,p.prenotato=false ";
		Query query = entityManager.createQuery(jpql);
		List<Posto> listaPosti = query.getResultList();
	
		return listaPosti;
		
	}
	
	public static void  aggiornaPostiPrenotati(List <Posto> listaPostiDaAggiornare) {
		
		
	}
	
}

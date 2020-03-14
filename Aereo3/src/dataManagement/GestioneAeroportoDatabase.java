package dataManagement;

import java.util.List;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dominio.Aeroporto;

public class GestioneAeroportoDatabase extends GestioneDatabase {
	private static Log logger=LogFactory.getLog(GestioneAeroportoDatabase.class);
	
	
	private static List<Aeroporto> listaAeroporti= null;
	

	public static void insertAeroporto (Aeroporto a) {

		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();

		entityManager.persist(a);
		listaAeroporti.add(a);
		entityManager.getTransaction().commit();
		entityManager.clear();

	}
	
	public static List<Aeroporto> getListaAeroporti(){
		if(listaAeroporti==null) {
		String jpql = "SELECT DISTINCT a FROM Aeroporto as a";
		Query query = entityManager.createQuery(jpql);
		List<Aeroporto> listaAereoporti = query.getResultList();
		return listaAereoporti;
	}
		else
			return listaAeroporti;
	}
	
	public static List <String> getDenominazioniAeroporti(){
		String jpql= "SELECT DISTINCT a.denominazione FROM Aeroporto as a";
		Query query= entityManager.createQuery(jpql);
		List<String> listaNomiAereoporti= query.getResultList();
		return listaNomiAereoporti;
	}
	
	public static String parserAeroporto(String idAeroporto  ) {
		if (listaAeroporti != null) {
		for(Aeroporto a:listaAeroporti) {
			if(a.getIdAereoporto().equals(idAeroporto))
				return a.getDenominazione();
		}
	}
			listaAeroporti = getListaAeroporti();
			for(Aeroporto a:listaAeroporti) {
				if(a.getIdAereoporto().equals(idAeroporto))
					return a.getDenominazione();
		}
			return null;
	}
	
	public static String parserCodiceAeroporto(String denominazione) {
		String jpql = "SELECT  a.idAereoporto FROM Aeroporto a WHERE a.denominazione=:campoDenominazione";
		Query query = entityManager.createQuery(jpql);	
		query.setParameter("campoDenominazione", denominazione);
		
		List <String> risultato=query.getResultList();
		for(String s: risultato)
			System.out.println(s);
		return risultato.get(0);
		
	}
}

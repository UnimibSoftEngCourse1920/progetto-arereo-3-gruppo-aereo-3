package dataManagment;

import java.util.List;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dominio.Aereoporto;

public class GestioneAereoportoDatabase extends GestioneDatabase {
	private static Log logger=LogFactory.getLog(GestioneAereoportoDatabase.class);
//	public static void main (String...strings) {
//		System.out.println(parserCodiceAereoporto("Aereoporto Sofia"));
//	}
	
	
	private static List<Aereoporto> listaAereoporti= null;
	

	public static void insertAereoporto (Aereoporto a) {

		if(!(entityManager.getTransaction().isActive()))
			entityManager.getTransaction().begin();

		entityManager.persist(a);
		listaAereoporti.add(a);
		entityManager.getTransaction().commit();
		entityManager.clear();

	}
	
	public static List<Aereoporto> getListaAereoporti(){
		if(listaAereoporti==null) {
		String jpql = "SELECT DISTINCT a FROM Aereoporto as a";
		Query query = entityManager.createQuery(jpql);
		List<Aereoporto> listaAereoporti = query.getResultList();
		return listaAereoporti;
	}
		else
			return listaAereoporti;
	}
	
	public static List <String> getDenominazioniAereoporti(){
		String jpql= "SELECT DISTINCT a.denominazione FROM Aereoporto as a";
		Query query= entityManager.createQuery(jpql);
		List<String> listaNomiAereoporti= query.getResultList();
		return listaNomiAereoporti;
	}
	
	public static String parserAereoporto(String idAereoporto  ) {
		if (listaAereoporti != null) {
		for(Aereoporto a:listaAereoporti) {
			if(a.getIdAereoporto().equals(idAereoporto))
				return a.getDenominazione();
		}
	}
			listaAereoporti = getListaAereoporti();
			for(Aereoporto a:listaAereoporti) {
				if(a.getIdAereoporto().equals(idAereoporto))
					return a.getDenominazione();
		}
			return null;
	}
	public static String parserCodiceAereoporto(String denominazione) {
		String jpql = "SELECT  a.idAereoporto FROM Aereoporto a WHERE a.denominazione=:campoDenominazione";
		Query query = entityManager.createQuery(jpql);	
		query.setParameter("campoDenominazione", denominazione);
		
		List <String> risultato=query.getResultList();
		for(String s: risultato)
			System.out.println(s);
		return risultato.get(0);
		
	}
}

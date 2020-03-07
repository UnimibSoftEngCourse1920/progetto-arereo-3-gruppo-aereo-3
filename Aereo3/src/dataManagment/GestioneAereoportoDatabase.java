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
	
	
	static List<Aereoporto> listaAereoporti= getListaAereoporti();
	
	
	public static List<Aereoporto> getListaAereoporti(){
	String jpql = "SELECT DISTINCT a FROM Aereoporto as a";
	Query query = entityManager.createQuery(jpql);
	List<Aereoporto> listaAereoporti = query.getResultList();
	return listaAereoporti;
	}
	
	public static List <String> getDenominazioniAereoporti(){
		String jpql= "SELECT DISTINCT a.denominazione FROM Aereoporto as a";
		Query query= entityManager.createQuery(jpql);
		List<String> listaNomiAereoporti= query.getResultList();
		return listaNomiAereoporti;
	}
	
	public static String parserAereoporto(String idAereoporto  ) {
		
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

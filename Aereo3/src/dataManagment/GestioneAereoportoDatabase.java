package dataManagment;

import java.util.List;

import javax.persistence.Query;

import dominio.Aereoporto;

public class GestioneAereoportoDatabase extends GestioneDatabase {
	static List<Aereoporto> listaAereoporti= getListaAereoporti();
	
	
	public static List<Aereoporto> getListaAereoporti(){
	String jpql = "SELECT DISTINCT a FROM Aereoporto a";
	Query query = entityManager.createQuery(jpql);
	List<Aereoporto> listaAereoporti = query.getResultList();
	return listaAereoporti;
	}
	
	public static String parserAereoporto(String idAereoporto  ) {
		for(Aereoporto a:listaAereoporti) {
			if(a.getIdAereoporto().equals(idAereoporto));
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

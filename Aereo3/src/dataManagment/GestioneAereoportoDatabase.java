package dataManagment;

import java.util.List;

import javax.persistence.Query;

import dominio.Aereoporto;

public class GestioneAereoportoDatabase extends GestioneDatabase {
	static List<Aereoporto> listaAereoporti= getListaAereoporti();
	
	
	public static List<Aereoporto> getListaAereoporti(){
	String jpql = "SELECT a FROM Aereoporto a";
	Query query = entityManager.createQuery(jpql);
	List<Aereoporto> listaAereoporti = query.getResultList();
	return listaAereoporti;
	}
	
	public static String parserAereoporto(String idAereoporto) {
		for(Aereoporto a:listaAereoporti) {
			if(a.getIdAereoporto().equals(idAereoporto));
			return a.getDenominazione();
		}
		return null;
	}
}

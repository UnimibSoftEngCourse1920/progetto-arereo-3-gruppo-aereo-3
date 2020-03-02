package dataManagment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import dominio.Admin;
import dominio.Cliente;

public class GestioneAdminDatabase extends GestioneDatabase{

//	Per debug
//	public static void main(String[] args) {
//		System.out.println(isAmministratore("admin", "ciao"));
//		
//	}

	public static boolean isAmministratore(String username, String password){

		String jpql = "SELECT a FROM Admin as a where a.username=:username and a.password=:password";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("username", username);
        query.setParameter("password", password);
		List<Admin> listaAmministratori= query.getResultList();
		if(listaAmministratori.size() == 1)
			return true;
		return false;
	}
	
	public static void aggiornaVolo(int idVolo) {
		
	}

}

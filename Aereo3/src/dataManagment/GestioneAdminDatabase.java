package dataManagment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import dominio.Admin;

public class GestioneAdminDatabase extends GestioneDatabase{


	public static boolean isAmministratore(Admin probabileAdmin){


		String jpql = "SELECT a FROM Admin as a ";
		Query query = entityManager.createQuery(jpql);
		List<Admin> listaAmministratori=new ArrayList<Admin>();

		for(Admin a: listaAmministratori) {
			if(a.getUsername().equals(probabileAdmin.getUsername())&&a.getPassword().equals(probabileAdmin.getPassword()))
				return true;
		}

		return false;
	}
	

}

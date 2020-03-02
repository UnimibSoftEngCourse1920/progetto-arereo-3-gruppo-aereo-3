package dataManagment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import dominio.Admin;
import dominio.Cliente;
import dominio.Volo;

public class GestioneAdminDatabase extends GestioneDatabase{

//	Per debug
//	public static void main(String[] args) {
//		System.out.println(isAmministratore("admin", "ciao"));
//		
//	}

	public static boolean isAmministratore(String username, String psw){

		String jpql = "SELECT a FROM Admin as a where a.username=:username and a.psw=:psw";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("username", username);
        query.setParameter("psw", psw);
		List<Admin> listaAmministratori= query.getResultList();
		if(listaAmministratori.size() == 1)
			return true;
		return false;
	}
	
	public static void aggiornaVolo(int idVolo, String orarioPartenza, String minutiPartenza, String gate, Date dataPartenza, String orarioArrivo, String minutiArrivo, Date dataArrivo) {
		Volo voloDaAggiornare = GestioneVoloDatabase.getVolo(idVolo);
		
		Date nuovaData=null;
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy hh:mm");

		StringBuilder str=new StringBuilder();
		String data= dateformat.format(dataPartenza);

		str.append(data.substring(0,11)).append(orarioPartenza).append(":").append(minutiPartenza);

		try {
			nuovaData= dateformat.parse(str.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date nuovaData_1 = null;
		SimpleDateFormat dateformat_1 = new SimpleDateFormat("dd-MM-yy hh:mm");
		
		StringBuilder str_1 = new StringBuilder();
		String data_1 = dateformat_1.format(dataArrivo);
		
		str_1.append(data_1.substring(0,11)).append(orarioArrivo).append(":").append(minutiArrivo);
		
		try {
			nuovaData_1 = dateformat_1.parse(str_1.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String jpql = "UPDATE Volo SET dataPartenza=:nuovaData, dataArrivo=:nuovaData_1 WHERE idVolo=:idVolo";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nuovaData", nuovaData);
		query.setParameter("nuovaData_1", nuovaData_1);
		query.setParameter("idVolo", idVolo);
		
		query.executeUpdate();
		
		
	}

}

package dataManagment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dominio.Admin;
import dominio.Volo;

public class GestioneAdminDatabase extends GestioneDatabase{
	private static Log logger=LogFactory.getLog(GestioneAdminDatabase.class);
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
		@SuppressWarnings("unchecked")
		List<Admin> listaAmministratori= query.getResultList();
		if(listaAmministratori.size() == 1)
			return true;
		return false;
	}

	public static void aggiornaVolo(int idVolo, String orarioPartenza, String minutiPartenza, String gate, Date dataPartenza, String orarioArrivo, String minutiArrivo, Date dataArrivo) {
		Volo voloDaAggiornare = GestioneVoloDatabase.getVolo(idVolo);
		SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
		dFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat dtFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm");
		dtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

		String data1= dFormat.format(dataPartenza)+" "+ orarioPartenza+":"+minutiPartenza;
		String data2= dFormat.format(dataArrivo)+" "+ orarioArrivo+":"+minutiArrivo;

		Date dataP=null;

		try {
			dataP= dtFormat.parse(data1);
		} catch (ParseException e) {
			logger.error(e);
		}

		Date dataA=null;

		try {
			dataA= dtFormat.parse(data2);
		} catch (ParseException e) {
			logger.error(e);
		}
		entityManager.getTransaction().begin();
		String jpql = "UPDATE Volo SET dataPartenza=:nuovaData , gate=:gate, dataArrivo=:nuovaData_1 WHERE idVolo=:idVolo ";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nuovaData", dataP);
		query.setParameter("nuovaData_1", dataA);
		query.setParameter("idVolo", idVolo);
		query.setParameter("gate", gate);

		query.executeUpdate();
		entityManager.getTransaction().commit();
		entityManager.clear();


	}

}

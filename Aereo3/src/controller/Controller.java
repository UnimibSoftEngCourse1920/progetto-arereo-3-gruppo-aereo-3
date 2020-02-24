package controller;
import java.sql.SQLException;
import java.sql.Time;

import dominio.Cliente;
import dominio.Volo;
import gui.Home;


public class Controller {
	


	

	public static void main (String... args) {

		System.out.println("Main da chiamare all'eseguibile");
		Home.main(args);
		
		
	}
	
	public static boolean controlloDisponibilità (Volo voloDaControllare) throws SQLException, ClassNotFoundException {

		return 	 Cliente.consultaVolo(voloDaControllare);


	}
	
	public static void cambiaPrenotazione(int idPrenotazione, Time orario) {

		try {
			Cliente.modificaPrenotazione(idPrenotazione, orario);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

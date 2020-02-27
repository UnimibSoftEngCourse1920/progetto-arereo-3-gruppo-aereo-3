package controller;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import  dataManagment.GestioneVoloDatabase;
import dominio.Cliente;
import dominio.Volo;
import gui.Home;


public class Controller {
	
//Punto di entrata dell'applicazione
	public static void main (String... args) {

		System.out.println("Main da chiamare all'eseguibile");
//		Home.main(args);
		getDestinazioniVoliDisponibili();
		getPartenzeVoliDisponibili();
	}
	
	
	public static boolean controlloDisponibilità (Volo voloDaControllare) throws SQLException, ClassNotFoundException {

		return 	 Cliente.consultaVolo(voloDaControllare);

	}
	//ritorna lista di voli
	public static List<Volo> getListaVoli(){
		return GestioneVoloDatabase.getListaVoliDisponibili();
		
	}
	
	
	//ritorna lista di destinazioni
	public static List<String> getDestinazioniVoliDisponibili(){
	System.out.println(	GestioneVoloDatabase.getDestinazioniDisponibili());
		
		return GestioneVoloDatabase.getDestinazioniDisponibili();
	}
	

	//ritorna lista di partenze
	public static List<String> getPartenzeVoliDisponibili(){
	System.out.println(GestioneVoloDatabase.getPartenzeDisponibili());
		return GestioneVoloDatabase.getPartenzeDisponibili();
	}
	
//	
//	public static void cambiaPrenotazione(int idPrenotazione, Time orario) {
//
//		try {
//			Cliente.modificaPrenotazione(idPrenotazione, orario);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}

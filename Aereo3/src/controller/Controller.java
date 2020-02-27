package controller;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import dataManagment.GestioneAdminDatabase;
import dataManagment.GestioneAereoportoDatabase;
import dataManagment.GestionePostoDatabase;
import  dataManagment.GestioneVoloDatabase;
import dominio.Admin;
import dominio.Cliente;
import dominio.Posto;
import dominio.Volo;


public class Controller {
	
//Punto di entrata dell'applicazione
	public static void main (String... args) throws ParseException {

		System.out.println("Main da chiamare all'eseguibile");
//		Home.main(args);
		Volo volo=new Volo();
//		 new Date(int year, int month, int date, int hrs, int min, int sec);
		SimpleDateFormat dateformat2= new SimpleDateFormat("dd-M-yyyy hh:mm");
		 String strdate2 = "20-05-2020 8:00";
		 String ritorno="22-06-2020 20:00";
		volo.setDataPartenza(dateformat2.parse(strdate2));
		volo.setDataArrivo(dateformat2.parse(ritorno));
		volo.setGate("B1");	
		volo.setDestinazione("PA4");
		volo.setPartenza("MI5");
		volo.setNumeroPosti(50);
		volo.setPromo(null);
		insertVolo(volo);
	}
	
	
	public static boolean controlloDisponibilità (Volo voloDaControllare) throws SQLException, ClassNotFoundException {

		return 	 Cliente.consultaVolo(voloDaControllare);

	}
	//ritorna lista di voli
	public static List<Volo> getListaVoli(){
		return GestioneVoloDatabase.getListaVoliDisponibili();
		
	}
	
	public static List<Volo> getInfoVoli(Volo volo){
		
		return GestioneVoloDatabase.getListInfo(volo);
		
	}
	
	public static String getDenominazioneAereoporto(String idAereoporto) {
		
		return GestioneAereoportoDatabase.parserAereoporto(idAereoporto);
	
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
	
	//controlla se è amministratore
	
	public static boolean controlloLoginAmministratore(Admin presuntoAdmin) {
		
		return GestioneAdminDatabase.isAmministratore(presuntoAdmin);
	}
	
	public static void insertVolo(Volo volo) {
		GestioneVoloDatabase.insertVolo(volo);
		GestionePostoDatabase.insertPostiVolo(volo);
	}
	
	
	public static List<Posto> getListaPostiDisponibili(Volo volo){
		return GestionePostoDatabase.getListaPostiDisponibili(volo);
	}
	
	public static void aggiornaPostiDisponibili(List <Posto> listaPostiPrenotati){


	}
}
//	public static void cambiaPrenotazione(int idPrenotazione, Time orario) {
//
//		try {
//			Cliente.modificaPrenotazione(idPrenotazione, orario);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

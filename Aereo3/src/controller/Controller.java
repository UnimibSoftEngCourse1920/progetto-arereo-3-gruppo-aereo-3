package controller;

import java.sql.SQLException;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.List;

import dataManagment.GestioneAdminDatabase;
import dataManagment.GestioneAereoportoDatabase;
import dataManagment.GestioneClienteDatabase;
import dataManagment.GestionePostoDatabase;
import dataManagment.GestionePrenotazioneDatabase;
import dataManagment.GestioneVoloDatabase;
import dominio.Admin;
import dominio.Cliente;
import dominio.Posto;
import dominio.Prenotazione;
import dominio.Volo;
import gui.Home;

public class Controller {

//Punto di entrata dell'applicazione
	public static void main(String... args) throws ParseException {

		System.out.println("Main da chiamare all'eseguibile");
		Home.main(args);

		// Per debug
//		Volo volo=new Volo();
//		SimpleDateFormat dateformat2= new SimpleDateFormat("dd-M-yyyy hh:mm");
//		 String strdate2 = "15-09-2021 8:00";
//		 String ritorno="7-11-2021 20:00";
//		volo.setDataPartenza(dateformat2.parse(strdate2));
//		volo.setDataArrivo(dateformat2.parse(ritorno));
//		volo.setGate("B1");	
//		volo.setDestinazione("NA08");
//		volo.setPartenza("BS75");
//		volo.setNumeroPosti(10);
//		volo.setPromo(null);
//		insertVolo(volo);
	}

	public static boolean controlloDisponibilità(Volo voloDaControllare) throws SQLException, ClassNotFoundException {

		return Cliente.consultaVolo(voloDaControllare);

	}

	// ritorna lista di voli
	public static List<Volo> getListaVoli() {
		return GestioneVoloDatabase.getListaVoliDisponibili();

	}

	public static List<Volo> getInfoVoli(Volo volo) {

		return GestioneVoloDatabase.getListInfo(volo);

	}

	public static String getDenominazioneAereoporto(String idAereoporto) {

		return GestioneAereoportoDatabase.parserAereoporto(idAereoporto);

	}

	// ritorna lista di destinazioni
	public static List<String> getDestinazioniVoliDisponibili() {
		System.out.println(GestioneVoloDatabase.getDestinazioniDisponibili());

		return GestioneVoloDatabase.getDestinazioniDisponibili();
	}

	// ritorna lista di partenze
	public static List<String> getPartenzeVoliDisponibili() {
		//System.out.println(GestioneVoloDatabase.getPartenzeDisponibili());
		return GestioneVoloDatabase.getPartenzeDisponibili();
	}

	// controlla se è amministratore

	public static boolean controlloLoginAmministratore(Admin presuntoAdmin) {

		return GestioneAdminDatabase.isAmministratore(presuntoAdmin);
	}

	public static void insertVolo(Volo volo) {
		GestioneVoloDatabase.insertVolo(volo);
		GestionePostoDatabase.insertPostiVolo(volo);
	}

	public static List<Posto> getListaPostiDisponibili(Volo volo) {
		return GestionePostoDatabase.getListaPostiDisponibili(volo);
	}

	public static void aggiornaPostiDisponibili(List<Posto> listaPostiPrenotati) {

	}

	public static List<Prenotazione> getPrenotazionePerCliente(String codCliente) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerCliente(codCliente);

	}

	public static List<Prenotazione> getPrenotazioniPerVolo(String idVolo) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerVolo(idVolo);
	}

	public static void insertPrenotazione(Prenotazione prenotazione) {
		GestionePrenotazioneDatabase.insertPrenotazione(prenotazione);
	}

	public static void insertCliente(Cliente cliente) {

		GestioneClienteDatabase.insertCliente(cliente);
	}

	public static boolean login(String email, String pass) {
		return GestioneClienteDatabase.login(email, pass);
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

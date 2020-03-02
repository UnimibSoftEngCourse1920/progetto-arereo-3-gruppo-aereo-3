package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dataManagment.GestioneAdminDatabase;
import dataManagment.GestioneAereoportoDatabase;
import dataManagment.GestioneClienteDatabase;
import dataManagment.GestionePostoDatabase;
import dataManagment.GestionePrenotazioneDatabase;
import dataManagment.GestioneVoloDatabase;
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

//		Per debug
//		Volo volo=new Volo();
//		SimpleDateFormat dateformat2= new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		 String strdate2 = "15-03-2020 12:00:00";
//		 String ritorno="15-03-2020 12:40:00";
//		volo.setDataPartenza(dateformat2.parse(strdate2));
//		volo.setDataArrivo(dateformat2.parse(ritorno));
//		volo.setGate("B3");	
//		volo.setDestinazione("NA08");
//		volo.setPartenza("BS75");
//		volo.setNumeroPosti(5);
//		volo.setPromo(null);
//		insertVolo(volo,"15","30","16","30");
	}

	public static boolean controlloDisponibilità(Date dataPartenza, String partenza, String destinazione ) throws SQLException, ClassNotFoundException {

		List<Volo> listVoli=GestioneVoloDatabase.getListaVoliAndataORitorno(dataPartenza, partenza, destinazione);
		
		if(listVoli.size()==0 || listVoli==null)
			return false;
		
		return true;

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

	public static boolean controlloLoginAmministratore(String username, String password) {

		return GestioneAdminDatabase.isAmministratore(username,password);
	}

	public static void insertVolo(Volo volo, String oraPartenza, String minutiPartenza, String oraArrivo, String minutiArrivo) {
		GestioneVoloDatabase.insertVolo(volo, oraPartenza, minutiPartenza, oraArrivo, minutiArrivo );

		GestionePostoDatabase.insertPostiVolo(volo);
	}

	public static List<Posto> getListaPostiDisponibili(int volo) {
		return GestionePostoDatabase.getListaPostiDisponibili(volo);
	}



	public static List<Prenotazione> getPrenotazionePerCliente(int codCliente) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerCliente(codCliente);

	}

	public static List<Prenotazione> getPrenotazioniPerVolo(String idVolo) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerVolo(idVolo);
	}

	public static void insertPrenotazione(Cliente c, int v, List<Posto> p) {
		GestionePrenotazioneDatabase.insertPrenotazione(c, v, p);
	}

	public static void insertCliente(Cliente cliente) {

		GestioneClienteDatabase.insertCliente(cliente);
	}

	public static Cliente login(String email, String pass) {
		return GestioneClienteDatabase.login(email, pass);
	}
	
	public static String parserCodiceAereoporto(String denominazione) {
	
		return  GestioneAereoportoDatabase.parserCodiceAereoporto(denominazione);

	}

}


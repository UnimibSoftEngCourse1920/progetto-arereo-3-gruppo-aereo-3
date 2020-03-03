package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dataManagment.GestioneAdminDatabase;
import dataManagment.GestioneAereoportoDatabase;
import dataManagment.GestioneClienteDatabase;
import dataManagment.GestionePostoDatabase;
import dataManagment.GestionePrenotazioneDatabase;
import dataManagment.GestionePromozioneDatabase;
import dataManagment.GestioneVoloDatabase;
import dominio.Aereoporto;
import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Posto;
import dominio.Prenotazione;
import dominio.Promozione;
import dominio.Volo;
import gui.Home;

public class Controller {
	private static Log logger= LogFactory.getLog(Controller.class);

	//Punto di entrata dell'applicazione
	public static void main(String [] args) throws ParseException {
		System.out.println("Main da chiamare all'eseguibile");
		Home.main(args);
	}

	
	//GESTIONE ADMIN
	/********************************************************/
	public static boolean controlloLoginAmministratore(String username, String password) {

		return GestioneAdminDatabase.isAmministratore(username,password);
	}

	public static void aggiornaVoloAdmin(int idVolo, String orarioPartenza, String minutiPartenza, String gate, Date dataPartenza, String orarioArrivo, String minutiArrivo, Date dataArrivo) {
		
		GestioneAdminDatabase.aggiornaVolo(idVolo, orarioPartenza, minutiPartenza, gate, dataPartenza, orarioArrivo, minutiArrivo, dataArrivo);

	}
	
	/**********************************************************/
	//GESTIONE CLIENTI
	
	/********************************************************/
	public static void insertCliente(Cliente cliente) {

		GestioneClienteDatabase.insertCliente(cliente);
	}
	
	public static void insertListaClienti(ArrayList<Cliente> clienti) {
		GestioneClienteDatabase.insertClienti(clienti);
	}
	
	public static boolean controlloDisponibilità(Date dataPartenza, String partenza, String destinazione ) throws SQLException, ClassNotFoundException {

		List<Volo> listVoli=GestioneVoloDatabase.getListaVoliAndata(dataPartenza, partenza, destinazione);

		if(listVoli.size()==0 || listVoli==null)
			return false;

		return true;

	}
	public static Cliente login(String email, String pass) {
		return GestioneClienteDatabase.login(email, pass);
	}

	public static Prenotazione loginCliente(int idPrenotazione, String email ) {
	return GestioneClienteDatabase.loginCliente(idPrenotazione, email);
	}
	
	public static void signToLoyalty(Cliente cliente, String nome, String cognome, String indirizzo,
			Date date, String email) {
		GestioneClienteDatabase.signToLoyalty(cliente, nome, cognome, indirizzo, date, email);
	}
	
	public static void deleteCliente(Cliente cliente) {
		GestioneClienteDatabase.deleteCliente(cliente);
	}
	
	
	public static List<Cliente> getListaClienti() {
		return GestioneClienteDatabase.getClienti();
	}

	public static List<ClienteFedele> getClientiFedeli() {
		return GestioneClienteDatabase.getClientiFedeli();
	}
	
	/**********************************************************/
	// GESTIONE POSTI
	/*********************************************************/
	public static List<Posto> getListaPostiDisponibili(int volo) {
		return GestionePostoDatabase.getListaPostiDisponibili(volo);
	}

	public static Posto getPosto(char lettera, int fila, int idVolo) {
		return GestionePostoDatabase.getPosto(lettera, fila, idVolo);
	}
	
	public static void aggiornaPostiPrenotati(List <Posto> listaPosti, Prenotazione prenotazione){
		GestionePostoDatabase.aggiornaPostiPrenotati(listaPosti, prenotazione);
	}
	
	public static List<Posto> getPostiPerPrenotazione(int idPrenotazione){
		return GestionePostoDatabase.getPostiPerPrenotazione(idPrenotazione);
	}
	
	public static int getNumPostiPerPrenotazione(int idPrenotazione) {
		return GestionePostoDatabase.getNumPostiPerPrenotazione(idPrenotazione);
	}
	
	/********************************************************/
	//GESTIONE PRENOTAZIONI
	/****************************************************/
	public static List<Prenotazione> getPrenotazionePerCliente(int codCliente) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerCliente(codCliente);

	}
	
	public static Prenotazione getPrenotazione(int id) {
		return GestionePrenotazioneDatabase.getPrenotazioneDaId(id);

	}
	
	public static List<Prenotazione> getPrenotazioniPerVolo(String idVolo) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerVolo(idVolo);
	}
	
	public static void insertPrenotazione(Cliente c, int v, List<Posto> posti) {
		GestionePrenotazioneDatabase.insertPrenotazione(c, v, posti);
	}
	
	public static List<Prenotazione> getPrenotazioniInScadenza(){
		return GestionePrenotazioneDatabase.getPrenotazioniInScadenza();
	}

	public static void pagamentoPrenotazione(Prenotazione prenotazione) {
		GestionePrenotazioneDatabase.pagamentoPrenotazione(prenotazione);
	}
	
	public static int getIdPrenotazione(Cliente c, int v, List<Posto> posti) {
		return GestionePrenotazioneDatabase.getIdPrenotazione(c, v, posti);
	}


	public static void eliminaPrenotazione(int id) {
		GestionePrenotazioneDatabase.deletePrenotazione(id);
	}


	/***************************************************/
	//GESTIONE PROMOZIONE
	/***************************************************/
	public static List<Promozione> getPromozioni(){
		return GestionePromozioneDatabase.getAllPromozioni();
	}
	
	public static void insertPromozione(Date inizio, Date fine, String msg, Volo v) {
		GestionePromozioneDatabase.insertPromozione(inizio, fine, msg, v);
	}
	
	public static Promozione getPromozione(int idPromo) {
		return GestionePromozioneDatabase.getPromozione(idPromo);
	}
	/***************************************************/
	//GESTIONE VOLO
	/************************************************/
	public static List<Volo> getListaVoli() {
		return GestioneVoloDatabase.getListaVoliDisponibili();
	}
 
	public static List<String> getDestinazioniVoliDisponibili() {
		return GestioneVoloDatabase.getDestinazioniDisponibili();
	}

	public static Volo getVolo(int idVolo) {
		return GestioneVoloDatabase.getVolo(idVolo);
	}
	
	public static List<String> getDestinazioniDisponibili(){
	return GestioneVoloDatabase.getDestinazioniDisponibili();
	}

	
	public static List<String> getPartenzeVoliDisponibili() {
		return GestioneVoloDatabase.getPartenzeDisponibili();
		
	}

	public static List<Volo> getInfoVoli(Volo volo) {

		return GestioneVoloDatabase.getListInfo(volo);

	}
	
	public static void insertVolo(Volo volo, String oraPartenza, String minutiPartenza, String oraArrivo, String minutiArrivo) {
		GestioneVoloDatabase.insertVolo(volo, oraPartenza, minutiPartenza, oraArrivo, minutiArrivo );

		GestionePostoDatabase.insertPostiVolo(volo);
	}
	
	public static Volo getVoloDiPrenotazione(Prenotazione prenotazione) {
		return GestioneVoloDatabase.getVoloDiPrenotazione(prenotazione);
	}

	public static List<Volo> getListaVoliAndata(Date dataPartenza, String partenza, String destinazione ){
		return GestioneVoloDatabase.getListaVoliAndata(dataPartenza, partenza, destinazione);
	}
	
	
	/****************************************************/
	//GESTIONE AEREOPORTO

	public static String getDenominazioneAereoporto(String idAereoporto) {

		return GestioneAereoportoDatabase.parserAereoporto(idAereoporto);

	}
	
	public static String parserCodiceAereoporto(String denominazione) {
		return GestioneAereoportoDatabase.parserCodiceAereoporto(denominazione);
	}	
	
	public static String parserAereoporto(String idAereoporto  ) {
		return GestioneAereoportoDatabase.parserAereoporto(idAereoporto);
	}


}


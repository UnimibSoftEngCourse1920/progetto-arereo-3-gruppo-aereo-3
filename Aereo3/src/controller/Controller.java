package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;
import paymentManagment.CartaDiCredito;
import paymentManagment.GestorePagamento;

public class Controller {
	private static Log logger= LogFactory.getLog(Controller.class);

	//Punto di entrata dell'applicazione
	public static void main(String [] args) throws ParseException {
		System.out.println("Main da chiamare all'eseguibile");


		Home.main(args);
	}

	/*********************************************************/
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
	/*********************************************************/
	
	public static Cliente getCliente(String email) {
		return GestioneClienteDatabase.getCliente(email);
	}
	
	public static boolean trovaMail(String email) {
		return GestioneClienteDatabase.trovaMail(email);
	}
	
	public static boolean trovaCliente(int cliente, int idVolo) {
		return GestionePrenotazioneDatabase.trovaCliente(cliente, idVolo);
	}
	
	public static void insertCliente(Cliente cliente) {

		GestioneClienteDatabase.insertCliente(cliente);
	}
	
	public static void insertClienteFedele(ClienteFedele cliente) {

		GestioneClienteDatabase.insertClienteFedele(cliente);
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
	public static ClienteFedele login(String email, String pass) {
		return GestioneClienteDatabase.login(email, pass);
	}

	public static Prenotazione loginCliente(int idPrenotazione, String email ) {
	return GestioneClienteDatabase.loginCliente(idPrenotazione, email);
	}
	

	public static ClienteFedele signToLoyalty(Cliente c, String indirizzo, String pwd) {
		return GestioneClienteDatabase.signToLoyalty(c,	indirizzo, pwd);
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
	
	public static boolean isFedele(Cliente c) {
		return GestioneClienteDatabase.isFedele(c);
	}
	
	public static void addPunti(int codiceCliente, int punti) {
		GestioneClienteDatabase.addPunti(codiceCliente, punti);
	}
	
	public static Cliente getCliente(int id) {
		return GestioneClienteDatabase.getCliente(id);
	}
	
	public static List<ClienteFedele> getClientiInfedeli() {
		return GestioneClienteDatabase.getClientiInfedeli();
	}
	
	public static void updateInfedelta(ClienteFedele c, Date newInfedele, Date ultimoBiglietto) {
		GestioneClienteDatabase.updateInfedelta(c, newInfedele, ultimoBiglietto);
	}
	
	public static List<ClienteFedele> getClientiDaRimuovere(){
		return GestioneClienteDatabase.getClientiDaRimuovere();
	}
	
	public static HashMap<Integer, Integer> getPuntiFedelta(int codCliente){
		return GestioneClienteDatabase.getPuntiFedelta(codCliente);
	}
	
	/**********************************************************/
	// GESTIONE POSTI
	/*********************************************************/
	
	public static void modificaPrezzoPosti(List<Posto>listaPosti, double prezzo) {
		GestionePostoDatabase.modificaPrezzoPosti(listaPosti, prezzo);
	}
	
	public static List<Posto> getListaPostiDisponibili(int volo) {
		return GestionePostoDatabase.getListaPostiDisponibili(volo);
	}

	public static Posto getPosto(char lettera, int fila, int idVolo) {
		return GestionePostoDatabase.getPosto(lettera, fila, idVolo);
	}
	
	public static void aggiornaPostiPrenotati(List <Posto> listaPosti, int prenotazione){
		GestionePostoDatabase.aggiornaPostiPrenotati(listaPosti, prenotazione);
	}
	
	public static List<Posto> getPostiPerPrenotazione(int idPrenotazione){
		return GestionePostoDatabase.getPostiPerPrenotazione(idPrenotazione);
	}
	
	public static int getNumPostiPerPrenotazione(int idPrenotazione) {
		return GestionePostoDatabase.getNumPostiPerPrenotazione(idPrenotazione);
	}
	
	public static void modificaPuntiPosti(List<Posto>listaPosti, int punti) {
		GestionePostoDatabase.modificaPuntiPosti(listaPosti, punti);
	}
	
	/********************************************************/
	//GESTIONE PRENOTAZIONI
	/*******************************************************/
	
	public static List<Prenotazione> getPrenotazionePerCliente(int codCliente) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerCliente(codCliente);

	}

	
	public static List<Prenotazione> getPrenotazioniPerVolo(int idVolo) {
		return GestionePrenotazioneDatabase.getPrenotazioniPerVolo(idVolo);
	}
	
	public static void insertPrenotazione(Cliente c, int v, List<Posto> posti) {
		GestionePrenotazioneDatabase.insertPrenotazione(c, v, posti);
	}
	
	public static List<Prenotazione> getPrenotazioniInScadenza(){
		return GestionePrenotazioneDatabase.getPrenotazioniInScadenza();
	}

	public static void pagamentoPrenotazione(int prenotazione) {
		GestionePrenotazioneDatabase.pagamentoPrenotazione(prenotazione);
	}
	
	public static int getIdPrenotazione(Cliente c, int v, List<Posto> posti) {
		return GestionePrenotazioneDatabase.getIdPrenotazione(c, v, posti);
	}
	
	public static List<Prenotazione> getPrenotazioniScadute(){
		return GestionePrenotazioneDatabase.getPrenotazioniScadute();
	}
	
	public static void deletePrenotazione(Prenotazione p) {
		GestionePrenotazioneDatabase.deletePrenotazione(p);
	}
	
	public static Prenotazione getPrenotazionePerId(int id) {
		return GestionePrenotazioneDatabase.getPrenotazionePerId(id);
	}
	
	public static int getSovrapprezzo(int idOld, int costoNuovo) {
		return GestionePrenotazioneDatabase.getSovrapprezzo(idOld, costoNuovo);
	}

	/****************************************************/
	//GESTIONE PROMOZIONE
	/***************************************************/
	
	public static List<Promozione> getPromozioni(Date now){
		return GestionePromozioneDatabase.getAllPromozioni(now);
	}
	
	public static double applyPromozione(int codPromo, Volo v, double prezzoTot) {
	return  GestionePromozioneDatabase.applyPromozione(codPromo, v, prezzoTot);
	}
	
	public static void insertPromozione(Date inizio, Date fine, String partenza, String arrivo, double sconto, boolean perFedele) {
		GestionePromozioneDatabase.insertPromozione(inizio, fine, partenza, arrivo, sconto, perFedele);
	}
	
	public static Promozione getPromozione(int idPromo) {
		return GestionePromozioneDatabase.getPromozione(idPromo);
	}
	
	/***************************************************/
	//GESTIONE VOLO
	/**************************************************/
	
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
	
	public static void insertVolo(Volo volo, String oraPartenza, String minutiPartenza, String oraArrivo, String minutiArrivo, double prezzoPosto, int puntiPosto) {
		GestioneVoloDatabase.insertVolo(volo, oraPartenza, minutiPartenza, oraArrivo, minutiArrivo );

		GestionePostoDatabase.insertPostiVolo(volo, prezzoPosto, puntiPosto);
	}
	
	public static Volo getVoloDiPrenotazione(Prenotazione prenotazione) {
		return GestioneVoloDatabase.getVoloDiPrenotazione(prenotazione);
	}

	public static List<Volo> getListaVoliAndata(Date dataPartenza, String partenza, String destinazione ){
		return GestioneVoloDatabase.getListaVoliAndata(dataPartenza, partenza, destinazione);
	}
	
	public static String convertiData(Date data) {
		return GestioneVoloDatabase.convertiData(data);
	}
	
	/****************************************************/
	//GESTIONE AEREOPORTO
	/***************************************************/
	
	public static List<String> getDenominazioneAereoporti(){
		return GestioneAereoportoDatabase.getDenominazioniAereoporti();
	}

	public static String getDenominazioneAereoporto(String idAereoporto) {

		return GestioneAereoportoDatabase.parserAereoporto(idAereoporto);

	}
	
	public static String parserCodiceAereoporto(String denominazione) {
		return GestioneAereoportoDatabase.parserCodiceAereoporto(denominazione);
	}	
	
	public static String parserAereoporto(String idAereoporto  ) {
		return GestioneAereoportoDatabase.parserAereoporto(idAereoporto);
	}
	
	public static List<Volo> getPartenzaDestinazione(String partenza1, String arrivo1){
		return GestioneVoloDatabase.getVoloPartenzaDestinazione(partenza1, arrivo1);
	}
	
	/**Inserisce l'aereoporto nel DB**/
	public static void inserAereoporto(Aereoporto a) {
		GestioneAereoportoDatabase.insertAereoporto(a);
	}
	
	/****************************************************/
	//GESTIONE MAIL
	/***************************************************/
	
	public static GestoreMail getGestoreMail() {
		return GestoreMail.getInstance();
	}
	
	public static void sendMail(GestoreMail ge, String email, String subject, String content) {
		ge.sendMail(email, subject, content);
	}
	
	/****************************************************/
	//GESTIONE PAGAMENTO
	/***************************************************/
	
	public static boolean paga(CartaDiCredito cc, double importo) {
		return GestorePagamento.paga(cc, importo);
	}
	
	
}


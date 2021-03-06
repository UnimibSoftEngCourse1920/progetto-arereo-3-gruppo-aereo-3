package mailManagment;

public enum MessaggiPredefiniti {
	NUOVAPROMOZIONE_SUBJ("PROMOZIONE ECCEZIONALE!"),
	RESOCONTOPRENOTAZIONE_SUBJ("Resoconto prenotazione id. "),
	MODIFICA_VOLO_SBJ("Modifica volo id. "),
	MODIFICA_VOLO_TXT("Si comunica che il volo � cambiato, di seguito le nuove info: "),
	RESOCONTOPRENOTAZIONE_TXT("Gentile cliente, \n"
			+ "Qui di seguito il resoconto della sua prenotazione da esibire al check-in: \n"),
	SCADENZAPRENOTAZIONE_SUBJ("Avviso scadenza prenotazione id. "),
	SCADENZAPRENOTAZIONE_TXT("Si avvisa il gentile cliente che la prenotazione scade tra 24h \n"
			+ "Se non verr� pagata tale prenotazione sar� automaticamente cancellata"),
	INFEDELE_SUBJ("Inattivit� programma fedelt�"),
	INFEDELE_TXT("Si avvisa il gentile cliente che non avendo acquistato biglietti per 2 anni"
			+ " il suo account � in uno stato di \"infedelt�\"; se non acquista un biglietto"
			+ " nell'arco del prossimo anno il suo account sar� automaticamente cancellato"),
	FEDELE_SUBJ("Programma Fedelt� compagnia Aereo3PJ"),
	FEDELE_TXT("Gentile cliente, \n"
			+ "Grazie per aver aderito al nostro programma fedelt�! \n"
			+ "CONDIZIONI D'USO: \n"
			+ "- Se non si compra un biglietto nell'arco di 2 anni passer� in uno stato di \"infedelt�\" \n"
			+ "- Se � in stato di infedelt� e non compra un biglietto nell'arco di un anno verr� automaticamente rimosso \n"
			+ "- Ricever� tutte le ultime promozioni della compagnia via mail"),
	INFEDELE_RIMOZIONE_SUBJ("Rimozione dal programma fedelt�"),
	INFEDELE_RIMOZIONE_TXT("Si avvisa il gentile cliente che vista le sua inattivit�, � stato rimosso dal"
			+ " programma di fedelt� come da condizioni d\'uso."),
	PRENOTAZIONESCADUTA_RIMOZIONE_SUBJ("Rimozione scadenza insoluta id. "),
	PRENOTAZIONESCADUTA_RIMOZIONE_TXT("Si avvisa il cliente che non avendo pagato la prenotazione entro i "
			+ "termini stabiliti dal regolamento, la sua prenotazione � stata annullata."),
	PRENOTAZIONE_ELIMINATA_SBJ("Cancellazione prenotazione id. "),
	PRENOTAZIONE_ELIMINATA_TXT("Si avvisa il gentile cliente che la prenotazione � stata cancellata con successo. "
			+ "Non c\'� possibilit� di rimborso e in caso avesse pagato, i punti a lei aggiunti saranno decurtati.");
	
	private final String messaggio;
	
	private MessaggiPredefiniti(String msg){
		this.messaggio = msg;
	}
	
	public String getMessaggio() {
		return this.messaggio;
	}
}

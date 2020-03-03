package mailManagment;

public enum MessaggiPredefiniti {
	NUOVAPROMOZIONE_SUBJ("PROMOZIONE ECCEZIONALE!"),
	//NUOVAPROMOZIONE_TXT(""),
	RESOCONTOPRENOTAZIONE_SUBJ("Resoconto prenotazione id. "),
	//RESOCONTOPRENOTAZIONE_TXT(""),
	SCADENZAPRENOTAZIONE_SUBJ("Avviso scadenza prenotazione id."),
	SCADENZAPRENOTAZIONE_TXT("Si avvisa il gentile cliente che la prenotazione scade tra 24h"
			+ '\n' + "Se non verrà pagata tale prenotazione sarà automaticamente cancellata"),
	INFEDELE_SUBJ("Inattività programma fedeltà"),
	INFEDELE_TXT("Si avvisa il gentile cliente che non avendo acquistato biglietti per 2 anni"
			+ "il suo account è in uno stato di \"infedeltà\"; se non acquista un biglietto"
			+ "nell'arco del prossimo anno il suo account sarà automaticamente cancellato");
	
	private final String messaggio;
	
	private MessaggiPredefiniti(String msg){
		this.messaggio = msg;
	}
	
	public String getMessaggio() {
		return this.messaggio;
	}
}

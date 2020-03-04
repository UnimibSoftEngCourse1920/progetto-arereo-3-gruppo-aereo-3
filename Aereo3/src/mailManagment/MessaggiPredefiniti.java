package mailManagment;

public enum MessaggiPredefiniti {
	NUOVAPROMOZIONE_SUBJ("PROMOZIONE ECCEZIONALE!"),
	RESOCONTOPRENOTAZIONE_SUBJ("Resoconto prenotazione id. "),
	RESOCONTOPRENOTAZIONE_TXT("Gentile cliente," + '\n'
			+ "Qui di seguito il resoconto della sua prenotazione da esibire al check-in:" + '\n'),
	SCADENZAPRENOTAZIONE_SUBJ("Avviso scadenza prenotazione id."),
	SCADENZAPRENOTAZIONE_TXT("Si avvisa il gentile cliente che la prenotazione scade tra 24h"
			+ '\n' + "Se non verrà pagata tale prenotazione sarà automaticamente cancellata"),
	INFEDELE_SUBJ("Inattività programma fedeltà"),
	INFEDELE_TXT("Si avvisa il gentile cliente che non avendo acquistato biglietti per 2 anni"
			+ "il suo account è in uno stato di \"infedeltà\"; se non acquista un biglietto"
			+ "nell'arco del prossimo anno il suo account sarà automaticamente cancellato"),
	FEDELE_SUBJ("Programma Fedeltà compagnia Aereo3PJ"),
	FEDELE_TXT("Gentile cliente," + '\n'
			+ "Grazie per aver aderito al nostro programma fedeltà!" + '\n'
			+ "CONDIZIONI D'USO:" + '\n'
			+ "- Se non si compra un biglietto nell'arco di 2 anni passerà in uno stato di \"infedeltà\"" + '\n'
			+ "- Se è in stato di infedeltà e non compra un biglietto nell'arco di un anno verrà automaticamente rimosso"
			+ "- Riceverà tutte le ultime promozioni della compagnia via mail");
	
	private final String messaggio;
	
	private MessaggiPredefiniti(String msg){
		this.messaggio = msg;
	}
	
	public String getMessaggio() {
		return this.messaggio;
	}
}

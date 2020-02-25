package dominio;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cliente {

	private String codCliente;
	private String nome;
	private String cognome;
	private LocalDateTime dataDiNascita;
	private String email;
	private String indirizzo;
	//			private CartaDiCredito cartaDiCredito;

	public String getCodCliente() {
		return codCliente;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDateTime getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(LocalDateTime dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	/*****************************************/
	public void consultaVolo (String partenza, String destinazione, LocalTime orario) {

	}

	/*****************************************/
	public void prenotaVolo(Volo volo) {
		
	}

	/******************************************/
	
	public void paga(Prenotazione prenotazione) {
		
	}
	
	/*****************************************/
	public void modificaPrenotazione (Prenotazione prenotazione, LocalTime nuovoOrario) {
		
	}
	
	/****************************************/
	
	
}


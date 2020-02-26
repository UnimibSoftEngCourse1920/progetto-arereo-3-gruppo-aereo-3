
package dominio;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="cliente")
public class Cliente {

	//TODO: sistemare il database, diversificare il cliente fedele
	@Id
	@Column(name="cod_cliente")
	private String codCliente;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cognome")
	private String cognome;
	
	@Column(name="data_di_nascita")
	private LocalDateTime dataDiNascita;
	
	@Column(name="email")
	private String email;
	
	@Column(name="indirizzo")
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

	public static boolean consultaVolo(Volo voloDaControllare) {
	
		
		return false;
	}

	
	/****************************************/
	
	
	
	
	/****************************************/
	
	

	
}


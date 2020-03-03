package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cliente_fedele")
public class ClienteFedele extends Cliente {
	
	@Column(name = "punti")
	private int punti;

	@Column(name = "data_iscrizione")
	private Date dataIscrizione;
	
	@Column(name = "data_ultimo_biglietto")
	private Date ultimoBiglietto;


	// data in cui il cliente è diventato infedele (dopo due anni che non acquista
	// biglietti)
	@Column(name = "infedele")
	private Date infedele;
	
	@Column(name = "indirizzo")
	private String indirizzo;
	
	@Column(name = "password")
	private String psw;
	
	@Column(name = "data_di_nascita")
	private Date dataDiNascita;
	

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Date getInfedele() {
		return infedele;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public void setInfedele(Date infedele) {
		this.infedele = infedele;
	}

	public void setUltimoBiglietto(Date ultimoBiglietto) {
		this.ultimoBiglietto = ultimoBiglietto;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public Date getDataIscrizione() {
		return dataIscrizione;
	}

	public void setDataIscrizione(Date dataIscrizione) {

		this.dataIscrizione = dataIscrizione;
	}

	public Date getUltimoBiglietto() {
		// da sistemare
		return null;

	}
}

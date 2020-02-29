package dominio;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="promozione")
public class Promozione {

	@Id
	@Column(name="id_promozione")
	private int idPromozione;
	
	@Column(name="data_inizio")
	private Date dataInizio;
	
	@Column(name="data_fine")
	private Date dataFine;
	
	@Column(name="messaggio")
	private String messaggio;
	
	@Column(name="sconto")
	private double sconto;
	
	@Column(name="id_volo")
	private int idVolo;

	public double getSconto() {
		return sconto;
	}
	
	public void setSconto(double sconto) {
		this.sconto = sconto;
	}
	
	public Date getDataInizio() {
		return dataInizio;
	}
	
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	public Date getDataFine() {
		return dataFine;
	}
	
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	
	public String getMessaggio() {
		return messaggio;
	}
	
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}
	
}

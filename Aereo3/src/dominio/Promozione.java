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
	
	@Column(name="sconto")
	private double sconto;
	
	@Column(name="partenza")
	private String partenza;
	
	@Column(name="destinazione")
	private String destinazione;
	
	@Column(name="fedele")
	private boolean perFedele;

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

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public boolean isPerFedele() {
		return perFedele;
	}

	public int getIdPromozione() {
		return idPromozione;
	}

	public void setFedele(boolean fedele) {
		this.perFedele = fedele;
	}
	
}

package dominio;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="prenotazione")
public class Prenotazione {

	//TODO Controllare se è da cambiare la classe o il database, manca punti totali
	// qui manca id della prenotazione, le classi devono essere la copia (o con elementi in più) del database
	@Id
	@Column(name="id_prenotazione")
	private int id;
	
	@Transient
	private List<Posto> listaBiglietti;
	
	@Column(name="pagato")
	private boolean pagato;

	@Column(name="prezzo_totale")
	private double prezzoTotale;
	
	@Column(name="punti_totali")
	private int puntiTotali;
	
	@Column(name="cod_cliente")
	private int codCliente;

	@Column(name="id_volo")
	private int idVolo;
	
	@Column(name="prezzo_punti_totali")
	private int prezzoPuntiTotale;
	
	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}
	
	public int getId() {
		return id;
	}
	
	public List<Posto> getListaBiglietti() {
		return listaBiglietti;
	}
	public void setListaBiglietti(List<Posto> listaBiglietti) {
		this.listaBiglietti = listaBiglietti;
		this.prezzoTotale = 0.0;
		this.puntiTotali = 0;
		this.prezzoPuntiTotale = 0;
		
		for(Posto p : listaBiglietti) {
			this.prezzoTotale += p.getPrezzo();
			this.puntiTotali += p.getPunti();
			this.prezzoPuntiTotale += p.getPrezzoPunti();
		}
	}
	
	
	public boolean isPagato() {
		return pagato;
	}
	public void setPagato(boolean pagato) {
		this.pagato = pagato;
	}
	
	
	public double getPrezzoTotale() {
		return prezzoTotale;
	}
	
	public int getPuntiTotali() {
		return puntiTotali;
	}
	
	public int getPrezzoPuntiTotale() {
		return this.prezzoPuntiTotale;
	}

}

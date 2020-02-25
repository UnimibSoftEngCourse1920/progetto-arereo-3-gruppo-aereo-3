package dominio;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="prenotazione")
public class Prenotazione {

	//TODO Controllare se è da cambiare la classe o il database, manca punti totali
	// qui manca id della prenotazione, le classi devono essere la copia (o con elementi in più) del database
	
	@Column(name="id_prenotazione")
	private int id;
	
	@Transient
	private List <Posto> listaBiglietti;
	
	@Column(name="pagato")
	private boolean pagato;
	
	@Column(name="prezzo_totale")
	private double prezzoTotale;
	
	@Transient
	private int puntiTotali;
	
	public int getId() {
		return id;
	}
	
	public List<Posto> getListaBiglietti() {
		return listaBiglietti;
	}
	public void setListaBiglietti(List<Posto> listaBiglietti) {
		this.listaBiglietti = listaBiglietti;
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
	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}
	
	
	public int getPuntiTotali() {
		return puntiTotali;
	}
	public void setPuntiTotali(int puntiTotali) {
		this.puntiTotali = puntiTotali;
	}
	
	/*************************************/
	public void notify (String scadenza, List<Cliente> listaCliente) {
		
	}

}

package dominio;


import java.util.List;

public class Prenotazione {

	private int id;
	private List <Posto> listaBiglietti;
	private boolean pagato;
	private double prezzoTotale;
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

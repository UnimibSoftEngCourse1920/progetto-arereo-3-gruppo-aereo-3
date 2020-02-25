package dominio;


public class Posto {

	private int fila;
	private boolean prenotato;
	private char lettera;
	private double prezzo;
	private int punti;
	private int prezzoPunti;
	
	
	public int getFila() {
		return fila;
	}
	public void setFile(int file) {
		this.fila = file;
	}
	
	
	public boolean isPrenotato() {
		return prenotato;
	}
	public void setPrenotato(boolean prenotato) {
		this.prenotato = prenotato;
	}
	
	
	public char getLettera() {
		return lettera;
	}
	public void setLettera(char lettera) {
		this.lettera = lettera;
	}
	
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	public int getPunti() {
	
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	
	
	public int getPrezzoPunti() {
		return prezzoPunti;
	}
	public void setPrezzoPunti(int prezzoPunti) {
		this.prezzoPunti = prezzoPunti;
	}
	
	
	

}

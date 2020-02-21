package dominio;


import java.time.LocalTime;

public class Volo {
	
	private int idVolo;
	private String destinazione;
//	private String partenza;
	private LocalTime orarioPartenza;
	private LocalTime orarioArrivo;
	private int numeroPosti;
	private String gate;
	
	
	public int getIdVolo() {
		return idVolo;
	}
	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}
	
	
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	
	
	public LocalTime getOrarioPartenza() {
		return orarioPartenza;
	}
	public void setOrarioPartenza(LocalTime orarioPartenza) {
		this.orarioPartenza = orarioPartenza;
	}
	
	
	public LocalTime getOrarioArrivo() {
		return orarioArrivo;
	}
	public void setOrarioArrivo(LocalTime orarioArrivo) {
		this.orarioArrivo = orarioArrivo;
	}
	
	
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	
	/*****************************************/
	

}

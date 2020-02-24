package dominio;


import java.sql.Time;

public class Volo {
	
	private int idVolo;
	private String destinazione;
	private String partenza;
	private Time orarioPartenza;
	private Time orarioArrivo;
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
	
	
	public Time getOrarioPartenza() {
		return orarioPartenza;
	}
	public void setOrarioPartenza(Time time) {
		this.orarioPartenza = time;
	}
	
	
	public Time getOrarioArrivo() {
		return orarioArrivo;
	}
	public void setOrarioArrivo(Time time) {
		this.orarioArrivo = time;
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
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		Volo v=(Volo) obj;
		
		if(!(this.getPartenza().equalsIgnoreCase(v.getPartenza())))
			return false;
		
		if(!(this.getDestinazione().equalsIgnoreCase(v.getDestinazione())))
			return false;

		if(!(this.getOrarioPartenza().toString().equalsIgnoreCase(v.getOrarioPartenza().toString())))
			return false;

		return true;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	
	
	
	/*****************************************/
	
	
	

}

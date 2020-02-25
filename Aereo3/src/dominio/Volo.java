
package dominio;


import java.time.LocalTime;

public class Volo {
	
	private String idVolo;
	private String destinazione;
	private String partenza;
	private LocalTime orarioPartenza;
	private LocalTime orarioArrivo;
	private int numeroPosti;
	private String gate;
	private Promozione promo;

	public String getIdVolo() {
		return idVolo;
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
	
	public Promozione getPromo() {
		return promo;
	}

	public void setPromo(Promozione promo) {
		this.promo = promo;
	}
	
	/*****************************************/
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

}

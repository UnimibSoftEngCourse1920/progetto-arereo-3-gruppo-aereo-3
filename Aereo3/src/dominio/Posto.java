package dominio;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="posto")
public class Posto {

	@EmbeddedId
    private PostoCombinedKey chiaveComposta = new PostoCombinedKey();

	
	@Column(name="id_prenotazione")
	private Integer idPrenotazione;

	@Column(name="prezzo")
	private double prezzo;
	
	@Column(name="punti")
	private int punti;
	
	@Column(name="prezzo_punti")
	private int prezzoPunti;
	
	
	
	
	
	public PostoCombinedKey getChiaveComposta() {
		return chiaveComposta;
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
	@Override
	public String toString() {
		return chiaveComposta + ", prezzo= " + prezzo + ", punti= " + punti + ", prezzoPunti= " + prezzoPunti;
	}
	
	
	

}

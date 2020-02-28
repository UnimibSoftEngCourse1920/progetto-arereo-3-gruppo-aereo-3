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
    private PostoCombinedKey chiaveComposta=new PostoCombinedKey();

	
	@Transient
	private boolean prenotato;

	@Column(name="id_volo")
	private int idVolo;
	
	@Column(name="prezzo")
	private double prezzo;
	
	@Column(name="punti")
	private int punti;
	
	@Column(name="prezzo_punti")
	private int prezzoPunti;
	
	
	
	
	
	public PostoCombinedKey getChiaveComposta() {
		return chiaveComposta;
	}
	public void setChiaveComposta(PostoCombinedKey chiaveComposta) {
		this.chiaveComposta = chiaveComposta;
	}
	public boolean isPrenotato() {
		return prenotato;
	}
	public void setPrenotato(boolean prenotato) {
		this.prenotato = prenotato;
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

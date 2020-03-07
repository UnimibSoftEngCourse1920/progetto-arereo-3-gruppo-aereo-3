
package dominio;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import controller.Controller;

@Entity
@Table(name="volo")
public class Volo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_volo")
	private int idVolo;
	
	@Column(name="destinazione")
	private String destinazione;
	
	@Column(name="partenza")
	private String partenza;
	
	//Clark: cambiati i tipi in Date
	@Column(name="data_partenza")
	private Date dataPartenza;
	
	//Clark: cambiato in data di ritorno
	@Column(name="data_arrivo")
	private Date dataArrivo;
	
	@Column(name="n_posti")
	private int numeroPosti;
	
	@Column(name="gate")
	private String gate;
	
	@Transient
	private Promozione promo;


	public int getIdVolo() {
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
	
	public Date getDataPartenza() {
		return dataPartenza;
	}
	
	public void setDataPartenza(Date dataPartenza) {
		this.dataPartenza = dataPartenza;
	}
	
	public Date getDataArrivo() {
		return dataArrivo;
	}
	
	public void setDataArrivo(Date dataArrivo) {
		this.dataArrivo = dataArrivo;
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
	
	
	


	//@Override
	public String toString(String partenza, String arrivo) {
		return "Volo [idVolo=" + idVolo  + ", partenza=" + Controller.getDenominazioneAereoporto(partenza)
				+ ", destinazione=" + Controller.getDenominazioneAereoporto(arrivo)
				+ ", dataPartenza=" + dataPartenza + ", dataArrivo=" + dataArrivo + ", gate=" + gate + "]";
	}

	/*****************************************/


}

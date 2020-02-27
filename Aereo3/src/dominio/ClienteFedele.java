package dominio;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="cliente")
@DiscriminatorValue("1")
public class ClienteFedele extends Cliente {

	@Column(name = "punti")
	private int punti;

	@Column(name="data_iscrizione")
	private Date dataIscrizione;

	@Transient
	private Date ultimoBiglietto;
	
	@Column(name="fedele")
	private boolean fedele;

//    private static PagaStrategy strategy;

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}
	
	
	public Date getDataIscrizione() {
		return dataIscrizione;
	}
	public void setDataIscrizione(Date dataIscrizione) {

		this.dataIscrizione = dataIscrizione;
	}
	
	
	public Date getUltimoBiglietto() {
		// da sistemare
		return null;

}
}

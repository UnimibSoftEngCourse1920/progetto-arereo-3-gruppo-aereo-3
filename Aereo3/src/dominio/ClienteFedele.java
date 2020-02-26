package dominio;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Transient;

@MappedSuperclass
public class ClienteFedele extends Cliente {

	
	@Column(name="punti")
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
		return ultimoBiglietto;
	}
	public void setUltimoBiglietto(Date ultimoBiglietto) {
		this.ultimoBiglietto = ultimoBiglietto;
	}
	
	
	public boolean isFedele() {
		return fedele;
	}
	public void setInfedele(boolean stato) {
		this.fedele = stato;
	}
	
	
//	public static PagaStrategy getStrategy() {
//		return strategy;
//	}
//	public static void setStrategy(PagaStrategy strategy) {
//		ClienteFedele.strategy = strategy;
//	}
//    
    
	/*************************************/
//	public void notify (String scadenza, List<Cliente> listaCliente) {
//		
//	}


}

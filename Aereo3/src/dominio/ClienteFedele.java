package dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="cliente")
@DiscriminatorValue("1")
public class ClienteFedele extends Cliente {

	@Column(name = "punti")
	private int punti;

	@Column(name = "data_iscrizione")
	private LocalDate dataIscrizione;

	//@Transient
	//private LocalDateTime ultimoBiglietto;

//    private static PagaStrategy strategy;

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public LocalDate getDataIscrizione() {
		return dataIscrizione;
	}

	public void setDataIscrizione(LocalDate dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	/*public LocalDateTime getUltimoBiglietto() {
		return ultimoBiglietto;
	}

	public void setUltimoBiglietto(LocalDateTime ultimoBiglietto) {
		this.ultimoBiglietto = ultimoBiglietto;
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

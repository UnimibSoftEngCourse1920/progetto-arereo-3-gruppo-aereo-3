package dominio;


import java.time.LocalDateTime;

public class ClienteFedele extends Cliente {

	private int punti;
	private LocalDateTime dataIscrizione;
	private LocalDateTime ultimoBiglietto;
	private boolean stato;
//    private static PagaStrategy strategy;
    
    
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	
	
	public LocalDateTime getDataIscrizione() {
		return dataIscrizione;
	}
	public void setDataIscrizione(LocalDateTime dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}
	
	
	public LocalDateTime getUltimoBiglietto() {
		return ultimoBiglietto;
	}
	public void setUltimoBiglietto(LocalDateTime ultimoBiglietto) {
		this.ultimoBiglietto = ultimoBiglietto;
	}
	
	
	public boolean isStato() {
		return stato;
	}
	public void setStato(boolean stato) {
		this.stato = stato;
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

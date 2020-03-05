package paymentManagment;

import java.util.Date;

public class CartaDiCredito {
	private String numeroCarta;
	private Date expiry;
	private String cvc;
	
	public CartaDiCredito(String numeroCarta, Date expiry, String cvc) {
		this.numeroCarta = numeroCarta;
		this.expiry = expiry;
		this.cvc = cvc;
	}

	public String getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	
}

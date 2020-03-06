package paymentManagment;

import java.util.Calendar;
import java.util.Date;

public class GestorePagamento {
	
	public static boolean paga(CartaDiCredito cc, double importo) {
		boolean cartaValida = validate(cc);
		boolean pagato = false;
		if(cartaValida) {
			//gateway con un ente di pagamento
			pagato = true; //parametro restituito da chi processa il pagamento
			return (pagato);
		} else {
			return cartaValida;
		}
	}
	
	public static boolean validate(CartaDiCredito cc) {
		String numeroCarta = cc.getNumeroCarta();
		Date expiry = cc.getExpiry();
		String cvv = cc.getCvc();
		
		if(cvv.length()!=3) {
			return false;
		}
		
		for (int i=0; i<3; i++) {
			if (cvv.charAt(i)<'0' || cvv.charAt(i)>'9') {
				return false;
			}
		}
		
		if(expiry.compareTo(Calendar.getInstance().getTime()) <= 0) {
			return false;
		}
		
		boolean valida = true;
		for(int i=0; i<numeroCarta.length(); i++) {
			if(numeroCarta.charAt(i) < '0' || numeroCarta.charAt(i) > '9') {
				valida = false;
			}
		}
		
		return valida;
	}
}

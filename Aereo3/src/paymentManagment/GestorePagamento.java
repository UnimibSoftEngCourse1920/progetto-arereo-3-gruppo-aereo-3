package paymentManagment;

import java.util.Calendar;
import java.util.Date;

public class GestorePagamento {
	
	public static boolean paga(CartaDiCredito cc) {
		boolean cartaValida = GestorePagamento.validate(cc);
		boolean pagato = false;
		if(cartaValida) {
			//gateway con un ente di pagamento
			pagato = true; //parametro restituito da chi processa il pagamento
			return (pagato);
		} else {
			return cartaValida;
		}
	}
	
	private static boolean validate(CartaDiCredito cc) {
		String numeroCarta = cc.getNumeroCarta();
		Date expiry = cc.getExpiry();
		
		if(expiry.compareTo(Calendar.getInstance().getTime()) <= 0)
			return false;
		
		boolean valida = true;
		for(int i=0; i<numeroCarta.length(); i++) {
			if(numeroCarta.charAt(i) < '0' || numeroCarta.charAt(i) < '9')
				valida = false;
		}
		
		return valida;
	}
}

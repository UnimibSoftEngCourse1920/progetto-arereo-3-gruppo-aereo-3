package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dataManagment.GestioneAereoportoDatabase;
import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Posto;
import dominio.Promozione;
import dominio.Volo;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;
import paymentManagment.CartaDiCredito;

public class Pagamento {
	
	private static Log logger=LogFactory.getLog(GestioneAereoportoDatabase.class);
	
	static JPanel esegui(JPanel contentPane, double costo, int costoPunti, JPanel posti, Cliente c, int idVolo, List<Posto> listaPosti, boolean fedele, JPanel homePanel, boolean modifica) {
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.BLUE);
		contentPane.add(panel6, "name_1494837157713800");
		panel6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.BLUE);
		panel6.add(panel7, BorderLayout.WEST);
		GridBagLayout gblPanel7 = new GridBagLayout();
		gblPanel7.columnWidths = new int[]{0, 0};
		gblPanel7.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel7.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gblPanel7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel7.setLayout(gblPanel7);
		
		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setForeground(Color.WHITE);
		lblPagamento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblPagamento = new GridBagConstraints();
		gbcLblPagamento.anchor = GridBagConstraints.WEST;
		gbcLblPagamento.insets = new Insets(0, 0, 5, 0);
		gbcLblPagamento.gridx = 0;
		gbcLblPagamento.gridy = 0;
		panel7.add(lblPagamento, gbcLblPagamento);
		
		Component horizonatlStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut = new  GridBagConstraints();
		gbcHorizontalStrut.insets = new Insets(0, 0, 5, 0);
		gbcHorizontalStrut.gridx = 1;
		gbcHorizontalStrut.gridy = 0;
		panel7.add(horizonatlStrut, gbcHorizontalStrut);
		

		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut6.gridx = 0;
		gbcVerticalStrut6.gridy = 1;
		panel7.add(verticalStrut6, gbcVerticalStrut6);
		
		JLabel lblNewLabel2 = new JLabel("Costo Totale");
		lblNewLabel2.setForeground(Color.WHITE);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbcLblNewLabel2 = new GridBagConstraints();
		gbcLblNewLabel2.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel2.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel2.gridx = 0;
		gbcLblNewLabel2.gridy = 2;
		panel7.add(lblNewLabel2, gbcLblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel(String.valueOf(costo)+"$");
		lblNewLabel3.setForeground(Color.WHITE);
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbcLblNewLabel3 = new GridBagConstraints();
		gbcLblNewLabel3.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel3.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel3.gridx = 0;
		gbcLblNewLabel3.gridy = 3;
		panel7.add(lblNewLabel3, gbcLblNewLabel3);
		
		Component verticalStrut7 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut7 = new GridBagConstraints();
		gbcVerticalStrut7.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut7.gridx = 0;
		gbcVerticalStrut7.gridy = 4;
		panel7.add(verticalStrut7, gbcVerticalStrut7);
		
		JLabel lblNumeroDiCarta = new JLabel("Numero di carta");
		lblNumeroDiCarta.setForeground(Color.WHITE);
		lblNumeroDiCarta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblNumeroDiCarta = new GridBagConstraints();
		gbcLblNumeroDiCarta.insets = new Insets(0, 0, 5, 0);
		gbcLblNumeroDiCarta.anchor = GridBagConstraints.WEST;
		gbcLblNumeroDiCarta.gridx = 0;
		gbcLblNumeroDiCarta.gridy = 5;
		panel7.add(lblNumeroDiCarta, gbcLblNumeroDiCarta);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.insets = new Insets(0, 0, 5, 0);
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.gridx = 0;
		gbcTextField.gridy = 6;
		panel7.add(textField, gbcTextField);
		textField.setColumns(10);
		
		JLabel lblScadenzaCarta = new JLabel("Data scadenza");
		lblScadenzaCarta.setForeground(Color.WHITE);
		lblScadenzaCarta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblScadenzaDiCarta = new GridBagConstraints();
		gbcLblScadenzaDiCarta.insets = new Insets(0, 0, 5, 0);
		gbcLblScadenzaDiCarta.anchor = GridBagConstraints.WEST;
		gbcLblScadenzaDiCarta.gridx = 2;
		gbcLblScadenzaDiCarta.gridy = 5;
		panel7.add(lblScadenzaCarta, gbcLblScadenzaDiCarta);
		

		Date now = new Date();
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDate(now);
		GridBagConstraints gbcDateChooser = new GridBagConstraints();
		gbcDateChooser.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbcDateChooser.gridx = 2;
		gbcDateChooser.gridy = 6;
		panel7.add(dateChooser, gbcDateChooser);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut1 = new GridBagConstraints();
		gbcHorizontalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut1.gridx = 3;
		gbcHorizontalStrut1.gridy = 5;
		panel7.add(horizontalStrut, gbcHorizontalStrut1);
		
		JLabel cvv = new JLabel("CVV");
		cvv.setForeground(Color.WHITE);
		cvv.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcCvv = new GridBagConstraints();
		gbcCvv.insets = new Insets(0, 0, 5, 5);
		gbcCvv.anchor = GridBagConstraints.WEST;
		gbcCvv.gridx = 4;
		gbcCvv.gridy = 5;
		panel7.add(cvv, gbcCvv);
		
		JTextField textFieldCvv = new JTextField();
		GridBagConstraints gbcTextFieldCvv = new GridBagConstraints();
		gbcTextFieldCvv.insets = new Insets(0, 0, 5, 0);
		gbcTextFieldCvv.fill = GridBagConstraints.HORIZONTAL;
		gbcTextFieldCvv.gridx = 4;
		gbcTextFieldCvv.gridy = 6;
		panel7.add(textFieldCvv, gbcTextFieldCvv);
		textField.setColumns(10);
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut8.gridx = 0;
		gbcVerticalStrut8.gridy = 7;
		panel7.add(verticalStrut8, gbcVerticalStrut8);
		
		JLabel erroreCarta = new JLabel("");
		erroreCarta.setForeground(Color.RED);
		erroreCarta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcErroreCarta = new GridBagConstraints();
		gbcErroreCarta.insets = new Insets(0, 0, 5, 5);
		gbcErroreCarta.anchor = GridBagConstraints.WEST;
		gbcErroreCarta.gridx = 0;
		gbcErroreCarta.gridy = 9;
		panel7.add(erroreCarta, gbcErroreCarta);
		
		JButton btnNewButton = new JButton("Paga");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CartaDiCredito cc = new CartaDiCredito(textField.getText(), dateChooser.getDate(), textFieldCvv.getText());
				
				int idPrenotazione = -1;

				if(Controller.paga(cc, costo)) {
					System.out.print("Errore");
					
					if(modifica == false) {
					if(! Controller.trovaMail(c.getEmail())) {
						Controller.insertCliente(c);
						}
					} 
					Cliente cliente = Controller.getCliente(c.getEmail());
					
					if(! Controller.trovaCliente(cliente.getCodCliente(), idVolo)) {
							
							Controller.insertPrenotazione(cliente, idVolo, listaPosti);
						
						idPrenotazione = Controller.getIdPrenotazione(cliente, idVolo, listaPosti);
						Controller.pagamentoPrenotazione(idPrenotazione);
						Controller.aggiornaPostiPrenotati(listaPosti, idPrenotazione);
					}
					GestoreMail gePagamento = Controller.getGestoreMail();
					String sbjPagamento = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_SUBJ.getMessaggio() + idPrenotazione;
					String txtPagamento = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_TXT.getMessaggio();
					Volo v = Controller.getVolo(idVolo);
					txtPagamento += v.toString(v.getPartenza(), v.getDestinazione());
					for(Posto p : listaPosti)
						txtPagamento += p.toString();
					txtPagamento += "Prenotazione PAGATA";
					Controller.sendMail(gePagamento, cliente.getEmail(), sbjPagamento, txtPagamento);
					
					if(fedele) {
						int punti = 0;
						for(Posto p : listaPosti) {
							punti += p.getPunti();
						}
						Controller.addPunti(c.getCodCliente(), punti);
						
						Date ultimoBiglietto = new Date();
						Calendar cal = Calendar.getInstance();
						cal.add(Calendar.YEAR, 2);
						Date newInfedele = cal.getTime();
						Controller.updateInfedelta((ClienteFedele) cliente, newInfedele, ultimoBiglietto);
						
					}
					
					contentPane.removeAll();
					contentPane.add(LastPage.esegui(contentPane, homePanel));
					contentPane.repaint();
					contentPane.revalidate();
				}   
				else{
					if (! erroreCarta.getText().equals(""))
						erroreCarta.setText("");
					erroreCarta.setText("Dati non validi !");
					}
				}
				
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnNewButton = new GridBagConstraints();
		gbcBtnNewButton.insets = new Insets(0, 0, 5, 0);
		gbcBtnNewButton.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton.gridx = 0;
		gbcBtnNewButton.gridy = 8;
		panel7.add(btnNewButton, gbcBtnNewButton);
		
//		Component verticalStrut9 = Box.createVerticalStrut(20);
//		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
//		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 0);
//		gbcVerticalStrut9.gridx = 0;
//		gbcVerticalStrut9.gridy = 9;
//		panel7.add(verticalStrut9, gbcVerticalStrut9);
		
		JLabel lblNewLabel4 = new JLabel("Costo in Punti");
		if(fedele)
			lblNewLabel4.setVisible(true);
		else
			lblNewLabel4.setVisible(false);
		lblNewLabel4.setForeground(Color.WHITE);
		lblNewLabel4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbcLblNewLabel4 = new GridBagConstraints();
		gbcLblNewLabel4.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel4.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel4.gridx = 0;
		gbcLblNewLabel4.gridy = 10;
		panel7.add(lblNewLabel4, gbcLblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel(String.valueOf(costoPunti));
		if(fedele)
			lblNewLabel5.setVisible(true);
		else
			lblNewLabel5.setVisible(false);
		lblNewLabel5.setForeground(Color.WHITE);
		lblNewLabel5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbcLblNewLabel5 = new GridBagConstraints();
		gbcLblNewLabel5.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel5.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel5.gridx = 0;
		gbcLblNewLabel5.gridy = 11;
		panel7.add(lblNewLabel5, gbcLblNewLabel5);
		
		
		
		Component verticalStrut10 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut10 = new GridBagConstraints();
		gbcVerticalStrut10.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut10.gridx = 0;
		gbcVerticalStrut10.gridy = 12;
		panel7.add(verticalStrut10, gbcVerticalStrut10);
		
		JButton btnNewButton1 = new JButton("Paga con punti");
		if(fedele)
			btnNewButton1.setVisible(true);
		else
			btnNewButton1.setVisible(false);
		
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.modificaPuntiPosti(listaPosti, 0);
				for(Posto p : listaPosti)
					p.setPunti(0);
				Controller.insertPrenotazione(c, idVolo, listaPosti);
				int idPrenotazione = Controller.getIdPrenotazione(c, idVolo, listaPosti);
				Controller.pagamentoPrenotazione(idPrenotazione);
				Controller.aggiornaPostiPrenotati(listaPosti, idPrenotazione);
				
				GestoreMail ge = Controller.getGestoreMail();
				String sbj = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_SUBJ.getMessaggio() + idPrenotazione;
				String txt = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_TXT.getMessaggio();
				Volo v = Controller.getVolo(idVolo);
				txt += v.toString(v.getPartenza(), v.getDestinazione());
				for(Posto p : listaPosti)
					txt += " " + p.toString();
				txt += "Prenotazione PAGATA";
				Controller.sendMail(ge, c.getEmail(), sbj, txt);
				
				Controller.addPunti(c.getCodCliente(), -costoPunti);
					
				Date ultimoBiglietto = new Date();
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.YEAR, 2);
				Date newInfedele = cal.getTime();
				Controller.updateInfedelta((ClienteFedele) c, newInfedele, ultimoBiglietto);
					
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnNewButton1 = new GridBagConstraints();
		gbcBtnNewButton1.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton1.gridx = 0;
		gbcBtnNewButton1.gridy = 13;
		panel7.add(btnNewButton1, gbcBtnNewButton1);
		
		if(fedele) {
			JLabel lblPunti = new JLabel("I tuoi Punti");
			lblPunti.setForeground(Color.WHITE);
			lblPunti.setFont(new Font("Tahoma", Font.PLAIN, 25));
			GridBagConstraints gbcLblPunti = new GridBagConstraints();
			gbcLblPunti.insets = new Insets(0, 0, 5, 0);
			gbcLblPunti.anchor = GridBagConstraints.WEST;
			gbcLblPunti.gridx = 2;
			gbcLblPunti.gridy = 10;
			panel7.add(lblPunti, gbcLblPunti);
			
			ClienteFedele cf = (ClienteFedele)c;
			int puntiCliente = cf.getPunti();
			
			JLabel lblPuntiCliente = new JLabel(String.valueOf(puntiCliente));
			lblPuntiCliente.setForeground(Color.WHITE);
			lblPuntiCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
			GridBagConstraints gbcLblPuntiCliente = new GridBagConstraints();
			gbcLblPuntiCliente.insets = new Insets(0, 0, 5, 0);
			gbcLblPuntiCliente.anchor = GridBagConstraints.WEST;
			gbcLblPuntiCliente.gridx = 2;
			gbcLblPuntiCliente.gridy = 11;
			panel7.add(lblPuntiCliente, gbcLblPuntiCliente);
			
			if(costoPunti>puntiCliente)
				btnNewButton1.setEnabled(false);
		}
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.BLUE);
		panel6.add(panel8, BorderLayout.SOUTH);
		panel8.setLayout(new BorderLayout(0, 0));
		
		Volo v = Controller.getVolo(idVolo);
		Date dataVolo = v.getDataPartenza();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date tra1 = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date tra2 = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date tra3 = cal.getTime();
		
		@SuppressWarnings("deprecation")
		boolean conditionPagaAvanti = dataVolo.getDate() == now.getDate() && dataVolo.getMonth() == now.getMonth() && dataVolo.getYear() == now.getYear();
		@SuppressWarnings("deprecation")
		boolean conditionPagaAvanti1 = dataVolo.getDate() == tra1.getDate() && dataVolo.getMonth() == tra1.getMonth() && dataVolo.getYear() == tra1.getYear();
		@SuppressWarnings("deprecation")
		boolean conditionPagaAvanti2 = dataVolo.getDate() == tra2.getDate() && dataVolo.getMonth() == tra2.getMonth() && dataVolo.getYear() == tra2.getYear();
		@SuppressWarnings("deprecation")
		boolean conditionPagaAvanti3 = dataVolo.getDate() == tra3.getDate() && dataVolo.getMonth() == tra3.getMonth() && dataVolo.getYear() == tra3.getYear();
		
		JButton btnNewButton2 = new JButton("Paga pi\u00F9 avanti");
		if(conditionPagaAvanti || conditionPagaAvanti1 || conditionPagaAvanti2 || conditionPagaAvanti3)
			btnNewButton2.setEnabled(false);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! Controller.trovaMail(c.getEmail())) {
					Controller.insertCliente(c);
				}
				
				Cliente cliente = Controller.getCliente(c.getEmail());
				
				int idPrenotazione = -1;
				
				if(! Controller.trovaCliente(cliente.getCodCliente(), idVolo)) {
					Controller.insertPrenotazione(cliente, idVolo, listaPosti);
					idPrenotazione = Controller.getIdPrenotazione(cliente, idVolo, listaPosti);
					System.out.println(""+idPrenotazione);
					Controller.aggiornaPostiPrenotati(listaPosti, idPrenotazione);
				}
				GestoreMail ge = GestoreMail.getInstance();
				String sbj = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_SUBJ.getMessaggio() + idPrenotazione;
				String txt = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_TXT.getMessaggio();
				Volo v = Controller.getVolo(idVolo);
				String partenza = Controller.getDenominazioneAereoporto(v.getPartenza());
				String arrivo = Controller.getDenominazioneAereoporto(v.getDestinazione());
				txt += v.toString(partenza, arrivo);
				for(Posto p : listaPosti)
					txt += " " + p.toString();
				txt += ". Si ricorda che la prenotazione NON è pagata;\n il pagamento va effettuato 3 giorni prima della partenza";
				ge.sendMail(c.getEmail(), sbj, txt);
			}
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel8.add(btnNewButton2, BorderLayout.EAST);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(posti);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel8.add(btnBack, BorderLayout.WEST);
		

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel6.add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Inserisci codice promozione");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextField textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel errorePromo = new JLabel("");
		errorePromo.setForeground(Color.RED);
		errorePromo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcErrorePromo = new GridBagConstraints();
		gbcErrorePromo.anchor = GridBagConstraints.WEST;
		gbcErrorePromo.insets = new Insets(0, 0, 5, 0);
		gbcErrorePromo.gridx = 0;
		gbcErrorePromo.gridy = 3;
		panel.add(errorePromo, gbcErrorePromo);
		
		JButton btnNewButton_1 = new JButton("CHECK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(notValidPromo(textField_1.getText()) || Controller.getPromozione(Integer.parseInt(textField_1.getText())) == null) {
					errorePromo.setText("Codice promo non valido !");
				}
				
				else {
				Promozione promo = Controller.getPromozione(Integer.parseInt(textField_1.getText()));
				if(promo != null) {
					if(fedele || ! promo.isPerFedele()) {
					double prezzoFinale = Controller.applyPromozione(Integer.parseInt(textField_1.getText()), v, costo);
					if(prezzoFinale != 0) {
						Controller.modificaPrezzoPosti(listaPosti, prezzoFinale/listaPosti.size());
						for(Posto p : listaPosti)
							p.setPrezzo(prezzoFinale/listaPosti.size());
						lblNewLabel3.setText(prezzoFinale + "$ (-" + promo.getSconto() + "%)");
						btnNewButton2.setEnabled(false);
					}
						}
					}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		return panel6;
	}
	
	public static boolean notValidPromo(String codPromo) {
		boolean valore = false;
		if (codPromo.length()>1 || codPromo.equals("") || codPromo.charAt(0)<0 || codPromo.charAt(0)>9)
			valore = true;
		
		return valore;
	}
	
	public static Date convertiData(Date data) {
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
		String dataArrivo= dataFormat.format(data);
		System.out.println(dataArrivo);
		try {
			Date nuovaDataP = dataFormat.parse(dataArrivo.toString());
			System.out.println(nuovaDataP);
			System.out.println(dataFormat.format(nuovaDataP));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return null;
	}

}

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

import controller.Controller;
import dataManagment.GestioneClienteDatabase;
import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Posto;
import dominio.Volo;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;
import paymentManagment.CartaDiCredito;

public class Pagamento {
	
	static JPanel esegui(JPanel contentPane, double costo, int costoPunti, JPanel posti, Cliente c, int idVolo, List<Posto> listaPosti, boolean fedele) {
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
		
//		JLabel labelPrenotazione = new JLabel("Il tuo id Prenotazione è: " + Integer.toString(idPrenotazione));
//		labelPrenotazione.setForeground(Color.WHITE);
//		labelPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		GridBagConstraints gbcLabelPrenotazione = new GridBagConstraints();
//		gbcLabelPrenotazione.anchor = GridBagConstraints.WEST;
//		gbcLabelPrenotazione.insets = new Insets(0, 0, 5, 0);
//		gbcLabelPrenotazione.gridx = 2;
//		gbcLabelPrenotazione.gridy = 0;
//		panel7.add(labelPrenotazione, gbcLabelPrenotazione);
		
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
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut8.gridx = 0;
		gbcVerticalStrut8.gridy = 7;
		panel7.add(verticalStrut8, gbcVerticalStrut8);
		
		JButton btnNewButton = new JButton("Paga");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnNewButton = new GridBagConstraints();
		gbcBtnNewButton.insets = new Insets(0, 0, 5, 0);
		gbcBtnNewButton.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton.gridx = 0;
		gbcBtnNewButton.gridy = 8;
		panel7.add(btnNewButton, gbcBtnNewButton);
		
		Component verticalStrut9 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut9.gridx = 0;
		gbcVerticalStrut9.gridy = 9;
		panel7.add(verticalStrut9, gbcVerticalStrut9);
		
		JLabel lblNewLabel4 = new JLabel("Costo in Punti");
		if(Controller.isFedele(c))
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
		
		JButton btnNewButton1 = new JButton("Paga");
//		btnNewButton1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				CartaDiCredito cc = new CartaDiCredito(textField.getText(), new Date(2022, 01, 01), "111");
//				if(Controller.paga(cc, costo)) {
//					GestoreMail ge = Controller.getGestoreMail();
//					//String sbj = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_SUBJ.getMessaggio() + idPrenotazione;
//					String txt = MessaggiPredefiniti.RESOCONTOPRENOTAZIONE_TXT.getMessaggio();
//					Volo v = Controller.getVolo(idVolo);
//					txt += v.toString();
//					for(Posto p : listaPosti)
//						txt += p.toString();
//					txt += "Prenotazione PAGATA";
//					Controller.sendMail(ge, c.getEmail(), sbj, txt);
//					
//					if(fedele) {
//						int punti = 0;
//						for(Posto p : listaPosti) {
//							punti += p.getPunti();
//						}
//						Controller.addPunti(c.getCodCliente(), punti);
//						
//						Date newInfedele = new Date();
//						Controller.updateInfedelta((ClienteFedele) c, newInfedele);
//						
//					}
//				}
//			}
//		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnNewButton1 = new GridBagConstraints();
		gbcBtnNewButton1.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton1.gridx = 0;
		gbcBtnNewButton1.gridy = 13;
		panel7.add(btnNewButton1, gbcBtnNewButton1);
		
		/*
		 * Se è fedele dare la possibilità di pagare con punti
		 * inserire button paga con punti
		 * renderlo visibile solo se cliente è fedele e se ha abbastanza punti
		 * copia incolla di "paga" ma senza controlli perchè tanto è fedele
		 * 
		 * inserire data di expiry e cvc della carta di credito
		 * aggiornare parametri in paga
		 */
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.BLUE);
		panel6.add(panel8, BorderLayout.SOUTH);
		panel8.setLayout(new BorderLayout(0, 0));
		
		Volo v = Controller.getVolo(idVolo);
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date tra1 = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date tra2 = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date tra3 = cal.getTime();
		
		convertiData(now);
		
		JButton btnNewButton2 = new JButton("Paga pi\u00F9 avanti");
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
				txt += " Si ricorda che la prenotazione NON è pagata;\n il pagamento va effettuato 3 giorni prima della partenza";
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
		
		return panel6;
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
			e.printStackTrace();
		}
		return null;
	}

}

package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dataManagement.GestioneAeroportoDatabase;
import dominio.Aeroporto;
import dominio.ClienteFedele;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;

public class PromozioneAdmin {
	
	@SuppressWarnings("unchecked")
	static JPanel esegui(JPanel contentPane) {
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		contentPane.add(panel1, "name_1646201716826700");
		GridBagLayout gblPanel1 = new GridBagLayout();
		gblPanel1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 ,0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblPanel1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel1.setLayout(gblPanel1);
		
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut1 = new GridBagConstraints();
		gbcVerticalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut1.gridx = 0;
		gbcVerticalStrut1.gridy = 0;
		panel1.add(verticalStrut1, gbcVerticalStrut1);
		
		JLabel lblDataDiInizio = new JLabel("Data di Inizio");
		lblDataDiInizio.setForeground(Color.WHITE);
		lblDataDiInizio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblDataDiInizio = new GridBagConstraints();
		gbcLblDataDiInizio.insets = new Insets(0, 0, 5, 5);
		gbcLblDataDiInizio.anchor = GridBagConstraints.WEST;
		gbcLblDataDiInizio.gridx = 0;
		gbcLblDataDiInizio.gridy = 1;
		panel1.add(lblDataDiInizio, gbcLblDataDiInizio);
		
		JDateChooser dateChooser1 = new JDateChooser();
		GridBagConstraints gbcDateChooser1 = new GridBagConstraints();
		gbcDateChooser1.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser1.fill = GridBagConstraints.BOTH;
		gbcDateChooser1.gridx = 0;
		gbcDateChooser1.gridy = 2;
		panel1.add(dateChooser1, gbcDateChooser1);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut2 = new GridBagConstraints();
		gbcVerticalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut2.gridx = 0;
		gbcVerticalStrut2.gridy = 3;
		panel1.add(verticalStrut2, gbcVerticalStrut2);
		
		JLabel lblDataDiFine = new JLabel("Data di Fine");
		lblDataDiFine.setForeground(Color.WHITE);
		lblDataDiFine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblDataDiFine = new GridBagConstraints();
		gbcLblDataDiFine.insets = new Insets(0, 0, 5, 5);
		gbcLblDataDiFine.anchor = GridBagConstraints.WEST;
		gbcLblDataDiFine.gridx = 0;
		gbcLblDataDiFine.gridy = 4;
		panel1.add(lblDataDiFine, gbcLblDataDiFine);
		
		JDateChooser dateChooser2 = new JDateChooser();
		GridBagConstraints gbcDateChooser2 = new GridBagConstraints();
		gbcDateChooser2.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser2.fill = GridBagConstraints.BOTH;
		gbcDateChooser2.gridx = 0;
		gbcDateChooser2.gridy = 5;
		panel1.add(dateChooser2, gbcDateChooser2);
		
		Component verticalStrut3 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut3 = new GridBagConstraints();
		gbcVerticalStrut3.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut3.gridx = 0;
		gbcVerticalStrut3.gridy = 6;
		panel1.add(verticalStrut3, gbcVerticalStrut3);
		
		JLabel sconto = new JLabel("Sconto (senza %)");
		sconto.setForeground(Color.WHITE);
		sconto.setFont(new Font ("Tahoma", Font.PLAIN, 20));
		GridBagConstraints bcdSconto = new GridBagConstraints();
		bcdSconto.insets = new Insets(0, 0, 5, 5);
		bcdSconto.anchor = GridBagConstraints.WEST;
		bcdSconto.gridx = 0;
		bcdSconto.gridy = 7;
		panel1.add(sconto, bcdSconto);
		
		JTextField scontoField = new JTextField();
		GridBagConstraints gbcScontoField = new GridBagConstraints();
		gbcScontoField.fill = GridBagConstraints.HORIZONTAL;
		gbcScontoField.insets = new Insets(0, 0, 5, 5);
		gbcScontoField.gridx = 0;
		gbcScontoField.gridy = 8;
		panel1.add(scontoField, gbcScontoField);
		scontoField.setColumns(10);
		gbcVerticalStrut3.gridx = 0;
		gbcVerticalStrut3.gridy = 9;
		
		Component verticalStrut5 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut5 = new GridBagConstraints();
		gbcVerticalStrut5.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut5.gridx = 0;
		gbcVerticalStrut5.gridy = 9;
		panel1.add(verticalStrut5, gbcVerticalStrut5);
		
		JLabel partenza = new JLabel("Partenza");
		partenza.setForeground(Color.WHITE);
		partenza.setFont(new Font ("Tahoma", Font.PLAIN, 20));
		GridBagConstraints bcdPartenza = new GridBagConstraints();
		bcdPartenza.insets = new Insets(0, 0, 5, 5);
		bcdPartenza.anchor = GridBagConstraints.WEST;
		bcdPartenza.gridx = 0;
		bcdPartenza.gridy = 10;
		panel1.add(partenza, bcdPartenza);
		
		@SuppressWarnings("rawtypes")
		JComboBox partenzaCombo = new JComboBox();
		List <Aeroporto> aeroporti = GestioneAeroportoDatabase.getListaAeroporti();
		for (Aeroporto a : aeroporti) {
			String aerPar = Controller.getDenominazioneAeroporto(a.getIdAereoporto());
			partenzaCombo.addItem(aerPar);
		}
		GridBagConstraints gbcPartenzaCombo = new GridBagConstraints();
		gbcPartenzaCombo.insets = new Insets(0, 0, 5, 5);
		gbcPartenzaCombo.anchor = GridBagConstraints.WEST;
		gbcPartenzaCombo.gridx = 0;
		gbcPartenzaCombo.gridy = 11;
		panel1.add(partenzaCombo, gbcPartenzaCombo);
		
		JLabel destinazione = new JLabel("Destinazione");
		destinazione.setForeground(Color.WHITE);
		destinazione.setFont(new Font ("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcDestinazione = new GridBagConstraints();
		gbcDestinazione.insets = new Insets(0, 0, 5, 5);
		gbcDestinazione.anchor = GridBagConstraints.WEST;
		gbcDestinazione.gridx = 0;
		gbcDestinazione.gridy = 12;
		panel1.add(destinazione, gbcDestinazione);
		
		@SuppressWarnings("rawtypes")
		JComboBox destinazioneCombo = new JComboBox();
		for (Aeroporto a : aeroporti) {
			String aerPar = Controller.getDenominazioneAeroporto(a.getIdAereoporto());
			destinazioneCombo.addItem(aerPar);
		}
		GridBagConstraints gbcDestAer = new GridBagConstraints();
		gbcDestAer.insets = new Insets(0, 0, 5, 5);
		gbcDestAer.anchor = GridBagConstraints.WEST;
		gbcDestAer.gridx = 0;
		gbcDestAer.gridy = 13;
		panel1.add(destinazioneCombo, gbcDestAer);
		
		
		JCheckBox chckbxSonoUnCliente = new JCheckBox("Solo per Cliente Fedele");

		chckbxSonoUnCliente.setBackground(Color.BLUE);
		chckbxSonoUnCliente.setForeground(Color.WHITE);
		chckbxSonoUnCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcChckbxSonoUnCliente = new GridBagConstraints();
		gbcChckbxSonoUnCliente.anchor = GridBagConstraints.WEST;
		gbcChckbxSonoUnCliente.insets = new Insets(0, 0, 5, 5);
		gbcChckbxSonoUnCliente.gridx = 0;
		gbcChckbxSonoUnCliente.gridy = 14;
		panel1.add(chckbxSonoUnCliente, gbcChckbxSonoUnCliente);
		
		JLabel erroreLbl = new JLabel("");
		erroreLbl.setForeground(Color.RED);
		erroreLbl.setFont(new Font ("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcErrore = new GridBagConstraints();
		gbcErrore.insets = new Insets(0, 0, 5, 5);
		gbcErrore.anchor = GridBagConstraints.WEST;
		gbcErrore.gridx = 0;
		gbcErrore.gridy = 16;
		panel1.add(erroreLbl, gbcErrore);
		
		
		JButton btnCreaPromozione = new JButton("Crea Promozione");
		btnCreaPromozione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(partenzaCombo.getSelectedItem().equals(destinazioneCombo.getSelectedItem())) {
					if (! erroreLbl.getText().equals(""))
						erroreLbl.setText("");
					erroreLbl.setForeground(Color.RED);
					erroreLbl.setText("Gli Aeroporti Coincidono");
				}
				
				else if(dateChooser1.getDate().before(new Date()) || dateChooser2.getDate().before(new Date()) || dateChooser2.getDate().before(dateChooser1.getDate())) {
					if (! erroreLbl.getText().equals(""))
						erroreLbl.setText("");
					erroreLbl.setForeground(Color.RED);
					erroreLbl.setText("Errore nella data");
				}
				else if(!scontoValid(scontoField.getText())) {
					if (! erroreLbl.getText().equals(""))
						erroreLbl.setText("");
					erroreLbl.setForeground(Color.RED);
					erroreLbl.setText("Sconto deve essere un numero");
				}
				else if(Integer.parseInt(scontoField.getText())<=0 || Integer.parseInt(scontoField.getText())>=100) {
					if (! erroreLbl.getText().equals(""))
						erroreLbl.setText("");
					erroreLbl.setForeground(Color.RED);
					erroreLbl.setText("Sconto non valido");
				}
				
				else{
					if (! erroreLbl.getText().equals(""))
						erroreLbl.setText("");
					erroreLbl.setForeground(Color.GREEN);
					erroreLbl.setText("Promozione inserita!");
					if(chckbxSonoUnCliente.isSelected()) 
						Controller.insertPromozione(dateChooser1.getDate(), dateChooser2.getDate(), Controller.parserCodiceAeroporto((String) partenzaCombo.getSelectedItem()), Controller.parserCodiceAeroporto((String) destinazioneCombo.getSelectedItem()), Double.parseDouble(scontoField.getText()), true);
					else
						Controller.insertPromozione(dateChooser1.getDate(), dateChooser2.getDate(), Controller.parserCodiceAeroporto((String) partenzaCombo.getSelectedItem()), Controller.parserCodiceAeroporto((String) destinazioneCombo.getSelectedItem()), Double.parseDouble(scontoField.getText()), false);
				
				GestoreMail ge = Controller.getGestoreMail();
				List<ClienteFedele> clientiFedeli = Controller.getClientiFedeli();
				String sbj = MessaggiPredefiniti.NUOVAPROMOZIONE_SUBJ.getMessaggio() + " ";
				String txt = "Nuova promozione dal " + dateChooser1.getDate()
//				Controller.convertiData(dateChooser1.getDate())
						+ " al " + dateChooser2.getDate()
//						Controller.convertiData(dateChooser2.getDate())
						+ " per i voli da " + (String) partenzaCombo.getSelectedItem()
						+ " a " + (String) destinazioneCombo.getSelectedItem()
						+ " con uno sconto del " + scontoField.getText() + "%"
						+ ". Controlla il codice promo dalla lista delle prenotazioni attive"
						+ ". Affrettati a comprare un biglietto con la nuova promozione prima che finiscano!";
				for(ClienteFedele c : clientiFedeli) {
					Controller.sendMail(ge, c.getEmail(), sbj, txt);
				}
			}
			}
		});
		btnCreaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnCreaPromozione = new GridBagConstraints();
		gbc_btnCreaPromozione.anchor = GridBagConstraints.WEST;
		gbc_btnCreaPromozione.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreaPromozione.gridx = 0;
		gbc_btnCreaPromozione.gridy = 15;
		panel1.add(btnCreaPromozione, gbc_btnCreaPromozione);
		
		return panel1;
	}
	
	private static boolean scontoValid(String sconto) {
		boolean valid=true;
		for(int i=0; i<sconto.length(); i++) {
			if(sconto.charAt(i)<'0' || sconto.charAt(i)>'9')
				return false;
		}
		
		return valid;
	}

}

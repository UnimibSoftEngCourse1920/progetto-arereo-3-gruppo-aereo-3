package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dataManagment.GestioneAdminDatabase;
import dataManagment.GestioneVoloDatabase;
import dominio.Cliente;
import dominio.Prenotazione;
import dominio.Volo;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;

public class ModificaAdmin {
	
	static JPanel esegui(JPanel contentPane) {
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_865661938656900");
		panel.setBackground(Color.BLUE);
		GridBagLayout gblPanel = new GridBagLayout();
		gblPanel.columnWidths = new int[]{0, 0, 0, 0};
		gblPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gblPanel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut = new GridBagConstraints();
		gbcVerticalStrut.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut.gridx = 0;
		gbcVerticalStrut.gridy = 0;
		panel.add(verticalStrut, gbcVerticalStrut);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut2 = new GridBagConstraints();
		gbcVerticalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut2.gridx = 1;
		gbcVerticalStrut2.gridy = 0;
		panel.add(verticalStrut2, gbcVerticalStrut2);
		
		JLabel lblNewLabel2 = new JLabel("ID Volo");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel2.setForeground(Color.WHITE);
		GridBagConstraints gbcLblNewLabel2 = new GridBagConstraints();
		gbcLblNewLabel2.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel2.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel2.gridx = 0;
		gbcLblNewLabel2.gridy = 1;
		panel.add(lblNewLabel2, gbcLblNewLabel2);
		
		Component verticalStrut3 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut3 = new GridBagConstraints();
		gbcVerticalStrut3.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut3.gridx = 1;
		gbcVerticalStrut3.gridy = 1;
		panel.add(verticalStrut3, gbcVerticalStrut3);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.insets = new Insets(0, 0, 5, 5);
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.gridx = 0;
		gbcTextField.gridy = 2;
		panel.add(textField, gbcTextField);
		textField.setColumns(10);
		
		Component verticalStrut4 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut4 = new GridBagConstraints();
		gbcVerticalStrut4.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut4.gridx = 1;
		gbcVerticalStrut4.gridy = 2;
		panel.add(verticalStrut4, gbcVerticalStrut4);
		
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut1 = new GridBagConstraints();
		gbcVerticalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut1.gridx = 0;
		gbcVerticalStrut1.gridy = 3;
		panel.add(verticalStrut1, gbcVerticalStrut1);
		
		Component verticalStrut5 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut5 = new GridBagConstraints();
		gbcVerticalStrut5.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut5.gridx = 1;
		gbcVerticalStrut5.gridy = 3;
		panel.add(verticalStrut5, gbcVerticalStrut5);
		
		JLabel lblNewLabel = new JLabel("Ora Partenza");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel = new GridBagConstraints();
		gbcLblNewLabel.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel.gridx = 0;
		gbcLblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbcLblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("Minuti Partenza");
		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel1 = new GridBagConstraints();
		gbcLblNewLabel1.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel1.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel1.gridx = 1;
		gbcLblNewLabel1.gridy = 4;
		panel.add(lblNewLabel1, gbcLblNewLabel1);
		
		JComboBox comboBox = new JComboBox();
		for(int i = 0; i<24; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox.addItem(0+value);
			}
			else {
				comboBox.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox = new GridBagConstraints();
		gbcComboBox.insets = new Insets(0, 0, 5, 5);
		gbcComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox.gridx = 0;
		gbcComboBox.gridy = 5;
		panel.add(comboBox, gbcComboBox);
		
		JComboBox comboBox1 = new JComboBox();
		for(int i = 0; i<60; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox1.addItem(0+value);
			}
			else {
				comboBox1.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox1 = new GridBagConstraints();
		gbcComboBox1.insets = new Insets(0, 0, 5, 5);
		gbcComboBox1.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox1.gridx = 1;
		gbcComboBox1.gridy = 5;
		panel.add(comboBox1, gbcComboBox1);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut6.gridx = 0;
		gbcVerticalStrut6.gridy = 6;
		panel.add(verticalStrut6, gbcVerticalStrut6);
		
		Component verticalStrut7 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut7 = new GridBagConstraints();
		gbcVerticalStrut7.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut7.gridx = 1;
		gbcVerticalStrut7.gridy = 6;
		panel.add(verticalStrut7, gbcVerticalStrut7);
		
		JLabel lblOraRitorno = new JLabel("Ora Arrivo");
		lblOraRitorno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOraRitorno.setForeground(Color.WHITE);
		GridBagConstraints gbcLblOraRitorno = new GridBagConstraints();
		gbcLblOraRitorno.anchor = GridBagConstraints.WEST;
		gbcLblOraRitorno.insets = new Insets(0, 0, 5, 5);
		gbcLblOraRitorno.gridx = 0;
		gbcLblOraRitorno.gridy = 7;
		panel.add(lblOraRitorno, gbcLblOraRitorno);
		
		JLabel lblMinutiArrivo = new JLabel("Minuti Arrivo");
		lblMinutiArrivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutiArrivo.setForeground(Color.WHITE);
		GridBagConstraints gbcLblMinutiArrivo = new GridBagConstraints();
		gbcLblMinutiArrivo.anchor = GridBagConstraints.WEST;
		gbcLblMinutiArrivo.insets = new Insets(0, 0, 5, 5);
		gbcLblMinutiArrivo.gridx = 1;
		gbcLblMinutiArrivo.gridy = 7;
		panel.add(lblMinutiArrivo, gbcLblMinutiArrivo);
		
		JComboBox comboBox2 = new JComboBox();
		for(int i = 0; i<24; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox2.addItem(0+value);
			}
			else {
				comboBox2.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox2 = new GridBagConstraints();
		gbcComboBox2.insets = new Insets(0, 0, 5, 5);
		gbcComboBox2.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox2.gridx = 0;
		gbcComboBox2.gridy = 8;
		panel.add(comboBox2, gbcComboBox2);
		
		JComboBox comboBox3 = new JComboBox();
		for(int i = 0; i<60; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox3.addItem(0+value);
			}
			else {
				comboBox3.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox3 = new GridBagConstraints();
		gbcComboBox3.insets = new Insets(0, 0, 5, 5);
		gbcComboBox3.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox3.gridx = 1;
		gbcComboBox3.gridy = 8;
		panel.add(comboBox3, gbcComboBox3);
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut8.gridx = 0;
		gbcVerticalStrut8.gridy = 9;
		panel.add(verticalStrut8, gbcVerticalStrut8);
		
		JLabel lblGate = new JLabel("Gate");
		lblGate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGate.setForeground(Color.WHITE);
		GridBagConstraints gbcLblGate = new GridBagConstraints();
		gbcLblGate.anchor = GridBagConstraints.WEST;
		gbcLblGate.insets = new Insets(0, 0, 5, 5);
		gbcLblGate.gridx = 0;
		gbcLblGate.gridy = 10;
		panel.add(lblGate, gbcLblGate);
		
		JTextField textField1 = new JTextField();
		GridBagConstraints gbcTextField1 = new GridBagConstraints();
		gbcTextField1.insets = new Insets(0, 0, 5, 5);
		gbcTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField1.gridx = 0;
		gbcTextField1.gridy = 11;
		panel.add(textField1, gbcTextField1);
		textField1.setColumns(10);
		
		Component verticalStrut9 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut9.gridx = 0;
		gbcVerticalStrut9.gridy = 12;
		panel.add(verticalStrut9, gbcVerticalStrut9);
		
		JLabel lblNewLabel3 = new JLabel("Data Partenza");
		lblNewLabel3.setForeground(Color.WHITE);
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel3 = new GridBagConstraints();
		gbcLblNewLabel3.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel3.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel3.gridx = 0;
		gbcLblNewLabel3.gridy = 13;
		panel.add(lblNewLabel3, gbcLblNewLabel3);
		
		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbcDateChooser = new GridBagConstraints();
		gbcDateChooser.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser.fill = GridBagConstraints.BOTH;
		gbcDateChooser.gridx = 0;
		gbcDateChooser.gridy = 14;
		panel.add(dateChooser, gbcDateChooser);
		
		Component verticalStrut10 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut10 = new GridBagConstraints();
		gbcVerticalStrut10.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut10.gridx = 0;
		gbcVerticalStrut10.gridy = 15;
		panel.add(verticalStrut10, gbcVerticalStrut10);
		
		JLabel lblDataArrivo = new JLabel("Data Arrivo");
		lblDataArrivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataArrivo.setForeground(Color.WHITE);
		GridBagConstraints gbcLblDataArrivo = new GridBagConstraints();
		gbcLblDataArrivo.anchor = GridBagConstraints.WEST;
		gbcLblDataArrivo.insets = new Insets(0, 0, 5, 5);
		gbcLblDataArrivo.gridx = 0;
		gbcLblDataArrivo.gridy = 16;
		panel.add(lblDataArrivo, gbcLblDataArrivo);
		
		JDateChooser dateChooser1 = new JDateChooser();
		GridBagConstraints gbcDateChooser1 = new GridBagConstraints();
		gbcDateChooser1.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser1.fill = GridBagConstraints.BOTH;
		gbcDateChooser1.gridx = 0;
		gbcDateChooser1.gridy = 17;
		panel.add(dateChooser1, gbcDateChooser1);
		
		Component verticalStrut11 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut11 = new GridBagConstraints();
		gbcVerticalStrut11.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut11.gridx = 0;
		gbcVerticalStrut11.gridy = 18;
		panel.add(verticalStrut11, gbcVerticalStrut11);

		JButton btnModifica = new JButton("Modifica");
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volo v = Controller.getVolo(Integer.parseInt(textField.getText()));
				String oraPartenza = (String) comboBox.getSelectedItem(); 
				String minutiPartenza = (String) comboBox1.getSelectedItem();
				String oraArrivo = (String) comboBox2.getSelectedItem();
				String minutiArrivo = (String) comboBox3.getSelectedItem();
				Controller.aggiornaVoloAdmin(Integer.parseInt(textField.getText()), oraPartenza, minutiPartenza, textField1.getText(), dateChooser.getDate(), oraArrivo, minutiArrivo, dateChooser1.getDate());
				
				GestoreMail ge = GestoreMail.getInstance();
				List<Prenotazione> pr = Controller.getPrenotazioniPerVolo(v.getIdVolo());
				if(pr!=null) {
					List<Cliente> cl = new ArrayList<Cliente>();
					for(Prenotazione p : pr)
						cl.add(Controller.getCliente(p.getCodCliente()));
					
					v = Controller.getVolo(Integer.parseInt(textField.getText()));
					String subject = MessaggiPredefiniti.MODIFICA_VOLO_SBJ.getMessaggio() + v.getIdVolo();
					String content = MessaggiPredefiniti.MODIFICA_VOLO_TXT.getMessaggio() + v.toString(v.getPartenza(), v.getDestinazione());
					for(Cliente c : cl) {
						Controller.sendMail(ge, c.getEmail(), subject, content);
					}
				}
			}
		});
		btnModifica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnModifica = new GridBagConstraints();
		gbcBtnModifica.anchor = GridBagConstraints.WEST;
		gbcBtnModifica.insets = new Insets(0, 0, 0, 5);
		gbcBtnModifica.gridx = 0;
		gbcBtnModifica.gridy = 19;
		panel.add(btnModifica, gbcBtnModifica);
		
		return panel;
	}

}

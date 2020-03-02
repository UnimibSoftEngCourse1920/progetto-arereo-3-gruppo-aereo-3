package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import dataManagment.GestioneAdminDatabase;
import dataManagment.GestioneVoloDatabase;
import dominio.Volo;

public class ModificaAdmin {
	
	static JPanel esegui(JPanel contentPane) {
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_865661938656900");
		panel.setBackground(Color.BLUE);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 0;
		gbc_verticalStrut.gridy = 0;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 0;
		panel.add(verticalStrut_2, gbc_verticalStrut_2);
		
		JLabel lblNewLabel_2 = new JLabel("ID Volo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 1;
		gbc_verticalStrut_3.gridy = 1;
		panel.add(verticalStrut_3, gbc_verticalStrut_3);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4.gridx = 1;
		gbc_verticalStrut_4.gridy = 2;
		panel.add(verticalStrut_4, gbc_verticalStrut_4);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 0;
		gbc_verticalStrut_1.gridy = 3;
		panel.add(verticalStrut_1, gbc_verticalStrut_1);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 1;
		gbc_verticalStrut_5.gridy = 3;
		panel.add(verticalStrut_5, gbc_verticalStrut_5);
		
		JLabel lblNewLabel = new JLabel("Ora Partenza");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Minuti Partenza");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
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
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 5;
		panel.add(comboBox, gbc_comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		for(int i = 0; i<60; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox_1.addItem(0+value);
			}
			else {
				comboBox_1.addItem(value);
			}
		}
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 6;
		panel.add(verticalStrut_6, gbc_verticalStrut_6);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_7.gridx = 1;
		gbc_verticalStrut_7.gridy = 6;
		panel.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JLabel lblOraRitorno = new JLabel("Ora Arrivo");
		lblOraRitorno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOraRitorno.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblOraRitorno = new GridBagConstraints();
		gbc_lblOraRitorno.anchor = GridBagConstraints.WEST;
		gbc_lblOraRitorno.insets = new Insets(0, 0, 5, 5);
		gbc_lblOraRitorno.gridx = 0;
		gbc_lblOraRitorno.gridy = 7;
		panel.add(lblOraRitorno, gbc_lblOraRitorno);
		
		JLabel lblMinutiArrivo = new JLabel("Minuti Arrivo");
		lblMinutiArrivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinutiArrivo.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblMinutiArrivo = new GridBagConstraints();
		gbc_lblMinutiArrivo.anchor = GridBagConstraints.WEST;
		gbc_lblMinutiArrivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMinutiArrivo.gridx = 1;
		gbc_lblMinutiArrivo.gridy = 7;
		panel.add(lblMinutiArrivo, gbc_lblMinutiArrivo);
		
		JComboBox comboBox_2 = new JComboBox();
		for(int i = 0; i<24; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox_2.addItem(0+value);
			}
			else {
				comboBox_2.addItem(value);
			}
		}
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 0;
		gbc_comboBox_2.gridy = 8;
		panel.add(comboBox_2, gbc_comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		for(int i = 0; i<60; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox_3.addItem(0+value);
			}
			else {
				comboBox_3.addItem(value);
			}
		}
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 8;
		panel.add(comboBox_3, gbc_comboBox_3);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_8.gridx = 0;
		gbc_verticalStrut_8.gridy = 9;
		panel.add(verticalStrut_8, gbc_verticalStrut_8);
		
		JLabel lblGate = new JLabel("Gate");
		lblGate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGate.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblGate = new GridBagConstraints();
		gbc_lblGate.anchor = GridBagConstraints.WEST;
		gbc_lblGate.insets = new Insets(0, 0, 5, 5);
		gbc_lblGate.gridx = 0;
		gbc_lblGate.gridy = 10;
		panel.add(lblGate, gbc_lblGate);
		
		JTextField textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 11;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_9.gridx = 0;
		gbc_verticalStrut_9.gridy = 12;
		panel.add(verticalStrut_9, gbc_verticalStrut_9);
		
		JLabel lblNewLabel_3 = new JLabel("Data Partenza");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 13;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 0;
		gbc_dateChooser.gridy = 14;
		panel.add(dateChooser, gbc_dateChooser);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_10.gridx = 0;
		gbc_verticalStrut_10.gridy = 15;
		panel.add(verticalStrut_10, gbc_verticalStrut_10);
		
		JLabel lblDataArrivo = new JLabel("Data Arrivo");
		lblDataArrivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataArrivo.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblDataArrivo = new GridBagConstraints();
		gbc_lblDataArrivo.anchor = GridBagConstraints.WEST;
		gbc_lblDataArrivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataArrivo.gridx = 0;
		gbc_lblDataArrivo.gridy = 16;
		panel.add(lblDataArrivo, gbc_lblDataArrivo);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 0;
		gbc_dateChooser_1.gridy = 17;
		panel.add(dateChooser_1, gbc_dateChooser_1);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_11.gridx = 0;
		gbc_verticalStrut_11.gridy = 18;
		panel.add(verticalStrut_11, gbc_verticalStrut_11);

		JButton btnModifica = new JButton("Modifica");
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volo v = GestioneVoloDatabase.getVolo(Integer.parseInt(textField.getText()));
				String oraPartenza = (String) comboBox.getSelectedItem(); 
				String minutiPartenza = (String) comboBox_1.getSelectedItem();
				String oraArrivo = (String) comboBox_2.getSelectedItem();
				String minutiArrivo = (String) comboBox_3.getSelectedItem();
				GestioneAdminDatabase.aggiornaVolo(Integer.parseInt(textField.getText()), oraPartenza, minutiPartenza, textField_1.getText(), dateChooser.getDate(), oraArrivo, minutiArrivo, dateChooser_1.getDate());
			}
		});
		btnModifica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnModifica = new GridBagConstraints();
		gbc_btnModifica.anchor = GridBagConstraints.WEST;
		gbc_btnModifica.insets = new Insets(0, 0, 0, 5);
		gbc_btnModifica.gridx = 0;
		gbc_btnModifica.gridy = 19;
		panel.add(btnModifica, gbc_btnModifica);
		
		return panel;
	}

}

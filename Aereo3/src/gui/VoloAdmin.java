package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Volo;

public class VoloAdmin {

	private static JLabel lblNewLabel1;


	@SuppressWarnings("unchecked")
	static JPanel esegui(JPanel contentPane) {
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.BLUE);
		contentPane.add(panel6, "name_865661938656900");
		GridBagLayout gblPanel6 = new GridBagLayout();
		gblPanel6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 ,0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblPanel6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel6.setLayout(gblPanel6);

		JLabel lblPartenza = new JLabel("Partenza:");
		lblPartenza.setForeground(Color.WHITE);
		lblPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblPartenza = new GridBagConstraints();
		gbcLblPartenza.anchor = GridBagConstraints.WEST;
		gbcLblPartenza.insets = new Insets(0, 0, 5, 0);
		gbcLblPartenza.gridx = 1;
		gbcLblPartenza.gridy = 1;
		panel6.add(lblPartenza, gbcLblPartenza);

		List <String> aeroportiDisponibili = Controller.getDenominazioneAereoporti();

		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		for(String aeroporto : aeroportiDisponibili) {
			comboBox.addItem(aeroporto);
		}
		GridBagConstraints gbcComboBox = new GridBagConstraints();
		gbcComboBox.insets = new Insets(0, 0, 5, 5);
		gbcComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox.gridx = 1;
		gbcComboBox.gridy = 2;
		panel6.add(comboBox, gbcComboBox);

		JLabel lblDestinazione = new JLabel("Destinazione:");
		lblDestinazione.setForeground(Color.WHITE);
		lblDestinazione.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblDestinazione = new GridBagConstraints();
		gbcLblDestinazione.anchor = GridBagConstraints.WEST;
		gbcLblDestinazione.insets = new Insets(0, 0, 5, 5);
		gbcLblDestinazione.gridx = 1;
		gbcLblDestinazione.gridy = 3;
		panel6.add(lblDestinazione, gbcLblDestinazione);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox1 = new JComboBox();
		for(String aeroporto : aeroportiDisponibili) {
			comboBox1.addItem(aeroporto);
		}
		GridBagConstraints gbcComboBox1 = new GridBagConstraints();
		gbcComboBox1.insets = new Insets(0, 0, 5, 5);
		gbcComboBox1.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox1.gridx = 1;
		gbcComboBox1.gridy = 4;
		panel6.add(comboBox1, gbcComboBox1);

		JLabel lblDataPartenza = new JLabel("Data Partenza.");
		lblDataPartenza.setForeground(Color.WHITE);
		lblDataPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblDataPartenza = new GridBagConstraints();
		gbcLblDataPartenza.anchor = GridBagConstraints.WEST;
		gbcLblDataPartenza.insets = new Insets(0, 0, 5, 0);
		gbcLblDataPartenza.gridx = 1;
		gbcLblDataPartenza.gridy = 5;
		panel6.add(lblDataPartenza, gbcLblDataPartenza);

		JDateChooser dateChooser1 = new JDateChooser();
		GridBagConstraints gbcDateChooser1 = new GridBagConstraints();
		gbcDateChooser1.fill = GridBagConstraints.HORIZONTAL;
		gbcDateChooser1.anchor = GridBagConstraints.NORTH;
		gbcDateChooser1.insets = new Insets(0, 0, 5, 0);
		gbcDateChooser1.gridx = 1;
		gbcDateChooser1.gridy = 6;
		panel6.add(dateChooser1, gbcDateChooser1);

		JLabel lblNewLabel2 = new JLabel("Ora");
		lblNewLabel2.setForeground(Color.WHITE);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel2 = new GridBagConstraints();
		gbcLblNewLabel2.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel2.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel2.gridx = 1;
		gbcLblNewLabel2.gridy = 7;
		panel6.add(lblNewLabel2, gbcLblNewLabel2);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox3 = new JComboBox();
		for(int i = 0; i<24; i++) {
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
		gbcComboBox3.insets = new Insets(0, 0, 5, 0);
		gbcComboBox3.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox3.gridx = 1;
		gbcComboBox3.gridy = 8;
		panel6.add(comboBox3, gbcComboBox3);

		JLabel lblMinuti = new JLabel("Minuti");
		lblMinuti.setForeground(Color.WHITE);
		lblMinuti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblMinuti = new GridBagConstraints();
		gbcLblMinuti.anchor = GridBagConstraints.WEST;
		gbcLblMinuti.insets = new Insets(0, 0, 5, 0);
		gbcLblMinuti.gridx = 1;
		gbcLblMinuti.gridy = 9;
		panel6.add(lblMinuti, gbcLblMinuti);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox4 = new JComboBox();
		for(int i = 0; i<60; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox4.addItem(0+value);
			}
			else {
				comboBox4.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox4 = new GridBagConstraints();
		gbcComboBox4.insets = new Insets(0, 0, 5, 0);
		gbcComboBox4.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox4.gridx = 1;
		gbcComboBox4.gridy = 10;
		panel6.add(comboBox4, gbcComboBox4);

		JLabel lblDataArrivo = new JLabel("Data Arrivo");
		lblDataArrivo.setForeground(Color.WHITE);
		lblDataArrivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblDataArrivo = new GridBagConstraints();
		gbcLblDataArrivo.anchor = GridBagConstraints.WEST;
		gbcLblDataArrivo.insets = new Insets(0, 0, 5, 0);
		gbcLblDataArrivo.gridx = 1;
		gbcLblDataArrivo.gridy = 11;
		panel6.add(lblDataArrivo, gbcLblDataArrivo);

		JDateChooser dateChooser2 = new JDateChooser();
		GridBagConstraints gbcDateChooser2 = new GridBagConstraints();
		gbcDateChooser2.insets = new Insets(0, 0, 5, 0);
		gbcDateChooser2.fill = GridBagConstraints.BOTH;
		gbcDateChooser2.gridx = 1;
		gbcDateChooser2.gridy = 12;
		panel6.add(dateChooser2, gbcDateChooser2);

		JLabel lblOra = new JLabel("Ora");
		lblOra.setForeground(Color.WHITE);
		lblOra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblOra = new GridBagConstraints();
		gbcLblOra.anchor = GridBagConstraints.WEST;
		gbcLblOra.insets = new Insets(0, 0, 5, 0);
		gbcLblOra.gridx = 1;
		gbcLblOra.gridy = 13;
		panel6.add(lblOra, gbcLblOra);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox5 = new JComboBox();
		for(int i = 0; i<24; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox5.addItem(0+value);
			}
			else {
				comboBox5.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox5 = new GridBagConstraints();
		gbcComboBox5.insets = new Insets(0, 0, 5, 0);
		gbcComboBox5.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox5.gridx = 1;
		gbcComboBox5.gridy = 14;
		panel6.add(comboBox5, gbcComboBox5);

		JLabel lblMinuti1 = new JLabel("Minuti");
		lblMinuti1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinuti1.setForeground(Color.WHITE);
		GridBagConstraints gbcLblMinuti1 = new GridBagConstraints();
		gbcLblMinuti1.anchor = GridBagConstraints.WEST;
		gbcLblMinuti1.insets = new Insets(0, 0, 5, 0);
		gbcLblMinuti1.gridx = 1;
		gbcLblMinuti1.gridy = 15;
		panel6.add(lblMinuti1, gbcLblMinuti1);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox6 = new JComboBox();
		for(int i = 0; i<60; i++) {
			String value;
			value = Integer.toString(i);
			if(i<10) {
				comboBox6.addItem(0+value);
			}
			else {
				comboBox6.addItem(value);
			}
		}
		GridBagConstraints gbcComboBox6 = new GridBagConstraints();
		gbcComboBox6.insets = new Insets(0, 0, 5, 0);
		gbcComboBox6.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox6.gridx = 1;
		gbcComboBox6.gridy = 16;
		panel6.add(comboBox6, gbcComboBox6);

		JLabel lblGate = new JLabel("Gate:");
		lblGate.setForeground(Color.WHITE);
		lblGate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblGate = new GridBagConstraints();
		gbcLblGate.anchor = GridBagConstraints.WEST;
		gbcLblGate.insets = new Insets(0, 0, 5, 0);
		gbcLblGate.gridx = 1;
		gbcLblGate.gridy = 17;
		panel6.add(lblGate, gbcLblGate);

		JTextField textField4 = new JTextField();
		GridBagConstraints gbcTextField4 = new GridBagConstraints();
		gbcTextField4.insets = new Insets(0, 0, 5, 0);
		gbcTextField4.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField4.gridx = 1;
		gbcTextField4.gridy = 18;
		panel6.add(textField4, gbcTextField4);
		textField4.setColumns(10);

		JLabel lblNumeroPosti = new JLabel("Numero posti:");
		lblNumeroPosti.setForeground(Color.WHITE);
		lblNumeroPosti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNumeroPosti = new GridBagConstraints();
		gbcLblNumeroPosti.anchor = GridBagConstraints.WEST;
		gbcLblNumeroPosti.insets = new Insets(0, 0, 5, 0);
		gbcLblNumeroPosti.gridx = 1;
		gbcLblNumeroPosti.gridy = 19;
		panel6.add(lblNumeroPosti, gbcLblNumeroPosti);

		JTextField textField5 = new JTextField();
		GridBagConstraints gbcTextField5 = new GridBagConstraints();
		gbcTextField5.insets = new Insets(0, 0, 5, 0);
		gbcTextField5.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField5.gridx = 1;
		gbcTextField5.gridy = 20;
		panel6.add(textField5, gbcTextField5);
		textField5.setColumns(10);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut = new GridBagConstraints();
		gbcHorizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut.gridx = 2;
		gbcHorizontalStrut.gridy = 19;
		panel6.add(horizontalStrut, gbcHorizontalStrut);

		JLabel lblPrezzoPosto = new JLabel("Prezzo per posto");
		lblPrezzoPosto.setForeground(Color.WHITE);
		lblPrezzoPosto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblPrezzoPosto = new GridBagConstraints();
		gbcLblPrezzoPosto.anchor = GridBagConstraints.WEST;
		gbcLblPrezzoPosto.insets = new Insets(0, 0, 5, 0);
		gbcLblPrezzoPosto.gridx = 3;
		gbcLblPrezzoPosto.gridy = 19;
		panel6.add(lblPrezzoPosto, gbcLblPrezzoPosto);

		JTextField textField6 = new JTextField();
		GridBagConstraints gbcTextField6 = new GridBagConstraints();
		gbcTextField6.insets = new Insets(0, 0, 5, 0);
		gbcTextField6.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField6.gridx = 3;
		gbcTextField6.gridy = 20;
		panel6.add(textField6, gbcTextField6);
		textField6.setColumns(10);

		Component horizontalStrut1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut1 = new GridBagConstraints();
		gbcHorizontalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut1.gridx = 4;
		gbcHorizontalStrut1.gridy = 19;
		panel6.add(horizontalStrut1, gbcHorizontalStrut1);

		JLabel lblPuntiPosto = new JLabel("Punti per posto");
		lblPuntiPosto.setForeground(Color.WHITE);
		lblPuntiPosto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblPuntiPosto = new GridBagConstraints();
		gbcLblPuntiPosto.anchor = GridBagConstraints.WEST;
		gbcLblPuntiPosto.insets = new Insets(0, 0, 5, 0);
		gbcLblPuntiPosto.gridx = 5;
		gbcLblPuntiPosto.gridy = 19;
		panel6.add(lblPuntiPosto, gbcLblPuntiPosto);

		JTextField textField7 = new JTextField();
		GridBagConstraints gbcTextField7 = new GridBagConstraints();
		gbcTextField7.insets = new Insets(0, 0, 5, 0);
		gbcTextField7.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField7.gridx = 5;
		gbcTextField7.gridy = 20;
		panel6.add(textField7, gbcTextField7);
		textField6.setColumns(10);

		lblNewLabel1 = new JLabel("");
		lblNewLabel1.setForeground(Color.RED);
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel1 = new GridBagConstraints();
		gbcLblNewLabel1.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel1.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel1.gridx = 1;
		gbcLblNewLabel1.gridy = 22;
		panel6.add(lblNewLabel1, gbcLblNewLabel1);
		

		JButton btnAggiungiVolo = new JButton("Aggiungi Volo");
		
		btnAggiungiVolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (dateChooser1.getDate().after(dateChooser2.getDate())) {
						lblNewLabel1.setText("Date errate");


				}else if (comboBox.getSelectedItem().equals(comboBox1.getSelectedItem())) {
						lblNewLabel1.setText("Attenzione, gli aeroporti coincidono !");

					}
					else if (Integer.parseInt(textField5.getText())<=0) {
							lblNewLabel1.setText("Attenzione, gli aeroporti coincidono !");


					}else if (textField4.getText().length()!=2) {
							lblNewLabel1.setText("Il gate deve essere solo di 2 caratteri");

					}
					else {

						Volo v = new Volo();
						
						v.setPartenza((String)comboBox.getSelectedItem());
						v.setDestinazione((String) comboBox1.getSelectedItem());
						v.setDataPartenza(dateChooser1.getDate());
						v.setDataArrivo(dateChooser2.getDate());
						v.setGate(textField4.getText());
						v.setNumeroPosti(Integer.parseInt(textField5.getText()));
						String oraPartenza = (String) comboBox3.getSelectedItem();
						String minutiPartenza = (String) comboBox4.getSelectedItem();
						String oraArrivo = (String) comboBox5.getSelectedItem();
						String minutiArrivo = (String) comboBox6.getSelectedItem();
						Controller.insertVolo(v, oraPartenza, minutiPartenza, oraArrivo, minutiArrivo, Double.parseDouble(textField6.getText()), Integer.parseInt(textField7.getText()));

						lblNewLabel1.setText("Volo inserito!");

					}
				}
		});
			
	
	
		
	

		btnAggiungiVolo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnAggiungiVolo = new GridBagConstraints();
		gbcBtnAggiungiVolo.anchor = GridBagConstraints.WEST;
		gbcBtnAggiungiVolo.gridx = 1;
		gbcBtnAggiungiVolo.gridy = 21;
		panel6.add(btnAggiungiVolo, gbcBtnAggiungiVolo);

		return panel6;
		}

	}

package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Volo;

public class VoloAdmin {
	
	static JPanel esegui(JPanel contentPane) {
	JPanel panel_6 = new JPanel();
	panel_6.setBackground(Color.BLUE);
	contentPane.add(panel_6, "name_1232818374636800");
	GridBagLayout gbl_panel_6 = new GridBagLayout();
	gbl_panel_6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 ,0.0, 0.0, 0.0, Double.MIN_VALUE};
	gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	panel_6.setLayout(gbl_panel_6);
	
	JLabel lblPartenza = new JLabel("Partenza:");
	lblPartenza.setForeground(Color.WHITE);
	lblPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblPartenza = new GridBagConstraints();
	gbc_lblPartenza.anchor = GridBagConstraints.WEST;
	gbc_lblPartenza.insets = new Insets(0, 0, 5, 0);
	gbc_lblPartenza.gridx = 0;
	gbc_lblPartenza.gridy = 1;
	panel_6.add(lblPartenza, gbc_lblPartenza);
	
	JTextField textField = new JTextField();
	GridBagConstraints gbc_textField = new GridBagConstraints();
	gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField.insets = new Insets(0, 0, 5, 0);
	gbc_textField.gridx = 0;
	gbc_textField.gridy = 2;
	panel_6.add(textField, gbc_textField);
	textField.setColumns(10);
	
	JLabel lblDestinazione = new JLabel("Destinazione:");
	lblDestinazione.setForeground(Color.WHITE);
	lblDestinazione.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblDestinazione = new GridBagConstraints();
	gbc_lblDestinazione.anchor = GridBagConstraints.WEST;
	gbc_lblDestinazione.insets = new Insets(0, 0, 5, 0);
	gbc_lblDestinazione.gridx = 0;
	gbc_lblDestinazione.gridy = 3;
	panel_6.add(lblDestinazione, gbc_lblDestinazione);
	
	JTextField textField_1 = new JTextField();
	GridBagConstraints gbc_textField_1 = new GridBagConstraints();
	gbc_textField_1.insets = new Insets(0, 0, 5, 0);
	gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_1.gridx = 0;
	gbc_textField_1.gridy = 4;
	panel_6.add(textField_1, gbc_textField_1);
	textField_1.setColumns(10);
	
	JLabel lblDataPartenza = new JLabel("Data Partenza.");
	lblDataPartenza.setForeground(Color.WHITE);
	lblDataPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblDataPartenza = new GridBagConstraints();
	gbc_lblDataPartenza.anchor = GridBagConstraints.WEST;
	gbc_lblDataPartenza.insets = new Insets(0, 0, 5, 0);
	gbc_lblDataPartenza.gridx = 0;
	gbc_lblDataPartenza.gridy = 5;
	panel_6.add(lblDataPartenza, gbc_lblDataPartenza);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
	gbc_dateChooser_1.fill = GridBagConstraints.HORIZONTAL;
	gbc_dateChooser_1.anchor = GridBagConstraints.NORTH;
	gbc_dateChooser_1.insets = new Insets(0, 0, 5, 0);
	gbc_dateChooser_1.gridx = 0;
	gbc_dateChooser_1.gridy = 6;
	panel_6.add(dateChooser_1, gbc_dateChooser_1);
	
	JLabel lblNewLabel_2 = new JLabel("Ora");
	lblNewLabel_2.setForeground(Color.WHITE);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
	gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
	gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
	gbc_lblNewLabel_2.gridx = 0;
	gbc_lblNewLabel_2.gridy = 7;
	panel_6.add(lblNewLabel_2, gbc_lblNewLabel_2);
	
	JComboBox comboBox_3 = new JComboBox();
	for(int i = 0; i<24; i++) {
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
	gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_3.gridx = 0;
	gbc_comboBox_3.gridy = 8;
	panel_6.add(comboBox_3, gbc_comboBox_3);
	
	JLabel lblMinuti = new JLabel("Minuti");
	lblMinuti.setForeground(Color.WHITE);
	lblMinuti.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblMinuti = new GridBagConstraints();
	gbc_lblMinuti.anchor = GridBagConstraints.WEST;
	gbc_lblMinuti.insets = new Insets(0, 0, 5, 0);
	gbc_lblMinuti.gridx = 0;
	gbc_lblMinuti.gridy = 9;
	panel_6.add(lblMinuti, gbc_lblMinuti);
	
	JComboBox comboBox_4 = new JComboBox();
	for(int i = 0; i<60; i++) {
		String value;
		value = Integer.toString(i);
		if(i<10) {
			comboBox_4.addItem(0+value);
		}
		else {
			comboBox_4.addItem(value);
		}
	}
	GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
	gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_4.gridx = 0;
	gbc_comboBox_4.gridy = 10;
	panel_6.add(comboBox_4, gbc_comboBox_4);
	
	JLabel lblDataArrivo = new JLabel("Data Arrivo");
	lblDataArrivo.setForeground(Color.WHITE);
	lblDataArrivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblDataArrivo = new GridBagConstraints();
	gbc_lblDataArrivo.anchor = GridBagConstraints.WEST;
	gbc_lblDataArrivo.insets = new Insets(0, 0, 5, 0);
	gbc_lblDataArrivo.gridx = 0;
	gbc_lblDataArrivo.gridy = 11;
	panel_6.add(lblDataArrivo, gbc_lblDataArrivo);
	
	JDateChooser dateChooser_2 = new JDateChooser();
	GridBagConstraints gbc_dateChooser_2 = new GridBagConstraints();
	gbc_dateChooser_2.insets = new Insets(0, 0, 5, 0);
	gbc_dateChooser_2.fill = GridBagConstraints.BOTH;
	gbc_dateChooser_2.gridx = 0;
	gbc_dateChooser_2.gridy = 12;
	panel_6.add(dateChooser_2, gbc_dateChooser_2);
	
	JLabel lblOra = new JLabel("Ora");
	lblOra.setForeground(Color.WHITE);
	lblOra.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblOra = new GridBagConstraints();
	gbc_lblOra.anchor = GridBagConstraints.WEST;
	gbc_lblOra.insets = new Insets(0, 0, 5, 0);
	gbc_lblOra.gridx = 0;
	gbc_lblOra.gridy = 13;
	panel_6.add(lblOra, gbc_lblOra);
	
	JComboBox comboBox_5 = new JComboBox();
	for(int i = 0; i<24; i++) {
		String value;
		value = Integer.toString(i);
		if(i<10) {
			comboBox_5.addItem(0+value);
		}
		else {
			comboBox_5.addItem(value);
		}
	}
	GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
	gbc_comboBox_5.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_5.gridx = 0;
	gbc_comboBox_5.gridy = 14;
	panel_6.add(comboBox_5, gbc_comboBox_5);
	
	JLabel lblMinuti_1 = new JLabel("Minuti");
	lblMinuti_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblMinuti_1.setForeground(Color.WHITE);
	GridBagConstraints gbc_lblMinuti_1 = new GridBagConstraints();
	gbc_lblMinuti_1.anchor = GridBagConstraints.WEST;
	gbc_lblMinuti_1.insets = new Insets(0, 0, 5, 0);
	gbc_lblMinuti_1.gridx = 0;
	gbc_lblMinuti_1.gridy = 15;
	panel_6.add(lblMinuti_1, gbc_lblMinuti_1);
	
	JComboBox comboBox_6 = new JComboBox();
	for(int i = 0; i<60; i++) {
		String value;
		value = Integer.toString(i);
		if(i<10) {
			comboBox_6.addItem(0+value);
		}
		else {
			comboBox_6.addItem(value);
		}
	}
	GridBagConstraints gbc_comboBox_6 = new GridBagConstraints();
	gbc_comboBox_6.insets = new Insets(0, 0, 5, 0);
	gbc_comboBox_6.fill = GridBagConstraints.HORIZONTAL;
	gbc_comboBox_6.gridx = 0;
	gbc_comboBox_6.gridy = 16;
	panel_6.add(comboBox_6, gbc_comboBox_6);
	
	JLabel lblGate = new JLabel("Gate:");
	lblGate.setForeground(Color.WHITE);
	lblGate.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblGate = new GridBagConstraints();
	gbc_lblGate.anchor = GridBagConstraints.WEST;
	gbc_lblGate.insets = new Insets(0, 0, 5, 0);
	gbc_lblGate.gridx = 0;
	gbc_lblGate.gridy = 17;
	panel_6.add(lblGate, gbc_lblGate);
	
	JTextField textField_4 = new JTextField();
	GridBagConstraints gbc_textField_4 = new GridBagConstraints();
	gbc_textField_4.insets = new Insets(0, 0, 5, 0);
	gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_4.gridx = 0;
	gbc_textField_4.gridy = 18;
	panel_6.add(textField_4, gbc_textField_4);
	textField_4.setColumns(10);
	
	JLabel lblNumeroPosti = new JLabel("Numero posti:");
	lblNumeroPosti.setForeground(Color.WHITE);
	lblNumeroPosti.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_lblNumeroPosti = new GridBagConstraints();
	gbc_lblNumeroPosti.anchor = GridBagConstraints.WEST;
	gbc_lblNumeroPosti.insets = new Insets(0, 0, 5, 0);
	gbc_lblNumeroPosti.gridx = 0;
	gbc_lblNumeroPosti.gridy = 19;
	panel_6.add(lblNumeroPosti, gbc_lblNumeroPosti);
	
	JTextField textField_5 = new JTextField();
	GridBagConstraints gbc_textField_5 = new GridBagConstraints();
	gbc_textField_5.insets = new Insets(0, 0, 5, 0);
	gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
	gbc_textField_5.gridx = 0;
	gbc_textField_5.gridy = 20;
	panel_6.add(textField_5, gbc_textField_5);
	textField_5.setColumns(10);
	
	JButton btnAggiungiVolo = new JButton("Aggiungi Volo");
	btnAggiungiVolo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Volo v = new Volo();
			v.setPartenza(textField.getText());
			v.setDestinazione(textField_1.getText());
			v.setDataPartenza(dateChooser_1.getDate());
			v.setDataArrivo(dateChooser_2.getDate());
			v.setGate(textField_4.getText());
			v.setNumeroPosti(Integer.parseInt(textField_5.getText()));
			String oraPartenza = (String) comboBox_3.getSelectedItem();
			String minutiPartenza = (String) comboBox_4.getSelectedItem();
			String oraArrivo = (String) comboBox_5.getSelectedItem();
			String minutiArrivo = (String) comboBox_6.getSelectedItem();
			Controller.insertVolo(v, oraPartenza, minutiPartenza, oraArrivo, minutiArrivo);
		}
	});
	btnAggiungiVolo.setFont(new Font("Tahoma", Font.PLAIN, 20));
	GridBagConstraints gbc_btnAggiungiVolo = new GridBagConstraints();
	gbc_btnAggiungiVolo.anchor = GridBagConstraints.WEST;
	gbc_btnAggiungiVolo.gridx = 0;
	gbc_btnAggiungiVolo.gridy = 21;
	panel_6.add(btnAggiungiVolo, gbc_btnAggiungiVolo);
	
	return panel_6;
	}

}

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

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

public class VisualizzaModificaPrenotazione {
	static JPanel esegui(JPanel contentPane, JPanel prenotazione, String partenza, String arrivo, Date data, boolean modifica, int value) {
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLUE);
		contentPane.add(panel_6, "name_58028579602300");
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblLaTuaPrenotazione = new JLabel("La tua Prenotazione");
		lblLaTuaPrenotazione.setForeground(Color.WHITE);
		lblLaTuaPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblLaTuaPrenotazione = new GridBagConstraints();
		gbc_lblLaTuaPrenotazione.anchor = GridBagConstraints.WEST;
		gbc_lblLaTuaPrenotazione.insets = new Insets(0, 0, 5, 0);
		gbc_lblLaTuaPrenotazione.gridx = 0;
		gbc_lblLaTuaPrenotazione.gridy = 0;
		panel_6.add(lblLaTuaPrenotazione, gbc_lblLaTuaPrenotazione);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 1;
		panel_6.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JLabel lblPartenza = new JLabel("Partenza: " + partenza);
		lblPartenza.setForeground(Color.WHITE);
		lblPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblPartenza = new GridBagConstraints();
		gbc_lblPartenza.insets = new Insets(0, 0, 5, 0);
		gbc_lblPartenza.anchor = GridBagConstraints.WEST;
		gbc_lblPartenza.gridx = 0;
		gbc_lblPartenza.gridy = 2;
		panel_6.add(lblPartenza, gbc_lblPartenza);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_7.gridx = 0;
		gbc_verticalStrut_7.gridy = 3;
		panel_6.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JLabel lblDestinazione = new JLabel("Destinazione: " + arrivo);
		lblDestinazione.setForeground(Color.WHITE);
		lblDestinazione.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDestinazione = new GridBagConstraints();
		gbc_lblDestinazione.insets = new Insets(0, 0, 5, 0);
		gbc_lblDestinazione.anchor = GridBagConstraints.WEST;
		gbc_lblDestinazione.gridx = 0;
		gbc_lblDestinazione.gridy = 4;
		panel_6.add(lblDestinazione, gbc_lblDestinazione);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_8.gridx = 0;
		gbc_verticalStrut_8.gridy = 5;
		panel_6.add(verticalStrut_8, gbc_verticalStrut_8);
		
		JLabel lblDataPartenza = new JLabel("Data Partenza");
		lblDataPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataPartenza.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblDataPartenza = new GridBagConstraints();
		gbc_lblDataPartenza.insets = new Insets(0, 0, 5, 0);
		gbc_lblDataPartenza.anchor = GridBagConstraints.WEST;
		gbc_lblDataPartenza.gridx = 0;
		gbc_lblDataPartenza.gridy = 6;
		panel_6.add(lblDataPartenza, gbc_lblDataPartenza);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_9.gridx = 0;
		gbc_verticalStrut_9.gridy = 7;
		panel_6.add(verticalStrut_9, gbc_verticalStrut_9);
		
		JLabel lblNewLabel_2 = new JLabel("Data Arrivo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 8;
		panel_6.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_10.gridx = 0;
		gbc_verticalStrut_10.gridy = 9;
		panel_6.add(verticalStrut_10, gbc_verticalStrut_10);
		
		JLabel lblNewLabel_3 = new JLabel("Numero di Biglietti: " + Integer.toString(value));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 10;
		panel_6.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_11.gridx = 0;
		gbc_verticalStrut_11.gridy = 11;
		panel_6.add(verticalStrut_11, gbc_verticalStrut_11);
		
		JLabel lblModificaPrenotazione = new JLabel("Modifica Prenotazione");
		lblModificaPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblModificaPrenotazione.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblModificaPrenotazione = new GridBagConstraints();
		gbc_lblModificaPrenotazione.insets = new Insets(0, 0, 5, 0);
		gbc_lblModificaPrenotazione.anchor = GridBagConstraints.WEST;
		gbc_lblModificaPrenotazione.gridx = 0;
		gbc_lblModificaPrenotazione.gridy = 12;
		panel_6.add(lblModificaPrenotazione, gbc_lblModificaPrenotazione);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_12 = new GridBagConstraints();
		gbc_verticalStrut_12.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_12.gridx = 0;
		gbc_verticalStrut_12.gridy = 13;
		panel_6.add(verticalStrut_12, gbc_verticalStrut_12);
		
		JLabel lblNuovaData = new JLabel("Nuova Data");
		lblNuovaData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNuovaData.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNuovaData = new GridBagConstraints();
		gbc_lblNuovaData.insets = new Insets(0, 0, 5, 0);
		gbc_lblNuovaData.anchor = GridBagConstraints.WEST;
		gbc_lblNuovaData.gridx = 0;
		gbc_lblNuovaData.gridy = 14;
		panel_6.add(lblNuovaData, gbc_lblNuovaData);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 0;
		gbc_dateChooser_1.gridy = 15;
		panel_6.add(dateChooser_1, gbc_dateChooser_1);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_13 = new GridBagConstraints();
		gbc_verticalStrut_13.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_13.gridx = 0;
		gbc_verticalStrut_13.gridy = 16;
		panel_6.add(verticalStrut_13, gbc_verticalStrut_13);
		
		JButton btnModifica = new JButton("Modifica");
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModifica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnModifica = new GridBagConstraints();
		gbc_btnModifica.insets = new Insets(0, 0, 5, 0);
		gbc_btnModifica.anchor = GridBagConstraints.WEST;
		gbc_btnModifica.gridx = 0;
		gbc_btnModifica.gridy = 17;
		panel_6.add(btnModifica, gbc_btnModifica);
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_14 = new GridBagConstraints();
		gbc_verticalStrut_14.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_14.gridx = 0;
		gbc_verticalStrut_14.gridy = 18;
		panel_6.add(verticalStrut_14, gbc_verticalStrut_14);
		
		Component verticalStrut_15 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_15 = new GridBagConstraints();
		gbc_verticalStrut_15.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_15.gridx = 0;
		gbc_verticalStrut_15.gridy = 19;
		panel_6.add(verticalStrut_15, gbc_verticalStrut_15);
		
		Component verticalStrut_16 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_16 = new GridBagConstraints();
		gbc_verticalStrut_16.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_16.gridx = 0;
		gbc_verticalStrut_16.gridy = 20;
		panel_6.add(verticalStrut_16, gbc_verticalStrut_16);
		
		Component verticalStrut_17 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_17 = new GridBagConstraints();
		gbc_verticalStrut_17.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_17.gridx = 0;
		gbc_verticalStrut_17.gridy = 21;
		panel_6.add(verticalStrut_17, gbc_verticalStrut_17);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(prenotazione);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 22;
		panel_6.add(btnBack, gbc_btnBack);
		
		return panel_6;
	}
}

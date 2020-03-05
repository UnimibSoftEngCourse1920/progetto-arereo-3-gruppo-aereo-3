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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Volo;

public class PromozioneAdmin {
	
	static JPanel esegui(JPanel contentPane) {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		contentPane.add(panel_1, "name_1646201716826700");
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 0;
		gbc_verticalStrut_1.gridy = 0;
		panel_1.add(verticalStrut_1, gbc_verticalStrut_1);
		
		JLabel lblDataDiInizio = new JLabel("Data di Inizio");
		lblDataDiInizio.setForeground(Color.WHITE);
		lblDataDiInizio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDataDiInizio = new GridBagConstraints();
		gbc_lblDataDiInizio.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDiInizio.anchor = GridBagConstraints.WEST;
		gbc_lblDataDiInizio.gridx = 0;
		gbc_lblDataDiInizio.gridy = 1;
		panel_1.add(lblDataDiInizio, gbc_lblDataDiInizio);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 0;
		gbc_dateChooser_1.gridy = 2;
		panel_1.add(dateChooser_1, gbc_dateChooser_1);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 0;
		gbc_verticalStrut_2.gridy = 3;
		panel_1.add(verticalStrut_2, gbc_verticalStrut_2);
		
		JLabel lblDataDiFine = new JLabel("Data di Fine");
		lblDataDiFine.setForeground(Color.WHITE);
		lblDataDiFine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDataDiFine = new GridBagConstraints();
		gbc_lblDataDiFine.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDiFine.anchor = GridBagConstraints.WEST;
		gbc_lblDataDiFine.gridx = 0;
		gbc_lblDataDiFine.gridy = 4;
		panel_1.add(lblDataDiFine, gbc_lblDataDiFine);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_2 = new GridBagConstraints();
		gbc_dateChooser_2.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_2.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_2.gridx = 0;
		gbc_dateChooser_2.gridy = 5;
		panel_1.add(dateChooser_2, gbc_dateChooser_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 0;
		gbc_verticalStrut_3.gridy = 6;
		panel_1.add(verticalStrut_3, gbc_verticalStrut_3);
		
		JLabel sconto = new JLabel("Sconto");
		sconto.setForeground(Color.WHITE);
		sconto.setFont(new Font ("Tahoma", Font.PLAIN, 20));
		GridBagConstraints bcdSconto = new GridBagConstraints();
		bcdSconto.insets = new Insets(0, 0, 5, 5);
		bcdSconto.anchor = GridBagConstraints.WEST;
		bcdSconto.gridx = 0;
		bcdSconto.gridy = 7;
		panel_1.add(sconto, bcdSconto);
		
		JTextField scontoField = new JTextField();
		GridBagConstraints gbcScontoField = new GridBagConstraints();
		gbcScontoField.fill = GridBagConstraints.HORIZONTAL;
		gbcScontoField.insets = new Insets(0, 0, 5, 5);
		gbcScontoField.gridx = 0;
		gbcScontoField.gridy = 8;
		panel_1.add(scontoField, gbcScontoField);
		scontoField.setColumns(0);
		gbc_verticalStrut_3.gridx = 0;
		gbc_verticalStrut_3.gridy = 9;
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 0;
		gbc_verticalStrut_5.gridy = 9;
		panel_1.add(verticalStrut_5, gbc_verticalStrut_5);
		
		Volo v = null;
		
		JButton btnCreaPromozione = new JButton("Crea Promozione");
		btnCreaPromozione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.insertPromozione(dateChooser_1.getDate(), dateChooser_2.getDate(), v, Double.parseDouble(scontoField.getText()));
			}
		});
		btnCreaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnCreaPromozione = new GridBagConstraints();
		gbc_btnCreaPromozione.anchor = GridBagConstraints.WEST;
		gbc_btnCreaPromozione.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreaPromozione.gridx = 0;
		gbc_btnCreaPromozione.gridy = 10;
		panel_1.add(btnCreaPromozione, gbc_btnCreaPromozione);
		
		return panel_1;
	}

}

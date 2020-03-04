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
import javax.swing.JTextField;

import controller.Controller;
import dominio.Prenotazione;
import dominio.Volo;

public class CercaPrenotazione {
	
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel prenotazione = new JPanel();
		prenotazione.setBackground(Color.BLUE);
		GridBagLayout gbl_prenotazione = new GridBagLayout();
		gbl_prenotazione.columnWidths = new int[]{442, 10, 0};
		gbl_prenotazione.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_prenotazione.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_prenotazione.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		prenotazione.setLayout(gbl_prenotazione);
		
		boolean modifica = true;
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 5;
		prenotazione.add(lblEmail, gbc_lblEmail);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 6;
		prenotazione.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 0;
		gbc_verticalStrut.gridy = 7;
		prenotazione.add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblIdVolo = new JLabel("ID Prenotazione:");
		lblIdVolo.setForeground(Color.WHITE);
		lblIdVolo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblIdVolo = new GridBagConstraints();
		gbc_lblIdVolo.anchor = GridBagConstraints.WEST;
		gbc_lblIdVolo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdVolo.gridx = 0;
		gbc_lblIdVolo.gridy = 8;
		prenotazione.add(lblIdVolo, gbc_lblIdVolo);
		
		JTextField textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 9;
		prenotazione.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 0;
		gbc_verticalStrut_1.gridy = 10;
		prenotazione.add(verticalStrut_1, gbc_verticalStrut_1);
		
		JButton btnCerca = new JButton("Cerca !");
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prenotazione p = Controller.getPrenotazione(Integer.parseInt(textField_1.getText()));
				System.out.println(Controller.getPostiPerPrenotazione(p.getId()));
				Volo v = Controller.getVolo(p.getIdVolo());
				String partenza = v.getPartenza();
				String arrivo = v.getDestinazione();
				int value = Controller.getPostiPerPrenotazione(p.getId()).size();
				Date data = v.getDataPartenza();
				contentPane.removeAll();
				contentPane.add(VisualizzaModificaPrenotazione.esegui(contentPane, prenotazione, partenza, arrivo, data, modifica, value));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnCerca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnCerca = new GridBagConstraints();
		gbc_btnCerca.anchor = GridBagConstraints.WEST;
		gbc_btnCerca.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerca.gridx = 0;
		gbc_btnCerca.gridy = 11;
		prenotazione.add(btnCerca, gbc_btnCerca);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 0;
		gbc_verticalStrut_2.gridy = 12;
		prenotazione.add(verticalStrut_2, gbc_verticalStrut_2);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 13;
		prenotazione.add(btnNewButton, gbc_btnNewButton);
		
		return prenotazione;
	}

}

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
import dominio.Cliente;
import dominio.Prenotazione;
import dominio.Volo;

public class CercaPrenotazione {
	
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel prenotazione = new JPanel();
		prenotazione.setBackground(Color.BLUE);
		GridBagLayout gblPrenotazione = new GridBagLayout();
		gblPrenotazione.columnWidths = new int[]{442, 10, 0};
		gblPrenotazione.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPrenotazione.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gblPrenotazione.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		prenotazione.setLayout(gblPrenotazione);
		
		boolean modifica = true;
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblEmail = new GridBagConstraints();
		gbcLblEmail.anchor = GridBagConstraints.WEST;
		gbcLblEmail.insets = new Insets(0, 0, 5, 5);
		gbcLblEmail.gridx = 0;
		gbcLblEmail.gridy = 5;
		prenotazione.add(lblEmail, gbcLblEmail);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.insets = new Insets(0, 0, 5, 5);
		gbcTextField.gridx = 0;
		gbcTextField.gridy = 6;
		prenotazione.add(textField, gbcTextField);
		textField.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut = new GridBagConstraints();
		gbcVerticalStrut.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut.gridx = 0;
		gbcVerticalStrut.gridy = 7;
		prenotazione.add(verticalStrut, gbcVerticalStrut);
		
		JLabel lblIdVolo = new JLabel("ID Prenotazione:");
		lblIdVolo.setForeground(Color.WHITE);
		lblIdVolo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblIdVolo = new GridBagConstraints();
		gbcLblIdVolo.anchor = GridBagConstraints.WEST;
		gbcLblIdVolo.insets = new Insets(0, 0, 5, 5);
		gbcLblIdVolo.gridx = 0;
		gbcLblIdVolo.gridy = 8;
		prenotazione.add(lblIdVolo, gbcLblIdVolo);
		
		JTextField textField1 = new JTextField();
		GridBagConstraints gbcTextField_1 = new GridBagConstraints();
		gbcTextField_1.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField_1.insets = new Insets(0, 0, 5, 5);
		gbcTextField_1.gridx = 0;
		gbcTextField_1.gridy = 9;
		prenotazione.add(textField1, gbcTextField_1);
		textField1.setColumns(10);
		
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut1 = new GridBagConstraints();
		gbcVerticalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut1.gridx = 0;
		gbcVerticalStrut1.gridy = 10;
		prenotazione.add(verticalStrut1, gbcVerticalStrut1);
		
		JButton btnCerca = new JButton("Cerca !");
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prenotazione p = Controller.loginCliente(Integer.parseInt(textField1.getText()), textField.getText());
				Cliente c = Controller.getCliente(textField.getText());
				int idVolo = p.getIdVolo();
				System.out.println(Controller.getPostiPerPrenotazione(p.getId()));
				Volo v = Controller.getVolo(p.getIdVolo());
				String partenza = v.getPartenza();
				String arrivo = v.getDestinazione();
				int value = Controller.getPostiPerPrenotazione(p.getId()).size();
				Date dataPartenza = v.getDataPartenza();
				Date dataArrivo = v.getDataArrivo();
				contentPane.removeAll();
				contentPane.add(VisualizzaModificaPrenotazione.esegui(contentPane, prenotazione, partenza, arrivo, dataPartenza, dataArrivo, modifica, value, idVolo, c, p.getId()));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnCerca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcBtnCerca = new GridBagConstraints();
		gbcBtnCerca.anchor = GridBagConstraints.WEST;
		gbcBtnCerca.insets = new Insets(0, 0, 0, 5);
		gbcBtnCerca.gridx = 0;
		gbcBtnCerca.gridy = 11;
		prenotazione.add(btnCerca, gbcBtnCerca);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut2 = new GridBagConstraints();
		gbcVerticalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut2.gridx = 0;
		gbcVerticalStrut2.gridy = 12;
		prenotazione.add(verticalStrut2, gbcVerticalStrut2);
		
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
		GridBagConstraints gbcBtnNewButton = new GridBagConstraints();
		gbcBtnNewButton.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton.insets = new Insets(0, 0, 0, 5);
		gbcBtnNewButton.gridx = 0;
		gbcBtnNewButton.gridy = 13;
		prenotazione.add(btnNewButton, gbcBtnNewButton);
		
		return prenotazione;
	}

}

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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.Controller;
import dominio.Cliente;

public class Accesso {
	
	static JPanel esegui(JPanel contentPane, JPanel homePanel, JPanel registrationPanel) {
		JPanel logInPanel = new JPanel();
		logInPanel.setBackground(Color.BLUE);
		GridBagLayout gbl_logInPanel = new GridBagLayout();
		gbl_logInPanel.columnWidths = new int[]{0, 0, 0};
		gbl_logInPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_logInPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_logInPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		logInPanel.setLayout(gbl_logInPanel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 14;
		logInPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_6.gridx = 1;
		gbc_verticalStrut_6.gridy = 1;
		logInPanel.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 0);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 2;
		logInPanel.add(btnBack, gbc_btnBack);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 5;
		logInPanel.add(lblEmail, gbc_lblEmail);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 6;
		logInPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_7.gridx = 1;
		gbc_verticalStrut_7.gridy = 7;
		logInPanel.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblPassword.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 8;
		logInPanel.add(lblPassword, gbc_lblPassword);
		
		JPasswordField textField_1 = new JPasswordField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 10;
		logInPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_8.gridx = 1;
		gbc_verticalStrut_8.gridy = 11;
		logInPanel.add(verticalStrut_8, gbc_verticalStrut_8);
		
		JButton btnLogIn_1 = new JButton("LOG IN");
		btnLogIn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("") || textField_1.getText().equals("")) {
					if (lblNewLabel_1.getText() != "")
						lblNewLabel_1.setText("");
					lblNewLabel_1.setText("Errore !");
				}
				
				else if (Controller.login(textField.getText(), textField_1.getText()) == null) { //aggiungere errore email non trovata nel database
					if (lblNewLabel_1.getText() != "")
						lblNewLabel_1.setText("");
					lblNewLabel_1.setText("Errore !");
				}
				
				else{
					Cliente c = Controller.login(textField.getText(), textField_1.getText());
					contentPane.removeAll();
					contentPane.add(AreaUtente.esegui(contentPane, homePanel, c));
					contentPane.repaint();
					contentPane.revalidate();
					}
				}
		});
		btnLogIn_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnLogIn_1 = new GridBagConstraints();
		gbc_btnLogIn_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogIn_1.anchor = GridBagConstraints.WEST;
		gbc_btnLogIn_1.gridx = 1;
		gbc_btnLogIn_1.gridy = 13;
		logInPanel.add(btnLogIn_1, gbc_btnLogIn_1);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_9.gridx = 1;
		gbc_verticalStrut_9.gridy = 14;
		logInPanel.add(verticalStrut_9, gbc_verticalStrut_9);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_12 = new GridBagConstraints();
		gbc_verticalStrut_12.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_12.gridx = 1;
		gbc_verticalStrut_12.gridy = 15;
		logInPanel.add(verticalStrut_12, gbc_verticalStrut_12);
		
		JLabel lblNewLabel = new JLabel("Non hai un account?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 16;
		logInPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblRegistratiAlProgramma = new JLabel("Registrati al programma fedelt\u00E0");
		lblRegistratiAlProgramma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRegistratiAlProgramma.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblRegistratiAlProgramma = new GridBagConstraints();
		gbc_lblRegistratiAlProgramma.anchor = GridBagConstraints.WEST;
		gbc_lblRegistratiAlProgramma.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistratiAlProgramma.gridx = 1;
		gbc_lblRegistratiAlProgramma.gridy = 17;
		logInPanel.add(lblRegistratiAlProgramma, gbc_lblRegistratiAlProgramma);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_10.gridx = 1;
		gbc_verticalStrut_10.gridy = 18;
		logInPanel.add(verticalStrut_10, gbc_verticalStrut_10);
		
		JButton btnNewButton = new JButton("Registrazione");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(Registrazione.esegui(contentPane, logInPanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 19;
		logInPanel.add(btnNewButton, gbc_btnNewButton);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_11.gridx = 1;
		gbc_verticalStrut_11.gridy = 20;
		logInPanel.add(verticalStrut_11, gbc_verticalStrut_11);
		
		return logInPanel;
		
	}

}

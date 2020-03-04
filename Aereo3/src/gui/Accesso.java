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
		GridBagLayout gblLogInPanel = new GridBagLayout();
		gblLogInPanel.columnWidths = new int[]{0, 0, 0};
		gblLogInPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblLogInPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gblLogInPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		logInPanel.setLayout(gblLogInPanel);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel1.setForeground(Color.RED);
		GridBagConstraints gbcLblNewLabel1 = new GridBagConstraints();
		gbcLblNewLabel1.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel1.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel1.gridx = 1;
		gbcLblNewLabel1.gridy = 14;
		logInPanel.add(lblNewLabel1, gbcLblNewLabel1);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut6.gridx = 1;
		gbcVerticalStrut6.gridy = 1;
		logInPanel.add(verticalStrut6, gbcVerticalStrut6);
		
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
		GridBagConstraints gbcBtnBack = new GridBagConstraints();
		gbcBtnBack.anchor = GridBagConstraints.WEST;
		gbcBtnBack.insets = new Insets(0, 0, 5, 0);
		gbcBtnBack.gridx = 1;
		gbcBtnBack.gridy = 2;
		logInPanel.add(btnBack, gbcBtnBack);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbcLblEmail = new GridBagConstraints();
		gbcLblEmail.insets = new Insets(0, 0, 5, 0);
		gbcLblEmail.anchor = GridBagConstraints.NORTHWEST;
		gbcLblEmail.gridx = 1;
		gbcLblEmail.gridy = 5;
		logInPanel.add(lblEmail, gbcLblEmail);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.insets = new Insets(0, 0, 5, 0);
		gbcTextField.anchor = GridBagConstraints.NORTH;
		gbcTextField.gridx = 1;
		gbcTextField.gridy = 6;
		logInPanel.add(textField, gbcTextField);
		textField.setColumns(10);
		
		Component verticalStrut7 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut7 = new GridBagConstraints();
		gbcVerticalStrut7.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut7.gridx = 1;
		gbcVerticalStrut7.gridy = 7;
		logInPanel.add(verticalStrut7, gbcVerticalStrut7);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbcLblPassword = new GridBagConstraints();
		gbcLblPassword.insets = new Insets(0, 0, 5, 0);
		gbcLblPassword.anchor = GridBagConstraints.NORTHWEST;
		gbcLblPassword.gridx = 1;
		gbcLblPassword.gridy = 8;
		logInPanel.add(lblPassword, gbcLblPassword);
		
		JPasswordField textField1 = new JPasswordField();
		GridBagConstraints gbcTextField1 = new GridBagConstraints();
		gbcTextField1.insets = new Insets(0, 0, 5, 0);
		gbcTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField1.anchor = GridBagConstraints.NORTH;
		gbcTextField1.gridx = 1;
		gbcTextField1.gridy = 10;
		logInPanel.add(textField1, gbcTextField1);
		textField1.setColumns(10);
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut8.gridx = 1;
		gbcVerticalStrut8.gridy = 11;
		logInPanel.add(verticalStrut8, gbcVerticalStrut8);
		
		JButton btnLogIn1 = new JButton("LOG IN");
		btnLogIn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("") || textField1.getText().equals("")) {
					if ( ! lblNewLabel1.getText().equals(""))
						lblNewLabel1.setText("");
					lblNewLabel1.setText("Errore !");
				}
				
				else if (Controller.login(textField.getText(), textField1.getText()) == null) { //aggiungere errore email non trovata nel database
					if (! lblNewLabel1.getText().equals(""))
						lblNewLabel1.setText("");
					lblNewLabel1.setText("Errore !");
				}
				
				else{
					Cliente c = Controller.login(textField.getText(), textField1.getText());
					contentPane.removeAll();
					contentPane.add(AreaUtente.esegui(contentPane, homePanel, c));
					contentPane.repaint();
					contentPane.revalidate();
					}
				}
		});
		btnLogIn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbcBtnLogIn1 = new GridBagConstraints();
		gbcBtnLogIn1.insets = new Insets(0, 0, 5, 0);
		gbcBtnLogIn1.anchor = GridBagConstraints.WEST;
		gbcBtnLogIn1.gridx = 1;
		gbcBtnLogIn1.gridy = 13;
		logInPanel.add(btnLogIn1, gbcBtnLogIn1);
		
		Component verticalStrut9 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut9.gridx = 1;
		gbcVerticalStrut9.gridy = 14;
		logInPanel.add(verticalStrut9, gbcVerticalStrut9);
		
		Component verticalStrut12 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut12 = new GridBagConstraints();
		gbcVerticalStrut12.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut12.gridx = 1;
		gbcVerticalStrut12.gridy = 15;
		logInPanel.add(verticalStrut12, gbcVerticalStrut12);
		
		JLabel lblNewLabel = new JLabel("Non hai un account?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblNewLabel = new GridBagConstraints();
		gbcLblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel.gridx = 1;
		gbcLblNewLabel.gridy = 16;
		logInPanel.add(lblNewLabel, gbcLblNewLabel);
		
		JLabel lblRegistratiAlProgramma = new JLabel("Registrati al programma fedelt\u00E0");
		lblRegistratiAlProgramma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRegistratiAlProgramma.setForeground(Color.WHITE);
		GridBagConstraints gbcLblRegistratiAlProgramma = new GridBagConstraints();
		gbcLblRegistratiAlProgramma.anchor = GridBagConstraints.WEST;
		gbcLblRegistratiAlProgramma.insets = new Insets(0, 0, 5, 0);
		gbcLblRegistratiAlProgramma.gridx = 1;
		gbcLblRegistratiAlProgramma.gridy = 17;
		logInPanel.add(lblRegistratiAlProgramma, gbcLblRegistratiAlProgramma);
		
		Component verticalStrut10 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut10 = new GridBagConstraints();
		gbcVerticalStrut10.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut10.gridx = 1;
		gbcVerticalStrut10.gridy = 18;
		logInPanel.add(verticalStrut10, gbcVerticalStrut10);
		
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
		GridBagConstraints gbcBtnNewButton = new GridBagConstraints();
		gbcBtnNewButton.insets = new Insets(0, 0, 5, 0);
		gbcBtnNewButton.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton.gridx = 1;
		gbcBtnNewButton.gridy = 19;
		logInPanel.add(btnNewButton, gbcBtnNewButton);
		
		Component verticalStrut11 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut11 = new GridBagConstraints();
		gbcVerticalStrut11.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut11.gridx = 1;
		gbcVerticalStrut11.gridy = 20;
		logInPanel.add(verticalStrut11, gbcVerticalStrut11);
		
		return logInPanel;
		
	}

}

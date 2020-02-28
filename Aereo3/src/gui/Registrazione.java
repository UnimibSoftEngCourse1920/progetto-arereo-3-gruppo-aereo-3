package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.regex.Pattern;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.Controller;
import dominio.Cliente;

public class Registrazione {
	
	static JPanel esegui(JPanel contentPane, JPanel logInPanel) {
		JLabel label_3 = new JLabel("");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 18;
		JPanel registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.BLUE);
		contentPane.add(registrationPanel, "name_523737106974600");
		GridBagLayout gbl_registrationPanel = new GridBagLayout();
		gbl_registrationPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_registrationPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_registrationPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_registrationPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registrationPanel.setLayout(gbl_registrationPanel);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_13 = new GridBagConstraints();
		gbc_verticalStrut_13.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_13.gridx = 1;
		gbc_verticalStrut_13.gridy = 1;
		registrationPanel.add(verticalStrut_13, gbc_verticalStrut_13);
		
		JButton btnBack_1 = new JButton("BACK");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(registrationPanel);
				contentPane.add(logInPanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnBack_1 = new GridBagConstraints();
		gbc_btnBack_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack_1.anchor = GridBagConstraints.WEST;
		gbc_btnBack_1.gridx = 1;
		gbc_btnBack_1.gridy = 2;
		registrationPanel.add(btnBack_1, gbc_btnBack_1);
		
		Component verticalStrut_14 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_14 = new GridBagConstraints();
		gbc_verticalStrut_14.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_14.gridx = 1;
		gbc_verticalStrut_14.gridy = 3;
		registrationPanel.add(verticalStrut_14, gbc_verticalStrut_14);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		registrationPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JTextField textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		registrationPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		Component verticalStrut_15 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_15 = new GridBagConstraints();
		gbc_verticalStrut_15.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_15.gridx = 1;
		gbc_verticalStrut_15.gridy = 5;
		registrationPanel.add(verticalStrut_15, gbc_verticalStrut_15);
		
		JLabel lblCognome = new JLabel("Cognome:");
		lblCognome.setForeground(Color.WHITE);
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblCognome = new GridBagConstraints();
		gbc_lblCognome.anchor = GridBagConstraints.WEST;
		gbc_lblCognome.insets = new Insets(0, 0, 5, 5);
		gbc_lblCognome.gridx = 1;
		gbc_lblCognome.gridy = 6;
		registrationPanel.add(lblCognome, gbc_lblCognome);
		
		JTextField textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.WEST;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 6;
		registrationPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		Component verticalStrut_16 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_16 = new GridBagConstraints();
		gbc_verticalStrut_16.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_16.gridx = 1;
		gbc_verticalStrut_16.gridy = 7;
		registrationPanel.add(verticalStrut_16, gbc_verticalStrut_16);
		
		JLabel lblIndirizzo = new JLabel("Indirizzo:");
		lblIndirizzo.setForeground(Color.WHITE);
		lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblIndirizzo = new GridBagConstraints();
		gbc_lblIndirizzo.anchor = GridBagConstraints.WEST;
		gbc_lblIndirizzo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndirizzo.gridx = 1;
		gbc_lblIndirizzo.gridy = 8;
		registrationPanel.add(lblIndirizzo, gbc_lblIndirizzo);
		
		JTextField textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.WEST;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 8;
		registrationPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		Component verticalStrut_17 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_17 = new GridBagConstraints();
		gbc_verticalStrut_17.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_17.gridx = 1;
		gbc_verticalStrut_17.gridy = 9;
		registrationPanel.add(verticalStrut_17, gbc_verticalStrut_17);
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setForeground(Color.WHITE);
		lblEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 1;
		gbc_lblEmail_1.gridy = 10;
		registrationPanel.add(lblEmail_1, gbc_lblEmail_1);
		
		JTextField textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.WEST;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 10;
		registrationPanel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		Component verticalStrut_18 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_18 = new GridBagConstraints();
		gbc_verticalStrut_18.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_18.gridx = 1;
		gbc_verticalStrut_18.gridy = 11;
		registrationPanel.add(verticalStrut_18, gbc_verticalStrut_18);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setForeground(Color.WHITE);
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
		gbc_lblPassword_1.anchor = GridBagConstraints.WEST;
		gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword_1.gridx = 1;
		gbc_lblPassword_1.gridy = 12;
		registrationPanel.add(lblPassword_1, gbc_lblPassword_1);
		
		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 12;
		registrationPanel.add(passwordField, gbc_passwordField);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 3;
		gbc_horizontalStrut.gridy = 12;
		registrationPanel.add(horizontalStrut, gbc_horizontalStrut);
		
		Component verticalStrut_19 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_19 = new GridBagConstraints();
		gbc_verticalStrut_19.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_19.gridx = 1;
		gbc_verticalStrut_19.gridy = 13;
		registrationPanel.add(verticalStrut_19, gbc_verticalStrut_19);
		
		JLabel lblConfermaPassword = new JLabel("Conferma Password:");
		lblConfermaPassword.setForeground(Color.WHITE);
		lblConfermaPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblConfermaPassword = new GridBagConstraints();
		gbc_lblConfermaPassword.anchor = GridBagConstraints.EAST;
		gbc_lblConfermaPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfermaPassword.gridx = 1;
		gbc_lblConfermaPassword.gridy = 14;
		registrationPanel.add(lblConfermaPassword, gbc_lblConfermaPassword);
		
		JPasswordField passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 2;
		gbc_passwordField_1.gridy = 14;
		registrationPanel.add(passwordField_1, gbc_passwordField_1);
		
		Component verticalStrut_20 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_20 = new GridBagConstraints();
		gbc_verticalStrut_20.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_20.gridx = 1;
		gbc_verticalStrut_20.gridy = 15;
		registrationPanel.add(verticalStrut_20, gbc_verticalStrut_20);
		
		Component verticalStrut_21 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_21 = new GridBagConstraints();
		gbc_verticalStrut_21.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_21.gridx = 1;
		gbc_verticalStrut_21.gridy = 16;
		registrationPanel.add(verticalStrut_21, gbc_verticalStrut_21);
		
		JButton btnConferma = new JButton("Registrati !");
		btnConferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label_3 != null)
					registrationPanel.remove(label_3);
				
				if(!(passwordField.getText().equals(passwordField_1.getText()))) {
					label_3.setText("Password Errate !");
					registrationPanel.add(label_3, gbc_label_3);
				}
				
				else if(isValid(textField_5.getText()) == false) {
					label_3.setText("Email errate");
					registrationPanel.add(label_3, gbc_label_3);
				}
				Cliente c = new Cliente();
				c.setNome(textField_2.getText());
				c.setCognome(textField_3.getText());
				c.setEmail(textField_5.getText());
				c.setPassword(passwordField.getText());
				c.setDataDiNascita(LocalDate.of(1998, 11, 22));
				c.setIndirizzo(textField_4.getText());
				Controller.insertCliente(c);
				registrationPanel.repaint();
				registrationPanel.revalidate();
			}
		});
		btnConferma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnConferma.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnConferma = new GridBagConstraints();
		gbc_btnConferma.anchor = GridBagConstraints.WEST;
		gbc_btnConferma.insets = new Insets(0, 0, 5, 5);
		gbc_btnConferma.gridx = 1;
		gbc_btnConferma.gridy = 17;
		registrationPanel.add(btnConferma, gbc_btnConferma);
		
		return registrationPanel;
	}
	
	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
			return false; 
		
		return pat.matcher(email).matches();
	}

}

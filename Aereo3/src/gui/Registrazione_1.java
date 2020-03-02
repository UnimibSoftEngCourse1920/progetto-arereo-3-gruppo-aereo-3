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
import java.util.regex.Pattern;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Cliente;

public class Registrazione_1 {
	
	static JPanel esegui(JPanel contentPane, JPanel logInPanel) {
		JPanel registration_panel = new JPanel();
		registration_panel.setBackground(Color.BLUE);
		contentPane.add(registration_panel, "name_5801880281900");
		GridBagLayout gbl_registration_panel = new GridBagLayout();
		gbl_registration_panel.columnWidths = new int[]{0, 0};
		gbl_registration_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_registration_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_registration_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registration_panel.setLayout(gbl_registration_panel);
		
		Date now = new Date();
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(logInPanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 0);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 0;
		registration_panel.add(btnBack, gbc_btnBack);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 1;
		registration_panel.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNome.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 0);
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 2;
		registration_panel.add(lblNome, gbc_lblNome);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 3;
		registration_panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCognome.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblCognome = new GridBagConstraints();
		gbc_lblCognome.insets = new Insets(0, 0, 5, 0);
		gbc_lblCognome.anchor = GridBagConstraints.WEST;
		gbc_lblCognome.gridx = 0;
		gbc_lblCognome.gridy = 4;
		registration_panel.add(lblCognome, gbc_lblCognome);
		
		JTextField textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 5;
		registration_panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataDiNascita = new JLabel("Data di Nascita");
		lblDataDiNascita.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDataDiNascita.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblDataDiNascita = new GridBagConstraints();
		gbc_lblDataDiNascita.insets = new Insets(0, 0, 5, 0);
		gbc_lblDataDiNascita.anchor = GridBagConstraints.WEST;
		gbc_lblDataDiNascita.gridx = 0;
		gbc_lblDataDiNascita.gridy = 6;
		registration_panel.add(lblDataDiNascita, gbc_lblDataDiNascita);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 0;
		gbc_dateChooser_1.gridy = 7;
		registration_panel.add(dateChooser_1, gbc_dateChooser_1);
		
		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblIndirizzo.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIndirizzo = new GridBagConstraints();
		gbc_lblIndirizzo.insets = new Insets(0, 0, 5, 0);
		gbc_lblIndirizzo.anchor = GridBagConstraints.WEST;
		gbc_lblIndirizzo.gridx = 0;
		gbc_lblIndirizzo.gridy = 8;
		registration_panel.add(lblIndirizzo, gbc_lblIndirizzo);
		
		JTextField textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 9;
		registration_panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 10;
		registration_panel.add(lblEmail, gbc_lblEmail);
		
		JTextField textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 11;
		registration_panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 12;
		registration_panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 13;
		registration_panel.add(passwordField, gbc_passwordField);
		
		JLabel lblConfermaPassword = new JLabel("Conferma Password");
		lblConfermaPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConfermaPassword.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblConfermaPassword = new GridBagConstraints();
		gbc_lblConfermaPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblConfermaPassword.anchor = GridBagConstraints.WEST;
		gbc_lblConfermaPassword.gridx = 0;
		gbc_lblConfermaPassword.gridy = 14;
		registration_panel.add(lblConfermaPassword, gbc_lblConfermaPassword);
		
		JPasswordField passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 0;
		gbc_passwordField_1.gridy = 15;
		registration_panel.add(passwordField_1, gbc_passwordField_1);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_7.gridx = 0;
		gbc_verticalStrut_7.gridy = 16;
		registration_panel.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 18;
		registration_panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JButton btnRegistrati = new JButton("Registrati ");
		btnRegistrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (! lblNewLabel_3.getText().equals(""))
					lblNewLabel_3.setText("");
				
				if(!(passwordField.getText().equals(passwordField_1.getText())) || passwordField.getText().equals("") || passwordField_1.getText().equals("")) {
					lblNewLabel_3.setText("Password Errate !");
				}
				
				else if(dateChooser_1.getDate().after(now)) {
					lblNewLabel_3.setText("Errore nella data");
				}
				
				else if(isValid(textField_3.getText()) == false || textField_3.getText().equals("")) {
					lblNewLabel_3.setText("Email errate");
				}
				
				else{
				Cliente c = new Cliente();
				c.setNome(textField.getText());
				c.setCognome(textField_1.getText());
				c.setEmail(textField_3.getText());
				c.setPsw(passwordField.getText());
				c.setDataDiNascita(dateChooser_1.getDate());
				c.setIndirizzo(textField_2.getText());
				Controller.insertCliente(c);
				registration_panel.add(AreaUtente.esegui(contentPane, registration_panel, c));
				registration_panel.repaint();
				registration_panel.revalidate();
				}
			}
		});
		btnRegistrati.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnRegistrati = new GridBagConstraints();
		gbc_btnRegistrati.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegistrati.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrati.gridx = 0;
		gbc_btnRegistrati.gridy = 17;
		registration_panel.add(btnRegistrati, gbc_btnRegistrati);
		
		return registration_panel;
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

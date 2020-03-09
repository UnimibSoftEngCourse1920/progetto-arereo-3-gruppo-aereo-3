package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
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
import dominio.ClienteFedele;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;

public class Registrazione {
	
	static JPanel esegui(JPanel contentPane, JPanel logInPanel) {
		JPanel registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.BLUE);
		contentPane.add(registrationPanel, "name_5801880281900");
		GridBagLayout gblRegistrationPanel = new GridBagLayout();
		gblRegistrationPanel.columnWidths = new int[]{0, 0};
		gblRegistrationPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblRegistrationPanel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gblRegistrationPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registrationPanel.setLayout(gblRegistrationPanel);
		
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
		GridBagConstraints gbcBtnBack = new GridBagConstraints();
		gbcBtnBack.anchor = GridBagConstraints.WEST;
		gbcBtnBack.insets = new Insets(0, 0, 5, 0);
		gbcBtnBack.gridx = 0;
		gbcBtnBack.gridy = 0;
		registrationPanel.add(btnBack, gbcBtnBack);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut6.gridx = 0;
		gbcVerticalStrut6.gridy = 1;
		registrationPanel.add(verticalStrut6, gbcVerticalStrut6);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNome.setForeground(Color.WHITE);
		GridBagConstraints gbcLblNome = new GridBagConstraints();
		gbcLblNome.insets = new Insets(0, 0, 5, 0);
		gbcLblNome.anchor = GridBagConstraints.WEST;
		gbcLblNome.gridx = 0;
		gbcLblNome.gridy = 2;
		registrationPanel.add(lblNome, gbcLblNome);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.insets = new Insets(0, 0, 5, 0);
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.gridx = 0;
		gbcTextField.gridy = 3;
		registrationPanel.add(textField, gbcTextField);
		textField.setColumns(10);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCognome.setForeground(Color.WHITE);
		GridBagConstraints gbcLblCognome = new GridBagConstraints();
		gbcLblCognome.insets = new Insets(0, 0, 5, 0);
		gbcLblCognome.anchor = GridBagConstraints.WEST;
		gbcLblCognome.gridx = 0;
		gbcLblCognome.gridy = 4;
		registrationPanel.add(lblCognome, gbcLblCognome);
		
		JTextField textField1 = new JTextField();
		GridBagConstraints gbcTextField1 = new GridBagConstraints();
		gbcTextField1.insets = new Insets(0, 0, 5, 0);
		gbcTextField1.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField1.gridx = 0;
		gbcTextField1.gridy = 5;
		registrationPanel.add(textField1, gbcTextField1);
		textField1.setColumns(10);
		
		JLabel lblDataDiNascita = new JLabel("Data di Nascita");
		lblDataDiNascita.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDataDiNascita.setForeground(Color.WHITE);
		GridBagConstraints gbcLblDataDiNascita = new GridBagConstraints();
		gbcLblDataDiNascita.insets = new Insets(0, 0, 5, 0);
		gbcLblDataDiNascita.anchor = GridBagConstraints.WEST;
		gbcLblDataDiNascita.gridx = 0;
		gbcLblDataDiNascita.gridy = 6;
		registrationPanel.add(lblDataDiNascita, gbcLblDataDiNascita);
		
		JDateChooser dateChooser1 = new JDateChooser();
		GridBagConstraints gbcDateChooser1 = new GridBagConstraints();
		gbcDateChooser1.insets = new Insets(0, 0, 5, 0);
		gbcDateChooser1.fill = GridBagConstraints.BOTH;
		gbcDateChooser1.gridx = 0;
		gbcDateChooser1.gridy = 7;
		registrationPanel.add(dateChooser1, gbcDateChooser1);
		
		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblIndirizzo.setForeground(Color.WHITE);
		GridBagConstraints gbcLblIndirizzo = new GridBagConstraints();
		gbcLblIndirizzo.insets = new Insets(0, 0, 5, 0);
		gbcLblIndirizzo.anchor = GridBagConstraints.WEST;
		gbcLblIndirizzo.gridx = 0;
		gbcLblIndirizzo.gridy = 8;
		registrationPanel.add(lblIndirizzo, gbcLblIndirizzo);
		
		JTextField textField2 = new JTextField();
		GridBagConstraints gbcTextField2 = new GridBagConstraints();
		gbcTextField2.insets = new Insets(0, 0, 5, 0);
		gbcTextField2.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField2.gridx = 0;
		gbcTextField2.gridy = 9;
		registrationPanel.add(textField2, gbcTextField2);
		textField2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblEmail = new GridBagConstraints();
		gbcLblEmail.insets = new Insets(0, 0, 5, 0);
		gbcLblEmail.anchor = GridBagConstraints.WEST;
		gbcLblEmail.gridx = 0;
		gbcLblEmail.gridy = 10;
		registrationPanel.add(lblEmail, gbcLblEmail);
		
		JTextField textField3 = new JTextField();
		GridBagConstraints gbcTextField3 = new GridBagConstraints();
		gbcTextField3.insets = new Insets(0, 0, 5, 0);
		gbcTextField3.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField3.gridx = 0;
		gbcTextField3.gridy = 11;
		registrationPanel.add(textField3, gbcTextField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel2 = new JLabel("Password");
		lblNewLabel2.setForeground(Color.WHITE);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblNewLabel2 = new GridBagConstraints();
		gbcLblNewLabel2.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel2.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel2.gridx = 0;
		gbcLblNewLabel2.gridy = 12;
		registrationPanel.add(lblNewLabel2, gbcLblNewLabel2);
		
		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbcPasswordField = new GridBagConstraints();
		gbcPasswordField.insets = new Insets(0, 0, 5, 0);
		gbcPasswordField.fill = GridBagConstraints.HORIZONTAL;
		gbcPasswordField.gridx = 0;
		gbcPasswordField.gridy = 13;
		registrationPanel.add(passwordField, gbcPasswordField);
		
		JLabel lblConfermaPassword = new JLabel("Conferma Password");
		lblConfermaPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConfermaPassword.setForeground(Color.WHITE);
		GridBagConstraints gbcLblConfermaPassword = new GridBagConstraints();
		gbcLblConfermaPassword.insets = new Insets(0, 0, 5, 0);
		gbcLblConfermaPassword.anchor = GridBagConstraints.WEST;
		gbcLblConfermaPassword.gridx = 0;
		gbcLblConfermaPassword.gridy = 14;
		registrationPanel.add(lblConfermaPassword, gbcLblConfermaPassword);
		
		JPasswordField passwordField1 = new JPasswordField();
		GridBagConstraints gbcPasswordField1 = new GridBagConstraints();
		gbcPasswordField1.insets = new Insets(0, 0, 5, 0);
		gbcPasswordField1.fill = GridBagConstraints.HORIZONTAL;
		gbcPasswordField1.gridx = 0;
		gbcPasswordField1.gridy = 15;
		registrationPanel.add(passwordField1, gbcPasswordField1);
		
		Component verticalStrut7 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut7 = new GridBagConstraints();
		gbcVerticalStrut7.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut7.gridx = 0;
		gbcVerticalStrut7.gridy = 16;
		registrationPanel.add(verticalStrut7, gbcVerticalStrut7);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setForeground(Color.RED);
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel3 = new GridBagConstraints();
		gbcLblNewLabel3.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel3.gridx = 0;
		gbcLblNewLabel3.gridy = 18;
		registrationPanel.add(lblNewLabel3, gbcLblNewLabel3);
		
		JButton btnRegistrati = new JButton("Registrati ");
		btnRegistrati.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (! lblNewLabel3.getText().equals(""))
					lblNewLabel3.setText("");
				
				if(!(passwordField.getText().equals(passwordField1.getText())) || passwordField.getText().equals("") || passwordField1.getText().equals("")) {
					lblNewLabel3.setText("Password Errate !");
				}
				
				else if(dateChooser1.getDate().after(now)) {
					lblNewLabel3.setText("Errore nella data");
				}
				
				else if(!(isValid(textField3.getText())) || textField3.getText().equals("")) {
					lblNewLabel3.setText("Email errate");
				}
				
				else{
				ClienteFedele c = null;
				Cliente cli = Controller.getCliente(textField3.getText());
				if(cli != null) {
					c = Controller.signToLoyalty(cli, textField2.getText(), passwordField.getText());
				} else {
					c = new ClienteFedele();
					c.setNome(textField.getText());
					c.setCognome(textField1.getText());
					c.setEmail(textField3.getText());
					c.setPsw(passwordField.getText());
					c.setDataDiNascita(dateChooser1.getDate());
					c.setIndirizzo(textField2.getText());
					c.setDataIscrizione(now);
					c.setUltimoBiglietto(now);
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.YEAR, 2);
					Date infedele = cal.getTime();
					c.setInfedele(infedele);
					Controller.insertClienteFedele(c);
				}
				lblNewLabel3.setText("Registrazione andata a buon fine");
				registrationPanel.add(AreaUtente.esegui(contentPane, registrationPanel, c));
				registrationPanel.repaint();
				registrationPanel.revalidate();
				
				GestoreMail ge = Controller.getGestoreMail();
				Controller.sendMail(ge, c.getEmail(), MessaggiPredefiniti.FEDELE_SUBJ.getMessaggio(), MessaggiPredefiniti.FEDELE_TXT.getMessaggio());
				}
			}
		});
		btnRegistrati.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcBtnRegistrati = new GridBagConstraints();
		gbcBtnRegistrati.insets = new Insets(0, 0, 5, 0);
		gbcBtnRegistrati.anchor = GridBagConstraints.WEST;
		gbcBtnRegistrati.gridx = 0;
		gbcBtnRegistrati.gridy = 17;
		registrationPanel.add(btnRegistrati, gbcBtnRegistrati);
		
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


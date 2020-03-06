package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Pattern;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Cliente;
import dominio.ClienteFedele;
import dominio.Volo;

public class ElencoPasseggeri {
	
	static JPanel esegui(JPanel contentPane, int value, JPanel panel_6, int idVolo, boolean modifica) {
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.BLUE);
		contentPane.add(panel8, "name_1158551504937600");
		panel8.setLayout(new BorderLayout(0, 0));
		
		Date now = new Date();
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.BLUE);
		panel8.add(panel9, BorderLayout.WEST);
		GridBagLayout gblPanel9 = new GridBagLayout();
		gblPanel9.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel9.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0};
		gblPanel9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblPanel9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel9.setLayout(gblPanel9);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel8.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(panel_6);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnBack, BorderLayout.WEST);
		
		JLabel [] etichette = new JLabel[value*3];
		JTextField [] campi = new JTextField [value*2];
		GridBagConstraints [] format = new GridBagConstraints[etichette.length*campi.length];
		
		int k = 0;
		int y = 0;
		int z = 0;
		int h = 0;
		int u = 0;
		
		for (int i = 0; i<value; i++) {
			etichette[u] = new JLabel("Passeggero " + (i+1));
			etichette[u].setForeground(Color.WHITE);
			etichette[u].setFont(new Font("Tahoma", Font.PLAIN, 30));
			format[z] = new GridBagConstraints();
			format[z].anchor = GridBagConstraints.WEST;
			format[z].insets = new Insets(0, 0, 5, 5);
			format[z].gridx = k;
			format[z].gridy = y;
			panel9.add(etichette[u], format[z]);
			u++;
			y++;
			z++;
			
			etichette[u] = new JLabel("Nome");
			etichette[u].setForeground(Color.WHITE);
			etichette[u].setFont(new Font("Tahoma", Font.PLAIN, 20));
			format[z] = new GridBagConstraints();
			format[z].anchor = GridBagConstraints.WEST;
			format[z].insets = new Insets(0, 0, 5, 5);
			format[z].gridx = k;
			format[z].gridy = y;
			panel9.add(etichette[u], format[z]);
			u++;
			y++;
			z++;
			
			campi[h] = new JTextField();
			format[z] = new GridBagConstraints();
			format[z].fill = GridBagConstraints.HORIZONTAL;
			format[z].insets = new Insets(0, 0, 5, 0);
			format[z].anchor = GridBagConstraints.NORTH;
			format[z].gridx = k;
			format[z].gridy = y;
			panel9.add(campi[h], format[z]);
			campi[h].setColumns(10);
			y++;
			h++;
			z++;
			
			etichette[u] = new JLabel("Cognome");
			etichette[u].setForeground(Color.WHITE);
			etichette[u].setFont(new Font("Tahoma", Font.PLAIN, 20));
			format[z] = new GridBagConstraints();
			format[z].anchor = GridBagConstraints.WEST;
			format[z].insets = new Insets(0, 0, 5, 5);
			format[z].gridx = k;
			format[z].gridy = y;
			panel9.add(etichette[u], format[z]);
			u++;
			y++;
			z++;
			
			campi[h] = new JTextField();
			format[z] = new GridBagConstraints();
			format[z].fill = GridBagConstraints.HORIZONTAL;
			format[z].insets = new Insets(0, 0, 5, 0);
			format[z].anchor = GridBagConstraints.NORTH;
			format[z].gridx = k;
			format[z].gridy = y;
			panel9.add(campi[h], format[z]);
			campi[h].setColumns(10);
			y++;
			z++;
			h++;
	}
		
		JLabel email = new JLabel("Email");
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints glcEmail = new GridBagConstraints();
		glcEmail.anchor = GridBagConstraints.WEST;
		glcEmail.insets = new Insets(0, 0, 5, 5);
		glcEmail.gridx = k;
		glcEmail.gridy = y;
		panel9.add(email, glcEmail);
		y++;
		
		JTextField emailInsert = new JTextField();
		GridBagConstraints glcEmailText = new GridBagConstraints();
		glcEmailText.fill = GridBagConstraints.HORIZONTAL;
		glcEmailText.insets = new Insets(0, 0, 5, 0);
		glcEmailText.anchor = GridBagConstraints.NORTH;
		glcEmailText.gridx = k;
		glcEmailText.gridy = y;
		panel9.add(emailInsert, glcEmailText);
		emailInsert.setColumns(10);
		y++;
		
		JLabel dataNascita = new JLabel("Inserire data di nascita");
		dataNascita.setForeground(Color.WHITE);
		dataNascita.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints glcNascita = new GridBagConstraints();
		glcNascita.anchor = GridBagConstraints.WEST;
		glcNascita.insets = new Insets(0, 0, 5, 5);
		glcNascita.gridx = k;
		glcNascita.gridy = y;
		panel9.add(dataNascita, glcNascita);
		y++;
		
		JDateChooser dataDiNascita = new JDateChooser();
		dataDiNascita.setDate(now);
		GridBagConstraints gbcDateChooser = new GridBagConstraints();
		gbcDateChooser.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbcDateChooser.gridx = k;
		gbcDateChooser.gridy = y;
		panel9.add(dataDiNascita, gbcDateChooser);
		y++;
		
		JLabel errore = new JLabel("");
		errore.setForeground(Color.RED);
		errore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints glcErrore = new GridBagConstraints();
		glcErrore.anchor = GridBagConstraints.WEST;
		glcErrore.insets = new Insets(0, 0, 5, 5);
		glcErrore.gridx = k;
		glcErrore.gridy = y;
		panel9.add(errore, glcErrore);
		
		int oldP = -1;
		
		JPanel panel10 = new JPanel();
		panel10.setBackground(Color.BLUE);
		panel8.add(panel10, BorderLayout.EAST);
		GridBagLayout gblPanel10 = new GridBagLayout();
		gblPanel10.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel10.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0};
		gblPanel10.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblPanel10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel10.setLayout(gblPanel10);
		
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut1 = new GridBagConstraints();
		gbcVerticalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut1.gridx = 0;
		gbcVerticalStrut1.gridy = 0;
		panel10.add(verticalStrut1, gbcVerticalStrut1);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut2 = new GridBagConstraints();
		gbcVerticalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut2.gridx = 0;
		gbcVerticalStrut2.gridy = 2;
		panel10.add(verticalStrut2, gbcVerticalStrut2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setVisible(false);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblEmail = new GridBagConstraints();
		gbcLblEmail.anchor = GridBagConstraints.WEST;
		gbcLblEmail.insets = new Insets(0, 0, 5, 5);
		gbcLblEmail.gridx = 0;
		gbcLblEmail.gridy = 3;
		panel10.add(lblEmail, gbcLblEmail);
		
		JTextField textField = new JTextField();
		textField.setVisible(false);
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.insets = new Insets(0, 0, 5, 5);
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.gridx = 0;
		gbcTextField.gridy = 4;
		panel10.add(textField, gbcTextField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setVisible(false);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setForeground(Color.WHITE);
		GridBagConstraints gbcLblPassword = new GridBagConstraints();
		gbcLblPassword.anchor = GridBagConstraints.WEST;
		gbcLblPassword.insets = new Insets(0, 0, 5, 5);
		gbcLblPassword.gridx = 0;
		gbcLblPassword.gridy = 5;
		panel10.add(lblPassword, gbcLblPassword);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setVisible(false);
		GridBagConstraints gbcPasswordField = new GridBagConstraints();
		gbcPasswordField.insets = new Insets(0, 0, 5, 5);
		gbcPasswordField.fill = GridBagConstraints.HORIZONTAL;
		gbcPasswordField.gridx = 0;
		gbcPasswordField.gridy = 6;
		panel10.add(passwordField, gbcPasswordField);
		
		Component verticalStrut3 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut3 = new GridBagConstraints();
		gbcVerticalStrut3.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut3.gridx = 0;
		gbcVerticalStrut3.gridy = 7;
		panel10.add(verticalStrut3, gbcVerticalStrut3);
		
		JButton btnNewButton1 = new JButton("LOGIN");
		btnNewButton1.setVisible(false);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteFedele c1 = Controller.login(textField.getText(), passwordField.getText());
				if(c1 != null) {
					campi[0].setText(c1.getNome());
					campi[1].setText(c1.getCognome());
					emailInsert.setText(c1.getEmail());
					emailInsert.setEditable(false);
					dataDiNascita.setDate(c1.getDataDiNascita());
				}
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnNewButton = new GridBagConstraints();
		gbcBtnNewButton.anchor = GridBagConstraints.WEST;
		gbcBtnNewButton.insets = new Insets(0, 0, 5, 5);
		gbcBtnNewButton.gridx = 0;
		gbcBtnNewButton.gridy = 8;
		panel10.add(btnNewButton1, gbcBtnNewButton);
		
		JCheckBox chckbxSonoUnCliente = new JCheckBox("Sono un Cliente Fedele");
		chckbxSonoUnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblEmail.isVisible())
					lblEmail.setVisible(false);
				else
					lblEmail.setVisible(true);
				
				if(textField.isVisible())
					textField.setVisible(false);
				else
					textField.setVisible(true);
				
				if(lblPassword.isVisible())
					lblPassword.setVisible(false);
				else
					lblPassword.setVisible(true);
				
				if(passwordField.isVisible())
					passwordField.setVisible(false);
				else
					passwordField.setVisible(true);
				
				if(btnNewButton1.isVisible())
					btnNewButton1.setVisible(false);
				else
					btnNewButton1.setVisible(true);
			}
		});
		chckbxSonoUnCliente.setBackground(Color.BLUE);
		chckbxSonoUnCliente.setForeground(Color.WHITE);
		chckbxSonoUnCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcChckbxSonoUnCliente = new GridBagConstraints();
		gbcChckbxSonoUnCliente.anchor = GridBagConstraints.WEST;
		gbcChckbxSonoUnCliente.insets = new Insets(0, 0, 5, 5);
		gbcChckbxSonoUnCliente.gridx = 0;
		gbcChckbxSonoUnCliente.gridy = 1;
		panel10.add(chckbxSonoUnCliente, gbcChckbxSonoUnCliente);
		
		JButton btnNewButton = new JButton("Continua");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean continua = true;
				for (int i = 0; i<campi.length;i++) {
					if (campi[i].getText().equals("") || emailInsert.getText().equals("") || isValid(emailInsert.getText()) == false){
						continua=false;
						if (!errore.getText().equals("")) {
							errore.setText("");
						}
						errore.setText("Errore");
					}
				}
				
				if(dataDiNascita.getDate().after(now)) {
					continua=false;
					if (!errore.getText().equals("")) {
						errore.setText("");
					}
					errore.setText("Errore");
				}
				
				else if (continua) {
					if (Controller.getCliente(emailInsert.getText()) != null) {
						if (Controller.trovaCliente(Controller.getCliente(emailInsert.getText()).getCodCliente(), idVolo)){
							if (!errore.getText().equals("")) 
									errore.setText("");
					}	
							errore.setText("Il cliente ha già una prenotazione per questo volo");
						}
					else{
						if (!errore.getText().equals("")) {
							errore.setText("");
						}
						Cliente c = Controller.login(textField.getText(), passwordField.getText());
						boolean fedele = true;
						if (c == null) {
							c  = new Cliente();
							c.setNome(campi[0].getText());
							c.setCognome(campi[1].getText());
							c.setEmail(emailInsert.getText());
							c.setDataDiNascita(dataDiNascita.getDate());
							c.setIndirizzo("");
							fedele = false;
						}
						contentPane.removeAll();
						contentPane.add(SceltaPosti.esegui(contentPane, value, panel8, idVolo, c, modifica, oldP, fedele));
						contentPane.repaint();
						contentPane.revalidate();
					}
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton, BorderLayout.EAST);
		
		
		return panel8;
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

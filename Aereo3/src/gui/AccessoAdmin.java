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
import dominio.Admin;

public class AccessoAdmin {
	static JPanel esegui(JPanel contentPane, JPanel areaUtente, JPanel homePanel) {
		JPanel adminLogIn = new JPanel();
		adminLogIn.setBounds(100, 100, 894, 717);
		adminLogIn.setBackground(Color.BLUE);
		contentPane.add(adminLogIn, "name_1062736859150500");
		GridBagLayout gbl_adminLogIn = new GridBagLayout();
		gbl_adminLogIn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_adminLogIn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_adminLogIn.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_adminLogIn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		adminLogIn.setLayout(gbl_adminLogIn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 12;
		adminLogIn.add(lblNewLabel, gbc_lblNewLabel);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_6.gridx = 1;
		gbc_verticalStrut_6.gridy = 0;
		adminLogIn.add(verticalStrut_6, gbc_verticalStrut_6);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 1;
		adminLogIn.add(horizontalStrut, gbc_horizontalStrut);
		
		JLabel lblInserireLeCredenziali = new JLabel("Inserire le credenziali:");
		lblInserireLeCredenziali.setForeground(Color.WHITE);
		lblInserireLeCredenziali.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblInserireLeCredenziali = new GridBagConstraints();
		gbc_lblInserireLeCredenziali.insets = new Insets(0, 0, 5, 5);
		gbc_lblInserireLeCredenziali.anchor = GridBagConstraints.WEST;
		gbc_lblInserireLeCredenziali.gridx = 1;
		gbc_lblInserireLeCredenziali.gridy = 1;
		adminLogIn.add(lblInserireLeCredenziali, gbc_lblInserireLeCredenziali);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_11.gridx = 1;
		gbc_verticalStrut_11.gridy = 2;
		adminLogIn.add(verticalStrut_11, gbc_verticalStrut_11);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_10.gridx = 1;
		gbc_verticalStrut_10.gridy = 3;
		adminLogIn.add(verticalStrut_10, gbc_verticalStrut_10);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_9.gridx = 1;
		gbc_verticalStrut_9.gridy = 4;
		adminLogIn.add(verticalStrut_9, gbc_verticalStrut_9);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 0;
		gbc_horizontalStrut_2.gridy = 5;
		adminLogIn.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 5;
		adminLogIn.add(lblEmail, gbc_lblEmail);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 0;
		gbc_horizontalStrut_1.gridy = 6;
		adminLogIn.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 6;
		adminLogIn.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_8.gridx = 1;
		gbc_verticalStrut_8.gridy = 7;
		adminLogIn.add(verticalStrut_8, gbc_verticalStrut_8);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_3.gridx = 0;
		gbc_horizontalStrut_3.gridy = 8;
		adminLogIn.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPassword.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 8;
		adminLogIn.add(lblPassword, gbc_lblPassword);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5.gridx = 0;
		gbc_horizontalStrut_5.gridy = 9;
		adminLogIn.add(horizontalStrut_5, gbc_horizontalStrut_5);
		
		JPasswordField passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 9;
		adminLogIn.add(passwordField, gbc_passwordField);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_7.gridx = 1;
		gbc_verticalStrut_7.gridy = 10;
		adminLogIn.add(verticalStrut_7, gbc_verticalStrut_7);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_7 = new GridBagConstraints();
		gbc_horizontalStrut_7.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_7.gridx = 0;
		gbc_horizontalStrut_7.gridy = 11;
		adminLogIn.add(horizontalStrut_7, gbc_horizontalStrut_7);
		
		JButton btnNewButton = new JButton("Accedi !");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 11;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin a = new Admin();
				a.setUsername(textField.getText());
				a.setPassword(passwordField.getText());
				if(passwordField.getText().equals("") || textField.getText().equals("")) {
					if (!lblNewLabel.getText().equals(""))
						lblNewLabel.setText("");
					lblNewLabel.setText("Errore !");
				}
				
				else if(Controller.controlloLoginAmministratore(a) == false) {
					if (!lblNewLabel.getText().equals(""))
						lblNewLabel.setText("");
					lblNewLabel.setText("Errore !");
					System.out.println(Controller.controlloLoginAmministratore(a));
				}
				
				else {
					Controller.controlloLoginAmministratore(a);
					System.out.println(Controller.controlloLoginAmministratore(a));
					contentPane.removeAll();
					contentPane.add(AreaAdmin.esegui(contentPane, homePanel));
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		adminLogIn.add(btnNewButton, gbc_btnNewButton);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_13 = new GridBagConstraints();
		gbc_verticalStrut_13.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_13.gridx = 1;
		gbc_verticalStrut_13.gridy = 13;
		adminLogIn.add(verticalStrut_13, gbc_verticalStrut_13);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 14;
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(areaUtente);
				contentPane.repaint();
				contentPane.revalidate();
				}
		});
		adminLogIn.add(btnBack, gbc_btnBack);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
		gbc_horizontalStrut_4.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut_4.gridx = 0;
		gbc_horizontalStrut_4.gridy = 15;
		adminLogIn.add(horizontalStrut_4, gbc_horizontalStrut_4);
		
		return adminLogIn;
	}

}

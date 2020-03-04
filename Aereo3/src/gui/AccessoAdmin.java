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
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel adminLogIn = new JPanel();
		adminLogIn.setBounds(100, 100, 894, 717);
		adminLogIn.setBackground(Color.BLUE);
		contentPane.add(adminLogIn, "name_1062736859150500");
		GridBagLayout gblAdminLogIn = new GridBagLayout();
		gblAdminLogIn.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblAdminLogIn.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblAdminLogIn.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblAdminLogIn.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		adminLogIn.setLayout(gblAdminLogIn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel = new GridBagConstraints();
		gbcLblNewLabel.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel.gridx = 1;
		gbcLblNewLabel.gridy = 12;
		adminLogIn.add(lblNewLabel, gbcLblNewLabel);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut6.gridx = 1;
		gbcVerticalStrut6.gridy = 0;
		adminLogIn.add(verticalStrut6, gbcVerticalStrut6);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut = new GridBagConstraints();
		gbcHorizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut.gridx = 0;
		gbcHorizontalStrut.gridy = 1;
		adminLogIn.add(horizontalStrut, gbcHorizontalStrut);
		
		JLabel lblInserireLeCredenziali = new JLabel("Inserire le credenziali:");
		lblInserireLeCredenziali.setForeground(Color.WHITE);
		lblInserireLeCredenziali.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblInserireLeCredenziali = new GridBagConstraints();
		gbcLblInserireLeCredenziali.insets = new Insets(0, 0, 5, 5);
		gbcLblInserireLeCredenziali.anchor = GridBagConstraints.WEST;
		gbcLblInserireLeCredenziali.gridx = 1;
		gbcLblInserireLeCredenziali.gridy = 1;
		adminLogIn.add(lblInserireLeCredenziali, gbcLblInserireLeCredenziali);
		
		Component verticalStrut11 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut11 = new GridBagConstraints();
		gbcVerticalStrut11.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut11.gridx = 1;
		gbcVerticalStrut11.gridy = 2;
		adminLogIn.add(verticalStrut11, gbcVerticalStrut11);
		
		Component verticalStrut10 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut10 = new GridBagConstraints();
		gbcVerticalStrut10.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut10.gridx = 1;
		gbcVerticalStrut10.gridy = 3;
		adminLogIn.add(verticalStrut10, gbcVerticalStrut10);
		
		Component verticalStrut9 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut9.gridx = 1;
		gbcVerticalStrut9.gridy = 4;
		adminLogIn.add(verticalStrut9, gbcVerticalStrut9);
		
		Component horizontalStrut2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut2 = new GridBagConstraints();
		gbcHorizontalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut2.gridx = 0;
		gbcHorizontalStrut2.gridy = 5;
		adminLogIn.add(horizontalStrut2, gbcHorizontalStrut2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblEmail = new GridBagConstraints();
		gbcLblEmail.anchor = GridBagConstraints.WEST;
		gbcLblEmail.insets = new Insets(0, 0, 5, 5);
		gbcLblEmail.gridx = 1;
		gbcLblEmail.gridy = 5;
		adminLogIn.add(lblEmail, gbcLblEmail);
		
		Component horizontalStrut1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut1 = new GridBagConstraints();
		gbcHorizontalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut1.gridx = 0;
		gbcHorizontalStrut1.gridy = 6;
		adminLogIn.add(horizontalStrut1, gbcHorizontalStrut1);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.insets = new Insets(0, 0, 5, 5);
		gbcTextField.gridx = 1;
		gbcTextField.gridy = 6;
		adminLogIn.add(textField, gbcTextField);
		textField.setColumns(10);
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut8.gridx = 1;
		gbcVerticalStrut8.gridy = 7;
		adminLogIn.add(verticalStrut8, gbcVerticalStrut8);
		
		Component horizontalStrut3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbcHorizontalStrut3 = new GridBagConstraints();
		gbcHorizontalStrut3.insets = new Insets(0, 0, 5, 5);
		gbcHorizontalStrut3.gridx = 0;
		gbcHorizontalStrut3.gridy = 8;
		adminLogIn.add(horizontalStrut3, gbcHorizontalStrut3);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPassword.setForeground(Color.WHITE);
		GridBagConstraints gbcLblPassword = new GridBagConstraints();
		gbcLblPassword.anchor = GridBagConstraints.WEST;
		gbcLblPassword.insets = new Insets(0, 0, 5, 5);
		gbcLblPassword.gridx = 1;
		gbcLblPassword.gridy = 8;
		adminLogIn.add(lblPassword, gbcLblPassword);
		
		Component horizontalStrut5 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
		gbc_horizontalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_5.gridx = 0;
		gbc_horizontalStrut_5.gridy = 9;
		adminLogIn.add(horizontalStrut5, gbc_horizontalStrut_5);
		
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
//				Admin a = new Admin();
//				a.setUsername(textField.getText());
//				a.setPassword(passwordField.getText());
				if(passwordField.getText().equals("") || textField.getText().equals("")) {
					if (!lblNewLabel.getText().equals(""))
						lblNewLabel.setText("");
					lblNewLabel.setText("Errore !");
				}
				
				else if(Controller.controlloLoginAmministratore(textField.getText(),passwordField.getText()) == false) {
					if (!lblNewLabel.getText().equals(""))
						lblNewLabel.setText("");
					lblNewLabel.setText("Errore !");
					//System.out.println(Controller.controlloLoginAmministratore(a));
				}
				
				else {
//					Controller.controlloLoginAmministratore(a);
//					System.out.println(Controller.controlloLoginAmministratore(a));
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
				contentPane.add(homePanel);
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

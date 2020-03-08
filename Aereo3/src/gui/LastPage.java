package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import dominio.Cliente;
import dominio.Prenotazione;
import dominio.Volo;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;

public class LastPage {
	
	static JPanel esegui (JPanel contentPane, JPanel homePanel) {
		JPanel lastPage = new JPanel();
		lastPage.setBackground(Color.BLUE);
		contentPane.add(lastPage, "name_462023660912200");
		lastPage.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		lastPage.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 3;
		gbc_horizontalStrut.gridy = 9;
		panel_1.add(horizontalStrut, gbc_horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 4;
		gbc_horizontalStrut_1.gridy = 9;
		panel_1.add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 5;
		gbc_horizontalStrut_2.gridy = 9;
		panel_1.add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
		gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_3.gridx = 6;
		gbc_horizontalStrut_3.gridy = 9;
		panel_1.add(horizontalStrut_3, gbc_horizontalStrut_3);
		
		JLabel lblGraziePerAver = new JLabel("Grazie per aver viaggiato con noi !");
		lblGraziePerAver.setForeground(Color.WHITE);
		lblGraziePerAver.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lblGraziePerAver = new GridBagConstraints();
		gbc_lblGraziePerAver.insets = new Insets(0, 0, 5, 5);
		gbc_lblGraziePerAver.gridx = 7;
		gbc_lblGraziePerAver.gridy = 9;
		panel_1.add(lblGraziePerAver, gbc_lblGraziePerAver);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		lastPage.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnTornaAllaHome = new JButton("Torna alla Home");
		btnTornaAllaHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnTornaAllaHome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(btnTornaAllaHome);
		
		return lastPage;
	}

}

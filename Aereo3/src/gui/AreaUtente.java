package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import javax.swing.border.LineBorder;

public class AreaUtente {
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel areaUtente = new JPanel ();
		areaUtente.setBackground(Color.BLUE);
		contentPane.add(areaUtente, "name_864878817126900");
		areaUtente.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(Color.BLUE);
		areaUtente.add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel menu = new JPanel();
		menu.setBackground(Color.BLUE);
		areaUtente.add(menu, BorderLayout.WEST);
		GridBagLayout gbl_menu = new GridBagLayout();
		gbl_menu.columnWidths = new int[]{0, 0};
		gbl_menu.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_menu.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_menu.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		menu.setLayout(gbl_menu);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_7.gridx = 0;
		gbc_verticalStrut_7.gridy = 1;
		menu.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JButton btnDatiPersonali = new JButton("Dati Personali");
		btnDatiPersonali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				JPanel datiPersonali = new JPanel();
				datiPersonali.setBackground(Color.BLUE);
				panel.add(datiPersonali, "name_865661938656900");
				GridBagLayout gbl_datiPersonali = new GridBagLayout();
				gbl_datiPersonali.columnWidths = new int[]{0, 0, 0};
				gbl_datiPersonali.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_datiPersonali.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_datiPersonali.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				datiPersonali.setLayout(gbl_datiPersonali);
				
				Component verticalStrut_10 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
				gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_10.gridx = 1;
				gbc_verticalStrut_10.gridy = 0;
				datiPersonali.add(verticalStrut_10, gbc_verticalStrut_10);
				
				Component horizontalStrut = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
				gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
				gbc_horizontalStrut.gridx = 0;
				gbc_horizontalStrut.gridy = 1;
				datiPersonali.add(horizontalStrut, gbc_horizontalStrut);
				
				JLabel lblNome = new JLabel("Nome:");
				lblNome.setForeground(Color.WHITE);
				lblNome.setFont(new Font("Tahoma", Font.PLAIN, 28));
				GridBagConstraints gbc_lblNome = new GridBagConstraints();
				gbc_lblNome.insets = new Insets(0, 0, 5, 0);
				gbc_lblNome.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblNome.gridx = 1;
				gbc_lblNome.gridy = 1;
				datiPersonali.add(lblNome, gbc_lblNome);
				
				Component verticalStrut_11 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
				gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_11.gridx = 1;
				gbc_verticalStrut_11.gridy = 2;
				datiPersonali.add(verticalStrut_11, gbc_verticalStrut_11);
				
				Component horizontalStrut_1 = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
				gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
				gbc_horizontalStrut_1.gridx = 0;
				gbc_horizontalStrut_1.gridy = 3;
				datiPersonali.add(horizontalStrut_1, gbc_horizontalStrut_1);
				
				JLabel lblCognome = new JLabel("Cognome:");
				lblCognome.setForeground(Color.WHITE);
				lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 28));
				GridBagConstraints gbc_lblCognome = new GridBagConstraints();
				gbc_lblCognome.insets = new Insets(0, 0, 5, 0);
				gbc_lblCognome.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblCognome.gridx = 1;
				gbc_lblCognome.gridy = 3;
				datiPersonali.add(lblCognome, gbc_lblCognome);
				
				Component verticalStrut_12 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_12 = new GridBagConstraints();
				gbc_verticalStrut_12.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_12.gridx = 1;
				gbc_verticalStrut_12.gridy = 4;
				datiPersonali.add(verticalStrut_12, gbc_verticalStrut_12);
				
				Component horizontalStrut_2 = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
				gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
				gbc_horizontalStrut_2.gridx = 0;
				gbc_horizontalStrut_2.gridy = 5;
				datiPersonali.add(horizontalStrut_2, gbc_horizontalStrut_2);
				
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setForeground(Color.WHITE);
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 28));
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
				gbc_lblEmail.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblEmail.gridx = 1;
				gbc_lblEmail.gridy = 5;
				datiPersonali.add(lblEmail, gbc_lblEmail);
				
				Component verticalStrut_13 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_13 = new GridBagConstraints();
				gbc_verticalStrut_13.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_13.gridx = 1;
				gbc_verticalStrut_13.gridy = 6;
				datiPersonali.add(verticalStrut_13, gbc_verticalStrut_13);
				
				Component horizontalStrut_3 = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut_3 = new GridBagConstraints();
				gbc_horizontalStrut_3.insets = new Insets(0, 0, 5, 5);
				gbc_horizontalStrut_3.gridx = 0;
				gbc_horizontalStrut_3.gridy = 7;
				datiPersonali.add(horizontalStrut_3, gbc_horizontalStrut_3);
				
				JLabel lblIndirizzo = new JLabel("Indirizzo:");
				lblIndirizzo.setForeground(Color.WHITE);
				lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 28));
				GridBagConstraints gbc_lblIndirizzo = new GridBagConstraints();
				gbc_lblIndirizzo.insets = new Insets(0, 0, 5, 0);
				gbc_lblIndirizzo.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblIndirizzo.gridx = 1;
				gbc_lblIndirizzo.gridy = 7;
				datiPersonali.add(lblIndirizzo, gbc_lblIndirizzo);
				
				Component verticalStrut_14 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_14 = new GridBagConstraints();
				gbc_verticalStrut_14.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_14.gridx = 1;
				gbc_verticalStrut_14.gridy = 8;
				datiPersonali.add(verticalStrut_14, gbc_verticalStrut_14);
				
				Component horizontalStrut_4 = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut_4 = new GridBagConstraints();
				gbc_horizontalStrut_4.insets = new Insets(0, 0, 0, 5);
				gbc_horizontalStrut_4.gridx = 0;
				gbc_horizontalStrut_4.gridy = 9;
				datiPersonali.add(horizontalStrut_4, gbc_horizontalStrut_4);
				
				JLabel lblPassword = new JLabel("Password:");
				lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblPassword.setForeground(Color.WHITE);
				GridBagConstraints gbc_lblPassword = new GridBagConstraints();
				gbc_lblPassword.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblPassword.gridx = 1;
				gbc_lblPassword.gridy = 9;
				datiPersonali.add(lblPassword, gbc_lblPassword);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnDatiPersonali.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnDatiPersonali = new GridBagConstraints();
		gbc_btnDatiPersonali.insets = new Insets(0, 0, 5, 0);
		gbc_btnDatiPersonali.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDatiPersonali.gridx = 0;
		gbc_btnDatiPersonali.gridy = 2;
		menu.add(btnDatiPersonali, gbc_btnDatiPersonali);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 3;
		menu.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JButton btnPrenotazioni = new JButton("Prenotazioni");
		btnPrenotazioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				JPanel prenotazioni = new JPanel();
				prenotazioni.setBackground(Color.BLUE);
				panel.add(prenotazioni, "name_866024865084500");
				GridBagLayout gbl_prenotazioni = new GridBagLayout();
				gbl_prenotazioni.columnWidths = new int[]{0, 0, 0};
				gbl_prenotazioni.rowHeights = new int[]{0, 0, 0};
				gbl_prenotazioni.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_prenotazioni.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				prenotazioni.setLayout(gbl_prenotazioni);
				
				Component verticalStrut_15 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_15 = new GridBagConstraints();
				gbc_verticalStrut_15.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_15.gridx = 1;
				gbc_verticalStrut_15.gridy = 0;
				prenotazioni.add(verticalStrut_15, gbc_verticalStrut_15);
				
				Component horizontalStrut_5 = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
				gbc_horizontalStrut_5.insets = new Insets(0, 0, 0, 5);
				gbc_horizontalStrut_5.gridx = 0;
				gbc_horizontalStrut_5.gridy = 1;
				prenotazioni.add(horizontalStrut_5, gbc_horizontalStrut_5);
				
				JLabel lblLeTuePrenotazioni = new JLabel("Le tue Prenotazioni:");
				lblLeTuePrenotazioni.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblLeTuePrenotazioni.setForeground(Color.WHITE);
				GridBagConstraints gbc_lblLeTuePrenotazioni = new GridBagConstraints();
				gbc_lblLeTuePrenotazioni.anchor = GridBagConstraints.WEST;
				gbc_lblLeTuePrenotazioni.gridx = 1;
				gbc_lblLeTuePrenotazioni.gridy = 1;
				prenotazioni.add(lblLeTuePrenotazioni, gbc_lblLeTuePrenotazioni);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnPrenotazioni.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnPrenotazioni = new GridBagConstraints();
		gbc_btnPrenotazioni.insets = new Insets(0, 0, 5, 0);
		gbc_btnPrenotazioni.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnPrenotazioni.gridx = 0;
		gbc_btnPrenotazioni.gridy = 4;
		menu.add(btnPrenotazioni, gbc_btnPrenotazioni);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_8.gridx = 0;
		gbc_verticalStrut_8.gridy = 5;
		menu.add(verticalStrut_8, gbc_verticalStrut_8);
		
		JButton btnSaldoPunti = new JButton("Saldo Punti");
		btnSaldoPunti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				JPanel punti = new JPanel();
				punti.setBackground(Color.BLUE);
				panel.add(punti, "name_866024865084500");
				GridBagLayout gbl_punti = new GridBagLayout();
				gbl_punti.columnWidths = new int[]{0, 0, 0};
				gbl_punti.rowHeights = new int[]{0, 0, 0};
				gbl_punti.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_punti.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				punti.setLayout(gbl_punti);
				
				Component verticalStrut_15 = Box.createVerticalStrut(20);
				GridBagConstraints gbc_verticalStrut_15 = new GridBagConstraints();
				gbc_verticalStrut_15.insets = new Insets(0, 0, 5, 0);
				gbc_verticalStrut_15.gridx = 1;
				gbc_verticalStrut_15.gridy = 0;
				punti.add(verticalStrut_15, gbc_verticalStrut_15);
				
				Component horizontalStrut_5 = Box.createHorizontalStrut(20);
				GridBagConstraints gbc_horizontalStrut_5 = new GridBagConstraints();
				gbc_horizontalStrut_5.insets = new Insets(0, 0, 0, 5);
				gbc_horizontalStrut_5.gridx = 0;
				gbc_horizontalStrut_5.gridy = 1;
				punti.add(horizontalStrut_5, gbc_horizontalStrut_5);
				
				JLabel lblLeTuePrenotazioni = new JLabel("Il tuo saldo punti:");
				lblLeTuePrenotazioni.setFont(new Font("Tahoma", Font.PLAIN, 28));
				lblLeTuePrenotazioni.setForeground(Color.WHITE);
				GridBagConstraints gbc_lblLeTuePrenotazioni = new GridBagConstraints();
				gbc_lblLeTuePrenotazioni.anchor = GridBagConstraints.WEST;
				gbc_lblLeTuePrenotazioni.gridx = 1;
				gbc_lblLeTuePrenotazioni.gridy = 1;
				punti.add(lblLeTuePrenotazioni, gbc_lblLeTuePrenotazioni);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnSaldoPunti.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnSaldoPunti = new GridBagConstraints();
		gbc_btnSaldoPunti.insets = new Insets(0, 0, 5, 0);
		gbc_btnSaldoPunti.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnSaldoPunti.gridx = 0;
		gbc_btnSaldoPunti.gridy = 6;
		menu.add(btnSaldoPunti, gbc_btnSaldoPunti);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_9.gridx = 0;
		gbc_verticalStrut_9.gridy = 7;
		menu.add(verticalStrut_9, gbc_verticalStrut_9);
	
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnLogOut = new GridBagConstraints();
		gbc_btnLogOut.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogOut.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnLogOut.gridx = 0;
		gbc_btnLogOut.gridy = 10;
		menu.add(btnLogOut, gbc_btnLogOut);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut.gridx = 0;
		gbc_verticalStrut.gridy = 9;
		menu.add(verticalStrut, gbc_verticalStrut);
		
		JButton btnAreaAdmin = new JButton("Area Admin");
		btnAreaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(AreaAdmin.esegui(contentPane, homePanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAreaAdmin.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnAreaAdmin = new GridBagConstraints();
		gbc_btnAreaAdmin.insets = new Insets(0, 0, 5, 0);
		gbc_btnAreaAdmin.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAreaAdmin.gridx = 0;
		gbc_btnAreaAdmin.gridy = 8;
		menu.add(btnAreaAdmin, gbc_btnAreaAdmin);
		
		JLabel lblNewLabel = new JLabel("Sei loggato come: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setForeground(Color.WHITE);
		areaUtente.add(lblNewLabel, BorderLayout.NORTH);
		
		return areaUtente;
	}
}

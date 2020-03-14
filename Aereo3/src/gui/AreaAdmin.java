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

public class AreaAdmin {
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel areaAdmin = new JPanel();
		areaAdmin.setBackground(Color.BLUE);
		contentPane.add(areaAdmin, "name_881526299580700");
		areaAdmin.setLayout(new BorderLayout(0, 0));
		
		JPanel panel5 = new JPanel();
		panel5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel5.setBackground(Color.BLUE);
		areaAdmin.add(panel5, BorderLayout.CENTER);
		panel5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Benvenuto nell'area Admin");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		areaAdmin.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel menuAdmin = new JPanel();
		menuAdmin.setBackground(Color.BLUE);
		areaAdmin.add(menuAdmin, BorderLayout.WEST);
		GridBagLayout gblMenuAdmin = new GridBagLayout();
		gblMenuAdmin.columnWidths = new int[]{0, 0, 0};
		gblMenuAdmin.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblMenuAdmin.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gblMenuAdmin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		menuAdmin.setLayout(gblMenuAdmin);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut6.gridx = 0;
		gbcVerticalStrut6.gridy = 0;
		menuAdmin.add(verticalStrut6, gbcVerticalStrut6);
		
		JButton btnAggiungiVolo = new JButton("Aggiungi Volo");
		btnAggiungiVolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel5.removeAll();
				panel5.add(VoloAdmin.esegui(panel5));
				panel5.repaint();
				panel5.revalidate();
			}
		});
		btnAggiungiVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbcBtnAggiungiVolo = new GridBagConstraints();
		gbcBtnAggiungiVolo.insets = new Insets(0, 0, 5, 5);
		gbcBtnAggiungiVolo.anchor = GridBagConstraints.NORTHWEST;
		gbcBtnAggiungiVolo.gridx = 0;
		gbcBtnAggiungiVolo.gridy = 1;
		menuAdmin.add(btnAggiungiVolo, gbcBtnAggiungiVolo);
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut8.gridx = 0;
		gbcVerticalStrut8.gridy = 2;
		menuAdmin.add(verticalStrut8, gbcVerticalStrut8);
		
		JButton btnModificaVolo = new JButton("Modifica Volo");
		btnModificaVolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel5.removeAll();
				panel5.add(ModificaAdmin.esegui(panel5));
				panel5.repaint();
				panel5.revalidate();
			}
		});
		btnModificaVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbcBtnModificaVolo = new GridBagConstraints();
		gbcBtnModificaVolo.anchor = GridBagConstraints.NORTHWEST;
		gbcBtnModificaVolo.insets = new Insets(0, 0, 5, 5);
		gbcBtnModificaVolo.gridx = 0;
		gbcBtnModificaVolo.gridy = 3;
		menuAdmin.add(btnModificaVolo, gbcBtnModificaVolo);
		
		Component verticalStrut9 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut9.gridx = 0;
		gbcVerticalStrut9.gridy = 4;
		menuAdmin.add(verticalStrut9, gbcVerticalStrut9);
		
		JButton btnCreaPromozione = new JButton("Crea Promozione");
		btnCreaPromozione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel5.removeAll();
				panel5.add(PromozioneAdmin.esegui(panel5));
				panel5.repaint();
				panel5.revalidate();
			}
		});
		btnCreaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbcBtnCreaPromozione = new GridBagConstraints();
		gbcBtnCreaPromozione.anchor = GridBagConstraints.NORTHWEST;
		gbcBtnCreaPromozione.insets = new Insets(0, 0, 5, 5);
		gbcBtnCreaPromozione.gridx = 0;
		gbcBtnCreaPromozione.gridy = 5;
		menuAdmin.add(btnCreaPromozione, gbcBtnCreaPromozione);
		
		Component verticalStrut10 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut10 = new GridBagConstraints();
		gbcVerticalStrut10.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut10.gridx = 0;
		gbcVerticalStrut10.gridy = 6;
		menuAdmin.add(verticalStrut10, gbcVerticalStrut10);
		
		Component verticalStrut11 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut11 = new GridBagConstraints();
		gbcVerticalStrut11.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut11.gridx = 0;
		gbcVerticalStrut11.gridy = 8;
		menuAdmin.add(verticalStrut11, gbcVerticalStrut11);
		
		JButton btnLog = new JButton("Log Out");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbcBtnLog = new GridBagConstraints();
		gbcBtnLog.anchor = GridBagConstraints.WEST;
		gbcBtnLog.insets = new Insets(0, 0, 0, 5);
		gbcBtnLog.gridx = 0;
		gbcBtnLog.gridy = 30;
		menuAdmin.add(btnLog, gbcBtnLog);
		
		return areaAdmin;
	}

}

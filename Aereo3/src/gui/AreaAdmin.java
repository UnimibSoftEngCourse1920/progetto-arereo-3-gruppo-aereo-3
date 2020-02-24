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
		
		JLabel lblNewLabel = new JLabel("Benvenuto nell'area Admin");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		areaAdmin.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel menuAdmin = new JPanel();
		menuAdmin.setBackground(Color.BLUE);
		areaAdmin.add(menuAdmin, BorderLayout.WEST);
		GridBagLayout gbl_menuAdmin = new GridBagLayout();
		gbl_menuAdmin.columnWidths = new int[]{0, 0, 0};
		gbl_menuAdmin.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_menuAdmin.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_menuAdmin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		menuAdmin.setLayout(gbl_menuAdmin);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 0;
		menuAdmin.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JButton btnAggiungiVolo = new JButton("Aggiungi Volo");
		btnAggiungiVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnAggiungiVolo = new GridBagConstraints();
		gbc_btnAggiungiVolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAggiungiVolo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAggiungiVolo.gridx = 0;
		gbc_btnAggiungiVolo.gridy = 1;
		menuAdmin.add(btnAggiungiVolo, gbc_btnAggiungiVolo);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_8.gridx = 0;
		gbc_verticalStrut_8.gridy = 2;
		menuAdmin.add(verticalStrut_8, gbc_verticalStrut_8);
		
		JButton btnEliminaVolo = new JButton("Elimina Volo");
		btnEliminaVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnEliminaVolo = new GridBagConstraints();
		gbc_btnEliminaVolo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEliminaVolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminaVolo.gridx = 0;
		gbc_btnEliminaVolo.gridy = 3;
		menuAdmin.add(btnEliminaVolo, gbc_btnEliminaVolo);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_7.gridx = 0;
		gbc_verticalStrut_7.gridy = 4;
		menuAdmin.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JButton btnModificaVolo = new JButton("Modifica Volo");
		btnModificaVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnModificaVolo = new GridBagConstraints();
		gbc_btnModificaVolo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnModificaVolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificaVolo.gridx = 0;
		gbc_btnModificaVolo.gridy = 5;
		menuAdmin.add(btnModificaVolo, gbc_btnModificaVolo);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_9.gridx = 0;
		gbc_verticalStrut_9.gridy = 6;
		menuAdmin.add(verticalStrut_9, gbc_verticalStrut_9);
		
		JButton btnCreaPromozione = new JButton("Crea Promozione");
		btnCreaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnCreaPromozione = new GridBagConstraints();
		gbc_btnCreaPromozione.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnCreaPromozione.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreaPromozione.gridx = 0;
		gbc_btnCreaPromozione.gridy = 7;
		menuAdmin.add(btnCreaPromozione, gbc_btnCreaPromozione);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_10.gridx = 0;
		gbc_verticalStrut_10.gridy = 8;
		menuAdmin.add(verticalStrut_10, gbc_verticalStrut_10);
		
		JButton btnEliminaPromozione = new JButton("Elimina Promozione");
		btnEliminaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnEliminaPromozione = new GridBagConstraints();
		gbc_btnEliminaPromozione.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEliminaPromozione.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminaPromozione.gridx = 0;
		gbc_btnEliminaPromozione.gridy = 9;
		menuAdmin.add(btnEliminaPromozione, gbc_btnEliminaPromozione);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_11.gridx = 0;
		gbc_verticalStrut_11.gridy = 10;
		menuAdmin.add(verticalStrut_11, gbc_verticalStrut_11);
		
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
		GridBagConstraints gbc_btnLog = new GridBagConstraints();
		gbc_btnLog.anchor = GridBagConstraints.WEST;
		gbc_btnLog.insets = new Insets(0, 0, 0, 5);
		gbc_btnLog.gridx = 0;
		gbc_btnLog.gridy = 30;
		menuAdmin.add(btnLog, gbc_btnLog);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBackground(Color.BLUE);
		areaAdmin.add(panel_5, BorderLayout.CENTER);
		
		return areaAdmin;
	}

}

package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dominio.Volo;

public class ElencoPasseggeri {
	static JPanel esegui(JPanel contentPane, int value, JPanel panel_6, Volo idVolo) {
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.BLUE);
		contentPane.add(panel_8, "name_1158551504937600");
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.BLUE);
		panel_8.add(panel_9, BorderLayout.CENTER);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_9.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0};
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel_8.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Continua");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(SceltaPosti.esegui(contentPane, value, panel_8, idVolo));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton, BorderLayout.EAST);
		
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
			panel_9.add(etichette[u], format[z]);
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
			panel_9.add(etichette[u], format[z]);
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
			panel_9.add(campi[h], format[z]);
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
			panel_9.add(etichette[u], format[z]);
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
			panel_9.add(campi[h], format[z]);
			campi[h].setColumns(10);
			y++;
			z++;
			h++;
	}
		
		JLabel email = new JLabel("Email");
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints glc_email = new GridBagConstraints();
		glc_email.anchor = GridBagConstraints.WEST;
		glc_email.insets = new Insets(0, 0, 5, 5);
		glc_email.gridx = k;
		glc_email.gridy = y;
		panel_9.add(email, glc_email);
		y++;
		
		JTextField email_insert = new JTextField();
		GridBagConstraints glc_email_text = new GridBagConstraints();
		glc_email_text.fill = GridBagConstraints.HORIZONTAL;
		glc_email_text.insets = new Insets(0, 0, 5, 0);
		glc_email_text.anchor = GridBagConstraints.NORTH;
		glc_email_text.gridx = k;
		glc_email_text.gridy = y;
		panel_9.add(email_insert, glc_email_text);
		email_insert.setColumns(10);
		
		
		return panel_8;
	}
}

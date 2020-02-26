package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class DettaglioVolo {
	
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(100, 100, 894, 717);
		panel_6.setBackground(Color.BLUE);
		contentPane.add(panel_6, "name_1038618259728500");
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDataRitorno = new JLabel("Data Ritorno:");
		lblDataRitorno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDataRitorno.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblDataRitorno = new GridBagConstraints();
		gbc_lblDataRitorno.insets = new Insets(0, 0, 5, 0);
		gbc_lblDataRitorno.anchor = GridBagConstraints.WEST;
		gbc_lblDataRitorno.gridx = 0;
		gbc_lblDataRitorno.gridy = 16;
		
		
		JDateChooser dateChooser_3 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_3 = new GridBagConstraints();
		gbc_dateChooser_3.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser_3.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_3.gridx = 0;
		gbc_dateChooser_3.gridy = 17;
		
		ButtonGroup bg = new ButtonGroup();
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_8.setBackground(Color.BLUE);
		panel_6.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btnContinua = new JButton("Continua");
		btnContinua.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_8.add(btnContinua, BorderLayout.EAST);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel_8.add(btnBack, BorderLayout.WEST);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBackground(Color.BLUE);
		panel_6.add(panel_9, BorderLayout.CENTER);
	
	return panel_6;
	}
}

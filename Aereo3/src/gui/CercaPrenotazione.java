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
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controller;
import dominio.Cliente;
import dominio.Prenotazione;
import dominio.Volo;

public class CercaPrenotazione {
	
	static JPanel esegui(JPanel contentPane, JPanel homePanel) {
		JPanel container = new JPanel();
		container.setBounds(100, 100, 894, 717);
		container.setBackground(Color.BLUE);
		contentPane.add(container);
		container.setLayout(new BorderLayout(0, 0));
		
		JPanel prenotazione = new JPanel();
		container.add(prenotazione, BorderLayout.CENTER);
		prenotazione.setBackground(Color.BLUE);
		GridBagLayout gblPrenotazione = new GridBagLayout();
		gblPrenotazione.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gblPrenotazione.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPrenotazione.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gblPrenotazione.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		prenotazione.setLayout(gblPrenotazione);

		boolean modifica = true;
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblEmail = new GridBagConstraints();
		gbcLblEmail.anchor = GridBagConstraints.WEST;
		gbcLblEmail.insets = new Insets(0, 0, 5, 5);
		gbcLblEmail.gridx = 0;
		gbcLblEmail.gridy = 5;
		prenotazione.add(lblEmail, gbcLblEmail);
		
		JTextField textField = new JTextField();
		GridBagConstraints gbcTextField = new GridBagConstraints();
		gbcTextField.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField.insets = new Insets(0, 0, 5, 5);
		gbcTextField.gridx = 0;
		gbcTextField.gridy = 6;
		prenotazione.add(textField, gbcTextField);
		textField.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut = new GridBagConstraints();
		gbcVerticalStrut.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut.gridx = 0;
		gbcVerticalStrut.gridy = 7;
		prenotazione.add(verticalStrut, gbcVerticalStrut);
		
		JLabel lblIdVolo = new JLabel("ID Prenotazione:");
		lblIdVolo.setForeground(Color.WHITE);
		lblIdVolo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblIdVolo = new GridBagConstraints();
		gbcLblIdVolo.anchor = GridBagConstraints.WEST;
		gbcLblIdVolo.insets = new Insets(0, 0, 5, 5);
		gbcLblIdVolo.gridx = 0;
		gbcLblIdVolo.gridy = 8;
		prenotazione.add(lblIdVolo, gbcLblIdVolo);
		
		JTextField textField1 = new JTextField();
		GridBagConstraints gbcTextField_1 = new GridBagConstraints();
		gbcTextField_1.fill = GridBagConstraints.HORIZONTAL;
		gbcTextField_1.insets = new Insets(0, 0, 5, 5);
		gbcTextField_1.gridx = 0;
		gbcTextField_1.gridy = 9;
		prenotazione.add(textField1, gbcTextField_1);
		textField1.setColumns(10);
		
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut1 = new GridBagConstraints();
		gbcVerticalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut1.gridx = 0;
		gbcVerticalStrut1.gridy = 10;
		prenotazione.add(verticalStrut1, gbcVerticalStrut1);
		
		JLabel lblErrPren = new JLabel("");
		lblErrPren.setForeground(Color.RED);
		lblErrPren.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblErrPren = new GridBagConstraints();
		gbcLblErrPren.anchor = GridBagConstraints.WEST;
		gbcLblErrPren.insets = new Insets(0, 0, 5, 5);
		gbcLblErrPren.gridx = 0;
		gbcLblErrPren.gridy = 12;
		prenotazione.add(lblErrPren, gbcLblErrPren);
		
		JButton btnCerca = new JButton("Cerca !");
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField1.getText().equals("") || textField.getText().equals("")) {
					lblErrPren.setText("Campo vuoto !");
				}
				
				else if(! isValid(textField.getText())) {
					if(! lblErrPren.getText().equals(""))
						lblErrPren.setText("");
					lblErrPren.setText("Email errata !");
				}
				
				else if(notValidId(textField1.getText())) {
					if(! lblErrPren.getText().equals(""))
						lblErrPren.setText("");
					lblErrPren.setText("Id non valido !");
				}
				
				else {
					Prenotazione p = Controller.loginCliente(Integer.parseInt(textField1.getText()), textField.getText());
					if(p == null) {
						if(! lblErrPren.getText().equals(""))
							lblErrPren.setText("");
						lblErrPren.setText("Email o ID errati!");
					}
					else if(Controller.getVolo(p.getIdVolo()).getDataPartenza().compareTo(new Date()) < 0){
						if(! lblErrPren.getText().equals(""))
							lblErrPren.setText("");
						lblErrPren.setText("Prenotazione scaduta");
					} else {
					lblErrPren.setText("");
					Cliente c = Controller.getCliente(textField.getText());
					int idVolo = p.getIdVolo();
					System.out.println(Controller.getPostiPerPrenotazione(p.getId()));
					Volo v = Controller.getVolo(p.getIdVolo());
					String partenza = v.getPartenza();
					String arrivo = v.getDestinazione();
					int value = Controller.getPostiPerPrenotazione(p.getId()).size();
					Date dataPartenza = v.getDataPartenza();
					Date dataArrivo = v.getDataArrivo();
					contentPane.removeAll();
					contentPane.add(VisualizzaModificaPrenotazione.esegui(contentPane, container, partenza, arrivo, dataPartenza, dataArrivo, modifica, value, idVolo, c, p.getId(), homePanel));
					contentPane.repaint();
					contentPane.revalidate();
					}

				}
			}
		});
		btnCerca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcBtnCerca = new GridBagConstraints();
		gbcBtnCerca.anchor = GridBagConstraints.WEST;
		gbcBtnCerca.insets = new Insets(0, 0, 0, 5);
		gbcBtnCerca.gridx = 0;
		gbcBtnCerca.gridy = 11;
		prenotazione.add(btnCerca, gbcBtnCerca);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut2 = new GridBagConstraints();
		gbcVerticalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut2.gridx = 0;
		gbcVerticalStrut2.gridy = 13;
		prenotazione.add(verticalStrut2, gbcVerticalStrut2);
		
		JPanel panelBack = new JPanel();
		panelBack.setBackground(Color.BLUE);
		container.add(panelBack, BorderLayout.SOUTH);
		panelBack.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelBack.add(btnNewButton);
		
		return container;
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
	
	public static boolean notValidId(String id) {
		boolean valore = false;
		for(int i = 0; i<id.length() && valore == false; i++) {
			if(id.charAt(i) < '0' || id.charAt(i) > '9')
				valore = true;
		}
		return valore;
	}

}

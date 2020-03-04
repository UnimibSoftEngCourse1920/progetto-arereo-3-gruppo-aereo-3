package gui;

import java.awt.BorderLayout;
import java.awt.Color;
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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import dominio.Cliente;
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
		panel8.add(panel9, BorderLayout.CENTER);
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
		errore.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints glcErrore = new GridBagConstraints();
		glcErrore.anchor = GridBagConstraints.WEST;
		glcErrore.insets = new Insets(0, 0, 5, 5);
		glcErrore.gridx = k;
		glcErrore.gridy = y;
		panel9.add(errore, glcErrore);
		
		int oldP = -1;
		
		JButton btnNewButton = new JButton("Continua");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean continua = true;
				for (int i = 0; i<campi.length;i++) {
					if (campi[i].getText().equals("") || emailInsert.getText().equals("") || emailInsert.isValid() == false){
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
				
				else if (continua == true) {
					if (!errore.getText().equals("")) {
						errore.setText("");
					}
					Cliente c = new Cliente();
					c.setNome(campi[0].getText());
					c.setCognome(campi[1].getText());
					c.setEmail(emailInsert.getText());
					c.setDataDiNascita(dataDiNascita.getDate());
					c.setIndirizzo("Via Duomo");
					contentPane.removeAll();
					contentPane.add(SceltaPosti.esegui(contentPane, value, panel8, idVolo, c, modifica, oldP));
					contentPane.repaint();
					contentPane.revalidate();
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

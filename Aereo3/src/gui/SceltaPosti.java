package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import dataManagment.GestioneClienteDatabase;
import dataManagment.GestionePostoDatabase;
import dataManagment.GestionePrenotazioneDatabase;
import dominio.Cliente;
import dominio.Posto;
import dominio.Prenotazione;
import dominio.Volo;

import javax.swing.ImageIcon;
import java.awt.Image;

public class SceltaPosti {
	
	static JPanel esegui(JPanel contentPane, int value, JPanel panel8, int idVolo, Cliente c) {
		JPanel posti = new JPanel();
		posti.setBounds(100, 100, 894, 717);
		posti.setBackground(Color.BLUE);
		contentPane.add(posti, "name_1170960813504800");
		posti.setLayout(new BorderLayout(0, 0));
		
		JPanel sceltaPostiPanel = new JPanel();
		sceltaPostiPanel.setBackground(Color.BLUE);
		posti.add(sceltaPostiPanel, BorderLayout.WEST);
		GridBagLayout gblSceltaPostiPanel = new GridBagLayout();
		gblSceltaPostiPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblSceltaPostiPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblSceltaPostiPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblSceltaPostiPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		sceltaPostiPanel.setLayout(gblSceltaPostiPanel);
		
		JLabel lblScegliereIPosti = new JLabel("Scegliere i posti:");
		lblScegliereIPosti.setForeground(Color.WHITE);
		lblScegliereIPosti.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblScegliereIPosti = new GridBagConstraints();
		gbcLblScegliereIPosti.insets = new Insets(0, 0, 5, 0);
		gbcLblScegliereIPosti.gridx = 0;
		gbcLblScegliereIPosti.gridy = 0;
		sceltaPostiPanel.add(lblScegliereIPosti, gbcLblScegliereIPosti);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut6.gridx = 0;
		gbcVerticalStrut6.gridy = 1;
		sceltaPostiPanel.add(verticalStrut6, gbcVerticalStrut6);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		posti.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(panel8);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton, BorderLayout.WEST);
		
		JLabel [] etichette = new JLabel[value*3];
		JComboBox [] box = new JComboBox[value*2];
		//Posto [] listaPosti = new Posto[value];
		GridBagConstraints [] format = new GridBagConstraints[15];
		
		int u = 0;
		int y = 2;
		int z = 0;
		int k = 0;
		int h = 0;
		
		for(int i = 0; i<value;i++) {
			etichette[u] = new JLabel("Passeggero " + (i+1));
			etichette[u].setForeground(Color.WHITE);
			etichette[u].setFont(new Font("Tahoma", Font.PLAIN, 30));
			format[z] = new GridBagConstraints();
			format[z].anchor = GridBagConstraints.WEST;
			format[z].insets = new Insets(0, 0, 5, 5);
			format[z].gridx = k;
			format[z].gridy = y;
			sceltaPostiPanel.add(etichette[u], format[z]);
			y++;
			u++;
			z++;
			
			etichette[u] = new JLabel("Posto");
			etichette[u].setForeground(Color.WHITE);
			etichette[u].setFont(new Font("Tahoma", Font.PLAIN, 20));
			format[z] = new GridBagConstraints();
			format[z].anchor = GridBagConstraints.WEST;
			format[z].insets = new Insets(0, 0, 5, 5);
			format[z].gridx = k;
			format[z].gridy = y;
			sceltaPostiPanel.add(etichette[u], format[z]);
			y++;
			u++;
			z++;
			
			box[h] = new JComboBox();
			List <Posto> postidisponibili = Controller.getListaPostiDisponibili(idVolo);
			for (Posto p : postidisponibili)
				box[h].addItem(p);
			format[z] = new GridBagConstraints();
			format[z].fill = GridBagConstraints.HORIZONTAL;
			format[z].gridx = k;
			format[z].gridy = y;
			sceltaPostiPanel.add(box[h], format[z]);
			y++;
			h++;
			z++;
			
//			etichette[u] = new JLabel("Fila");
//			etichette[u].setForeground(Color.WHITE);
//			etichette[u].setFont(new Font("Tahoma", Font.PLAIN, 20));
//			format[z] = new GridBagConstraints();
//			format[z].anchor = GridBagConstraints.WEST;
//			format[z].insets = new Insets(0, 0, 5, 5);
//			format[z].gridx = k;
//			format[z].gridy = y;
//			sceltaPostiPanel.add(etichette[u], format[z]);
//			y++;
//			u++;
//			z++;
			
//			box[h] = new JComboBox();
//			format[z] = new GridBagConstraints();
//			format[z].fill = GridBagConstraints.HORIZONTAL;
//			format[z].gridx = k;
//			format[z].gridy = y;
//			sceltaPostiPanel.add(box[h], format[z]);
//			h++;
//			y++;
//			z++;
		}
		
		
		JLabel errore = new JLabel("");
		errore.setForeground(Color.RED);
		errore.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbcErrore = new GridBagConstraints();
		gbcErrore.insets = new Insets(0, 0, 5, 0);
		gbcErrore.gridx = k;
		gbcErrore.gridy = y;
		sceltaPostiPanel.add(errore, gbcErrore);
		
		JButton btnNewButton1 = new JButton("Prenota");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! Controller.trovaMail(c.getEmail())) {
					Controller.insertCliente(c);
				}
				Cliente cliente = Controller.getCliente(c.getEmail());
				
				if(! Controller.trovaCliente(cliente.getCodCliente(), idVolo)) {
					List <Posto> listaPosti = new ArrayList<Posto>();
					double costo = 0;
					int costoPunti = 0;
					for(int i = 0; i<value; i++) {
						/*String s = (String)box[i].getSelectedItem();
						String[] ss = s.split(", ");
						
						char fila = ss[0].charAt(ss[0].length()-1);
						Integer numero = Integer.parseInt(ss[0].substring(0, ss[0].length()-1));
						int valore = numero.valueOf(numero);*/
						
						Posto p = (Posto)box[i].getSelectedItem();
						costo = costo + p.getPrezzo();
						costoPunti = costoPunti + p.getPrezzoPunti();
						listaPosti.add(Controller.getPosto(p.getChiaveComposta().getLettera(), p.getChiaveComposta().getFila(), idVolo));
						}
					System.out.println(listaPosti);
					//portati dietro cliente
					Controller.insertPrenotazione(cliente, idVolo, listaPosti);
					int idPrenotazione = Controller.getIdPrenotazione(cliente, idVolo, listaPosti);
					Controller.aggiornaPostiPrenotati(listaPosti, idPrenotazione);
					contentPane.removeAll();
					contentPane.add(Pagamento.esegui(contentPane, costo, costoPunti, posti, idPrenotazione));
					contentPane.repaint();
					contentPane.revalidate();
				} else {
					errore.setText("Il cliente ha già una prenotazione per questo volo");
				}
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(btnNewButton1, BorderLayout.EAST);
		
	return posti;
}
}

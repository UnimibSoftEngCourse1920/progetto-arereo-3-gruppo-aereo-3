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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import dominio.Cliente;
import dominio.Posto;

public class SceltaPosti {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static JPanel esegui(JPanel contentPane, int value, JPanel panel8, int idVolo, Cliente c, boolean modifica, int oldP, boolean fedele, JPanel homePanel) {
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
		gbcLblScegliereIPosti.anchor = GridBagConstraints.WEST;
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
		@SuppressWarnings("rawtypes")
		JComboBox [] box = new JComboBox[value*2];
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
					List <Posto> listaPosti = new ArrayList<Posto>();
					double costo = 0;
					int costoPunti = 0;
					for(int i = 0; i<value; i++) {
				
						Posto p = (Posto)box[i].getSelectedItem();
						costo = costo + p.getPrezzo();
						costoPunti = costoPunti + p.getPrezzoPunti();
						listaPosti.add(Controller.getPosto(p.getChiaveComposta().getLettera(), p.getChiaveComposta().getFila(), idVolo));
						}
					System.out.println(listaPosti);
					boolean modifica = false;
					contentPane.removeAll();
					contentPane.add(Pagamento.esegui(contentPane, costo, costoPunti, posti, c, idVolo, listaPosti, fedele, homePanel, modifica));
					contentPane.repaint();
					contentPane.revalidate();
					if(modifica)
						Controller.deletePrenotazione(Controller.getPrenotazionePerId(oldP));
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(btnNewButton1, BorderLayout.EAST);
		
	return posti;
}
}

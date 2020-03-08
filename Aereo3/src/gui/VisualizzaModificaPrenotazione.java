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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dataManagment.GestioneAereoportoDatabase;
import dataManagment.GestioneVoloDatabase;
import dominio.Cliente;
import dominio.Prenotazione;
import dominio.Volo;
import mailManagment.GestoreMail;
import mailManagment.MessaggiPredefiniti;

public class VisualizzaModificaPrenotazione {
	static JPanel esegui(JPanel contentPane, JPanel prenotazione, String partenza, String arrivo, Date dataPartenza, Date dataArrivo, boolean modifica, int value, int idVolo, Cliente c, int oldIdPrenotazione) {
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.BLUE);
		contentPane.add(panel6, "name_58028579602300");
		GridBagLayout gblPanel6 = new GridBagLayout();
		gblPanel6.columnWidths = new int[]{0, 0};
		gblPanel6.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel6.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gblPanel6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel6.setLayout(gblPanel6);
		
		JLabel lblLaTuaPrenotazione = new JLabel("La tua Prenotazione");
		lblLaTuaPrenotazione.setForeground(Color.WHITE);
		lblLaTuaPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblLaTuaPrenotazione = new GridBagConstraints();
		gbcLblLaTuaPrenotazione.anchor = GridBagConstraints.WEST;
		gbcLblLaTuaPrenotazione.insets = new Insets(0, 0, 5, 0);
		gbcLblLaTuaPrenotazione.gridx = 0;
		gbcLblLaTuaPrenotazione.gridy = 0;
		panel6.add(lblLaTuaPrenotazione, gbcLblLaTuaPrenotazione);
		
		JLabel lblStatoPrenotazione = new JLabel("");
		lblStatoPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblStatoPrenotazione = new GridBagConstraints();
		gbcLblStatoPrenotazione.insets = new Insets(0, 0, 5, 0);
		gbcLblStatoPrenotazione.anchor = GridBagConstraints.WEST;
		gbcLblStatoPrenotazione.gridx = 2;
		gbcLblStatoPrenotazione.gridy = 0;
		if(Controller.getPrenotazionePerId(oldIdPrenotazione).isPagato()) {
			lblStatoPrenotazione.setForeground(Color.WHITE);
			lblStatoPrenotazione.setText("STATO: PAGATA");
		} else {
			lblStatoPrenotazione.setForeground(Color.RED);
			lblStatoPrenotazione.setText("STATO: NON PAGATA");
		}
		panel6.add(lblStatoPrenotazione, gbcLblStatoPrenotazione);
		
		Component verticalStrut6 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut6 = new GridBagConstraints();
		gbcVerticalStrut6.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut6.gridx = 0;
		gbcVerticalStrut6.gridy = 1;
		panel6.add(verticalStrut6, gbcVerticalStrut6);
		
		JLabel lblPartenza = new JLabel("Partenza: " + Controller.parserAereoporto(partenza));
		lblPartenza.setForeground(Color.WHITE);
		lblPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblPartenza = new GridBagConstraints();
		gbcLblPartenza.insets = new Insets(0, 0, 5, 0);
		gbcLblPartenza.anchor = GridBagConstraints.WEST;
		gbcLblPartenza.gridx = 0;
		gbcLblPartenza.gridy = 2;
		panel6.add(lblPartenza, gbcLblPartenza);
		
		Component verticalStrut7 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut7 = new GridBagConstraints();
		gbcVerticalStrut7.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut7.gridx = 0;
		gbcVerticalStrut7.gridy = 3;
		panel6.add(verticalStrut7, gbcVerticalStrut7);
		
		JLabel lblDestinazione = new JLabel("Destinazione: " + Controller.parserAereoporto(arrivo));
		lblDestinazione.setForeground(Color.WHITE);
		lblDestinazione.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblDestinazione = new GridBagConstraints();
		gbcLblDestinazione.insets = new Insets(0, 0, 5, 0);
		gbcLblDestinazione.anchor = GridBagConstraints.WEST;
		gbcLblDestinazione.gridx = 0;
		gbcLblDestinazione.gridy = 4;
		panel6.add(lblDestinazione, gbcLblDestinazione);
		
		Component verticalStrut8 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut8 = new GridBagConstraints();
		gbcVerticalStrut8.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut8.gridx = 0;
		gbcVerticalStrut8.gridy = 5;
		panel6.add(verticalStrut8, gbcVerticalStrut8);
		
		JLabel lblDataPartenza = new JLabel("Data Partenza: " + convertiData(dataPartenza));
		lblDataPartenza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataPartenza.setForeground(Color.WHITE);
		GridBagConstraints gbcLblDataPartenza = new GridBagConstraints();
		gbcLblDataPartenza.insets = new Insets(0, 0, 5, 0);
		gbcLblDataPartenza.anchor = GridBagConstraints.WEST;
		gbcLblDataPartenza.gridx = 0;
		gbcLblDataPartenza.gridy = 6;
		panel6.add(lblDataPartenza, gbcLblDataPartenza);
		
		Component verticalStrut9 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut9 = new GridBagConstraints();
		gbcVerticalStrut9.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut9.gridx = 0;
		gbcVerticalStrut9.gridy = 7;
		panel6.add(verticalStrut9, gbcVerticalStrut9);
		
		JLabel lblNewLabel2 = new JLabel("Data Arrivo: " + convertiData(dataArrivo));
		lblNewLabel2.setForeground(Color.WHITE);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel2 = new GridBagConstraints();
		gbcLblNewLabel2.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel2.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel2.gridx = 0;
		gbcLblNewLabel2.gridy = 8;
		panel6.add(lblNewLabel2, gbcLblNewLabel2);
		
		Component verticalStrut10 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut10 = new GridBagConstraints();
		gbcVerticalStrut10.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut10.gridx = 0;
		gbcVerticalStrut10.gridy = 9;
		panel6.add(verticalStrut10, gbcVerticalStrut10);
		
		JLabel lblNewLabel3 = new JLabel("Numero di Biglietti: " + Integer.toString(value));
		lblNewLabel3.setForeground(Color.WHITE);
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcLblNewLabel3 = new GridBagConstraints();
		gbcLblNewLabel3.insets = new Insets(0, 0, 5, 0);
		gbcLblNewLabel3.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel3.gridx = 0;
		gbcLblNewLabel3.gridy = 10;
		panel6.add(lblNewLabel3, gbcLblNewLabel3);
		
		Component verticalStrut11 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut11 = new GridBagConstraints();
		gbcVerticalStrut11.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut11.gridx = 0;
		gbcVerticalStrut11.gridy = 11;
		panel6.add(verticalStrut11, gbcVerticalStrut11);
		
		JLabel lblModificaPrenotazione = new JLabel("Modifica Prenotazione");
		lblModificaPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblModificaPrenotazione.setForeground(Color.WHITE);
		GridBagConstraints gbcLblModificaPrenotazione = new GridBagConstraints();
		gbcLblModificaPrenotazione.insets = new Insets(0, 0, 5, 0);
		gbcLblModificaPrenotazione.anchor = GridBagConstraints.WEST;
		gbcLblModificaPrenotazione.gridx = 0;
		gbcLblModificaPrenotazione.gridy = 12;
		panel6.add(lblModificaPrenotazione, gbcLblModificaPrenotazione);
		
		Component verticalStrut12 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut12 = new GridBagConstraints();
		gbcVerticalStrut12.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut12.gridx = 0;
		gbcVerticalStrut12.gridy = 13;
		panel6.add(verticalStrut12, gbcVerticalStrut12);
		
		JLabel lblNuovaData = new JLabel("Nuova Data");
		lblNuovaData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNuovaData.setForeground(Color.WHITE);
		GridBagConstraints gbcLblNuovaData = new GridBagConstraints();
		gbcLblNuovaData.insets = new Insets(0, 0, 5, 0);
		gbcLblNuovaData.anchor = GridBagConstraints.WEST;
		gbcLblNuovaData.gridx = 0;
		gbcLblNuovaData.gridy = 14;
		panel6.add(lblNuovaData, gbcLblNuovaData);
		
		String partenza1 = Controller.parserAereoporto(partenza);
		String arrivo1 = Controller.parserAereoporto(arrivo);
		
		List <Volo> listaVoli = Controller.getPartenzaDestinazione(partenza1, arrivo1);
		
		JComboBox nuovoVolo = new JComboBox();
		GridBagConstraints gbcNuovoVolo = new GridBagConstraints();
		gbcNuovoVolo.fill = GridBagConstraints.HORIZONTAL;
		gbcNuovoVolo.insets = new Insets(0, 0, 5, 5);
		gbcNuovoVolo.gridx = 0;
		gbcNuovoVolo.gridy = 15;
		for(Volo v : listaVoli) {
			if(v.getIdVolo() != idVolo) {
			StringBuilder stringa = new StringBuilder();
			stringa.append(v.getIdVolo());
			stringa.append(", Partenza " + v.getDataPartenza());
			stringa.append(", Arrivo " + v.getDataArrivo());
			nuovoVolo.addItem(stringa.toString());
			System.out.println(stringa.toString());}
		}
		panel6.add(nuovoVolo, gbcNuovoVolo);
		
		Component verticalStrut13 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut13 = new GridBagConstraints();
		gbcVerticalStrut13.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut13.gridx = 0;
		gbcVerticalStrut13.gridy = 16;
		panel6.add(verticalStrut13, gbcVerticalStrut13);
		
		//aggiungere il button per pagare se la prenotazione non è stata pagata (stesso if della label di stato)
		
		JButton btnModifica = new JButton("Modifica");
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String v = (String) nuovoVolo.getSelectedItem();
				String[] params = v.split(", ");
				int newIdVolo = Integer.parseInt(params[0]);
				boolean fedele = Controller.isFedele(c);
				contentPane.removeAll();
				contentPane.add(SceltaPosti.esegui(contentPane, value, panel6, newIdVolo, c, modifica, oldIdPrenotazione, fedele));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnModifica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnModifica = new GridBagConstraints();
		gbcBtnModifica.insets = new Insets(0, 0, 5, 0);
		gbcBtnModifica.anchor = GridBagConstraints.WEST;
		gbcBtnModifica.gridx = 0;
		gbcBtnModifica.gridy = 17;
		panel6.add(btnModifica, gbcBtnModifica);
		
		JLabel lblPrenotazioneEliminata = new JLabel("");
		lblPrenotazioneEliminata.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrenotazioneEliminata.setForeground(Color.WHITE);
		GridBagConstraints gbcLblPrenotazioneEliminata = new GridBagConstraints();
		gbcLblPrenotazioneEliminata.insets = new Insets(0, 0, 5, 0);
		gbcLblPrenotazioneEliminata.anchor = GridBagConstraints.WEST;
		gbcLblPrenotazioneEliminata.gridx = 2;
		gbcLblPrenotazioneEliminata.gridy = 17;
		panel6.add(lblPrenotazioneEliminata, gbcLblPrenotazioneEliminata);
		
		JButton btnElimina = new JButton("Elimina");
		btnElimina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prenotazione pren = Controller.getPrenotazionePerId(oldIdPrenotazione);
				Controller.deletePrenotazione(pren);
				if(Controller.isFedele(c) && pren.isPagato())
					Controller.addPunti(c.getCodCliente(), - pren.getPuntiTotali());
				btnModifica.setEnabled(false);
				lblPrenotazioneEliminata.setText("Prenotazione eliminata con successo");
				GestoreMail ge = Controller.getGestoreMail();
				String sbj = MessaggiPredefiniti.PRENOTAZIONE_ELIMINATA_SBJ.getMessaggio() + pren.getId();
				String cnt = MessaggiPredefiniti.PRENOTAZIONE_ELIMINATA_TXT.getMessaggio();
				Controller.sendMail(ge, c.getEmail(), sbj, cnt);
			}
		});
		btnElimina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnElimina = new GridBagConstraints();
		gbcBtnElimina.insets = new Insets(0, 0, 5, 0);
		gbcBtnElimina.anchor = GridBagConstraints.WEST;
		gbcBtnElimina.gridx = 1;
		gbcBtnElimina.gridy = 17;
		panel6.add(btnElimina, gbcBtnElimina);
		
		Component verticalStrut14 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut14 = new GridBagConstraints();
		gbcVerticalStrut14.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut14.gridx = 0;
		gbcVerticalStrut14.gridy = 18;
		panel6.add(verticalStrut14, gbcVerticalStrut14);
		
		Component verticalStrut15 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut15 = new GridBagConstraints();
		gbcVerticalStrut15.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut15.gridx = 0;
		gbcVerticalStrut15.gridy = 19;
		panel6.add(verticalStrut15, gbcVerticalStrut15);
		
		Component verticalStrut16 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut16 = new GridBagConstraints();
		gbcVerticalStrut16.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut16.gridx = 0;
		gbcVerticalStrut16.gridy = 20;
		panel6.add(verticalStrut16, gbcVerticalStrut16);
		
		Component verticalStrut17 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut17 = new GridBagConstraints();
		gbcVerticalStrut17.insets = new Insets(0, 0, 5, 0);
		gbcVerticalStrut17.gridx = 0;
		gbcVerticalStrut17.gridy = 21;
		panel6.add(verticalStrut17, gbcVerticalStrut17);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(prenotazione);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbcBtnBack = new GridBagConstraints();
		gbcBtnBack.anchor = GridBagConstraints.WEST;
		gbcBtnBack.gridx = 0;
		gbcBtnBack.gridy = 22;
		panel6.add(btnBack, gbcBtnBack);
		
		return panel6;
	}
	
	public static String convertiData(Date data) {
		SimpleDateFormat dtFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm");
		dtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		String dataStringa= dtFormat.format(data);
		return dataStringa;
	}
}

package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.Controller;
import dominio.Volo;

public class DettaglioVoloRitorno {
	
	static JPanel esegui(JPanel contentPane, int value, JPanel panel_7) {
		List <Volo> listaVoli = Controller.getListaVoli();
		
		Object rows [][] = new Object [listaVoli.size()][5];
		
		String [] columns = {"ID", "Partenza", "Arrivo", "Data Partenza", "Data Arrivo"};
		
		int i = 0;
		
		for(Volo v : listaVoli) {
			rows[i][0] = v.getIdVolo();
			rows[i][1] = v.getPartenza();
			rows[i][2] = v.getDestinazione();
			rows[i][3] = v.getDataPartenza();
			rows[i][4] = v.getDataArrivo();
			i++;
		}
		
		TableModel model = new DefaultTableModel(rows, columns)
		  {
		    public boolean isCellEditable(int row, int columns)
		    {
		      return false;
		    }
		  };
		JTable table = new JTable(model);
		table.setPreferredSize(new Dimension(800, 500));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(100, 100, 894, 717);
		panel_6.setBackground(Color.BLUE);
		contentPane.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
	
		
		JPanel pulsanti = new JPanel();
		pulsanti.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pulsanti.setBackground(Color.BLUE);
		panel_6.add(pulsanti, BorderLayout.SOUTH);
		pulsanti.setLayout(new BorderLayout(0, 0));
		
		JButton btnContinua = new JButton("Continua");
		btnContinua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(ElencoPasseggeri.esegui(contentPane, value, panel_6));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnContinua.setFont(new Font("Tahoma", Font.PLAIN, 28));
		pulsanti.add(btnContinua, BorderLayout.EAST);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(panel_7);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		pulsanti.add(btnBack, BorderLayout.WEST);
		
		JComboBox comboBox = new JComboBox();
		for(Volo v : listaVoli) {
			StringBuilder stringa = new StringBuilder();
			stringa.append("ID Volo " + v.getIdVolo());
			stringa.append(", Partenza " + v.getDataPartenza());
			stringa.append(", Arrivo " + v.getDataArrivo());
			comboBox.addItem(stringa.toString());
			System.out.println(stringa.toString());
		}
		pulsanti.add(comboBox, BorderLayout.CENTER);
		
		JPanel tabellaEtichetta = new JPanel();
		tabellaEtichetta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tabellaEtichetta.setBackground(Color.BLUE);
		panel_6.add(tabellaEtichetta, BorderLayout.CENTER);
		tabellaEtichetta.setLayout(new BorderLayout(0, 0));
		
		tabellaEtichetta.add(new JScrollPane(table));
		
		JPanel etichettaVolo = new JPanel();
		etichettaVolo.setForeground(Color.WHITE);
		etichettaVolo.setBackground(Color.BLUE);
		tabellaEtichetta.add(etichettaVolo, BorderLayout.SOUTH);
		
		JLabel lblSelezionaVolo = new JLabel("Seleziona Volo di Ritorno:");
		lblSelezionaVolo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSelezionaVolo.setForeground(Color.WHITE);
		etichettaVolo.add(lblSelezionaVolo);
		
		return panel_6;
	}

}

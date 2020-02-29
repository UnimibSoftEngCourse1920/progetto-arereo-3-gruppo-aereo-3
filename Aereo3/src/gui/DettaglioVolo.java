package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dataManagment.GestioneVoloDatabase;
import dominio.Volo;

public class DettaglioVolo {
	
	static JPanel esegui(JPanel contentPane, JPanel homePanel, Volo volo, boolean andataRitorno, int value) {
		
		//TODO: Metodo controller per prendere i voli
//		String destinazione=Controller.parserCodiceAereoporto(volo.getDestinazione());
//		String partenza=Controller.parserCodiceAereoporto(volo.getPartenza());

		//List <Volo> listaVoli = GestioneVoloDatabase.getListaVoliAndataORitorno(volo.getDataPartenza(), partenza, destinazione);
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
	
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_8.setBackground(Color.BLUE);
		panel_6.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btnContinua = new JButton("Continua");
		btnContinua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(andataRitorno == false) {
					contentPane.removeAll();
					contentPane.add(ElencoPasseggeri.esegui(contentPane, value, panel_6, volo.getIdVolo()));
					contentPane.repaint();
					contentPane.revalidate();
				}
				else {
					contentPane.removeAll();
					contentPane.add(DettaglioVoloRitorno.esegui(contentPane, value, panel_6, volo.getIdVolo()));
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
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
		
		JComboBox comboBox = new JComboBox();
		for(Volo v : listaVoli) {
			StringBuilder stringa = new StringBuilder();
			stringa.append("ID Volo " + v.getIdVolo());
			stringa.append(", Partenza " + v.getDataPartenza());
			stringa.append(", Arrivo " + v.getDataArrivo());
			comboBox.addItem(stringa.toString());
			System.out.println(stringa.toString());
		}
		panel_8.add(comboBox, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBackground(Color.BLUE);
		panel_6.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		panel_9.add(new JScrollPane(table));
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLUE);
		panel_9.add(panel, BorderLayout.SOUTH);
		
		JLabel lblSelezionaVolo = new JLabel("Seleziona Volo di Andata:");
		lblSelezionaVolo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSelezionaVolo.setForeground(Color.WHITE);
		panel.add(lblSelezionaVolo);

	return panel_6;
	}
}

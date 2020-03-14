package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.Controller;
import dominio.Promozione;
import dominio.Volo;

public class ListaPromozioni {
	
	static JPanel esegui (JPanel contentPane, JPanel homePanel) {
		Date now = new Date();
		
		List <Promozione> promozioni = Controller.getPromozioni(now);
		
		Object rows [][] = new Object [promozioni.size()][7];
		
		String [] columns = {"ID", "Data Inizio", "Data Fine", "Sconto", "Aeroporto Partenza", "Aeroporto Arrivo", "Fedele"};
		
		int i = 0;
		
		for(Promozione p : promozioni) {
			rows[i][0] = p.getIdPromozione();
			rows[i][1] = convertiData(p.getDataInizio());
			rows[i][2] = convertiData(p.getDataFine());
			rows[i][3] = p.getSconto()+"%";
			rows[i][4] = Controller.parserAeroporto(p.getPartenza());
			rows[i][5] = Controller.parserAeroporto(p.getDestinazione());
			if(p.isPerFedele())
				rows[i][6] = "Si";
			else
				rows[i][6] = "No";
			i++;
		}
		
		TableModel modelVolo = new DefaultTableModel(rows, columns)
		  {
		    public boolean isCellEditable(int row, int columns)
		    {
		      return false;
		    }
		  };
		JTable tableVolo = new JTable(modelVolo);
		tableVolo.setPreferredSize(new Dimension(800, 500));
		
		JPanel panel6Volo = new JPanel();
		panel6Volo.setBounds(100, 100, 894, 717);
		panel6Volo.setBackground(Color.BLUE);
		contentPane.add(panel6Volo);
		panel6Volo.setLayout(new BorderLayout(0, 0));
		
		JPanel panel8Volo = new JPanel();
		panel8Volo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel8Volo.setBackground(Color.BLUE);
		panel6Volo.add(panel8Volo, BorderLayout.SOUTH);
		panel8Volo.setLayout(new BorderLayout(0, 0));
		
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
		panel8Volo.add(btnBack, BorderLayout.WEST);
		
		JPanel panel9 = new JPanel();
		panel9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel9.setBackground(Color.BLUE);
		panel6Volo.add(panel9, BorderLayout.CENTER);
		panel9.setLayout(new BorderLayout(0, 0));
		
		panel9.add(new JScrollPane(tableVolo));
		
		return panel6Volo;
	}
	
	public static String convertiData(Date data) {
		SimpleDateFormat dtFormat=new SimpleDateFormat("dd-MM-yyyy");
		dtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		String dataStringa= dtFormat.format(data);
		return dataStringa;
	}

}

package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.toedter.calendar.JDateChooser;

import controller.Controller;



@SuppressWarnings("serial")
public class Home extends JFrame {
	
	//Dichiarazione variabili;
	private static Log logger=LogFactory.getLog(Home.class);

	private JPanel contentPane;
	private JPanel homePanel;
	private JPanel panel1;
	private JPanel panel3;
	private JLabel lblAirPj;
	private JPanel panel4;
	private JButton btnLogIn;
	private JPanel panel2;
	private JLabel lblAeroportoDiPartenza;
	private JComboBox comboBox;
	private JLabel lblAeroportoDiArrivo;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JLabel lblDataDiPartenza;
	private JLabel lblNewLabel1;
	private JDateChooser dateChooser;
	private Date now = new Date(); 
	private JPanel registrationPanel;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnAreaAdmin;
	private JPanel panel5;
	private JButton btnVisualizzamodificaPrenotazione;
	private boolean modifica;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					logger.error(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public Home() throws ClassNotFoundException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 717);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		homePanel = new JPanel();
		contentPane.add(homePanel, "name_358108283923800");
		homePanel.setLayout(new BorderLayout(0, 0));
		
		modifica = false;
		
		panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		homePanel.add(panel1, BorderLayout.NORTH);
		panel1.setLayout(new BorderLayout(0, 0));
		
		panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		panel1.add(panel3, BorderLayout.WEST);
		
		lblAirPj = new JLabel("AIR PJ 3");
		lblAirPj.setBackground(Color.BLUE);
		lblAirPj.setForeground(Color.WHITE);
		lblAirPj.setFont(new Font("Tw Cen MT", Font.PLAIN, 50));
		panel3.add(lblAirPj);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.BLUE);
		panel1.add(panel4, BorderLayout.EAST);
		
		btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel1 != null) {
					panel2.remove(lblNewLabel1);
				}
				contentPane.removeAll();
				contentPane.add(Accesso.esegui(contentPane, homePanel, registrationPanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel4.add(btnLogIn);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel1.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnAreaAdmin = new JButton("Area Admin");
		btnAreaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(AccessoAdmin.esegui(contentPane, homePanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnAreaAdmin.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel.add(btnAreaAdmin);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.BLUE);
		homePanel.add(panel2, BorderLayout.CENTER);
		GridBagLayout gblPanel_2 = new GridBagLayout();
		gblPanel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gblPanel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gblPanel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel2.setLayout(gblPanel_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut = new GridBagConstraints();
		gbcVerticalStrut.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut.gridx = 1;
		gbcVerticalStrut.gridy = 0;
		panel2.add(verticalStrut, gbcVerticalStrut);
		
		Component verticalStrut1 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut1 = new GridBagConstraints();
		gbcVerticalStrut1.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut1.gridx = 3;
		gbcVerticalStrut1.gridy = 0;
		panel2.add(verticalStrut1, gbcVerticalStrut1);
		
		Component verticalStrut2 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut2 = new GridBagConstraints();
		gbcVerticalStrut2.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut2.gridx = 1;
		gbcVerticalStrut2.gridy = 2;
		panel2.add(verticalStrut2, gbcVerticalStrut2);
		
		Component verticalStrut4 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut4 = new GridBagConstraints();
		gbcVerticalStrut4.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut4.gridx = 3;
		gbcVerticalStrut4.gridy = 2;
		panel2.add(verticalStrut4, gbcVerticalStrut4);
		
		lblNewLabel = new JLabel("Numero Passeggeri:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblNewLabel = new GridBagConstraints();
		gbcLblNewLabel.anchor = GridBagConstraints.WEST;
		gbcLblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbcLblNewLabel.gridx = 1;
		gbcLblNewLabel.gridy = 3;
		panel2.add(lblNewLabel, gbcLblNewLabel);
		
		comboBox2 = new JComboBox();
		GridBagConstraints gbcComboBox2 = new GridBagConstraints();
		gbcComboBox2.insets = new Insets(0, 0, 5, 5);
		gbcComboBox2.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox2.gridx = 3;
		gbcComboBox2.gridy = 3;
		for(int i = 1;i<4;i++) {
			Integer valore = i;
			comboBox2.addItem(valore);
			}
		panel2.add(comboBox2, gbcComboBox2);
		
		lblAeroportoDiPartenza = new JLabel("Aeroporto di Partenza:");
		lblAeroportoDiPartenza.setForeground(Color.WHITE);
		lblAeroportoDiPartenza.setBackground(Color.WHITE);
		lblAeroportoDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblAeroportoDiPartenza = new GridBagConstraints();
		gbcLblAeroportoDiPartenza.anchor = GridBagConstraints.NORTHWEST;
		gbcLblAeroportoDiPartenza.insets = new Insets(0, 0, 5, 5);
		gbcLblAeroportoDiPartenza.gridx = 1;
		gbcLblAeroportoDiPartenza.gridy = 5;
		panel2.add(lblAeroportoDiPartenza, gbcLblAeroportoDiPartenza);
		
		List <String> listaVoli = Controller.getPartenzeVoliDisponibili();
		
		comboBox = new JComboBox();
		GridBagConstraints gbcComboBox = new GridBagConstraints();
		gbcComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox.insets = new Insets(0, 0, 5, 5);
		gbcComboBox.gridx = 3;
		gbcComboBox.gridy = 5;
		for(String v : listaVoli) {
			comboBox.addItem(v);
		}
		panel2.add(comboBox, gbcComboBox);
		
		Component verticalStrut3 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut3 = new GridBagConstraints();
		gbcVerticalStrut3.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut3.gridx = 1;
		gbcVerticalStrut3.gridy = 6;
		panel2.add(verticalStrut3, gbcVerticalStrut3);
		
		Component verticalStrut5 = Box.createVerticalStrut(20);
		GridBagConstraints gbcVerticalStrut5 = new GridBagConstraints();
		gbcVerticalStrut5.insets = new Insets(0, 0, 5, 5);
		gbcVerticalStrut5.gridx = 3;
		gbcVerticalStrut5.gridy = 6;
		panel2.add(verticalStrut5, gbcVerticalStrut5);
		
		lblAeroportoDiArrivo = new JLabel("Aeroporto di Arrivo:");
		lblAeroportoDiArrivo.setForeground(Color.WHITE);
		lblAeroportoDiArrivo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblAeroportoDiArrivo = new GridBagConstraints();
		gbcLblAeroportoDiArrivo.anchor = GridBagConstraints.NORTHWEST;
		gbcLblAeroportoDiArrivo.insets = new Insets(0, 0, 5, 5);
		gbcLblAeroportoDiArrivo.gridx = 1;
		gbcLblAeroportoDiArrivo.gridy = 8;
		panel2.add(lblAeroportoDiArrivo, gbcLblAeroportoDiArrivo);
		
		List <String> listaDestinazioni = Controller.getDestinazioniVoliDisponibili();
		
		comboBox1 = new JComboBox();
		GridBagConstraints gbcComboBox1 = new GridBagConstraints();
		gbcComboBox1.fill = GridBagConstraints.HORIZONTAL;
		gbcComboBox1.insets = new Insets(0, 0, 5, 5);
		gbcComboBox1.gridx = 3;
		gbcComboBox1.gridy = 8;
		for(String v : listaDestinazioni) {
			comboBox1.addItem(v);
		}
		panel2.add(comboBox1, gbcComboBox1);
		
		lblDataDiPartenza = new JLabel("Data di Partenza:");
		lblDataDiPartenza.setForeground(Color.WHITE);
		lblDataDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbcLblDataDiPartenza = new GridBagConstraints();
		gbcLblDataDiPartenza.anchor = GridBagConstraints.WEST;
		gbcLblDataDiPartenza.insets = new Insets(0, 0, 5, 5);
		gbcLblDataDiPartenza.gridx = 1;
		gbcLblDataDiPartenza.gridy = 10;
		panel2.add(lblDataDiPartenza, gbcLblDataDiPartenza);
		
		dateChooser = new JDateChooser();
		dateChooser.setDate(now);
		GridBagConstraints gbcDateChooser = new GridBagConstraints();
		gbcDateChooser.insets = new Insets(0, 0, 5, 5);
		gbcDateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbcDateChooser.gridx = 3;
		gbcDateChooser.gridy = 10;
		panel2.add(dateChooser, gbcDateChooser);
		
		JButton btnCercaIlTuo1 = new JButton("Cerca il tuo volo !");
		btnCercaIlTuo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (dateChooser.getDate().getDay() < now.getDay()) {
					if (lblNewLabel1 != null)
						panel2.remove(lblNewLabel1);
					
					lblNewLabel1 = new JLabel("Data errate !");
					lblNewLabel1.setForeground(Color.RED);
					lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
					GridBagConstraints gbcLblNewLabel1 = new GridBagConstraints();
					gbcLblNewLabel1.anchor = GridBagConstraints.WEST;
					gbcLblNewLabel1.insets = new Insets(0, 0, 5, 5);
					gbcLblNewLabel1.gridx = 3;
					gbcLblNewLabel1.gridy = 12;
					panel2.add(lblNewLabel1, gbcLblNewLabel1);
				}
				else if(comboBox.getSelectedItem().equals(comboBox1.getSelectedItem())) {
					if (lblNewLabel1 != null)
						panel2.remove(lblNewLabel1);
					
					lblNewLabel1 = new JLabel("Attenzione, gli aeroporti coincidono !");
					lblNewLabel1.setForeground(Color.RED);
					lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
					GridBagConstraints gbcLblNewLabel1 = new GridBagConstraints();
					gbcLblNewLabel1.anchor = GridBagConstraints.WEST;
					gbcLblNewLabel1.insets = new Insets(0, 0, 5, 5);
					gbcLblNewLabel1.gridx = 3;
					gbcLblNewLabel1.gridy = 12;
					panel2.add(lblNewLabel1, gbcLblNewLabel1);
				}
				
				else {
					
					if (lblNewLabel1 != null)
						panel2.remove(lblNewLabel1);
					
					System.out.println(comboBox2.getSelectedItem());
					Integer value1 = (Integer)comboBox2.getSelectedItem();
					int value = value1.intValue();
					
					Date dataPartenza= dateChooser.getDate();
					String partenza= (String)comboBox.getSelectedItem();
					String destinazione= (String) comboBox1.getSelectedItem();
					try {
						if(Controller.controlloDisponibilità(dataPartenza, partenza, destinazione)) {
						contentPane.removeAll();
						contentPane.add(DettaglioVolo.esegui(contentPane, homePanel, value, comboBox.getSelectedItem().toString(), comboBox1.getSelectedItem().toString(), dateChooser.getDate(), modifica));
						contentPane.repaint();
						contentPane.revalidate();
						}
						else {
							if (lblNewLabel1 != null)
								panel2.remove(lblNewLabel1);
							lblNewLabel1 = new JLabel("Volo inesistente !");
							lblNewLabel1.setForeground(Color.RED);
							lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
							GridBagConstraints gbcLblNewLabel1 = new GridBagConstraints();
							gbcLblNewLabel1.anchor = GridBagConstraints.WEST;
							gbcLblNewLabel1.insets = new Insets(0, 0, 5, 5);
							gbcLblNewLabel1.gridx = 3;
							gbcLblNewLabel1.gridy = 12;
							panel2.add(lblNewLabel1, gbcLblNewLabel1);
						}
					} catch (ClassNotFoundException | SQLException e1) {
							logger.error(e1);	
							}
				}
				
		
				panel2.revalidate();
				panel2.repaint();
			}
		});
		btnCercaIlTuo1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		GridBagConstraints gbcBtnCercaIlTuo1 = new GridBagConstraints();
		gbcBtnCercaIlTuo1.anchor = GridBagConstraints.WEST;
		gbcBtnCercaIlTuo1.insets = new Insets(0, 0, 5, 5);
		gbcBtnCercaIlTuo1.gridx = 1;
		gbcBtnCercaIlTuo1.gridy = 12;
		panel2.add(btnCercaIlTuo1, gbcBtnCercaIlTuo1);
		
		panel5 = new JPanel();
		panel5.setBackground(Color.BLUE);
		homePanel.add(panel5, BorderLayout.SOUTH);
		panel5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		btnVisualizzamodificaPrenotazione = new JButton("Visualizza/Modifica Prenotazione");
		btnVisualizzamodificaPrenotazione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(CercaPrenotazione.esegui(contentPane, homePanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnVisualizzamodificaPrenotazione.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel5.add(btnVisualizzamodificaPrenotazione);
		
		JButton btnPromozioni = new JButton("Visualizza Promozioni");
		btnPromozioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(ListaPromozioni.esegui(contentPane, homePanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnPromozioni.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel5.add(btnPromozioni);
		
		//Nuovo panel
	}		
		
}


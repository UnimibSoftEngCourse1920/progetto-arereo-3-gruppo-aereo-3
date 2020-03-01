package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.hibernate.exception.DataException;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Aereoporto;
import dominio.Volo;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;


public class Home extends JFrame {
	
	//Dichiarazione variabili;

	private JPanel contentPane;
	private JPanel homePanel;
	private JPanel panel_1;
	private JPanel panel_3;
	private JLabel lblAirPj;
	private JPanel panel_4;
	private JButton btnLogIn;
	private JPanel panel_2;
	private JLabel lblAeroportoDiPartenza;
	private JComboBox comboBox;
	private JLabel lblAeroportoDiArrivo;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblDataDiPartenza;
	private JLabel lblNewLabel_1;
	private JDateChooser dateChooser;
	private Date now = new Date(); 
	private JPanel registrationPanel;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnAreaAdmin;
	private JPanel panel_5;
	private JButton btnVisualizzamodificaPrenotazione;
	private JPanel panel_6;
	private JLabel lblPartenza;
	private JLabel lblDestinazione;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblDataPartenza;
	private JLabel lblDataArrivo;
	private JLabel lblGate;
	private JTextField textField_4;
	private JLabel lblNumeroPosti;
	private JTextField textField_5;
	private JButton btnAggiungiVolo;
	private JDateChooser dateChooser_1;
	private JDateChooser dateChooser_2;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_3;
	private JLabel lblMinuti;
	private JComboBox comboBox_4;
	private JLabel lblOra;
	private JComboBox comboBox_5;
	private JLabel lblMinuti_1;
	private JComboBox comboBox_6;
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
					e.printStackTrace();
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
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		homePanel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel_1.add(panel_3, BorderLayout.WEST);
		
		lblAirPj = new JLabel("AIR PJ 3");
		lblAirPj.setBackground(Color.BLUE);
		lblAirPj.setForeground(Color.WHITE);
		lblAirPj.setFont(new Font("Tw Cen MT", Font.PLAIN, 50));
		panel_3.add(lblAirPj);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_1.add(panel_4, BorderLayout.EAST);
		
		btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel_1 != null) {
					panel_2.remove(lblNewLabel_1);
				}
				contentPane.removeAll();
				contentPane.add(Accesso.esegui(contentPane, homePanel, registrationPanel));
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_4.add(btnLogIn);
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel_1.add(panel, BorderLayout.CENTER);
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
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		homePanel.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 1;
		gbc_verticalStrut.gridy = 0;
		panel_2.add(verticalStrut, gbc_verticalStrut);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 3;
		gbc_verticalStrut_1.gridy = 0;
		panel_2.add(verticalStrut_1, gbc_verticalStrut_1);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 1;
		gbc_verticalStrut_2.gridy = 2;
		panel_2.add(verticalStrut_2, gbc_verticalStrut_2);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4.gridx = 3;
		gbc_verticalStrut_4.gridy = 2;
		panel_2.add(verticalStrut_4, gbc_verticalStrut_4);
		
		lblNewLabel = new JLabel("Numero Passeggeri:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 3;
		for(int i = 1;i<4;i++) {
			Integer valore = i;
			comboBox_2.addItem(valore);
			}
		panel_2.add(comboBox_2, gbc_comboBox_2);
		
		lblAeroportoDiPartenza = new JLabel("Aeroporto di Partenza:");
		lblAeroportoDiPartenza.setForeground(Color.WHITE);
		lblAeroportoDiPartenza.setBackground(Color.WHITE);
		lblAeroportoDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblAeroportoDiPartenza = new GridBagConstraints();
		gbc_lblAeroportoDiPartenza.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAeroportoDiPartenza.insets = new Insets(0, 0, 5, 5);
		gbc_lblAeroportoDiPartenza.gridx = 1;
		gbc_lblAeroportoDiPartenza.gridy = 5;
		panel_2.add(lblAeroportoDiPartenza, gbc_lblAeroportoDiPartenza);
		
		List <String> listaVoli = Controller.getPartenzeVoliDisponibili();
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 5;
		for(String v : listaVoli) {
			comboBox.addItem(v);
		}
		panel_2.add(comboBox, gbc_comboBox);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 1;
		gbc_verticalStrut_3.gridy = 6;
		panel_2.add(verticalStrut_3, gbc_verticalStrut_3);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 3;
		gbc_verticalStrut_5.gridy = 6;
		panel_2.add(verticalStrut_5, gbc_verticalStrut_5);
		
		lblAeroportoDiArrivo = new JLabel("Aeroporto di Arrivo:");
		lblAeroportoDiArrivo.setForeground(Color.WHITE);
		lblAeroportoDiArrivo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblAeroportoDiArrivo = new GridBagConstraints();
		gbc_lblAeroportoDiArrivo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblAeroportoDiArrivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAeroportoDiArrivo.gridx = 1;
		gbc_lblAeroportoDiArrivo.gridy = 8;
		panel_2.add(lblAeroportoDiArrivo, gbc_lblAeroportoDiArrivo);
		
		List <String> listaDestinazioni = Controller.getDestinazioniVoliDisponibili();
		
		comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 8;
		for(String v : listaDestinazioni) {
			comboBox_1.addItem(v);
		}
		panel_2.add(comboBox_1, gbc_comboBox_1);
		
		lblDataDiPartenza = new JLabel("Data di Partenza:");
		lblDataDiPartenza.setForeground(Color.WHITE);
		lblDataDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblDataDiPartenza = new GridBagConstraints();
		gbc_lblDataDiPartenza.anchor = GridBagConstraints.WEST;
		gbc_lblDataDiPartenza.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDiPartenza.gridx = 1;
		gbc_lblDataDiPartenza.gridy = 10;
		panel_2.add(lblDataDiPartenza, gbc_lblDataDiPartenza);
		
		dateChooser = new JDateChooser();
		dateChooser.setDate(now);
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.gridx = 3;
		gbc_dateChooser.gridy = 10;
		panel_2.add(dateChooser, gbc_dateChooser);
		
		JButton btnCercaIlTuo_1 = new JButton("Cerca il tuo volo !");
		btnCercaIlTuo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (dateChooser.getDate().before(now)) {
					if (lblNewLabel_1 != null)
						panel_2.remove(lblNewLabel_1);
					
					lblNewLabel_1 = new JLabel("Data errate !");
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
					GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
					gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
					gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_1.gridx = 3;
					gbc_lblNewLabel_1.gridy = 12;
					panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
				}
				else if(comboBox.getSelectedItem().equals(comboBox_1.getSelectedItem())) {
					if (lblNewLabel_1 != null)
						panel_2.remove(lblNewLabel_1);
					
					lblNewLabel_1 = new JLabel("Attenzione, gli aeroporti coincidono !");
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
					GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
					gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
					gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_1.gridx = 3;
					gbc_lblNewLabel_1.gridy = 12;
					panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
				}
				
				else {
					
					if (lblNewLabel_1 != null)
						panel_2.remove(lblNewLabel_1);
					
					System.out.println(comboBox_2.getSelectedItem());
					Integer value_1 = (Integer)comboBox_2.getSelectedItem();
					int value = value_1.intValue();
					
					Date dataPartenza= dateChooser.getDate();
					String partenza= (String)comboBox.getSelectedItem();
					String destinazione= (String) comboBox_1.getSelectedItem();
					try {
						if(Controller.controlloDisponibilità(dataPartenza, partenza, destinazione)) {
						contentPane.removeAll();
						contentPane.add(DettaglioVolo.esegui(contentPane, homePanel, value, comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(), dateChooser.getDate()));
						contentPane.repaint();
						contentPane.revalidate();
						}
						else {
							if (lblNewLabel_1 != null)
								panel_2.remove(lblNewLabel_1);
							lblNewLabel_1 = new JLabel("Volo inesistente !");
							lblNewLabel_1.setForeground(Color.RED);
							lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
							GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
							gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
							gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblNewLabel_1.gridx = 3;
							gbc_lblNewLabel_1.gridy = 12;
							panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
						}
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}
				}
				
		
				panel_2.revalidate();
				panel_2.repaint();
			}
		});
		btnCercaIlTuo_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		GridBagConstraints gbc_btnCercaIlTuo_1 = new GridBagConstraints();
		gbc_btnCercaIlTuo_1.anchor = GridBagConstraints.WEST;
		gbc_btnCercaIlTuo_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnCercaIlTuo_1.gridx = 1;
		gbc_btnCercaIlTuo_1.gridy = 12;
		panel_2.add(btnCercaIlTuo_1, gbc_btnCercaIlTuo_1);
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.BLUE);
		homePanel.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
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
		panel_5.add(btnVisualizzamodificaPrenotazione);
		
		//Nuovo panel
		
	}
}


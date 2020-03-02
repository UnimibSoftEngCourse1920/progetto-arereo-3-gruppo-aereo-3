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
import dominio.Cliente;
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
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


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
	private JPanel registration_panel;
	private JButton btnBack;
	private Component verticalStrut_6;
	private JLabel lblNome;
	private JTextField textField;
	private JLabel lblCognome;
	private JTextField textField_1;
	private JLabel lblDataDiNascita;
	private JDateChooser dateChooser_1;
	private JLabel lblIndirizzo;
	private JTextField textField_2;
	private JLabel lblEmail;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JLabel lblConfermaPassword;
	private Component verticalStrut_7;
	private JButton btnRegistrati;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField_1;

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
				

				if (dateChooser.getDate().getDay() < now.getDay()) {
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
		
		registration_panel = new JPanel();
		registration_panel.setBackground(Color.BLUE);
		contentPane.add(registration_panel, "name_5801880281900");
		GridBagLayout gbl_registration_panel = new GridBagLayout();
		gbl_registration_panel.columnWidths = new int[]{0, 0};
		gbl_registration_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_registration_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_registration_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registration_panel.setLayout(gbl_registration_panel);
		
		btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 0);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 0;
		registration_panel.add(btnBack, gbc_btnBack);
		
		verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 1;
		registration_panel.add(verticalStrut_6, gbc_verticalStrut_6);
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNome.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 0);
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 2;
		registration_panel.add(lblNome, gbc_lblNome);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 3;
		registration_panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblCognome = new JLabel("Cognome");
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCognome.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblCognome = new GridBagConstraints();
		gbc_lblCognome.insets = new Insets(0, 0, 5, 0);
		gbc_lblCognome.anchor = GridBagConstraints.WEST;
		gbc_lblCognome.gridx = 0;
		gbc_lblCognome.gridy = 4;
		registration_panel.add(lblCognome, gbc_lblCognome);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 5;
		registration_panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblDataDiNascita = new JLabel("Data di Nascita");
		lblDataDiNascita.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDataDiNascita.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblDataDiNascita = new GridBagConstraints();
		gbc_lblDataDiNascita.insets = new Insets(0, 0, 5, 0);
		gbc_lblDataDiNascita.anchor = GridBagConstraints.WEST;
		gbc_lblDataDiNascita.gridx = 0;
		gbc_lblDataDiNascita.gridy = 6;
		registration_panel.add(lblDataDiNascita, gbc_lblDataDiNascita);
		
		dateChooser_1 = new JDateChooser();
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser_1.fill = GridBagConstraints.BOTH;
		gbc_dateChooser_1.gridx = 0;
		gbc_dateChooser_1.gridy = 7;
		registration_panel.add(dateChooser_1, gbc_dateChooser_1);
		
		lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblIndirizzo.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblIndirizzo = new GridBagConstraints();
		gbc_lblIndirizzo.insets = new Insets(0, 0, 5, 0);
		gbc_lblIndirizzo.anchor = GridBagConstraints.WEST;
		gbc_lblIndirizzo.gridx = 0;
		gbc_lblIndirizzo.gridy = 8;
		registration_panel.add(lblIndirizzo, gbc_lblIndirizzo);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 9;
		registration_panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 10;
		registration_panel.add(lblEmail, gbc_lblEmail);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 11;
		registration_panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 12;
		registration_panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 0;
		gbc_passwordField.gridy = 13;
		registration_panel.add(passwordField, gbc_passwordField);
		
		lblConfermaPassword = new JLabel("Conferma Password");
		lblConfermaPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConfermaPassword.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblConfermaPassword = new GridBagConstraints();
		gbc_lblConfermaPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblConfermaPassword.anchor = GridBagConstraints.WEST;
		gbc_lblConfermaPassword.gridx = 0;
		gbc_lblConfermaPassword.gridy = 14;
		registration_panel.add(lblConfermaPassword, gbc_lblConfermaPassword);
		
		passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 0;
		gbc_passwordField_1.gridy = 15;
		registration_panel.add(passwordField_1, gbc_passwordField_1);
		
		verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_7.gridx = 0;
		gbc_verticalStrut_7.gridy = 16;
		registration_panel.add(verticalStrut_7, gbc_verticalStrut_7);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 18;
		registration_panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		btnRegistrati = new JButton("Registrati ");
		btnRegistrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (! lblNewLabel_3.getText().equals(""))
					lblNewLabel_3.setText("");
				
				if(!(passwordField.getText().equals(passwordField_1.getText())) || passwordField.getText().equals("") || passwordField_1.getText().equals("")) {
					lblNewLabel_3.setText("Password Errate !");
				}
				
				else if(dateChooser_1.getDate().after(now)) {
					lblNewLabel_3.setText("Errore nella data");
				}
				
				else if(isValid(textField_3.getText()) == false || textField_3.getText().equals("")) {
					lblNewLabel_3.setText("Email errate");
				}
				Cliente c = new Cliente();
				c.setNome(textField.getText());
				c.setCognome(textField_1.getText());
				c.setEmail(textField_3.getText());
				c.setPassword(passwordField.getText());
				c.setDataDiNascita(dateChooser_1.getDate());
				c.setIndirizzo(textField_2.getText());
				Controller.insertCliente(c);
				registrationPanel.repaint();
				registrationPanel.revalidate();
			}
		});
		btnRegistrati.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnRegistrati = new GridBagConstraints();
		gbc_btnRegistrati.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegistrati.anchor = GridBagConstraints.WEST;
		gbc_btnRegistrati.gridx = 0;
		gbc_btnRegistrati.gridy = 17;
		registration_panel.add(btnRegistrati, gbc_btnRegistrati);
		
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


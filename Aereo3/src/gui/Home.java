package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Home extends JFrame {
	
	//Dichiarazione variabili;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel logInPanel;
	private JPanel homePanel;
	private JPanel panel_1;
	private JPanel panel_3;
	private JLabel lblAirPj;
	private JPanel panel_4;
	private JButton btnLogIn;
	private JPanel panel_2;
	private JRadioButton rdbtnSoloAndata;
	private JRadioButton rdbtnAndataERitorno;
	private JLabel lblAeroportoDiPartenza;
	private JComboBox comboBox;
	private JLabel lblAeroportoDiArrivo;
	private JComboBox comboBox_1;
	private JLabel lblDataDiPartenza;
	private Component verticalStrut_6;
	private Component verticalStrut_7;
	private Component verticalStrut_8;
	private JLabel lblNewLabel_1;
	private JLabel lblDataDiRitorno;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private Date now = new Date(); 
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private Component verticalStrut_9;
	private Component verticalStrut_10;
	private Component verticalStrut_12;
	private JLabel lblRegistratiAlProgramma;
	private Component verticalStrut_11;
	private JPanel registrationPanel;
	private JButton btnBack_1;
	private Component verticalStrut_13;
	private Component verticalStrut_14;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private Component verticalStrut_15;
	private JLabel lblCognome;
	private JTextField textField_3;
	private Component verticalStrut_16;
	private JLabel lblIndirizzo;
	private JTextField textField_4;
	private Component verticalStrut_17;
	private JLabel lblEmail_1;
	private JTextField textField_5;
	private Component verticalStrut_18;
	private JLabel lblPassword_1;
	private JTextField textField_6;
	private JLabel lblConfermaPassword;
	private JTextField textField_7;
	private Component horizontalStrut;
	private Component verticalStrut_19;
	private Component verticalStrut_20;
	private JButton btnConferma;
	private Component verticalStrut_21;
	private JLabel label;

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
	 */
	public Home() {
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
				contentPane.removeAll();
				contentPane.add(logInPanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_4.add(btnLogIn);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		homePanel.add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		rdbtnSoloAndata = new JRadioButton("Solo Andata");
		rdbtnSoloAndata.setForeground(Color.WHITE);
		rdbtnSoloAndata.setBackground(Color.BLUE);
		rdbtnSoloAndata.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_rdbtnSoloAndata = new GridBagConstraints();
		gbc_rdbtnSoloAndata.anchor = GridBagConstraints.WEST;
		gbc_rdbtnSoloAndata.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSoloAndata.gridx = 1;
		gbc_rdbtnSoloAndata.gridy = 1;
		rdbtnSoloAndata.setSelected(true);
		rdbtnSoloAndata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDataDiRitorno.setVisible(false);
				dateChooser_1.setVisible(false);
				panel_2.revalidate();
				panel_2.repaint();
				}
		});
		panel_2.add(rdbtnSoloAndata, gbc_rdbtnSoloAndata);
		
		rdbtnAndataERitorno = new JRadioButton("Andata e Ritorno");
		rdbtnAndataERitorno.setForeground(Color.WHITE);
		rdbtnAndataERitorno.setBackground(Color.BLUE);
		rdbtnAndataERitorno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_rdbtnAndataERitorno = new GridBagConstraints();
		gbc_rdbtnAndataERitorno.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnAndataERitorno.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAndataERitorno.gridx = 3;
		gbc_rdbtnAndataERitorno.gridy = 1;
		rdbtnAndataERitorno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDataDiRitorno.setVisible(true);
				dateChooser_1.setVisible(true);
				panel_2.revalidate();
				panel_2.repaint();
				}
		});
		panel_2.add(rdbtnAndataERitorno, gbc_rdbtnAndataERitorno);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSoloAndata);
		bg.add(rdbtnAndataERitorno);
		
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
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 5;
		comboBox.addItem("Milano");
		comboBox.addItem("Napoli");
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
		
		comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 8;
		comboBox_1.addItem("Milano");
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
		
		lblDataDiRitorno = new JLabel("Data di Ritorno:");
		lblDataDiRitorno.setForeground(Color.WHITE);
		lblDataDiRitorno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblDataDiRitorno = new GridBagConstraints();
		gbc_lblDataDiRitorno.anchor = GridBagConstraints.WEST;
		gbc_lblDataDiRitorno.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDiRitorno.gridx = 1;
		gbc_lblDataDiRitorno.gridy = 11;
		panel_2.add(lblDataDiRitorno, gbc_lblDataDiRitorno);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setDate(now);
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser_1.gridx = 3;
		gbc_dateChooser_1.gridy = 11;
		panel_2.add(dateChooser_1, gbc_dateChooser_1);
		
		lblDataDiRitorno.setVisible(false);
		dateChooser_1.setVisible(false);
		
		JButton btnCercaIlTuo_1 = new JButton("Cerca il tuo volo !");
		btnCercaIlTuo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lblNewLabel_1.setVisible(false);
				if(comboBox.getSelectedItem().equals(comboBox_1.getSelectedItem())) {
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
				
				else if(dateChooser.getDate().compareTo(dateChooser_1.getDate()) == 1) {
					
					if (lblNewLabel_1 != null)
						panel_2.remove(lblNewLabel_1);
					
					lblNewLabel_1 = new JLabel("Attenzione, le date sono errate !");
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
					GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
					gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
					gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel_1.gridx = 3;
					gbc_lblNewLabel_1.gridy = 12;
					panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
				}
				
				else if (lblNewLabel_1 != null) {
					panel_2.remove(lblNewLabel_1);
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
		
		logInPanel = new JPanel();
		logInPanel.setBackground(Color.BLUE);
		contentPane.add(logInPanel, "name_540380700630600");
		GridBagLayout gbl_logInPanel = new GridBagLayout();
		gbl_logInPanel.columnWidths = new int[]{0, 0, 0};
		gbl_logInPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_logInPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_logInPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		logInPanel.setLayout(gbl_logInPanel);
		
		verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_6.gridx = 1;
		gbc_verticalStrut_6.gridy = 1;
		logInPanel.add(verticalStrut_6, gbc_verticalStrut_6);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(homePanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.WEST;
		gbc_btnBack.insets = new Insets(0, 0, 5, 0);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 2;
		logInPanel.add(btnBack, gbc_btnBack);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 5;
		logInPanel.add(lblEmail, gbc_lblEmail);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 6;
		logInPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_7.gridx = 1;
		gbc_verticalStrut_7.gridy = 7;
		logInPanel.add(verticalStrut_7, gbc_verticalStrut_7);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblPassword.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 8;
		logInPanel.add(lblPassword, gbc_lblPassword);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 10;
		logInPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_8.gridx = 1;
		gbc_verticalStrut_8.gridy = 11;
		logInPanel.add(verticalStrut_8, gbc_verticalStrut_8);
		
		JButton btnLogIn_1 = new JButton("LOG IN");
		btnLogIn_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnLogIn_1 = new GridBagConstraints();
		gbc_btnLogIn_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogIn_1.anchor = GridBagConstraints.WEST;
		gbc_btnLogIn_1.gridx = 1;
		gbc_btnLogIn_1.gridy = 13;
		logInPanel.add(btnLogIn_1, gbc_btnLogIn_1);
		
		verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_9.gridx = 1;
		gbc_verticalStrut_9.gridy = 14;
		logInPanel.add(verticalStrut_9, gbc_verticalStrut_9);
		
		verticalStrut_12 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_12 = new GridBagConstraints();
		gbc_verticalStrut_12.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_12.gridx = 1;
		gbc_verticalStrut_12.gridy = 15;
		logInPanel.add(verticalStrut_12, gbc_verticalStrut_12);
		
		lblNewLabel = new JLabel("Non hai un account?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 16;
		logInPanel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblRegistratiAlProgramma = new JLabel("Registrati al programma fedelt\u00E0");
		lblRegistratiAlProgramma.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRegistratiAlProgramma.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblRegistratiAlProgramma = new GridBagConstraints();
		gbc_lblRegistratiAlProgramma.anchor = GridBagConstraints.WEST;
		gbc_lblRegistratiAlProgramma.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistratiAlProgramma.gridx = 1;
		gbc_lblRegistratiAlProgramma.gridy = 17;
		logInPanel.add(lblRegistratiAlProgramma, gbc_lblRegistratiAlProgramma);
		
		verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_10.gridx = 1;
		gbc_verticalStrut_10.gridy = 18;
		logInPanel.add(verticalStrut_10, gbc_verticalStrut_10);
		
		btnNewButton = new JButton("Registrazione");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(registrationPanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 19;
		logInPanel.add(btnNewButton, gbc_btnNewButton);
		
		verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 0);
		gbc_verticalStrut_11.gridx = 1;
		gbc_verticalStrut_11.gridy = 20;
		logInPanel.add(verticalStrut_11, gbc_verticalStrut_11);
		
		registrationPanel = new JPanel();
		registrationPanel.setBackground(Color.BLUE);
		contentPane.add(registrationPanel, "name_523737106974600");
		GridBagLayout gbl_registrationPanel = new GridBagLayout();
		gbl_registrationPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_registrationPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_registrationPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_registrationPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registrationPanel.setLayout(gbl_registrationPanel);
		
		verticalStrut_13 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_13 = new GridBagConstraints();
		gbc_verticalStrut_13.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_13.gridx = 1;
		gbc_verticalStrut_13.gridy = 1;
		registrationPanel.add(verticalStrut_13, gbc_verticalStrut_13);
		
		btnBack_1 = new JButton("BACK");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(logInPanel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_btnBack_1 = new GridBagConstraints();
		gbc_btnBack_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack_1.anchor = GridBagConstraints.WEST;
		gbc_btnBack_1.gridx = 1;
		gbc_btnBack_1.gridy = 2;
		registrationPanel.add(btnBack_1, gbc_btnBack_1);
		
		verticalStrut_14 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_14 = new GridBagConstraints();
		gbc_verticalStrut_14.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_14.gridx = 1;
		gbc_verticalStrut_14.gridy = 3;
		registrationPanel.add(verticalStrut_14, gbc_verticalStrut_14);
		
		lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		registrationPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		registrationPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		verticalStrut_15 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_15 = new GridBagConstraints();
		gbc_verticalStrut_15.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_15.gridx = 1;
		gbc_verticalStrut_15.gridy = 5;
		registrationPanel.add(verticalStrut_15, gbc_verticalStrut_15);
		
		lblCognome = new JLabel("Cognome:");
		lblCognome.setForeground(Color.WHITE);
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblCognome = new GridBagConstraints();
		gbc_lblCognome.anchor = GridBagConstraints.WEST;
		gbc_lblCognome.insets = new Insets(0, 0, 5, 5);
		gbc_lblCognome.gridx = 1;
		gbc_lblCognome.gridy = 6;
		registrationPanel.add(lblCognome, gbc_lblCognome);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.WEST;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 6;
		registrationPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		verticalStrut_16 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_16 = new GridBagConstraints();
		gbc_verticalStrut_16.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_16.gridx = 1;
		gbc_verticalStrut_16.gridy = 7;
		registrationPanel.add(verticalStrut_16, gbc_verticalStrut_16);
		
		lblIndirizzo = new JLabel("Indirizzo:");
		lblIndirizzo.setForeground(Color.WHITE);
		lblIndirizzo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblIndirizzo = new GridBagConstraints();
		gbc_lblIndirizzo.anchor = GridBagConstraints.WEST;
		gbc_lblIndirizzo.insets = new Insets(0, 0, 5, 5);
		gbc_lblIndirizzo.gridx = 1;
		gbc_lblIndirizzo.gridy = 8;
		registrationPanel.add(lblIndirizzo, gbc_lblIndirizzo);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.WEST;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 8;
		registrationPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		verticalStrut_17 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_17 = new GridBagConstraints();
		gbc_verticalStrut_17.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_17.gridx = 1;
		gbc_verticalStrut_17.gridy = 9;
		registrationPanel.add(verticalStrut_17, gbc_verticalStrut_17);
		
		lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setForeground(Color.WHITE);
		lblEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 1;
		gbc_lblEmail_1.gridy = 10;
		registrationPanel.add(lblEmail_1, gbc_lblEmail_1);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.WEST;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 10;
		registrationPanel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		verticalStrut_18 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_18 = new GridBagConstraints();
		gbc_verticalStrut_18.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_18.gridx = 1;
		gbc_verticalStrut_18.gridy = 11;
		registrationPanel.add(verticalStrut_18, gbc_verticalStrut_18);
		
		lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setForeground(Color.WHITE);
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
		gbc_lblPassword_1.anchor = GridBagConstraints.WEST;
		gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword_1.gridx = 1;
		gbc_lblPassword_1.gridy = 12;
		registrationPanel.add(lblPassword_1, gbc_lblPassword_1);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.WEST;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 12;
		registrationPanel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 3;
		gbc_horizontalStrut.gridy = 12;
		registrationPanel.add(horizontalStrut, gbc_horizontalStrut);
		
		lblConfermaPassword = new JLabel("Conferma Password:");
		lblConfermaPassword.setForeground(Color.WHITE);
		lblConfermaPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblConfermaPassword = new GridBagConstraints();
		gbc_lblConfermaPassword.anchor = GridBagConstraints.EAST;
		gbc_lblConfermaPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfermaPassword.gridx = 4;
		gbc_lblConfermaPassword.gridy = 12;
		registrationPanel.add(lblConfermaPassword, gbc_lblConfermaPassword);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.anchor = GridBagConstraints.WEST;
		gbc_textField_7.gridx = 5;
		gbc_textField_7.gridy = 12;
		registrationPanel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		verticalStrut_19 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_19 = new GridBagConstraints();
		gbc_verticalStrut_19.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_19.gridx = 1;
		gbc_verticalStrut_19.gridy = 13;
		registrationPanel.add(verticalStrut_19, gbc_verticalStrut_19);
		
		verticalStrut_20 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_20 = new GridBagConstraints();
		gbc_verticalStrut_20.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_20.gridx = 1;
		gbc_verticalStrut_20.gridy = 14;
		registrationPanel.add(verticalStrut_20, gbc_verticalStrut_20);
		
		verticalStrut_21 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_21 = new GridBagConstraints();
		gbc_verticalStrut_21.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_21.gridx = 1;
		gbc_verticalStrut_21.gridy = 15;
		registrationPanel.add(verticalStrut_21, gbc_verticalStrut_21);
		
		btnConferma = new JButton("Registrati !");
		btnConferma.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnConferma.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnConferma = new GridBagConstraints();
		gbc_btnConferma.insets = new Insets(0, 0, 5, 5);
		gbc_btnConferma.gridx = 1;
		gbc_btnConferma.gridy = 16;
		registrationPanel.add(btnConferma, gbc_btnConferma);
		
		label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 16;
		registrationPanel.add(label, gbc_label);
		
	}

}

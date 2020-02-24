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
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

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
	private JRadioButton rdbtnSoloAndata;
	private JRadioButton rdbtnAndataERitorno;
	private JLabel lblAeroportoDiPartenza;
	private JComboBox comboBox;
	private JLabel lblAeroportoDiArrivo;
	private JComboBox comboBox_1;
	private JLabel lblDataDiPartenza;
	private JLabel lblNewLabel_1;
	private JLabel lblDataDiRitorno;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private Date now = new Date(); 
	private JPanel registrationPanel;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel menuAdmin;
	private JButton btnAggiungiVolo;
	private JButton btnEliminaVolo;
	private Component verticalStrut_7;
	private JButton btnModificaVolo;
	private Component verticalStrut_6;
	private Component verticalStrut_8;
	private Component verticalStrut_9;
	private JButton btnCreaPromozione;
	private Component verticalStrut_10;
	private JButton btnEliminaPromozione;
	private Component verticalStrut_11;
	private JButton btnLog;
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
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		contentPane.add(panel, "name_881526299580700");
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("Benvenuto nell'area Admin");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		menuAdmin = new JPanel();
		menuAdmin.setBackground(Color.BLUE);
		panel.add(menuAdmin, BorderLayout.WEST);
		GridBagLayout gbl_menuAdmin = new GridBagLayout();
		gbl_menuAdmin.columnWidths = new int[]{0, 101, 0};
		gbl_menuAdmin.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_menuAdmin.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_menuAdmin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		menuAdmin.setLayout(gbl_menuAdmin);
		
		verticalStrut_6 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_6 = new GridBagConstraints();
		gbc_verticalStrut_6.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_6.gridx = 0;
		gbc_verticalStrut_6.gridy = 0;
		menuAdmin.add(verticalStrut_6, gbc_verticalStrut_6);
		
		btnAggiungiVolo = new JButton("Aggiungi Volo");
		btnAggiungiVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnAggiungiVolo = new GridBagConstraints();
		gbc_btnAggiungiVolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAggiungiVolo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAggiungiVolo.gridx = 0;
		gbc_btnAggiungiVolo.gridy = 1;
		menuAdmin.add(btnAggiungiVolo, gbc_btnAggiungiVolo);
		
		verticalStrut_8 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_8 = new GridBagConstraints();
		gbc_verticalStrut_8.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_8.gridx = 0;
		gbc_verticalStrut_8.gridy = 2;
		menuAdmin.add(verticalStrut_8, gbc_verticalStrut_8);
		
		btnEliminaVolo = new JButton("Elimina Volo");
		btnEliminaVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnEliminaVolo = new GridBagConstraints();
		gbc_btnEliminaVolo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnEliminaVolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminaVolo.gridx = 0;
		gbc_btnEliminaVolo.gridy = 3;
		menuAdmin.add(btnEliminaVolo, gbc_btnEliminaVolo);
		
		verticalStrut_7 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_7 = new GridBagConstraints();
		gbc_verticalStrut_7.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_7.gridx = 0;
		gbc_verticalStrut_7.gridy = 4;
		menuAdmin.add(verticalStrut_7, gbc_verticalStrut_7);
		
		btnModificaVolo = new JButton("Modifica Volo");
		btnModificaVolo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnModificaVolo = new GridBagConstraints();
		gbc_btnModificaVolo.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnModificaVolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificaVolo.gridx = 0;
		gbc_btnModificaVolo.gridy = 5;
		menuAdmin.add(btnModificaVolo, gbc_btnModificaVolo);
		
		verticalStrut_9 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_9 = new GridBagConstraints();
		gbc_verticalStrut_9.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_9.gridx = 0;
		gbc_verticalStrut_9.gridy = 6;
		menuAdmin.add(verticalStrut_9, gbc_verticalStrut_9);
		
		btnCreaPromozione = new JButton("Crea Promozione");
		btnCreaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnCreaPromozione = new GridBagConstraints();
		gbc_btnCreaPromozione.anchor = GridBagConstraints.WEST;
		gbc_btnCreaPromozione.insets = new Insets(0, 0, 5, 5);
		gbc_btnCreaPromozione.gridx = 0;
		gbc_btnCreaPromozione.gridy = 7;
		menuAdmin.add(btnCreaPromozione, gbc_btnCreaPromozione);
		
		verticalStrut_10 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_10 = new GridBagConstraints();
		gbc_verticalStrut_10.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_10.gridx = 0;
		gbc_verticalStrut_10.gridy = 8;
		menuAdmin.add(verticalStrut_10, gbc_verticalStrut_10);
		
		btnEliminaPromozione = new JButton("Elimina Promozione");
		btnEliminaPromozione.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btnEliminaPromozione = new GridBagConstraints();
		gbc_btnEliminaPromozione.anchor = GridBagConstraints.WEST;
		gbc_btnEliminaPromozione.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminaPromozione.gridx = 0;
		gbc_btnEliminaPromozione.gridy = 9;
		menuAdmin.add(btnEliminaPromozione, gbc_btnEliminaPromozione);
		
		verticalStrut_11 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_11 = new GridBagConstraints();
		gbc_verticalStrut_11.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_11.gridx = 0;
		gbc_verticalStrut_11.gridy = 10;
		menuAdmin.add(verticalStrut_11, gbc_verticalStrut_11);
		
		btnLog = new JButton("Log Out");
		GridBagConstraints gbc_btnLog = new GridBagConstraints();
		gbc_btnLog.anchor = GridBagConstraints.WEST;
		gbc_btnLog.insets = new Insets(0, 0, 0, 5);
		gbc_btnLog.gridx = 0;
		gbc_btnLog.gridy = 11;
		menuAdmin.add(btnLog, gbc_btnLog);
		}
}

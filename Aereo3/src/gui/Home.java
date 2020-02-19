package gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import com.toedter.calendar.*;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Home extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.pack();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
					frame.setResizable(false);
					
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
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_351026657567500");
		panel.setLayout(null);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btnLogIn.setBounds(1356, 10, 170, 70);
		panel.add(btnLogIn);
		
		JLabel lblAeroportoDiPartenza = new JLabel("Aeroporto di Partenza:");
		lblAeroportoDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblAeroportoDiPartenza.setBounds(501, 153, 398, 48);
		panel.add(lblAeroportoDiPartenza);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(860, 211, 304, 48);
		panel.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(826, 269, 304, 45);
		panel.add(dateChooser);
		
		JButton btnCercaIlTuo = new JButton("Cerca il tuo volo!");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(panel_1);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		btnCercaIlTuo.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnCercaIlTuo.setBounds(504, 478, 640, 139);
		panel.add(btnCercaIlTuo);
		
		JLabel lblAeroportoDiArrivo_1 = new JLabel("Aeroporto di Arrivo:");
		lblAeroportoDiArrivo_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblAeroportoDiArrivo_1.setBounds(501, 211, 349, 48);
		panel.add(lblAeroportoDiArrivo_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(909, 152, 304, 49);
		panel.add(comboBox_2);
		
		JLabel lblAeroportoDiArrivo_1_1 = new JLabel("Data di Partenza:");
		lblAeroportoDiArrivo_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblAeroportoDiArrivo_1_1.setBounds(501, 266, 315, 48);
		panel.add(lblAeroportoDiArrivo_1_1);
		
		JLabel lblAeroportoDiArrivo_1_1_1 = new JLabel("Data di Arrivo:");
		lblAeroportoDiArrivo_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblAeroportoDiArrivo_1_1_1.setBounds(501, 324, 257, 48);
		panel.add(lblAeroportoDiArrivo_1_1_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(766, 324, 304, 45);
		panel.add(dateChooser_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(511, 402, 496, 48);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, "name_353805033515200");
		panel_1.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblEmail.setBounds(556, 265, 137, 65);
		panel_1.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(556, 340, 389, 43);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblPassword.setBounds(556, 393, 228, 65);
		panel_1.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(556, 468, 389, 43);
		panel_1.add(textField_1);
		
		JButton btnLogIn_1 = new JButton("LOG IN");
		btnLogIn_1.setFont(new Font("Tahoma", Font.PLAIN, 42));
		btnLogIn_1.setBounds(556, 521, 389, 79);
		panel_1.add(btnLogIn_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 42));
		btnBack.setBounds(10, 10, 210, 88);
		panel_1.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
	}
}

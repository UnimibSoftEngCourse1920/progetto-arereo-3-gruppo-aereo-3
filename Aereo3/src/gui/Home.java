package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setResizable(true);
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
		setBounds(100, 100, 718, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_358108283923800");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnLogIn);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new MigLayout("", "[1px][305px][][27px,grow][1px]", "[][37px][][grow][grow][][][][grow][][]"));
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel_2.add(verticalGlue_1, "cell 3 0");
		
		JLabel lblAeroportoDiPartenza = new JLabel("Aeroporto di Partenza:");
		lblAeroportoDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(lblAeroportoDiPartenza, "cell 1 1,growx,aligny top");
		
		JComboBox comboBox = new JComboBox();
		panel_2.add(comboBox, "cell 3 1,growx");
		
		JLabel lblAeroportoDiArrivo = new JLabel("Aeroporto di Arrivo:    ");
		lblAeroportoDiArrivo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(lblAeroportoDiArrivo, "cell 1 2,growx,aligny top");
		
		JComboBox comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1, "cell 3 2,growx");
		
		JLabel lblDataDiPartenza = new JLabel("Data di Partenza:        ");
		lblDataDiPartenza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(lblDataDiPartenza, "cell 1 3,alignx trailing,aligny top");
		
		JCalendar calendar = new JCalendar();
		panel_2.add(calendar, "cell 3 3,grow");
		
		JLabel lblDataDiArrivo = new JLabel("Data di Ritorno:");
		lblDataDiArrivo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_2.add(lblDataDiArrivo, "cell 1 4,growx,aligny top");
		
		JCalendar calendar_1 = new JCalendar();
		panel_2.add(calendar_1, "cell 3 4,grow");
		
		Component verticalGlue = Box.createVerticalGlue();
		panel_2.add(verticalGlue, "cell 3 5");
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnCercaIlTuo = new JButton("Cerca il tuo Volo!");
		btnCercaIlTuo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_3.add(btnCercaIlTuo);
		
	}

}

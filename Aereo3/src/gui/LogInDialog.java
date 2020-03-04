package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import controller.Controller;
import dominio.Cliente;
import dominio.ClienteFedele;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInDialog extends JDialog {
	private boolean successed = false;
	private ClienteFedele c = null;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the dialog.
	 */
	public LogInDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gblPanel = new GridBagLayout();
			gblPanel.columnWidths = new int[]{0, 0};
			gblPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gblPanel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gblPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gblPanel);
			{
				JLabel lblEmail = new JLabel("Email");
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbcLblEmail = new GridBagConstraints();
				gbcLblEmail.anchor = GridBagConstraints.WEST;
				gbcLblEmail.insets = new Insets(0, 0, 5, 0);
				gbcLblEmail.gridx = 0;
				gbcLblEmail.gridy = 0;
				panel.add(lblEmail, gbcLblEmail);
			}
			{
				textField = new JTextField();
				GridBagConstraints gbcTextField = new GridBagConstraints();
				gbcTextField.insets = new Insets(0, 0, 5, 0);
				gbcTextField.fill = GridBagConstraints.HORIZONTAL;
				gbcTextField.gridx = 0;
				gbcTextField.gridy = 1;
				panel.add(textField, gbcTextField);
				textField.setColumns(10);
			}
			{
				JLabel lblPassword = new JLabel("Password");
				lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbcLblPassword = new GridBagConstraints();
				gbcLblPassword.insets = new Insets(0, 0, 5, 0);
				gbcLblPassword.anchor = GridBagConstraints.WEST;
				gbcLblPassword.gridx = 0;
				gbcLblPassword.gridy = 2;
				panel.add(lblPassword, gbcLblPassword);
			}
			{
				passwordField = new JPasswordField();
				GridBagConstraints gbcPasswordField = new GridBagConstraints();
				gbcPasswordField.insets = new Insets(0, 0, 5, 0);
				gbcPasswordField.fill = GridBagConstraints.HORIZONTAL;
				gbcPasswordField.gridx = 0;
				gbcPasswordField.gridy = 3;
				panel.add(passwordField, gbcPasswordField);
			}
			{
				Component verticalStrut = Box.createVerticalStrut(20);
				GridBagConstraints gbcVerticalStrut = new GridBagConstraints();
				gbcVerticalStrut.insets = new Insets(0, 0, 5, 0);
				gbcVerticalStrut.gridx = 0;
				gbcVerticalStrut.gridy = 4;
				panel.add(verticalStrut, gbcVerticalStrut);
			}
			{
				JButton btnLogin = new JButton("LogIn");
				btnLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						c = Controller.login(textField.getText(), passwordField.getText());
						if (c == null) {
							JOptionPane.showMessageDialog(LogInDialog.this,  "Autenticazione fallita");
							successed=false;
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(LogInDialog.this,  "Autenticazione avvenuta");
							successed=true;
							
							dispose();
						}
					}
				});
				btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbcBtnLogin = new GridBagConstraints();
				gbcBtnLogin.anchor = GridBagConstraints.WEST;
				gbcBtnLogin.gridx = 0;
				gbcBtnLogin.gridy = 5;
				panel.add(btnLogin, gbcBtnLogin);
			}
		}
	}
	
	public boolean isSuccessed() {
		return successed;
	}
	
	public ClienteFedele getCliente() {
		return c;
	}
	
	public void updateGui(JTextField nome, JTextField cognome, JTextField email, JDateChooser data) {
		ClienteFedele cf = this.getCliente();
		nome.setText(cf.getNome());
		nome.setEditable(false);
		cognome.setText(cf.getCognome());
		cognome.setEditable(false);
		email.setText(cf.getEmail());
		email.setEditable(false);
		data.setDate(cf.getDataDiNascita());
		data.setVisible(false);
	}

}

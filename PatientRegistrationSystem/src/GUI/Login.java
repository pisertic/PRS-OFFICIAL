package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame
{
	private JPanel topPanel;
	private JLabel panelLabel;
	private JLabel userLabel;
	private JLabel passLabel;
	private JLabel signupPromptLabel;
	private JTextField userTextField;
	private JTextField passTextField;
	private JButton loginButton;
	private JButton signupButton;
	
	public Login()
	{
		super("Patient Registation System Login");
		setLayout(new FlowLayout());
		setBackground(Color.white);
		
		topPanel = new JPanel();
		topPanel.setBackground(Color.blue);
		add(topPanel);
		
		panelLabel = new JLabel();
		panelLabel.setText("Welcome to ESOF3050 Hospital PRS System");
		panelLabel.setForeground(Color.white);
		topPanel.add(panelLabel);
		
		userLabel = new JLabel();
		userLabel.setText("Username:");
		add(userLabel);
		
		userTextField = new JTextField("Enter username");
		add(userTextField);
		
		passLabel = new JLabel();
		passLabel.setText("Password:");
		add(passLabel);
		
		passTextField = new JTextField("Enter password");
		add(passTextField);
		
		loginButton = new JButton("LOGIN");
		add(loginButton);
		
		signupPromptLabel = new JLabel();
		signupPromptLabel.setText("Not registered? Sign up now");
		add(signupPromptLabel);
		
		signupButton = new JButton("SIGN UP");
		add(signupButton);
		
		LoginHandler lhandler = new LoginHandler();
		loginButton.addActionListener(lhandler);
		signupButton.addActionListener(lhandler);
	}
		
	private class LoginHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == loginButton)
			{
				if (userTextField.getText() == "patient" && passTextField.getText() == "patientpass")
				{
					
				}
				
				if (userTextField.getText() == "doctor" && passTextField.getText() == "doctorpass")
				{
					
				}
				
				if (userTextField.getText() == "hospitalstaff" && passTextField.getText() == "staffpass")
				{
					
				}
			
				if (event.getSource() == signupButton);
				{
					
				}
			
			}
		}
	}
}


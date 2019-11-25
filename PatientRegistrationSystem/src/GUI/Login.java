package GUI;

import java.awt.Color;
import java.awt.Dimension;
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
		getContentPane().setBackground(Color.white);
		
		topPanel = new JPanel();
		topPanel.setBackground(Color.blue);
		topPanel.setPreferredSize(new Dimension(600,30));
		add(topPanel);
		
		panelLabel = new JLabel();
		panelLabel.setText("Welcome to ESOF3050 Hospital PRS System!");
		panelLabel.setForeground(Color.white);
		topPanel.add(panelLabel);
		
		userLabel = new JLabel();
		userLabel.setText("Username:");
		add(userLabel);
		
		userTextField = new JTextField();
		userTextField.setPreferredSize(new Dimension(100,20));
		add(userTextField);
		
		passLabel = new JLabel();
		passLabel.setText("Password:");
		add(passLabel);
		
		passTextField = new JTextField();
		passTextField.setPreferredSize(new Dimension(100,20));
		add(passTextField);
		
		loginButton = new JButton("LOGIN");
		add(loginButton);
		
		signupPromptLabel = new JLabel();
		signupPromptLabel.setText("Not registered? Sign up now");
		add(signupPromptLabel);
		
		signupButton = new JButton("SIGN UP");
		add(signupButton);
		
		LoginHandler1 lhandler1 = new LoginHandler1();
		loginButton.addActionListener(lhandler1);
		
		LoginHandler2 lhandler2 = new LoginHandler2();
		signupButton.addActionListener(lhandler2);
	}
		
	private class LoginHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == loginButton)
			{
				if (userTextField.getText().contentEquals("patient") && passTextField.getText().equals("password"))
				{
					PatientHome patientHome = new PatientHome();
					patientHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					patientHome.setSize(500, 400);
					patientHome.setVisible(true);
				}
				
				if (userTextField.getText().contentEquals("doctor") && passTextField.getText().equals("password"))
				{
					DoctorHome doctorHome = new DoctorHome();
					doctorHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					doctorHome.setSize(500, 400);
					doctorHome.setVisible(true);
				}
				
				if (userTextField.getText().contentEquals("staff") && passTextField.getText().equals("password"))
				{
					StaffHome staffHome = new StaffHome();
					staffHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					staffHome.setSize(500, 400);
					staffHome.setVisible(true);
				}
			}	
		}
	}
	
	private class LoginHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == signupButton);
			{
				Signup signupFrame = new Signup();
				signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				signupFrame.setSize(600, 400);
				signupFrame.setVisible(true);
			}	
		}
	}
}

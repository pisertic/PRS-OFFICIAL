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

public class Signup extends JFrame
{
	private JTextField pFirstTextField;
	private JTextField pLastTextField;
	private JTextField pAddressTextField;
	private JTextField pSINTextField;
	private JTextField pHealthCardTextField;
	private JLabel signupTopLabel;
	private JLabel pFirstLabel;
	private JLabel pLastLabel;
	private JLabel pAddressLabel;
	private JLabel pSINLabel;
	private JLabel pHealthCardLabel;
	private JButton signupEnterButton;
	
	public Signup()
	{
		super("Patient Registation System Signup");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		signupTopLabel = new JLabel();
		signupTopLabel.setText("Thank you for signing up! Please enter required information");
		signupTopLabel.setForeground(Color.blue);
		add(signupTopLabel);
		
		pFirstLabel = new JLabel();
		pFirstLabel.setText("Enter first name:");
		add(pFirstLabel);
		
		pFirstTextField = new JTextField();
		pFirstTextField.setPreferredSize(new Dimension(100,20));
		add(pFirstTextField);
		
		pLastLabel = new JLabel();
		pLastLabel.setText("Enter last name:");
		add(pLastLabel);
		
		pLastTextField = new JTextField();
		pLastTextField.setPreferredSize(new Dimension(100,20));
		add(pLastTextField);
		
		pAddressLabel = new JLabel();
		pAddressLabel.setText("Enter address:");
		add(pAddressLabel);
		
		pAddressTextField = new JTextField();
		pAddressTextField.setPreferredSize(new Dimension(100,20));
		add(pAddressTextField);
		
		pSINLabel = new JLabel();
		pSINLabel.setText("Enter SIN:");
		add(pSINLabel);
		
		pSINTextField = new JTextField();
		pSINTextField.setPreferredSize(new Dimension(100,20));
		add(pSINTextField);
		
		pHealthCardLabel = new JLabel();
		pHealthCardLabel.setText("Enter health card number:");
		add(pHealthCardLabel);
		
		pHealthCardTextField = new JTextField();
		pHealthCardTextField.setPreferredSize(new Dimension(100,20));
		add(pHealthCardTextField);
		
		signupEnterButton = new JButton("REGISTER");
		add(signupEnterButton);
	
		SignupHandler shandler = new SignupHandler();
		signupEnterButton.addActionListener(shandler);
	}
	
	private class SignupHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == signupEnterButton)
			{
				
			}
		}
	}
}
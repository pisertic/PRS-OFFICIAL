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
		super("Patient Registation System Login");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.white);
		
		signupTopLabel = new JLabel();
		signupTopLabel.setText("Thank you for signing up! Please enter required information");
		signupTopLabel.setForeground(Color.blue);
		add(signupTopLabel);
		
		pFirstLabel = new JLabel();
		pFirstLabel.setText("Enter first name:");
		add(pFirstLabel);
		
		pFirstTextField = new JTextField("First name");
		add(pFirstTextField);
		
		pLastLabel = new JLabel();
		pLastLabel.setText("Enter last name:");
		add(pLastLabel);
		
		pLastTextField = new JTextField("Last name");
		add(pLastTextField);
		
		pAddressLabel = new JLabel();
		pAddressLabel.setText("Enter address:");
		add(pAddressLabel);
		
		pAddressTextField = new JTextField("Address");
		add(pAddressTextField);
		
		pSINLabel = new JLabel();
		pSINLabel.setText("Enter SIN:");
		add(pSINLabel);
		
		pSINTextField = new JTextField("SIN");
		add(pSINTextField);
		
		pHealthCardLabel = new JLabel();
		pHealthCardLabel.setText("Enter health card number:");
		add(pHealthCardLabel);
		
		pHealthCardTextField = new JTextField("Health card number");
		add(pHealthCardTextField);
	}
}

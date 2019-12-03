package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import OCSF.GFG;
import OCSF.MyClient;
import OCSF.Objectinator;
import prsPackage.HospitalMember;
import prsPackage.LoginCard;

public class Signup extends JFrame 
{
	private JPanel pFirstPanel;
	private JPanel pLastPanel;
	private JPanel pUserPanel;
	private JPanel pPasswordPanel;
	private JPanel pButtonPanel;
	private JTextField pFirstTextField;
	private JTextField pLastTextField;
	private JTextField userNameTextField;
	private JTextField passWordTextField;
	private JLabel signupTopLabel;
	private JLabel pFirstLabel;
	private JLabel pLastLabel;
	private JLabel userNameLabel;
	private JLabel passWordLabel;
	private JButton signupEnterButton;

	// client instance
	private MyClient client;

	public Signup(MyClient client) {
		super("Member Registation System Signup");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);

		signupTopLabel = new JLabel();
		signupTopLabel.setText("Thank you for signing up! Please enter required information");
		signupTopLabel.setForeground(Color.blue);
		add(signupTopLabel);

		pFirstPanel = new JPanel();
		pFirstPanel.setLayout(new FlowLayout());
		pFirstPanel.setPreferredSize(new Dimension(500,30));
		pFirstPanel.setBackground(Color.white);
		add(pFirstPanel);
		
		pLastPanel = new JPanel();
		pLastPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		pLastPanel.setPreferredSize(new Dimension(500,30));
		pLastPanel.setBackground(Color.white);
		add(pLastPanel);
		
		pUserPanel = new JPanel();
		pUserPanel.setLayout(new FlowLayout());
		pUserPanel.setPreferredSize(new Dimension(500,30));
		pUserPanel.setBackground(Color.white);
		add(pUserPanel);
		
		pPasswordPanel = new JPanel();
		pPasswordPanel.setLayout(new FlowLayout());
		pPasswordPanel.setPreferredSize(new Dimension(500,30));
		pPasswordPanel.setBackground(Color.white);
		add(pPasswordPanel);
		
		pButtonPanel = new JPanel();
		pButtonPanel.setLayout(new FlowLayout());
		pButtonPanel.setPreferredSize(new Dimension(500,30));
		pButtonPanel.setBackground(Color.white);
		add(pButtonPanel);
		
		pFirstLabel = new JLabel();
		pFirstLabel.setText("Enter first name:");
		pFirstPanel.add(pFirstLabel);

		pFirstTextField = new JTextField();
		pFirstTextField.setPreferredSize(new Dimension(100, 20));
		pFirstPanel.add(pFirstTextField);

		pLastLabel = new JLabel();
		pLastLabel.setText("Enter last name:");
		pLastPanel.add(pLastLabel);

		pLastTextField = new JTextField();
		pLastTextField.setPreferredSize(new Dimension(100, 20));
		pLastPanel.add(pLastTextField);

		userNameLabel = new JLabel();
		userNameLabel.setText("Enter Username:");
		pUserPanel.add(userNameLabel);

		userNameTextField = new JTextField();
		userNameTextField.setPreferredSize(new Dimension(100, 20));
		pUserPanel.add(userNameTextField);

		passWordLabel = new JLabel();
		passWordLabel.setText("Enter password:");
		pPasswordPanel.add(passWordLabel);

		passWordTextField = new JTextField();
		passWordTextField.setPreferredSize(new Dimension(100, 20));
		pPasswordPanel.add(passWordTextField);

		signupEnterButton = new JButton("REGISTER");
		pButtonPanel.add(signupEnterButton);

		SignupHandler shandler = new SignupHandler();
		signupEnterButton.addActionListener(shandler);

		// set client
		this.client = client;
	}

	private class SignupHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == signupEnterButton) {
				//NO INPUT CHECKING IMPLIMENTED YET(except checking to ensure all fields are full)
				if(pFirstTextField.getText() != null && pLastTextField.getText() != null && userNameTextField.getText() != null && passWordTextField.getText() != null) {
					//create hospital member(and its login card)
					LoginCard card = null;
					try {
						card = new LoginCard(userNameTextField.getText(), GFG.toHexString(GFG.getSHA(passWordTextField.getText())), 10);
					} catch (NoSuchAlgorithmException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//SEND LOGIN CARD TO SERVER LIST FOR UPDATE
					try {
						client.sendToServer(Objectinator.createDataMsg(true, card ,6));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
//					//create user
//					HospitalMember user = new HospitalMember(pFirstTextField.getText(),pLastTextField.getText(), card);
//					//SEND USER TO SERVER UPDATE LIST OF HOSPITAL MEMBERS
//					try {
//						client.sendToServer(Objectinator.createDataMsg(true, user, 2));
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					// open appropriate window
//					HospitalMemberHome hmHome = new HospitalMemberHome(user, client);
//					hmHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//					hmHome.setSize(500, 400);
//					hmHome.setVisible(true);
				
				}
			}
		}
	}
}
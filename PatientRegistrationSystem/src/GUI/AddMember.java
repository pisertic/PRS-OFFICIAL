package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

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

public class AddMember extends JFrame {
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

	// client instance
	private MyClient client;

	public AddMember(MyClient client) {
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
		pFirstTextField.setPreferredSize(new Dimension(100, 20));
		add(pFirstTextField);

		pLastLabel = new JLabel();
		pLastLabel.setText("Enter last name:");
		add(pLastLabel);

		pLastTextField = new JTextField();
		pLastTextField.setPreferredSize(new Dimension(100, 20));
		add(pLastTextField);

		pAddressLabel = new JLabel();
		pAddressLabel.setText("Enter address:");
		add(pAddressLabel);

		pAddressTextField = new JTextField();
		pAddressTextField.setPreferredSize(new Dimension(100, 20));
		add(pAddressTextField);

		pSINLabel = new JLabel();
		pSINLabel.setText("Enter SIN:");
		add(pSINLabel);

		pSINTextField = new JTextField();
		pSINTextField.setPreferredSize(new Dimension(100, 20));
		add(pSINTextField);

		pHealthCardLabel = new JLabel();
		pHealthCardLabel.setText("Enter health card number:");
		add(pHealthCardLabel);

		pHealthCardTextField = new JTextField();
		pHealthCardTextField.setPreferredSize(new Dimension(100, 20));
		add(pHealthCardTextField);

		signupEnterButton = new JButton("REGISTER");
		add(signupEnterButton);

		SignupHandler shandler = new SignupHandler();
		signupEnterButton.addActionListener(shandler);

		// set client
		this.client = client;
	}

	private class SignupHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == signupEnterButton) {
				//NO INPUT CHECKING IMPLIMENTED YET
				if(pFirstTextField.getText() != null && pLastTextField.getText() != null && pAddressTextField.getText() != null && pSINTextField.getText() != null && pHealthCardTextField.getText() != null) {
					//NO INPUT CHECKING IMPLIMENTED YET(except checking to ensure all fields are full)
					
						//create hospital member(and its login card)
						LoginCard card = null;
						try {
							card = new LoginCard(userNameTextField.getText(), GFG.toHexString(GFG.getSHA(passWordTextField.getText())), 2); 
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
						//create user
						HospitalMember user = new HospitalMember(pFirstTextField.getText(),pLastTextField.getText(), card);
						//SEND USER TO SERVER UPDATE LIST OF HOSPITAL MEMBERS
						try {
							client.sendToServer(Objectinator.createDataMsg(true, user, 2));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// open appropriate window
						HospitalMemberHome hmHome = new HospitalMemberHome(user, client);
						hmHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						hmHome.setSize(500, 400);
						hmHome.setVisible(true);
					
					
				}
			}
		}
	}
}
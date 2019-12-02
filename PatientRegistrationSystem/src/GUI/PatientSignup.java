package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import OCSF.GFG;
import OCSF.MyClient;
import OCSF.Objectinator;
import prsPackage.HospitalMember;
import prsPackage.LoginCard;

public class PatientSignup extends JFrame {
	private JTextField pAddressField;
	private JTextField pSINField;
	private JLabel psignupTopLabel;
	private JLabel pAddressLabel;
	private JLabel pSINLabel;
	private JButton patientSignupButton;

	// client instance
	private MyClient client;
	private HospitalMember user;

	public PatientSignup(HospitalMember user , MyClient client) {
		
		super("Patient Registation System Signup");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);

		psignupTopLabel = new JLabel();
		psignupTopLabel.setText("To make an appointment, you must enter more information");
		psignupTopLabel.setForeground(Color.blue);
		add(psignupTopLabel);

		pAddressLabel = new JLabel();
		pAddressLabel.setText("Enter address:");
		add(pAddressLabel);

		pAddressField = new JTextField();
		pAddressField.setPreferredSize(new Dimension(100, 20));
		add(pAddressField);

		pSINLabel = new JLabel();
		pSINLabel.setText("Enter SIN:");
		add(pSINLabel);

		pSINField = new JTextField();
		pSINField.setPreferredSize(new Dimension(100, 20));
		add(pSINField);
		
		patientSignupButton = new JButton("REGISTER AS PATIENT");
		add(patientSignupButton);

		SignupHandler shandler = new SignupHandler();
		patientSignupButton.addActionListener(shandler);

		// set client
		this.client = client;
		this.user = user;
	}

	private class SignupHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == patientSignupButton) {
//				//NO INPUT CHECKING IMPLIMENTED YET(except checking to ensure all fields are full)
//				if(pAddressField.getText() != null && pSINField.getText() != null) {
//					//create hospital member(and its login card)
//					LoginCard card = null;
//					try {
//						card = new LoginCard(userNameTextField.getText(), GFG.toHexString(GFG.getSHA(passWordTextField.getText())), 2);
//					} catch (NoSuchAlgorithmException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
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
//				
//				}
			}
		}
	}
}

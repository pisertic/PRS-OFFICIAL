package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import OCSF.GFG;
import OCSF.MyClient;
import OCSF.Objectinator;
import prsPackage.HealthCard;
import prsPackage.HospitalMember;
import prsPackage.LoginCard;
import prsPackage.Patient;

public class PatientSignup extends JFrame {
	private JTextField pAddressField;
	private JTextField pSINField;
	private JTextField pHealthCardField;
	private JTextField pExpDateField;
	private JTextField pProvinceField;
	private JLabel psignupTopLabel;
	private JLabel pAddressLabel;
	private JLabel pSINLabel;
	private JLabel pHealthCardNo;
	private JLabel pExpDate;
	private JLabel pProvince;
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
		
		pHealthCardNo = new JLabel();
		pHealthCardNo.setText("Enter Health Card Number:");
		add(pHealthCardNo);

		pHealthCardField = new JTextField();
		pHealthCardField.setPreferredSize(new Dimension(100, 20));
		add(pHealthCardField);
		
		pExpDate = new JLabel();
		pExpDate.setText("Enter Health Card expiration date:");
		add(pExpDate);

		pExpDateField = new JTextField();
		pExpDateField.setPreferredSize(new Dimension(100, 20));
		add(pExpDateField);
		
		pProvince = new JLabel();
		pProvince.setText("Enter Province:");
		add(pProvince);

		pProvinceField = new JTextField();
		pProvinceField.setPreferredSize(new Dimension(100, 20));
		add(pProvinceField																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											);
		
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
				//NO INPUT CHECKING IMPLIMENTED YET(except checking to ensure all fields are full)
				if(pAddressField.getText() != null && pSINField.getText() != null && pHealthCardField.getText() != null && pExpDateField.getText() != null && pProvinceField.getText() != null) {
	
					//create new login card and grab list from server
					try {
						client.sendToServer(Objectinator.createDataMsg(6));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}//loginCards
					
					ArrayList<LoginCard> cardList= null;
					cardList = (ArrayList<LoginCard>) client.loginData;
					LoginCard card = null;
				
					//find old card, delete it, and add new card. send to server when done
					for(int i =0; i < cardList.size(); i++) {
						if (cardList.get(i).getUserName().equals(user.getLoginUser())) {
							cardList.get(i).setClassID(3);
							card = cardList.get(i);
							try {
								client.sendToServer(Objectinator.createDataMsg(true, cardList, 6));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					user.setLoginCard(card);
					
					//create the health card
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					HealthCard h = null;
					try {
						h = new HealthCard(Integer.parseInt(pHealthCardField.getText()) , dateFormat.parse(pExpDateField.getText()), pProvinceField.getText());
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//create patient
					Patient user1 = new Patient(h, user.getFName(), user.getLName(), pAddressField.getText(), Integer.parseInt(pSINField.getText()), card);
					//SEND USER TO SERVER UPDATE LIST OF HOSPITAL MEMBERS
					try {
						client.sendToServer(Objectinator.createDataMsg(true, user1, 3));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// open appropriate window
					PatientHome patientHome = new PatientHome(user1, client);
					patientHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					patientHome.setSize(500, 400);
					patientHome.setVisible(true);
				
				}
			}
		}
	}
}

package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import prsPackage.LoginCard;
//import prs useCases and proper member classes
import prsPackage.*;
//inport client
import OCSF.MyClient;
import OCSF.Objectinator;

public class Login extends JFrame {
	private JPanel topPanel;
	private JLabel panelLabel;
	private JLabel userLabel;
	private JLabel passLabel;
	private JLabel signupPromptLabel;
	private JTextField userTextField;
	private JTextField passTextField;
	private JButton loginButton;
	private JButton signupButton;
	// client instance
	private MyClient client;

	public Login(final MyClient client) {
		super("Patient Registation System LoginCard");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.white);

		topPanel = new JPanel();
		topPanel.setBackground(Color.blue);
		topPanel.setPreferredSize(new Dimension(600, 30));
		add(topPanel);

		panelLabel = new JLabel();
		panelLabel.setText("Welcome to ESOF3050 Hospital PRS System!");
		panelLabel.setForeground(Color.white);
		topPanel.add(panelLabel);

		userLabel = new JLabel();
		userLabel.setText("Username:");
		add(userLabel);

		userTextField = new JTextField();
		userTextField.setPreferredSize(new Dimension(100, 20));
		add(userTextField);

		passLabel = new JLabel();
		passLabel.setText("Password:");
		add(passLabel);

		passTextField = new JTextField();
		passTextField.setPreferredSize(new Dimension(100, 20));
		add(passTextField);

		loginButton = new JButton("LOGIN");
		add(loginButton);

		signupPromptLabel = new JLabel();
		signupPromptLabel.setText("Not registered? Sign up now");
		add(signupPromptLabel);

		// add button WITH actionListener
		signupButton = new JButton("SIGN UP");
		add(signupButton);

		LoginHandler1 lhandler1 = new LoginHandler1();
		loginButton.addActionListener(lhandler1);

		LoginHandler2 lhandler2 = new LoginHandler2();
		signupButton.addActionListener(lhandler2);

		// set client
		this.client = client;
	}

	public class LoginHandler1 implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == loginButton) {
				int loginResult = useCases.login(userTextField.getText(), passTextField.getText(), client);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// check if login successful
				if (loginResult == -2) { // no user found
					System.err.println("USER DOES NOT EXIST IN THE SYSTEM");
				} else if (loginResult == -1) { // incorrect password
					System.err.println("INCORRECT PASSWORD");
				} else { // intstantiate user data
					// get list of all members of type classID/loginResult
					switch (loginResult) {
					case 1:// doctor
							// pull list of doctors
						try {
							client.sendToServer(Objectinator.createDataMsg(1));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// find doctor in list ASSUMING USERNAMES ARE UNIQUE
						ArrayList<Doctor> dList = (ArrayList) client.docData;
						
						// create doctor instance
						Doctor user = null;
						for (Doctor d : dList) {
							if (d.getLoginUser().equals(userTextField.getText())) {
								user = d;
							}
						}
						
						// open appropriate window
						DoctorHome doctorHome = new DoctorHome(user, client);
						doctorHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						doctorHome.setSize(500, 400);
						doctorHome.setVisible(true);
						break;
					case 2:// hospital member
							// pull list of hospital members
						try {
							client.sendToServer(Objectinator.createDataMsg(2));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// find HM in list ASSUMING USERNAMES ARE UNIQUE
						ArrayList<HospitalMember> hmList = (ArrayList) client.hpData;

						// create HM instance
						HospitalMember user1 = null;
						for (HospitalMember h : hmList) {
							if (h.getLoginUser().equals(userTextField.getText())) {
								user1 = h;
							}
						}
						
						// open appropriate window
						HospitalMemberHome hmHome = new HospitalMemberHome(user1, client);
						hmHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						hmHome.setSize(500, 400);
						hmHome.setVisible(true);
						break;
					case 3:// patient
							// pull list of patients
						try {
							client.sendToServer(Objectinator.createDataMsg(3));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// find patient in list ASSUMING USERNAMES ARE UNIQUE
						ArrayList<Patient> pList = (ArrayList) client.patData;
					
						// create patient instance
						Patient user2 = null;
						for (Patient p : pList) {
							if (p.getLoginUser().equals(userTextField.getText())) {
								user2 = p;
							}
						}
						
						// open appropriate window
						PatientHome patientHome = new PatientHome();
						patientHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						patientHome.setSize(500, 400);
						patientHome.setVisible(true);
						break;
					case 5:// staff
							// pull list of staff
						try {
							client.sendToServer(Objectinator.createDataMsg(5));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// find staff in list ASSUMING USERNAMES ARE UNIQUE
						ArrayList<Staff> sList = (ArrayList) client.staffData;
					
						// create patient instance
						Staff user3 = null;
						for (Staff s : sList) {
							if (s.getLoginUser().equals(userTextField.getText())) {
								user3 = s;
							}
						}
						
						// open appropriate window
						StaffHome staffHome = new StaffHome();
						staffHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						staffHome.setSize(500, 400);
						staffHome.setVisible(true);
						break;
					case 10:// ADMIN
						// pull list of staff
						try {
							client.sendToServer(Objectinator.createDataMsg(5));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// find staff in list ASSUMING USERNAMES ARE UNIQUE
						ArrayList<Staff> admin = (ArrayList) client.staffData;
					
						// create patient instance
						Staff user4 = null;
						for (Staff s : admin) {
							if (s.getLoginUser().equals(userTextField.getText())) {
								user4 = s;
							}
						}
						AdminHome adHome = new AdminHome(user4, client);
						adHome.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						adHome.setSize(500, 400);
						adHome.setVisible(true);
						break;
					}

				}
			}
		}
	}

	private class LoginHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == signupButton) {
				Signup signupFrame = new Signup(client);
				signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				signupFrame.setSize(600, 400);
				signupFrame.setVisible(true);
			}
		}
	}
}

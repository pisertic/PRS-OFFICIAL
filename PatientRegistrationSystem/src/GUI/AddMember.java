package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import OCSF.GFG;
import OCSF.MyClient;
import OCSF.Objectinator;
import prsPackage.Doctor;
import prsPackage.HospitalMember;
import prsPackage.LoginCard;
import prsPackage.Staff;

public class AddMember extends JFrame {
	private JPanel adTopPanel;
	private JPanel adFNamePanel;
	private JPanel adLNamePanel;
	private JPanel adUserPanel;
	private JPanel adPasswordPanel;
	private JPanel adDeptPanel;
	private JPanel adEmplNumPanel;
	private JPanel adAddressPanel;
	private JPanel adSINPanel;
	private JPanel adSpecialtyPanel;
	private JPanel adRankPanel;
	private JPanel adWorkHoursPanel;
	private JPanel bottomPanel;

	private JLabel adTitleLabel;
	private JLabel adFNameLabel;
	private JLabel adLNameLabel;
	private JLabel adUserLabel;
	private JLabel adPasswordLabel;
	private JLabel adDeptLabel;
	private JLabel adEmplNumLabel;
	private JLabel adAddressLabel;
	private JLabel adSINLabel;
	private JLabel adSpecialtyLabel;
	private JLabel adRankLabel;
	private JLabel adWorkHoursLabel;

	private JTextField adFNameField;
	private JTextField adLNameField;
	private JTextField adUserField;
	private JTextField adPasswordField;
	private JTextField adDeptField;
	private JTextField adEmplNumField;
	private JTextField adAddressField;
	private JTextField adSINField;
	private JTextField adSpecialtyField;
	private JTextField adRankField;
	private JTextField adWorkHoursField;

	private JButton addMemberButton;
	JRadioButton staff;
	JRadioButton doctor;

	// client instance
	private MyClient client;

	public AddMember(MyClient client) {
		super("Patient Registation System Add New Members");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);

		adTopPanel = new JPanel();
		adTopPanel.setBackground(Color.blue);
		adTopPanel.setPreferredSize(new Dimension(500, 30));
		add(adTopPanel);

		adFNamePanel = new JPanel();
		adFNamePanel.setLayout(new FlowLayout());
		adFNamePanel.setPreferredSize(new Dimension(500, 30));
		adFNamePanel.setBackground(Color.white);
		add(adFNamePanel);

		adLNamePanel = new JPanel();
		adLNamePanel.setLayout(new FlowLayout());
		adLNamePanel.setPreferredSize(new Dimension(500, 30));
		adLNamePanel.setBackground(Color.white);
		add(adLNamePanel);

		adUserPanel = new JPanel();
		adUserPanel.setLayout(new FlowLayout());
		adUserPanel.setPreferredSize(new Dimension(500, 30));
		adUserPanel.setBackground(Color.white);
		add(adUserPanel);

		adPasswordPanel = new JPanel();
		adPasswordPanel.setLayout(new FlowLayout());
		adPasswordPanel.setPreferredSize(new Dimension(500, 30));
		adPasswordPanel.setBackground(Color.white);
		add(adPasswordPanel);

		adDeptPanel = new JPanel();
		adDeptPanel.setLayout(new FlowLayout());
		adDeptPanel.setPreferredSize(new Dimension(500, 30));
		adDeptPanel.setBackground(Color.white);
		add(adDeptPanel);

		adEmplNumPanel = new JPanel();
		adEmplNumPanel.setLayout(new FlowLayout());
		adEmplNumPanel.setPreferredSize(new Dimension(500, 30));
		adEmplNumPanel.setBackground(Color.white);
		add(adEmplNumPanel);

		adAddressPanel = new JPanel();
		adAddressPanel.setLayout(new FlowLayout());
		adAddressPanel.setPreferredSize(new Dimension(500, 30));
		adAddressPanel.setBackground(Color.white);
		add(adAddressPanel);
		
		adSINPanel = new JPanel();
		adSINPanel.setLayout(new FlowLayout());
		adSINPanel.setPreferredSize(new Dimension(500, 30));
		adSINPanel.setBackground(Color.white);
		add(adSINPanel);

		adSpecialtyPanel = new JPanel();
		adSpecialtyPanel.setLayout(new FlowLayout());
		adSpecialtyPanel.setPreferredSize(new Dimension(500, 30));
		adSpecialtyPanel.setBackground(Color.white);
		add(adSpecialtyPanel);

		adRankPanel = new JPanel();
		adRankPanel.setLayout(new FlowLayout());
		adRankPanel.setPreferredSize(new Dimension(500, 30));
		adRankPanel.setBackground(Color.white);
		add(adRankPanel);

		adWorkHoursPanel = new JPanel();
		adWorkHoursPanel.setLayout(new FlowLayout());
		adWorkHoursPanel.setPreferredSize(new Dimension(500, 30));
		adWorkHoursPanel.setBackground(Color.white);
		add(adWorkHoursPanel);

		bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.white);
		bottomPanel.setPreferredSize(new Dimension(500, 30));
		add(bottomPanel);

		adTitleLabel = new JLabel();
		adTitleLabel.setText("ESOF3050 Hospital PRS System: Add a Doctor");
		adTitleLabel.setForeground(Color.white);
		adTopPanel.add(adTitleLabel);

		adFNameLabel = new JLabel();
		adFNameLabel.setText("Enter first name of member to add: ");
		adFNamePanel.add(adFNameLabel);

		adLNameLabel = new JLabel();
		adLNameLabel.setText("Enter last name of member to add: ");
		adLNamePanel.add(adLNameLabel);

		adUserLabel = new JLabel();
		adUserLabel.setText("Enter member's username: ");
		adUserPanel.add(adUserLabel);

		adPasswordLabel = new JLabel();
		adPasswordLabel.setText("Enter member's password: ");
		adPasswordPanel.add(adPasswordLabel);

		adDeptLabel = new JLabel();
		adDeptLabel.setText("Enter member's department: ");
		adDeptPanel.add(adDeptLabel);

		adEmplNumLabel = new JLabel();
		adEmplNumLabel.setText("Enter member's employee number: ");
		adEmplNumPanel.add(adEmplNumLabel);

		adAddressLabel = new JLabel();
		adAddressLabel.setText("Enter member's address: ");
		adAddressPanel.add(adAddressLabel);

		adSINLabel = new JLabel();
		adSINLabel.setText("Enter member's SIN: ");
		adSINPanel.add(adSINLabel);

		adSpecialtyLabel = new JLabel();
		adSpecialtyLabel.setText("Enter doctor's specialty: ");
		adSpecialtyPanel.add(adSpecialtyLabel);

		adRankLabel = new JLabel();
		adRankLabel.setText("Enter doctor's rank: ");
		adRankPanel.add(adRankLabel);

		adWorkHoursLabel = new JLabel();
		adWorkHoursLabel.setText("Enter doctor's working hours: ");
		adWorkHoursPanel.add(adWorkHoursLabel);

		adFNameField = new JTextField();
		adFNameField.setPreferredSize(new Dimension(100, 20));
		adFNamePanel.add(adFNameField);

		adLNameField = new JTextField();
		adLNameField.setPreferredSize(new Dimension(100, 20));
		adLNamePanel.add(adLNameField);

		adUserField = new JTextField();
		adUserField.setPreferredSize(new Dimension(100, 20));
		adUserPanel.add(adUserField);

		adPasswordField = new JTextField();
		adPasswordField.setPreferredSize(new Dimension(100, 20));
		adPasswordPanel.add(adPasswordField);

		adDeptField = new JTextField();
		adDeptField.setPreferredSize(new Dimension(100, 20));
		adDeptPanel.add(adDeptField);

		adEmplNumField = new JTextField();
		adEmplNumField.setPreferredSize(new Dimension(100, 20));
		adEmplNumPanel.add(adEmplNumField);

		adAddressField = new JTextField();
		adAddressField.setPreferredSize(new Dimension(100, 20));
		adAddressPanel.add(adAddressField);

		adSINField = new JTextField();
		adSINField.setPreferredSize(new Dimension(100, 20));
		adSINPanel.add(adSINField);

		adSpecialtyField = new JTextField();
		adSpecialtyField.setPreferredSize(new Dimension(100, 20));
		adSpecialtyPanel.add(adSpecialtyField);

		adRankField = new JTextField();
		adRankField.setPreferredSize(new Dimension(100, 20));
		adRankPanel.add(adRankField);

		adWorkHoursField = new JTextField();
		adWorkHoursField.setPreferredSize(new Dimension(100, 20));
		adWorkHoursPanel.add(adWorkHoursField);

		addMemberButton = new JButton("ADD MEMBER");

		AddMemberHandler adhandler = new AddMemberHandler();
		addMemberButton.addActionListener(adhandler);

		staff = new JRadioButton("Staff");
		doctor = new JRadioButton("Doctor");
		bottomPanel.add(staff);
		bottomPanel.add(doctor);
		bottomPanel.add(addMemberButton);

		ButtonGroup bg = new ButtonGroup();
		bg.add(staff);
		bg.add(doctor);

		// set client
		this.client = client;
	}

	private class AddMemberHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == addMemberButton) {
				// NO INPUT CHECKING IMPLIMENTED YET
				// if adding staff
				if (staff.isSelected()) {
					if (adFNameField.getText() != null && adLNameField.getText() != null
							&& adUserField.getText() != null && adPasswordField.getText() != null
							&& adDeptField.getText() != null && adEmplNumField.getText() != null
							&& adAddressField.getText() != null && adSINField.getText() != null) {
						// NO INPUT CHECKING IMPLIMENTED YET(except checking to ensure all fields are
						// full)

						// create staff member and its login card)
						LoginCard card = null;
						try {
							card = new LoginCard(adUserField.getText(),
									GFG.toHexString(GFG.getSHA(adPasswordField.getText())), 5);
						} catch (NoSuchAlgorithmException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// SEND LOGIN CARD TO SERVER LIST FOR UPDATE
						try {
							client.sendToServer(Objectinator.createDataMsg(true, card, 6));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						// create user
						Staff user = new Staff(adFNameField.getText(), adLNameField.getText(), adDeptField.getText(), Integer.parseInt(adEmplNumField.getText()), adAddressField.getText(), Integer.parseInt(adSINField.getText()), card);
								
						// SEND USER TO SERVER UPDATE LIST OF HOSPITAL MEMBERS
						try {
							client.sendToServer(Objectinator.createDataMsg(true, user, 5));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// display success
						System.out.println("Staff Member " + adFNameField.getText() + " added!");
					}
				} else {
					//adding doctor
					if (adFNameField.getText() != null && adLNameField.getText() != null
							&& adUserField.getText() != null && adPasswordField.getText() != null
							&& adDeptField.getText() != null && adEmplNumField.getText() != null
							&& adAddressField.getText() != null && adSINField.getText() != null
							&& adSpecialtyField.getText() != null && adRankField.getText() != null
						&& adWorkHoursField.getText() != null) { //all fields are full
							// NO INPUT CHECKING IMPLIMENTED YET(except checking to ensure all fields are
							// full)

							// create staff member and its login card)
							LoginCard card = null;
							try {
								card = new LoginCard(adUserField.getText(),
										GFG.toHexString(GFG.getSHA(adPasswordField.getText())), 1);
							} catch (NoSuchAlgorithmException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							// SEND LOGIN CARD TO SERVER LIST FOR UPDATE
							try {
								client.sendToServer(Objectinator.createDataMsg(true, card, 6));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							// create user
							Doctor user = new Doctor(adSpecialtyField.getText(), adRankField.getText(), Integer.parseInt(adWorkHoursField.getText()), adFNameField.getText(), adLNameField.getText(), adDeptField.getText(), Integer.parseInt(adEmplNumField.getText()), adAddressField.getText(), Integer.parseInt(adSINField.getText()), card);
									
							// SEND USER TO SERVER UPDATE LIST OF HOSPITAL MEMBERS
							try {
								client.sendToServer(Objectinator.createDataMsg(true, user, 1));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							// display success
							System.out.println("Doctor " + adFNameField.getText() + " added!");
					}
				}
			}
		}
	}
}
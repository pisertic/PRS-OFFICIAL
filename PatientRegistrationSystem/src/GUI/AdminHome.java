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

import OCSF.MyClient;
import prsPackage.Staff;

public class AdminHome extends JFrame {
	private JPanel aHomeTopPanel;
	private JLabel aHomeTopLabel;
	private JLabel aLoggedin;
	private JButton aMakeAppointment;
	private JButton aViewDoctorSchedule;
	private JButton aViewPatientReferral;
	private JButton aViewPatientRecords;
	private JButton aScheduleDoctors;
	private JButton aRemoveUser;
	private JButton addMember;
	private JButton aMakeReferral;

	private MyClient client;
	private Staff user;

	public AdminHome(Staff user, MyClient client) {
		super("Admin Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);

		aHomeTopPanel = new JPanel();
		aHomeTopPanel.setBackground(Color.blue);
		aHomeTopPanel.setPreferredSize(new Dimension(500, 30));
		add(aHomeTopPanel);

		aHomeTopLabel = new JLabel();
		aHomeTopLabel.setText("ESOF3050 Hospital PRS System: Admin Home");
		aHomeTopLabel.setForeground(Color.white);
		aHomeTopPanel.add(aHomeTopLabel);

		aLoggedin = new JLabel();
		aLoggedin.setText("Logged in as Administrator");
		aLoggedin.setForeground(Color.blue);
		add(aLoggedin);

		aMakeAppointment = new JButton("Make Appointment");
		aMakeAppointment.setPreferredSize(new Dimension(200, 60));
		add(aMakeAppointment);

		aViewDoctorSchedule = new JButton("View Doctor Schedules");
		aViewDoctorSchedule.setPreferredSize(new Dimension(200, 60));
		add(aViewDoctorSchedule);

		aViewPatientReferral = new JButton("View Patient Referrals");
		aViewPatientReferral.setPreferredSize(new Dimension(200, 60));
		add(aViewPatientReferral);

		aViewPatientRecords = new JButton("View Patient Records");
		aViewPatientRecords.setPreferredSize(new Dimension(200, 60));
		add(aViewPatientRecords);

		aScheduleDoctors = new JButton("Schedule Doctor Timetables");
		aScheduleDoctors.setPreferredSize(new Dimension(200, 60));
		add(aScheduleDoctors);

		aRemoveUser = new JButton("Remove User");
		aRemoveUser.setPreferredSize(new Dimension(200, 60));
		add(aRemoveUser);

		addMember = new JButton("Add a member");
		addMember.setPreferredSize(new Dimension(200, 60));
		add(addMember);

		aMakeReferral = new JButton("Make a referral");
		aMakeReferral.setPreferredSize(new Dimension(200, 60));
		add(aMakeReferral);

		// Adding Listeners onto buttons
		AdminHandler1 ahandler1 = new AdminHandler1();
		aMakeAppointment.addActionListener(ahandler1);

		AdminHandler2 ahandler2 = new AdminHandler2();
		aViewDoctorSchedule.addActionListener(ahandler2);

		AdminHandler3 ahandler3 = new AdminHandler3();
		aViewPatientReferral.addActionListener(ahandler3);

		AdminHandler4 ahandler4 = new AdminHandler4();
		aViewPatientRecords.addActionListener(ahandler4);

		AdminHandler5 ahandler5 = new AdminHandler5();
		aScheduleDoctors.addActionListener(ahandler5);

		AdminHandler6 ahandler6 = new AdminHandler6();
		aRemoveUser.addActionListener(ahandler6);

		AdminHandler7 ahandler7 = new AdminHandler7();
		addMember.addActionListener(ahandler7);

		AdminHandler9 ahandler9 = new AdminHandler9();
		aMakeReferral.addActionListener(ahandler9);

		this.client = client;
		this.user = user;
	}

	private class AdminHandler1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == aMakeAppointment) {
				MakeAppointment makeAppointment = new MakeAppointment();
				makeAppointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeAppointment.setSize(600, 400);
				makeAppointment.setVisible(true);
			}
		}
	}

	private class AdminHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == aViewDoctorSchedule) {
				ViewDoctorSchedules doctorSchedules = new ViewDoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}

	private class AdminHandler3 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == aViewPatientReferral) {
				PatientReferrals patientReferrals = new PatientReferrals();
				patientReferrals.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientReferrals.setSize(600, 400);
				patientReferrals.setVisible(true);
			}
		}
	}

	private class AdminHandler4 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == aViewPatientRecords) {
				ViewRecords patientHistory = new ViewRecords();
				patientHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientHistory.setSize(600, 400);
				patientHistory.setVisible(true);
			}
		}
	}

	private class AdminHandler5 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == aScheduleDoctors) {
				ScheduleTimetable scheduleTimetable = new ScheduleTimetable();
				scheduleTimetable.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				scheduleTimetable.setSize(600, 400);
				scheduleTimetable.setVisible(true);
			}
		}
	}

	private class AdminHandler6 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == aRemoveUser) {
				RemoveUser removeuser = new RemoveUser(client);
				removeuser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				removeuser.setSize(600, 400);
				removeuser.setVisible(true);
			}
		}
	}

	private class AdminHandler7 implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == addMember) {

				AddMember addmember = new AddMember(client);
				addmember.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				addmember.setSize(600, 800);
				addmember.setVisible(true);

			}
		}
	}

	private class AdminHandler9 implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aMakeReferral)
			{
//				MakeReferral makeReferral = new MakeReferral();
//				makeReferral.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//				makeReferral.setSize(600, 400);
//				makeReferral.setVisible(true);

			}
		}
	}
}

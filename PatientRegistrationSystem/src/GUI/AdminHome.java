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

public class AdminHome extends JFrame
{
	private JPanel aHomeTopPanel;
	private JLabel aHomeTopLabel;
	private JLabel aLoggedin;
	private JButton aMakeAppointment;
	private JButton aViewDoctorSchedule;
	private JButton aViewPatientReferral;
	private JButton aViewPatientHistory;
	private JButton aScheduleDoctors;
	private JButton aRemoveUser;
	private JButton aAddDoctor;
	private JButton aAddStaff;
	private JButton aMakeReferral;

	
	public AdminHome()
	{
		super("Admin Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		aHomeTopPanel = new JPanel();
		aHomeTopPanel.setBackground(Color.blue);
		aHomeTopPanel.setPreferredSize(new Dimension(500,30));
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
		aMakeAppointment.setPreferredSize(new Dimension(200,60));
		add(aMakeAppointment);
		
		aViewDoctorSchedule = new JButton("View Doctor Schedules");
		aViewDoctorSchedule.setPreferredSize(new Dimension(200,60));
		add(aViewDoctorSchedule);
		
		aViewPatientReferral = new JButton("View Patient Referrals");
		aViewPatientReferral.setPreferredSize(new Dimension(200,60));
		add(aViewPatientReferral);
		
		aViewPatientHistory = new JButton("View Patient History");
		aViewPatientHistory.setPreferredSize(new Dimension(200,60));
		add(aViewPatientHistory);
		
		aScheduleDoctors = new JButton("Schedule Doctor Timetables");
		aScheduleDoctors.setPreferredSize(new Dimension(200,60));
		add(aScheduleDoctors);
		
		aRemoveUser = new JButton("Remove User");
		aRemoveUser.setPreferredSize(new Dimension(200,60));
		add(aRemoveUser);
		
		aAddDoctor = new JButton("Add a Doctor");
		aAddDoctor.setPreferredSize(new Dimension(200,60));
		add(aAddDoctor);
		
		aAddStaff = new JButton("Add a Staff Member");
		aAddStaff.setPreferredSize(new Dimension(200,60));
		add(aAddStaff);
		
		aMakeReferral = new JButton("Add a Staff Member");
		aMakeReferral.setPreferredSize(new Dimension(200,60));
		add(aMakeReferral);
		
		//Adding Listeners onto buttons
		AdminHandler1 ahandler1 = new AdminHandler1();
		aMakeAppointment.addActionListener(ahandler1);
		
		AdminHandler2 ahandler2 = new AdminHandler2();
		aViewDoctorSchedule.addActionListener(ahandler2);
		
		AdminHandler3 ahandler3 = new AdminHandler3();
		aViewPatientReferral.addActionListener(ahandler3);
		
		AdminHandler4 ahandler4 = new AdminHandler4();
		aViewPatientHistory.addActionListener(ahandler4);
		
		AdminHandler5 ahandler5 = new AdminHandler5();
		aScheduleDoctors.addActionListener(ahandler5);
		
		AdminHandler6 ahandler6 = new AdminHandler6();
		aRemoveUser.addActionListener(ahandler6);
		
		AdminHandler7 ahandler7 = new AdminHandler7();
		aAddDoctor.addActionListener(ahandler7);
		
		AdminHandler8 ahandler8 = new AdminHandler8();
		aAddStaff.addActionListener(ahandler8);
		
		AdminHandler9 ahandler9 = new AdminHandler9();
		aAddStaff.addActionListener(ahandler9);
	}
	
	private class AdminHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aMakeAppointment)
			{
				MakeAppointment makeAppointment = new MakeAppointment();
				makeAppointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeAppointment.setSize(600, 400);
				makeAppointment.setVisible(true);
			}
		}
	}
	
	private class AdminHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aViewDoctorSchedule)
			{
				DoctorSchedules doctorSchedules = new DoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}
	
	private class AdminHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aViewPatientReferral)
			{
				PatientReferrals patientReferrals = new PatientReferrals();
				patientReferrals.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientReferrals.setSize(600, 400);
				patientReferrals.setVisible(true);
			}
		}
	}
	
	private class AdminHandler4 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aViewPatientHistory)
			{
				PatientHistory patientHistory = new PatientHistory();
				patientHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientHistory.setSize(600, 400);
				patientHistory.setVisible(true);
			}
		}
	}
	
	private class AdminHandler5 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aScheduleDoctors)
			{
				ScheduleTimetable scheduleTimetable = new ScheduleTimetable();
				scheduleTimetable.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				scheduleTimetable.setSize(600, 400);
				scheduleTimetable.setVisible(true);
			}
		}
	}
	
	private class AdminHandler6 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aRemoveUser)
			{
				RemoveUser removeuser = new RemoveUser();
				removeuser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				removeuser.setSize(600, 400);
				removeuser.setVisible(true);
			}
		}
	}
	
	private class AdminHandler7 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aAddDoctor)
			{
				AddDoctor adddoctor = new AddDoctor();
				adddoctor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				adddoctor.setSize(600, 800);
				adddoctor.setVisible(true);
			}
		}
	}
	
	private class AdminHandler8 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aAddStaff)
			{
				AddStaff addstaff = new AddStaff();
				addstaff.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				addstaff.setSize(600, 800);
				addstaff.setVisible(true);
			}
		}
	}
	
	private class AdminHandler9 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == aMakeReferral)
			{
				MakeReferral makeReferral = new MakeReferral();
				makeReferral.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeReferral.setSize(600, 400);
				makeReferral.setVisible(true);
			}
		}
	}
}


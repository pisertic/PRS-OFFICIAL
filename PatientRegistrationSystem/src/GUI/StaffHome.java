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

public class StaffHome extends JFrame
{
	private JPanel sHomeTopPanel;
	private JLabel sHomeTopLabel;
	private JLabel sLoggedin;
	private JButton sMakeAppointment;
	private JButton sViewDoctorSchedule;
	private JButton sViewPatientReferral;
	private JButton sViewPatientHistory;
	private JButton sScheduleDoctors;
	private JButton sMakeReferral;
	
	
	public StaffHome()
	{
		super("Staff Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		sHomeTopPanel = new JPanel();
		sHomeTopPanel.setBackground(Color.blue);
		sHomeTopPanel.setPreferredSize(new Dimension(500,30));
		add(sHomeTopPanel);
		
		sHomeTopLabel = new JLabel();
		sHomeTopLabel.setText("ESOF3050 Hospital PRS System: Staff Home");
		sHomeTopLabel.setForeground(Color.white);
		sHomeTopPanel.add(sHomeTopLabel);
		
		sLoggedin = new JLabel();
		sLoggedin.setText("Logged in as Hospital Staff");
		sLoggedin.setForeground(Color.blue);
		add(sLoggedin);
		
		sMakeAppointment = new JButton("Make Appointment");
		sMakeAppointment.setPreferredSize(new Dimension(200,60));
		add(sMakeAppointment);
		
		sViewDoctorSchedule = new JButton("View Doctor Schedules");
		sViewDoctorSchedule.setPreferredSize(new Dimension(200,60));
		add(sViewDoctorSchedule);
		
		sViewPatientReferral = new JButton("View Patient Referrals");
		sViewPatientReferral.setPreferredSize(new Dimension(200,60));
		add(sViewPatientReferral);
		
		sViewPatientHistory = new JButton("View Patient History");
		sViewPatientHistory.setPreferredSize(new Dimension(200,60));
		add(sViewPatientHistory);
		
		sScheduleDoctors = new JButton("Schedule Doctor Timetables");
		sScheduleDoctors.setPreferredSize(new Dimension(200,60));
		add(sScheduleDoctors);
		
		sMakeReferral = new JButton("Make Referral");
		sMakeReferral.setPreferredSize(new Dimension(200,60));
		add(sMakeReferral);
		
		//Adding Listeners onto buttons
		StaffHandler1 shandler1 = new StaffHandler1();
		sMakeAppointment.addActionListener(shandler1);
		
		StaffHandler2 shandler2 = new StaffHandler2();
		sViewDoctorSchedule.addActionListener(shandler2);
		
		StaffHandler3 shandler3 = new StaffHandler3();
		sViewPatientReferral.addActionListener(shandler3);
		
		StaffHandler4 shandler4 = new StaffHandler4();
		sViewPatientHistory.addActionListener(shandler4);
		
		StaffHandler5 shandler5 = new StaffHandler5();
		sScheduleDoctors.addActionListener(shandler5);
		
		StaffHandler6 shandler6 = new StaffHandler6();
		sScheduleDoctors.addActionListener(shandler6);
	}
	
	private class StaffHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == sMakeAppointment)
			{
				MakeAppointment makeAppointment = new MakeAppointment();
				makeAppointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeAppointment.setSize(600, 400);
				makeAppointment.setVisible(true);
			}
		}
	}
	
	//Listeners for each button
	private class StaffHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == sViewDoctorSchedule)
			{
				DoctorSchedules doctorSchedules = new DoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}
	
	private class StaffHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == sViewPatientReferral)
			{
				PatientReferrals patientReferrals = new PatientReferrals();
				patientReferrals.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientReferrals.setSize(600, 400);
				patientReferrals.setVisible(true);
			}
		}
	}
	
	private class StaffHandler4 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == sViewPatientHistory)
			{
				PatientHistory patientHistory = new PatientHistory();
				patientHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientHistory.setSize(600, 400);
				patientHistory.setVisible(true);
			}
		}
	}
	
	private class StaffHandler5 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == sScheduleDoctors)
			{
				ScheduleTimetable scheduleTimetable = new ScheduleTimetable();
				scheduleTimetable.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				scheduleTimetable.setSize(600, 400);
				scheduleTimetable.setVisible(true);
			}
		}
	}
	
	private class StaffHandler6 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == sMakeReferral)
			{
				MakeReferral makeReferral = new MakeReferral();
				makeReferral.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeReferral.setSize(600, 400);
				makeReferral.setVisible(true);
			}
		}
	}
}

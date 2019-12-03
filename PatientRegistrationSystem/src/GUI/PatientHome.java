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

public class PatientHome extends JFrame 
{
	private JPanel pHomeTopPanel;
	private JLabel pHomeTopLabel;
	private JLabel pLoggedin;
	private JButton pMakeAppointment;
	private JButton pViewDoctorSchedule;
	private JButton pViewPatientReferral;
	private JButton pViewPatientHistory;
	
	public PatientHome()
	{
		super("Patient Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		pHomeTopPanel = new JPanel();
		pHomeTopPanel.setBackground(Color.blue);
		pHomeTopPanel.setPreferredSize(new Dimension(500,30));
		add(pHomeTopPanel);
		
		pHomeTopLabel = new JLabel();
		pHomeTopLabel.setText("ESOF3050 Hospital PRS System: Patient Home");
		pHomeTopLabel.setForeground(Color.white);
		pHomeTopPanel.add(pHomeTopLabel);
		
		pLoggedin = new JLabel();
		pLoggedin.setText("Logged in as Patient");
		pLoggedin.setForeground(Color.blue);
		add(pLoggedin);
		
		pMakeAppointment = new JButton("Make Appointment");
		pMakeAppointment.setPreferredSize(new Dimension(200,60));
		add(pMakeAppointment);
		
		pViewDoctorSchedule = new JButton("View Doctor Schedules");
		pViewDoctorSchedule.setPreferredSize(new Dimension(200,60));
		add(pViewDoctorSchedule);
		
		pViewPatientReferral = new JButton("View Patient Referrals");
		pViewPatientReferral.setPreferredSize(new Dimension(200,60));
		add(pViewPatientReferral);
		
		pViewPatientHistory = new JButton("View Patient Records");
		pViewPatientHistory.setPreferredSize(new Dimension(200,60));
		add(pViewPatientHistory);
		
		//Adding Listeners onto buttons
		PatientHandler1 phandler1 = new PatientHandler1();
		pMakeAppointment.addActionListener(phandler1);
		
		PatientHandler2 phandler2 = new PatientHandler2();
		pViewDoctorSchedule.addActionListener(phandler2);
		
		PatientHandler3 phandler3 = new PatientHandler3();
		pViewPatientReferral.addActionListener(phandler3);
		
		PatientHandler4 phandler4 = new PatientHandler4();
		pViewPatientHistory.addActionListener(phandler4);
	}
	
	//Listeners for each button
	private class PatientHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == pMakeAppointment)
			{
				MakeAppointment makeAppointment = new MakeAppointment();
				makeAppointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeAppointment.setSize(600, 400);
				makeAppointment.setVisible(true);
			}
		}
	}
	
	private class PatientHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == pViewDoctorSchedule)
			{
				ViewDoctorSchedules doctorSchedules = new ViewDoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}
	
	private class PatientHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == pViewPatientReferral)
			{
				PatientReferrals patientReferrals = new PatientReferrals();
				patientReferrals.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientReferrals.setSize(600, 400);
				patientReferrals.setVisible(true);
			}
		}
	}
	
	private class PatientHandler4 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == pViewPatientHistory)
			{
				ViewRecords patientHistory = new ViewRecords();
				patientHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientHistory.setSize(600, 400);
				patientHistory.setVisible(true);
			}
		}
	}
}


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

public class DoctorHome extends JFrame
{
	private JPanel dHomeTopPanel;
	private JLabel dHomeTopLabel;
	private JLabel dLoggedin;
	private JButton dMakeAppointment;
	private JButton dViewDoctorSchedule;
	private JButton dViewPatientReferral;
	private JButton dViewPatientHistory;
	private JButton dMakeDiagnosis;
	private JButton dWritePerscription;
	private JButton dMakeReferral;
	
	
	public DoctorHome()
	{
		super("Doctor Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		dHomeTopPanel = new JPanel();
		dHomeTopPanel.setBackground(Color.blue);
		dHomeTopPanel.setPreferredSize(new Dimension(500,30));
		add(dHomeTopPanel);
		
		dHomeTopLabel = new JLabel();
		dHomeTopLabel.setText("ESOF3050 Hospital PRS System: Doctor Home");
		dHomeTopLabel.setForeground(Color.white);
		dHomeTopPanel.add(dHomeTopLabel);
		
		dLoggedin = new JLabel();
		dLoggedin.setText("Logged in as Doctor");
		dLoggedin.setForeground(Color.blue);
		add(dLoggedin);
		
		dMakeAppointment = new JButton("Make Appointment");
		dMakeAppointment.setPreferredSize(new Dimension(200,60));
		add(dMakeAppointment);
		
		dViewDoctorSchedule = new JButton("View Doctor Schedules");
		dViewDoctorSchedule.setPreferredSize(new Dimension(200,60));
		add(dViewDoctorSchedule);
		
		dViewPatientReferral = new JButton("View Patient Referrals");
		dViewPatientReferral.setPreferredSize(new Dimension(200,60));
		add(dViewPatientReferral);
		
		dViewPatientHistory = new JButton("View Patient History");
		dViewPatientHistory.setPreferredSize(new Dimension(200,60));
		add(dViewPatientHistory);
		
		dMakeDiagnosis = new JButton("Make Diagnosis");
		dMakeDiagnosis.setPreferredSize(new Dimension(200,60));
		add(dMakeDiagnosis);
		
		dWritePerscription = new JButton("Write Perscription");
		dWritePerscription.setPreferredSize(new Dimension(200,60));
		add(dWritePerscription);
		
		dMakeReferral = new JButton("Make Referral");
		dMakeReferral.setPreferredSize(new Dimension(200,60));
		add(dMakeReferral);
		
		//Adding Listeners onto buttons
		DoctorHandler1 dhandler1 = new DoctorHandler1();
		dMakeAppointment.addActionListener(dhandler1);
		
		DoctorHandler2 dhandler2 = new DoctorHandler2();
		dViewDoctorSchedule.addActionListener(dhandler2);
		
		DoctorHandler3 dhandler3 = new DoctorHandler3();
		dViewPatientReferral.addActionListener(dhandler3);
		
		DoctorHandler4 dhandler4 = new DoctorHandler4();
		dViewPatientHistory.addActionListener(dhandler4);
		
		DoctorHandler5 dhandler5 = new DoctorHandler5();
		dMakeDiagnosis.addActionListener(dhandler5);
		
		DoctorHandler6 dhandler6 = new DoctorHandler6();
		dMakeReferral.addActionListener(dhandler6);
		
		DoctorHandler7 dhandler7 = new DoctorHandler7();
		dWritePerscription.addActionListener(dhandler7);
	}
	
	//Listeners for each button
	private class DoctorHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dMakeAppointment)
			{
				MakeAppointment makeAppointment = new MakeAppointment();
				makeAppointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeAppointment.setSize(600, 400);
				makeAppointment.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dViewDoctorSchedule)
			{
				DoctorSchedules doctorSchedules = new DoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dViewPatientReferral)
			{
				PatientReferrals patientReferrals = new PatientReferrals();
				patientReferrals.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientReferrals.setSize(600, 400);
				patientReferrals.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler4 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dViewPatientHistory)
			{
				PatientHistory patientHistory = new PatientHistory();
				patientHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientHistory.setSize(600, 400);
				patientHistory.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler5 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dMakeDiagnosis)
			{
				MakeDiagnosis makeDiagnosis = new MakeDiagnosis();
				makeDiagnosis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeDiagnosis.setSize(600, 400);
				makeDiagnosis.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler6 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dMakeReferral)
			{
				MakeReferral makeReferral = new MakeReferral();
				makeReferral.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeReferral.setSize(600, 400);
				makeReferral.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler7 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dWritePerscription)
			{
				WritePerscription writePerscription = new WritePerscription();
				writePerscription.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				writePerscription.setSize(600, 400);
				writePerscription.setVisible(true);
			}
		}
	}		
}

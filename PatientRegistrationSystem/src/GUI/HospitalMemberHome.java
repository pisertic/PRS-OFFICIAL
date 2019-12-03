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
import prsPackage.HospitalMember;

public class HospitalMemberHome extends JFrame 
{
	private JPanel hmHomeTopPanel;
	private JLabel hmHomeTopLabel;
	private JLabel hmLoggedin;
	private JButton hmMakeAppointment;
	private JButton hmViewDoctorSchedule;
	private HospitalMember user;
	private MyClient client;
	
	public HospitalMemberHome(HospitalMember user, MyClient client)
	{
		super("Hospital Member Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		hmHomeTopPanel = new JPanel();
		hmHomeTopPanel.setBackground(Color.blue);
		hmHomeTopPanel.setPreferredSize(new Dimension(500,30));
		add(hmHomeTopPanel);
		
		hmHomeTopLabel = new JLabel();
		hmHomeTopLabel.setText("ESOF3050 Hospital PRS System: Hospital Member Home");
		hmHomeTopLabel.setForeground(Color.white);
		hmHomeTopPanel.add(hmHomeTopLabel);
		
		hmLoggedin = new JLabel();
		hmLoggedin.setText("Logged in as Hospital Memebr");
		hmLoggedin.setForeground(Color.blue);
		add(hmLoggedin);
		
		hmMakeAppointment = new JButton("Make Appointment");
		hmMakeAppointment.setPreferredSize(new Dimension(200,60));
		add(hmMakeAppointment);
		
		hmViewDoctorSchedule = new JButton("View Doctor Schedules");
		hmViewDoctorSchedule.setPreferredSize(new Dimension(200,60));
		add(hmViewDoctorSchedule);
		
		//Adding Listeners onto buttons
		MemberHandler1 hmhandler1 = new MemberHandler1();
		hmMakeAppointment.addActionListener(hmhandler1);
		
		MemberHandler2 hmhandler2 = new MemberHandler2();
		hmViewDoctorSchedule.addActionListener(hmhandler2);
		
		//make user and client
		this.user = user;
		this.client = client;
	}
	
	//Listeners for each button
	private class MemberHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == hmMakeAppointment)
			{
				PatientSignup patientsignupFrame = new PatientSignup(user, client);
				patientsignupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientsignupFrame.setSize(600, 400);
				patientsignupFrame.setVisible(true);
				dispose();
			}
		}
	}

	
	private class MemberHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == hmViewDoctorSchedule)
			{
				ViewDoctorSchedules doctorSchedules = new ViewDoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}
}
package GUI;

import java.awt.BorderLayout;
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

<<<<<<< HEAD
import OCSF.MyClient;
import prsPackage.Doctor;
import prsPackage.Staff;
=======
import GUI.AddDoctor.AddDoctorHandler;
>>>>>>> branch 'master' of https://github.com/pisertic/PRS-OFFICIAL.git

public class MakeReferral extends JFrame
{
	private JPanel mrefLeftPanel;
	private JPanel mrefRightPanel;
	private JPanel mrefTopPanel;
	private JLabel mrefPanelLabel;
	private JLabel mrefDoctorFNameLabel;
	private JLabel mrefDoctorLNameLabel;
	private JLabel mrefPatientFNameLabel;
	private JLabel mrefPatientLNameLabel;
	private JTextField mrefDoctorFTextField;
	private JTextField mrefDoctorLTextField;
	private JTextField mrefPatientFTextField;
	private JTextField mrefPatientLTextField;
	private JButton mrefReferButton;
	
	public MakeReferral(Staff user, Doctor doc, MyClient client)
	{
		super("Make Referral");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		mrefTopPanel = new JPanel();
		mrefTopPanel.setBackground(Color.blue);
		mrefTopPanel.setPreferredSize(new Dimension(500,30));
		add(mrefTopPanel, BorderLayout.NORTH);
		
		mrefPanelLabel = new JLabel();
		mrefPanelLabel.setText("ESOF3050 Hospital PRS System: Make a Referral");
		mrefPanelLabel.setForeground(Color.white);
		mrefTopPanel.add(mrefPanelLabel);		
		
		mrefLeftPanel = new JPanel();
		mrefLeftPanel.setLayout(new FlowLayout());
		mrefLeftPanel.setPreferredSize(new Dimension(300,400));
		mrefLeftPanel.setBackground(Color.white);
		add(mrefLeftPanel, BorderLayout.WEST);
		
		mrefRightPanel = new JPanel();
		mrefRightPanel.setLayout(new FlowLayout());
		mrefRightPanel.setPreferredSize(new Dimension(300,400));
		mrefRightPanel.setBackground(Color.white);
		add(mrefRightPanel, BorderLayout.EAST);
		
		mrefDoctorFNameLabel = new JLabel();
		mrefDoctorFNameLabel.setText("Enter doctor's first name:");
		mrefLeftPanel.add(mrefDoctorFNameLabel);
		
		mrefDoctorFTextField = new JTextField();
		mrefDoctorFTextField.setPreferredSize(new Dimension(100,20));
		mrefLeftPanel.add(mrefDoctorFTextField);
		
		mrefDoctorLNameLabel = new JLabel();
		mrefDoctorLNameLabel.setText("Enter doctor's last name:");
		mrefLeftPanel.add(mrefDoctorLNameLabel);
		
		mrefDoctorLTextField = new JTextField();
		mrefDoctorLTextField.setPreferredSize(new Dimension(100,20));
		mrefLeftPanel.add(mrefDoctorLTextField);
		
		mrefPatientFNameLabel = new JLabel();
		mrefPatientFNameLabel.setText("Enter patient's first name:");
		mrefLeftPanel.add(mrefPatientFNameLabel);
		
		mrefPatientFTextField = new JTextField();
		mrefPatientFTextField.setPreferredSize(new Dimension(100,20));
		mrefLeftPanel.add(mrefPatientFTextField);
		
		mrefPatientLNameLabel = new JLabel();
		mrefPatientLNameLabel.setText("Enter patient's last name:");
		mrefLeftPanel.add(mrefPatientLNameLabel);
		
		mrefPatientLTextField = new JTextField();
		mrefPatientLTextField.setPreferredSize(new Dimension(100,20));
		mrefLeftPanel.add(mrefPatientLTextField);
		
		mrefReferButton = new JButton("REFER PATIENT");
		mrefLeftPanel.add(mrefReferButton);
		
		MakeReferralHandler mfhandler = new MakeReferralHandler();
		mrefReferButton.addActionListener(mfhandler);
	}
	
	private class MakeReferralHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == mrefReferButton)
			{
				
			}
		}
	}
}
	


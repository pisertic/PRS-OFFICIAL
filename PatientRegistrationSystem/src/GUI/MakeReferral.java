package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import OCSF.MyClient;
import OCSF.Objectinator;
import prsPackage.Doctor;
import prsPackage.HospitalMember;
import prsPackage.Patient;
import prsPackage.Staff;
import prsPackage.useCases;



public class MakeReferral extends JFrame {
	private JPanel mrefLeftPanel;
	private JPanel mrefRightPanel;
	private JPanel mrefTopPanel;
	private JLabel mrefPanelLabel;
	private JLabel mrefDoctorFNameLabel;
	private JLabel mrefPatientFNameLabel;
	private JTextField mrefDoctorFTextField;
	private JTextField mrefPatientFTextField;
	private JButton mrefReferButton;
	private Staff user;
	private Doctor doc;
	private MyClient client;


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
		mrefDoctorFNameLabel.setText("Enter doctor's user name:");
		mrefLeftPanel.add(mrefDoctorFNameLabel);
		
		mrefDoctorFTextField = new JTextField();
		mrefDoctorFTextField.setPreferredSize(new Dimension(100,20));
		mrefLeftPanel.add(mrefDoctorFTextField);
		
		mrefPatientFNameLabel = new JLabel();
		mrefPatientFNameLabel.setText("Enter patient's user name:");
		mrefLeftPanel.add(mrefPatientFNameLabel);
		
		mrefPatientFTextField = new JTextField();
		mrefPatientFTextField.setPreferredSize(new Dimension(100,20));
		mrefLeftPanel.add(mrefPatientFTextField);
		
		mrefReferButton = new JButton("REFER PATIENT");
		mrefLeftPanel.add(mrefReferButton);
		

		RefHandler refhandler = new RefHandler();
		mrefReferButton.addActionListener(refhandler);
		
		this.user = user;
		this.doc = doc;
		this.client = client;
	}	
	
	private class RefHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == mrefReferButton)
			{
				if(mrefDoctorFTextField.getText() != null && mrefPatientFTextField.getText() != null) {
					//grab patient being referred
					try {
						client.sendToServer(Objectinator.createDataMsg(3));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ArrayList<Patient> pList = (ArrayList) client.patData;
					Patient pat = null;
					for (Patient p : pList) {
						if (p.getLoginUser().equals(mrefPatientFTextField.getText())) {
							pat = p;
						}
					}
					//send to createRef method	
					useCases.createRef(user, mrefDoctorFTextField.getText(), pat, client);					
				}
			}
		}
		
	}
	
	
}

package GUI;

import java.awt.BorderLayout;
import OCSF.MyClient;
import OCSF.Objectinator;
import prsPackage.Doctor;
import prsPackage.Patient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MakeAppointment extends JFrame 
{
	private JPanel appLeftPanel;
	private JPanel appRightPanel;
	private JPanel appTopPanel;
	private JPanel datesAreaPanel;
	private JScrollPane dateAreaScroll;
	private JLabel appPanelLabel;
	private JLabel appDoctorUserLabel;
	private JLabel appPatientUserLabel;
	private JLabel appDateLabel;
	private JLabel appReasonLabel;
	private JTextField appDoctorUserField;
	private JTextField appPatientUserField;
	private JTextField appDateTextField;
	private JTextField appReasonTextField;
	private JTextArea appDatesWorkingArea;
	private JButton appDoctorEnterButton;
	private JButton appCreateButton;
	private MyClient client;
	private SimpleDateFormat formatter;

	
	public MakeAppointment(MyClient client)
	{
		super("Make Appointment");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		formatter = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		appTopPanel = new JPanel();
		appTopPanel.setBackground(Color.blue);
		appTopPanel.setPreferredSize(new Dimension(500,30));
		getContentPane().add(appTopPanel, BorderLayout.NORTH);
		
		appPanelLabel = new JLabel();
		appPanelLabel.setText("ESOF3050 Hospital PRS System: Make an Appointment");
		appPanelLabel.setForeground(Color.white);
		appTopPanel.add(appPanelLabel);		
		
		appLeftPanel = new JPanel();
		appLeftPanel.setLayout(new FlowLayout());
		appLeftPanel.setPreferredSize(new Dimension(300,400));
		appLeftPanel.setBackground(Color.white);
		getContentPane().add(appLeftPanel, BorderLayout.CENTER);
		
		appRightPanel = new JPanel();
		appRightPanel.setLayout(new FlowLayout());
		appRightPanel.setPreferredSize(new Dimension(300,400));
		appRightPanel.setBackground(Color.white);
		getContentPane().add(appRightPanel, BorderLayout.EAST);
		
		appDoctorUserLabel = new JLabel();
		appDoctorUserLabel.setText("Enter doctor's user name to see schedule:");
		appLeftPanel.add(appDoctorUserLabel);
		
		appDoctorUserField = new JTextField();
		appDoctorUserField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appDoctorUserField);
		
		appDoctorEnterButton = new JButton("ENTER");
		appLeftPanel.add(appDoctorEnterButton);
		
		appPatientUserLabel = new JLabel();
		appPatientUserLabel.setText("Enter patient's username:");
		appLeftPanel.add(appPatientUserLabel);
		
		appPatientUserField = new JTextField();
		appPatientUserField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appPatientUserField);
		
		appDateLabel = new JLabel();
		appDateLabel.setText("Enter date of appointment:");
		appLeftPanel.add(appDateLabel);
		
		appDateTextField = new JTextField();
		appDateTextField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appDateTextField);
		
		appReasonLabel = new JLabel();
		appReasonLabel.setText("Enter reason for appointment:");
		appLeftPanel.add(appReasonLabel);
	
		appReasonTextField = new JTextField();
		appReasonTextField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appReasonTextField);
		
		appCreateButton = new JButton("CREATE APPOINTMENT");
		appLeftPanel.add(appCreateButton);
		
//		appDatesWorkingArea = new JTextArea();
//		appDatesWorkingArea.setPreferredSize(new Dimension(200,300));
//		appRightPanel.add(appDatesWorkingArea);
		
//		datesAreaPanel = new JPanel();
//		datesAreaPanel.setPreferredSize(new Dimension(200,300));
		
//		------------------------------------------------------------
		datesAreaPanel = new JPanel();
		datesAreaPanel.setPreferredSize(new Dimension(200,300));
		datesAreaPanel.setBorder(new TitledBorder(new EtchedBorder()));
		datesAreaPanel.setBackground(Color.white);
		appDatesWorkingArea = new JTextArea("Check Availability\n");
		appDatesWorkingArea.setPreferredSize(new Dimension(180,280));
		appDatesWorkingArea.setEditable(true);
		dateAreaScroll = new JScrollPane(appDatesWorkingArea);
		dateAreaScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		datesAreaPanel.add(dateAreaScroll);
		appRightPanel.add(datesAreaPanel);
		
		AppHandler1 ahandler1 = new AppHandler1();
		appDoctorEnterButton.addActionListener(ahandler1);
		
		AppHandler2 ahandler2 = new AppHandler2();
		appCreateButton.addActionListener(ahandler2);
		
		this.client = client;
	}
	
	private class AppHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == appDoctorEnterButton)
			{
				//grab list from server
				try {
					client.sendToServer(Objectinator.createDataMsg(1));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				ArrayList<Doctor> doctorList = (ArrayList<Doctor>)client.docData;
				Doctor doctor = null;
				//going through the received ArrayList to find a match
				for(int counter = 0; counter < doctorList.size(); counter++) 
				{
					if(appDoctorUserField.getText() == doctorList.get(counter).getLoginUser()) 
					{
						doctor = doctorList.get(counter);
					}
				}
				for(int counter = 0; counter < doctor.getDoctorSchedule().size(); counter++) {
					appDatesWorkingArea.append("Appointment" + counter + 1 + doctor.getDoctorSchedule().get(counter).getDetails());
				}			
				
			}
		}
	}
	
	private class AppHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Patient patient;
			if (event.getSource() == appCreateButton)
			{
				try {
					client.sendToServer(Objectinator.createDataMsg(3));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int counter = 0; counter < client.patData.size(); counter++) {
				if(appPatientUserField.getText().equalsIgnoreCase(client.patData.get(counter).getLoginUser())) {
					patient 
				}
			}
		}
	}
}


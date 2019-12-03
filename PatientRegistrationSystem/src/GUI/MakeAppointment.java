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

public class MakeAppointment extends JFrame 
{
	private JPanel appLeftPanel;
	private JPanel appRightPanel;
	private JPanel appTopPanel;
	private JLabel appPanelLabel;
	private JLabel appDoctorUserLabel;
	private JLabel appPatientUserLabel;
	private JLabel appDateLabel;
	private JLabel appReasonLabel;
	private JLabel appDatesWorking;
	private JTextField appDoctorUserField;
	private JTextField appPatientUserField;
	private JTextField appDateTextField;
	private JTextField appReasonTextField;
	private JTextField appDatesWorkingField;
	private JButton appDoctorEnterButton;
	private JButton appCreateButton;
	
	public MakeAppointment()
	{
		super("Make Appointment");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		appTopPanel = new JPanel();
		appTopPanel.setBackground(Color.blue);
		appTopPanel.setPreferredSize(new Dimension(500,30));
		add(appTopPanel, BorderLayout.NORTH);
		
		appPanelLabel = new JLabel();
		appPanelLabel.setText("ESOF3050 Hospital PRS System: Make an Appointment");
		appPanelLabel.setForeground(Color.white);
		appTopPanel.add(appPanelLabel);		
		
		appLeftPanel = new JPanel();
		appLeftPanel.setLayout(new FlowLayout());
		appLeftPanel.setPreferredSize(new Dimension(300,400));
		appLeftPanel.setBackground(Color.white);
		add(appLeftPanel, BorderLayout.WEST);
		
		appRightPanel = new JPanel();
		appRightPanel.setLayout(new FlowLayout());
		appRightPanel.setPreferredSize(new Dimension(300,400));
		appRightPanel.setBackground(Color.white);
		add(appRightPanel, BorderLayout.EAST);
		
		appDoctorUserLabel = new JLabel();
		appDoctorUserLabel.setText("Enter doctor's user name to see schedule:");
		appLeftPanel.add(appDoctorUserLabel);
		
		appDoctorUserField = new JTextField();
		appDoctorUserField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appDoctorUserField);
		
		appDoctorEnterButton = new JButton("ENTER");
		appLeftPanel.add(appDoctorEnterButton);
		
		appPatientUserLabel = new JLabel();
		appPatientUserLabel.setText("Enter patient's first name:");
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
		
		appDatesWorking = new JLabel();
		appDatesWorking.setText("Dates Working:");
		appRightPanel.add(appDatesWorking);
		
		appDatesWorkingField = new JTextField();
		appDatesWorkingField.setPreferredSize(new Dimension(200,300));
		appRightPanel.add(appDatesWorkingField);
		
		AppHandler1 ahandler1 = new AppHandler1();
		appDoctorEnterButton.addActionListener(ahandler1);
		
		AppHandler2 ahandler2 = new AppHandler2();
		appCreateButton.addActionListener(ahandler2);
	}
	
	private class AppHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == appDoctorEnterButton)
			{
				
			}
		}
	}
	
	private class AppHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == appCreateButton)
			{
				
			}
		}
	}
}


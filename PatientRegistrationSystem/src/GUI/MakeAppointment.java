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
	private JLabel appDoctorFNameLabel;
	private JLabel appDoctorLNameLabel;
	private JLabel appPatientFNameLabel;
	private JLabel appPatientLNameLabel;
	private JLabel appHealthCardLabel;
	private JLabel appDateLabel;
	private JLabel appReasonLabel;
	private JLabel appDatesWorking;
	private JTextField appDoctorFTextField;
	private JTextField appDoctorLTextField;
	private JTextField appPatientFTextField;
	private JTextField appPatientLTextField;
	private JTextField appHealthCardField;
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
		
		appDoctorFNameLabel = new JLabel();
		appDoctorFNameLabel.setText("Enter doctor's first name:");
		appLeftPanel.add(appDoctorFNameLabel);
		
		appDoctorFTextField = new JTextField();
		appDoctorFTextField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appDoctorFTextField);
		
		appDoctorLNameLabel = new JLabel();
		appDoctorLNameLabel.setText("Enter doctor's last name:");
		appLeftPanel.add(appDoctorLNameLabel);
		
		appDoctorLTextField = new JTextField();
		appDoctorLTextField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appDoctorLTextField);
		
		appDoctorEnterButton = new JButton("ENTER");
		appLeftPanel.add(appDoctorEnterButton);
		
		appPatientFNameLabel = new JLabel();
		appPatientFNameLabel.setText("Enter patient's first name:");
		appLeftPanel.add(appPatientFNameLabel);
		
		appPatientFTextField = new JTextField();
		appPatientFTextField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appPatientFTextField);
		
		appPatientLNameLabel = new JLabel();
		appPatientLNameLabel.setText("Enter patient's last name:");
		appLeftPanel.add(appPatientLNameLabel);
		
		appPatientLTextField = new JTextField();
		appPatientLTextField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appPatientLTextField);
		
		appHealthCardLabel = new JLabel();
		appHealthCardLabel.setText("Enter Health Card number:");
		appLeftPanel.add(appHealthCardLabel);
		
		appHealthCardField = new JTextField();
		appHealthCardField.setPreferredSize(new Dimension(100,20));
		appLeftPanel.add(appHealthCardField);
		
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
		appDatesWorkingField.setPreferredSize(new Dimension(100,300));
		appRightPanel.add(appDatesWorkingField);
	}
}


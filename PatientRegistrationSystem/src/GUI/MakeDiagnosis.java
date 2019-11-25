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

public class MakeDiagnosis extends JFrame 
{
	private JPanel diaLeftPanel;
	private JPanel diaRightPanel;
	private JPanel diaTopPanel;
	private JLabel diaPanelLabel;
	private JLabel diaPatientFNameLabel;
	private JLabel diaPatientLNameLabel;
	private JLabel diaPatientRecordsLabel;
	private JLabel diaAddDateLabel;
	private JLabel diaDiagnosisNoteLabel;
	private JTextField diaPatientFTextField;
	private JTextField diaDoctorLTextField;
	private JTextField diaPatientRecordsField;
	private JTextField diaAddDateTextField;
	private JTextField diaDiagnosisNoteField;
	private JButton diaPatientEnterButton;
	private JButton diaDiagnoseButton;
	
	public MakeDiagnosis()
	{
		super("Make a Diagnosis");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		diaTopPanel = new JPanel();
		diaTopPanel.setBackground(Color.blue);
		diaTopPanel.setPreferredSize(new Dimension(500,30));
		add(diaTopPanel, BorderLayout.NORTH);
		
		diaPanelLabel = new JLabel();
		diaPanelLabel.setText("ESOF3050 Hospital PRS System: Make a Diagnosis");
		diaPanelLabel.setForeground(Color.white);
		diaTopPanel.add(diaPanelLabel);		
		
		diaLeftPanel = new JPanel();
		diaLeftPanel.setLayout(new FlowLayout());
		diaLeftPanel.setPreferredSize(new Dimension(300,400));
		diaLeftPanel.setBackground(Color.white);
		add(diaLeftPanel, BorderLayout.WEST);
		
		diaRightPanel = new JPanel();
		diaRightPanel.setLayout(new FlowLayout());
		diaRightPanel.setPreferredSize(new Dimension(300,400));
		diaRightPanel.setBackground(Color.white);
		add(diaRightPanel, BorderLayout.EAST);
		
		diaPatientFNameLabel = new JLabel();
		diaPatientFNameLabel.setText("Enter patient's first name:");
		diaLeftPanel.add(diaPatientFNameLabel);
		
		diaPatientFTextField = new JTextField();
		diaPatientFTextField.setPreferredSize(new Dimension(100,20));
		diaLeftPanel.add(diaPatientFTextField);
		
		diaPatientLNameLabel = new JLabel();
		diaPatientLNameLabel.setText("Enter patient's last name:");
		diaLeftPanel.add(diaPatientLNameLabel);
		
		diaDoctorLTextField = new JTextField();
		diaDoctorLTextField.setPreferredSize(new Dimension(100,20));
		diaLeftPanel.add(diaDoctorLTextField);
		
		diaPatientEnterButton = new JButton("ENTER");
		diaLeftPanel.add(diaPatientEnterButton);
		
		diaAddDateLabel = new JLabel();
		diaAddDateLabel.setText("Enter Date to add:");
		diaLeftPanel.add(diaAddDateLabel);
		
		diaAddDateTextField = new JTextField();
		diaAddDateTextField.setPreferredSize(new Dimension(100,20));
		diaLeftPanel.add(diaAddDateTextField);
		
		diaDiagnosisNoteLabel = new JLabel();
		diaDiagnosisNoteLabel.setText("Diagnosis notes:");
		diaLeftPanel.add(diaDiagnosisNoteLabel);
		
		diaDiagnosisNoteField = new JTextField();
		diaDiagnosisNoteField.setPreferredSize(new Dimension(100,20));
		diaLeftPanel.add(diaDiagnosisNoteField);
		
		diaDiagnoseButton = new JButton("DIAGNOSE");
		diaLeftPanel.add(diaDiagnoseButton);
		
		diaPatientRecordsLabel = new JLabel();
		diaPatientRecordsLabel.setText("Patient Medical Records:");
		diaRightPanel.add(diaPatientRecordsLabel);
		
		diaPatientRecordsField = new JTextField();
		diaPatientRecordsField.setPreferredSize(new Dimension(100,300));
		diaRightPanel.add(diaPatientRecordsField);
	}
}
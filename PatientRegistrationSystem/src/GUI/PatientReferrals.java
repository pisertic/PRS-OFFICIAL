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

public class PatientReferrals extends JFrame 
{
	private JPanel prefLeftPanel;
	private JPanel prefRightPanel;
	private JPanel prefTopPanel;
	private JLabel prefPanelLabel;
	private JLabel prefPatientFNameLabel;
	private JLabel prefPatientLNameLabel;
	private JLabel prefReferrals;
	private JTextField prefPatientFTextField;
	private JTextField prefPatientLTextField;
	private JTextField prefReferralsField;
	private JButton prefPatientEnterButton;
	
	public PatientReferrals()
	{
		super("View Patient Referrals");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		prefTopPanel = new JPanel();
		prefTopPanel.setBackground(Color.blue);
		prefTopPanel.setPreferredSize(new Dimension(500,30));
		add(prefTopPanel, BorderLayout.NORTH);
		
		prefPanelLabel = new JLabel();
		prefPanelLabel.setText("ESOF3050 Hospital PRS System: View Patient Referrals");
		prefPanelLabel.setForeground(Color.white);
		prefTopPanel.add(prefPanelLabel);		
		
		prefLeftPanel = new JPanel();
		prefLeftPanel.setLayout(new FlowLayout());
		prefLeftPanel.setPreferredSize(new Dimension(300,400));
		prefLeftPanel.setBackground(Color.white);
		add(prefLeftPanel, BorderLayout.WEST);
		
		prefRightPanel = new JPanel();
		prefRightPanel.setLayout(new FlowLayout());
		prefRightPanel.setPreferredSize(new Dimension(300,400));
		prefRightPanel.setBackground(Color.white);
		add(prefRightPanel, BorderLayout.EAST);
		
		prefPatientFNameLabel = new JLabel();
		prefPatientFNameLabel.setText("Enter patient's first name:");
		prefLeftPanel.add(prefPatientFNameLabel);
		
		prefPatientFTextField = new JTextField();
		prefPatientFTextField.setPreferredSize(new Dimension(100,20));
		prefLeftPanel.add(prefPatientFTextField);
		
		prefPatientLNameLabel = new JLabel();
		prefPatientLNameLabel.setText("Enter patient's last name:");
		prefLeftPanel.add(prefPatientLNameLabel);
		
		prefPatientLTextField = new JTextField();
		prefPatientLTextField.setPreferredSize(new Dimension(100,20));
		prefLeftPanel.add(prefPatientLTextField);
		
		prefPatientEnterButton = new JButton("VIEW REFERRALS");
		prefLeftPanel.add(prefPatientEnterButton);
		
		prefReferrals = new JLabel();
		prefReferrals.setText("Referrals:");
		prefRightPanel.add(prefReferrals);
		
		prefReferralsField = new JTextField();
		prefReferralsField.setPreferredSize(new Dimension(100,300));
		prefRightPanel.add(prefReferralsField);
	}
}


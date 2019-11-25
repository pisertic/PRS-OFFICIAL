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

public class PatientHistory extends JFrame
{
	private JPanel phisLeftPanel;
	private JPanel phisRightPanel;
	private JPanel phisTopPanel;
	private JLabel phisPanelLabel;
	private JLabel phisPatientFNameLabel;
	private JLabel phisPatientLNameLabel;
	private JLabel phisReferrals;
	private JTextField phisPatientFTextField;
	private JTextField phisPatientLTextField;
	private JTextField phisReferralsField;
	private JButton phisPatientEnterButton;
	
	public PatientHistory()
	{
		super("View Patient History");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		phisTopPanel = new JPanel();
		phisTopPanel.setBackground(Color.blue);
		phisTopPanel.setPreferredSize(new Dimension(500,30));
		add(phisTopPanel, BorderLayout.NORTH);
		
		phisPanelLabel = new JLabel();
		phisPanelLabel.setText("ESOF3050 Hospital PRS System: View Patient History");
		phisPanelLabel.setForeground(Color.white);
		phisTopPanel.add(phisPanelLabel);		
		
		phisLeftPanel = new JPanel();
		phisLeftPanel.setLayout(new FlowLayout());
		phisLeftPanel.setPreferredSize(new Dimension(300,400));
		phisLeftPanel.setBackground(Color.white);
		add(phisLeftPanel, BorderLayout.WEST);
		
		phisRightPanel = new JPanel();
		phisRightPanel.setLayout(new FlowLayout());
		phisRightPanel.setPreferredSize(new Dimension(300,400));
		phisRightPanel.setBackground(Color.white);
		add(phisRightPanel, BorderLayout.EAST);
		
		phisPatientFNameLabel = new JLabel();
		phisPatientFNameLabel.setText("Enter patient's first name:");
		phisLeftPanel.add(phisPatientFNameLabel);
		
		phisPatientFTextField = new JTextField();
		phisPatientFTextField.setPreferredSize(new Dimension(100,20));
		phisLeftPanel.add(phisPatientFTextField);
		
		phisPatientLNameLabel = new JLabel();
		phisPatientLNameLabel.setText("Enter patient's last name:");
		phisLeftPanel.add(phisPatientLNameLabel);
		
		phisPatientLTextField = new JTextField();
		phisPatientLTextField.setPreferredSize(new Dimension(100,20));
		phisLeftPanel.add(phisPatientLTextField);
		
		phisPatientEnterButton = new JButton("VIEW HISTORY");
		phisLeftPanel.add(phisPatientEnterButton);
		
		phisReferrals = new JLabel();
		phisReferrals.setText("Appointment History:");
		phisRightPanel.add(phisReferrals);
		
		phisReferralsField = new JTextField();
		phisReferralsField.setPreferredSize(new Dimension(100,300));
		phisRightPanel.add(phisReferralsField);
	}
}

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

public class DoctorSchedules extends JFrame
{
	private JPanel schLeftPanel;
	private JPanel schRightPanel;
	private JPanel schTopPanel;
	private JLabel schPanelLabel;
	private JLabel schDoctorFNameLabel;
	private JLabel schDoctorLNameLabel;
	private JLabel schDatesWorking;
	private JTextField schDoctorFTextField;
	private JTextField schDoctorLTextField;
	private JTextField schDatesWorkingField;
	private JButton schDoctorEnterButton;
	
	public DoctorSchedules()
	{
		super("View Doctor Schedules");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		schTopPanel = new JPanel();
		schTopPanel.setBackground(Color.blue);
		schTopPanel.setPreferredSize(new Dimension(500,30));
		add(schTopPanel, BorderLayout.NORTH);
		
		schPanelLabel = new JLabel();
		schPanelLabel.setText("ESOF3050 Hospital PRS System: View Doctor Schedules");
		schPanelLabel.setForeground(Color.white);
		schTopPanel.add(schPanelLabel);		
		
		schLeftPanel = new JPanel();
		schLeftPanel.setLayout(new FlowLayout());
		schLeftPanel.setPreferredSize(new Dimension(300,400));
		schLeftPanel.setBackground(Color.white);
		add(schLeftPanel, BorderLayout.WEST);
		
		schRightPanel = new JPanel();
		schRightPanel.setLayout(new FlowLayout());
		schRightPanel.setPreferredSize(new Dimension(300,400));
		schRightPanel.setBackground(Color.white);
		add(schRightPanel, BorderLayout.EAST);
		
		schDoctorFNameLabel = new JLabel();
		schDoctorFNameLabel.setText("Enter doctor's first name:");
		schLeftPanel.add(schDoctorFNameLabel);
		
		schDoctorFTextField = new JTextField();
		schDoctorFTextField.setPreferredSize(new Dimension(100,20));
		schLeftPanel.add(schDoctorFTextField);
		
		schDoctorLNameLabel = new JLabel();
		schDoctorLNameLabel.setText("Enter doctor's last name:");
		schLeftPanel.add(schDoctorLNameLabel);
		
		schDoctorLTextField = new JTextField();
		schDoctorLTextField.setPreferredSize(new Dimension(100,20));
		schLeftPanel.add(schDoctorLTextField);
		
		schDoctorEnterButton = new JButton("VIEW SCHEDULE");
		schLeftPanel.add(schDoctorEnterButton);
		
		schDatesWorking = new JLabel();
		schDatesWorking.setText("Dates Working:");
		schRightPanel.add(schDatesWorking);
		
		schDatesWorkingField = new JTextField();
		schDatesWorkingField.setPreferredSize(new Dimension(100,300));
		schRightPanel.add(schDatesWorkingField);
	}
}


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

public class AddDoctor extends JFrame
{
	private JPanel adTopPanel;
	private JPanel adFNamePanel;
	private JPanel adLNamePanel;
	private JPanel adUserPanel;
	private JPanel adPasswordPanel;
	private JPanel adDeptPanel;
	private JPanel adEmplNumPanel;
	private JPanel adAddressPanel;
	private JPanel adSINPanel;
	private JPanel adSpecialtyPanel;
	private JPanel adRankPanel;
	private JPanel adWorkHoursPanel;
	
	private JLabel adTitleLabel;
	private JLabel adFNameLabel;
	private JLabel adLNameLabel;
	private JLabel adUserLabel;
	private JLabel adPasswordLabel;
	private JLabel adDeptLabel;
	private JLabel adEmplNumLabel;
	private JLabel adAddressLabel;
	private JLabel adSINLabel;
	private JLabel adSpecialtyLabel;
	private JLabel adRankLabel;
	private JLabel adWorkHoursLabel;
	
	private JTextField adFNameField;
	private JTextField adLNameField;
	private JTextField adUserField;
	private JTextField adPasswordField;
	private JTextField adDeptField;
	private JTextField adEmplNumField;
	private JTextField adAddressField;
	private JTextField adSINField;
	private JTextField adSpecialtyField;
	private JTextField adRankField;
	private JTextField adWorkHoursField;
	
	private JButton adAddDoctorButton;
	
	public AddDoctor()
	{
		super("Add Doctor");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		adTopPanel = new JPanel();
		adTopPanel.setBackground(Color.blue);
		adTopPanel.setPreferredSize(new Dimension(500,30));
		add(adTopPanel);
		
		adFNamePanel = new JPanel();
		adFNamePanel.setLayout(new FlowLayout());
		adFNamePanel.setPreferredSize(new Dimension(500,30));
		adFNamePanel.setBackground(Color.white);
		add(adFNamePanel);

		adLNamePanel = new JPanel();
		adLNamePanel.setLayout(new FlowLayout());
		adLNamePanel.setPreferredSize(new Dimension(500,30));
		adLNamePanel.setBackground(Color.white);
		add(adLNamePanel);
		
		adUserPanel = new JPanel();
		adUserPanel.setLayout(new FlowLayout());
		adUserPanel.setPreferredSize(new Dimension(500,30));
		adUserPanel.setBackground(Color.white);
		add(adUserPanel);
		
		adPasswordPanel = new JPanel();
		adPasswordPanel.setLayout(new FlowLayout());
		adPasswordPanel.setPreferredSize(new Dimension(500,30));
		adPasswordPanel.setBackground(Color.white);
		add(adPasswordPanel);
		
		adDeptPanel = new JPanel();
		adDeptPanel.setLayout(new FlowLayout());
		adDeptPanel.setPreferredSize(new Dimension(500,30));
		adDeptPanel.setBackground(Color.white);
		add(adDeptPanel);
		
		adEmplNumPanel = new JPanel();
		adEmplNumPanel.setLayout(new FlowLayout());
		adEmplNumPanel.setPreferredSize(new Dimension(500,30));
		adEmplNumPanel.setBackground(Color.white);
		add(adEmplNumPanel);
		
		adAddressPanel = new JPanel();
		adAddressPanel.setLayout(new FlowLayout());
		adAddressPanel.setPreferredSize(new Dimension(500,30));
		adAddressPanel.setBackground(Color.white);
		add(adAddressPanel);
		
		adSpecialtyPanel = new JPanel();
		adSpecialtyPanel.setLayout(new FlowLayout());
		adSpecialtyPanel.setPreferredSize(new Dimension(500,30));
		adSpecialtyPanel.setBackground(Color.white);
		add(adSpecialtyPanel);
		
		adRankPanel = new JPanel();
		adRankPanel.setLayout(new FlowLayout());
		adRankPanel.setPreferredSize(new Dimension(500,30));
		adRankPanel.setBackground(Color.white);
		add(adRankPanel);
		
		adWorkHoursPanel = new JPanel();
		adWorkHoursPanel.setLayout(new FlowLayout());
		adWorkHoursPanel.setPreferredSize(new Dimension(500,30));
		adWorkHoursPanel.setBackground(Color.white);
		add(adWorkHoursPanel);
		
		adTitleLabel = new JLabel();
		adTitleLabel.setText("ESOF3050 Hospital PRS System: Add a Doctor");
		adTitleLabel.setForeground(Color.white);
		adTopPanel.add(adTitleLabel);
		
		adFNameLabel = new JLabel();
		adFNameLabel.setText("Enter first name of doctor to add: ");
		adFNamePanel.add(adFNameLabel);
		
		adLNameLabel = new JLabel();
		adLNameLabel.setText("Enter last name of doctor to add: ");
		adLNamePanel.add(adLNameLabel);
		
		adUserLabel = new JLabel();
		adUserLabel.setText("Enter doctor's username: ");
		adUserPanel.add(adUserLabel);
		
		adPasswordLabel = new JLabel();
		adPasswordLabel.setText("Enter doctor's password: ");
		adPasswordPanel.add(adPasswordLabel);
		
		adDeptLabel = new JLabel();
		adDeptLabel.setText("Enter doctor's department: ");
		adDeptPanel.add(adDeptLabel);
		
		adEmplNumLabel = new JLabel();
		adEmplNumLabel.setText("Enter doctor's employee number: ");
		adEmplNumPanel.add(adEmplNumLabel);
		
		adAddressLabel = new JLabel();
		adAddressLabel.setText("Enter doctor's address: ");
		adAddressPanel.add(adAddressLabel);
		
		adSINLabel = new JLabel();
		adSINLabel.setText("Enter doctor's SIN: ");
		adSINPanel.add(adSINLabel);
		
		adSpecialtyLabel = new JLabel();
		adSpecialtyLabel.setText("Enter doctor's specialty: ");
		adSpecialtyPanel.add(adSpecialtyLabel);
		
		adRankLabel = new JLabel();
		adRankLabel.setText("Enter doctor's rank: ");
		adRankPanel.add(adRankLabel);
		
		adWorkHoursLabel = new JLabel();
		adWorkHoursLabel.setText("Enter doctor's working hours: ");
		adWorkHoursPanel.add(adWorkHoursLabel);
		
		adFNameField = new JTextField();
		adFNameField.setPreferredSize(new Dimension(100,20));
		adFNamePanel.add(adFNameField);
		
		adLNameField = new JTextField();
		adLNameField.setPreferredSize(new Dimension(100,20));
		adLNamePanel.add(adLNameField);
		
		adUserField = new JTextField();
		adUserField.setPreferredSize(new Dimension(100,20));
		adUserPanel.add(adUserField);
		
		adPasswordField = new JTextField();
		adPasswordField.setPreferredSize(new Dimension(100,20));
		adPasswordPanel.add(adPasswordField);
		
		adDeptField = new JTextField();
		adDeptField.setPreferredSize(new Dimension(100,20));
		adDeptPanel.add(adDeptField);
		
		adEmplNumField = new JTextField();
		adEmplNumField.setPreferredSize(new Dimension(100,20));
		adEmplNumPanel.add(adEmplNumField);
		
		adAddressField = new JTextField();
		adAddressField.setPreferredSize(new Dimension(100,20));
		adAddressPanel.add(adAddressField);
		
		adSINField = new JTextField();
		adSINField.setPreferredSize(new Dimension(100,20));
		adSINPanel.add(adSINField);
		
		adSpecialtyField = new JTextField();
		adSpecialtyField.setPreferredSize(new Dimension(100,20));
		adSpecialtyPanel.add(adSpecialtyField);
		
		adRankField = new JTextField();
		adRankField.setPreferredSize(new Dimension(100,20));
		adRankPanel.add(adRankField);
		
		adWorkHoursField = new JTextField();
		adWorkHoursField.setPreferredSize(new Dimension(100,20));
		adWorkHoursPanel.add(adWorkHoursField);
		
		adAddDoctorButton = new JButton("ADD DOCTOR");
		add(adAddDoctorButton);
		
		AddDoctorHandler adhandler = new AddDoctorHandler();
		adAddDoctorButton.addActionListener(adhandler);
	}
	
	private class AddDoctorHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == adAddDoctorButton)
			{
				
			}
		}
	}
	
	
}

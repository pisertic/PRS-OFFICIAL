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

public class AddStaff extends JFrame
{
	private JPanel asTopPanel;
	private JPanel asFNamePanel;
	private JPanel asLNamePanel;
	private JPanel asUserPanel;
	private JPanel asPasswordPanel;
	private JPanel asDeptPanel;
	private JPanel asEmplNumPanel;
	private JPanel asAddressPanel;
	private JPanel asSINPanel;
	
	private JLabel asTitleLabel;
	private JLabel asFNameLabel;
	private JLabel asLNameLabel;
	private JLabel asUserLabel;
	private JLabel asPasswordLabel;
	private JLabel asDeptLabel;
	private JLabel asEmplNumLabel;
	private JLabel asAddressLabel;
	private JLabel asSINLabel;
	
	private JTextField asFNameField;
	private JTextField asLNameField;
	private JTextField asUserField;
	private JTextField asPasswordField;
	private JTextField asDeptField;
	private JTextField asEmplNumField;
	private JTextField asAddressField;
	private JTextField asSINField;
	
	private JButton asAddStaffButton;
	
	public AddStaff()
	{
		super("Add Staff");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		asTopPanel = new JPanel();
		asTopPanel.setBackground(Color.blue);
		asTopPanel.setPreferredSize(new Dimension(500,30));
		add(asTopPanel);
		
		asFNamePanel = new JPanel();
		asFNamePanel.setLayout(new FlowLayout());
		asFNamePanel.setPreferredSize(new Dimension(500,30));
		asFNamePanel.setBackground(Color.white);
		add(asFNamePanel);

		asLNamePanel = new JPanel();
		asLNamePanel.setLayout(new FlowLayout());
		asLNamePanel.setPreferredSize(new Dimension(500,30));
		asLNamePanel.setBackground(Color.white);
		add(asLNamePanel);
		
		asUserPanel = new JPanel();
		asUserPanel.setLayout(new FlowLayout());
		asUserPanel.setPreferredSize(new Dimension(500,30));
		asUserPanel.setBackground(Color.white);
		add(asUserPanel);
		
		asPasswordPanel = new JPanel();
		asPasswordPanel.setLayout(new FlowLayout());
		asPasswordPanel.setPreferredSize(new Dimension(500,30));
		asPasswordPanel.setBackground(Color.white);
		add(asPasswordPanel);
		
		asDeptPanel = new JPanel();
		asDeptPanel.setLayout(new FlowLayout());
		asDeptPanel.setPreferredSize(new Dimension(500,30));
		asDeptPanel.setBackground(Color.white);
		add(asDeptPanel);
		
		asEmplNumPanel = new JPanel();
		asEmplNumPanel.setLayout(new FlowLayout());
		asEmplNumPanel.setPreferredSize(new Dimension(500,30));
		asEmplNumPanel.setBackground(Color.white);
		add(asEmplNumPanel);
		
		asAddressPanel = new JPanel();
		asAddressPanel.setLayout(new FlowLayout());
		asAddressPanel.setPreferredSize(new Dimension(500,30));
		asAddressPanel.setBackground(Color.white);
		add(asAddressPanel);
		
		asSINPanel = new JPanel();
		asSINPanel.setLayout(new FlowLayout());
		asSINPanel.setPreferredSize(new Dimension(500,30));
		asSINPanel.setBackground(Color.white);
		add(asSINPanel);
		
		asTitleLabel = new JLabel();
		asTitleLabel.setText("ESOF3050 Hospital PRS System: Add a Staff Member");
		asTitleLabel.setForeground(Color.white);
		asTopPanel.add(asTitleLabel);
		
		asFNameLabel = new JLabel();
		asFNameLabel.setText("Enter first name of doctor to add: ");
		asFNamePanel.add(asFNameLabel);
		
		asLNameLabel = new JLabel();
		asLNameLabel.setText("Enter last name of doctor to add: ");
		asLNamePanel.add(asLNameLabel);
		
		asUserLabel = new JLabel();
		asUserLabel.setText("Enter doctor's username: ");
		asUserPanel.add(asUserLabel);
		
		asPasswordLabel = new JLabel(); 
		asPasswordLabel.setText("Enter doctor's password: ");
		asPasswordPanel.add(asPasswordLabel);
		
		asDeptLabel = new JLabel();
		asDeptLabel.setText("Enter doctor's department: ");
		asDeptPanel.add(asDeptLabel);
		
		asEmplNumLabel = new JLabel();
		asEmplNumLabel.setText("Enter doctor's employee number: ");
		asEmplNumPanel.add(asEmplNumLabel);
		
		asAddressLabel = new JLabel();
		asAddressLabel.setText("Enter doctor's address: ");
		asAddressPanel.add(asAddressLabel);
		
		asSINLabel = new JLabel();
		asSINLabel.setText("Enter doctor's SIN: ");
		asSINPanel.add(asSINLabel);
		
		asFNameField = new JTextField();
		asFNameField.setPreferredSize(new Dimension(100,20));
		asFNamePanel.add(asFNameField);
		
		asLNameField = new JTextField();
		asLNameField.setPreferredSize(new Dimension(100,20));
		asLNamePanel.add(asLNameField);
		
		asUserField = new JTextField();
		asUserField.setPreferredSize(new Dimension(100,20));
		asUserPanel.add(asUserField);
		
		asPasswordField = new JTextField();
		asPasswordField.setPreferredSize(new Dimension(100,20));
		asPasswordPanel.add(asPasswordField);
		
		asDeptField = new JTextField();
		asDeptField.setPreferredSize(new Dimension(100,20));
		asDeptPanel.add(asDeptField);
		
		asEmplNumField = new JTextField();
		asEmplNumField.setPreferredSize(new Dimension(100,20));
		asEmplNumPanel.add(asEmplNumField);
		
		asAddressField = new JTextField();
		asAddressField.setPreferredSize(new Dimension(100,20));
		asAddressPanel.add(asAddressField);
		
		asSINField = new JTextField();
		asSINField.setPreferredSize(new Dimension(100,20));
		asSINPanel.add(asSINField);
		
		asAddStaffButton = new JButton("ADD DOCTOR");
		add(asAddStaffButton);
		
		AddStaffHandler ashandler = new AddStaffHandler();
		asAddStaffButton.addActionListener(ashandler);
	}
	
	private class AddStaffHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == asAddStaffButton)
			{
				
			}
		}
	}
	
	
}
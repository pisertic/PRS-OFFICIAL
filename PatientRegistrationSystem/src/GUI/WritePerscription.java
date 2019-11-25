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

public class WritePerscription extends JFrame
{
	private JPanel preLeftPanel;
	private JPanel preRightPanel;
	private JPanel preTopPanel;
	private JLabel prePanelLabel;
	private JLabel prePatientFNameLabel;
	private JLabel prePatientLNameLabel;
	private JLabel prePerscriptionLabel;
	private JLabel prePatientPerscriptionsLabel;
	private JTextField prePatientFTextField;
	private JTextField prePatientLTextField;
	private JTextField prePerscriptionField;
	private JTextField prePatientPerscriptionsField;
	private JButton prePatientEnterButton;
	private JButton preCreateButton;
	
	
	public WritePerscription()
	{
		super("Write a Perscription");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		preTopPanel = new JPanel();
		preTopPanel.setBackground(Color.blue);
		preTopPanel.setPreferredSize(new Dimension(500,30));
		add(preTopPanel, BorderLayout.NORTH);
		
		prePanelLabel = new JLabel();
		prePanelLabel.setText("ESOF3050 Hospital PRS System: Write a Perscription");
		prePanelLabel.setForeground(Color.white);
		preTopPanel.add(prePanelLabel);		
		
		preLeftPanel = new JPanel();
		preLeftPanel.setLayout(new FlowLayout());
		preLeftPanel.setPreferredSize(new Dimension(300,400));
		preLeftPanel.setBackground(Color.white);
		add(preLeftPanel, BorderLayout.WEST);
		
		preRightPanel = new JPanel();
		preRightPanel.setLayout(new FlowLayout());
		preRightPanel.setPreferredSize(new Dimension(300,400));
		preRightPanel.setBackground(Color.white);
		add(preRightPanel, BorderLayout.EAST);
		
		prePatientFNameLabel = new JLabel();
		prePatientFNameLabel.setText("Enter patient's first name:");
		preLeftPanel.add(prePatientFNameLabel);
		
		prePatientFTextField = new JTextField();
		prePatientFTextField.setPreferredSize(new Dimension(100,20));
		preLeftPanel.add(prePatientFTextField);
		
		prePatientLNameLabel = new JLabel();
		prePatientLNameLabel.setText("Enter patient's last name:");
		preLeftPanel.add(prePatientLNameLabel);
		
		prePatientLTextField = new JTextField();
		prePatientLTextField.setPreferredSize(new Dimension(100,20));
		preLeftPanel.add(prePatientLTextField);
		
		prePatientEnterButton = new JButton("ENTER");
		preLeftPanel.add(prePatientEnterButton);
		
		prePerscriptionLabel = new JLabel();
		prePerscriptionLabel.setText("Enter name of Perscribed medicine:");
		preLeftPanel.add(prePerscriptionLabel);
		
		prePerscriptionField = new JTextField();
		prePerscriptionField.setPreferredSize(new Dimension(100,20));
		preLeftPanel.add(prePerscriptionField);
		
		preCreateButton  = new JButton("PERSCRIBE");
		preLeftPanel.add(preCreateButton);
		
		prePatientPerscriptionsLabel = new JLabel();
		prePatientPerscriptionsLabel.setText("Patient's perscriptions:");
		preRightPanel.add(prePatientPerscriptionsLabel);
		
		prePatientPerscriptionsField = new JTextField();
		prePatientPerscriptionsField.setPreferredSize(new Dimension(100,300));
		preRightPanel.add(prePatientPerscriptionsField);
	}
}


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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class CancelAppointment extends JFrame 
{
	private JPanel canLeftPanel;
	private JPanel canRightPanel;
	private JPanel canTopPanel;
	private JPanel datesAreaPanel;
	private JLabel canPanelLabel;
	private JLabel canPatientUserLabel;
	private JLabel canAppNumber;
	private JTextField canPatientUserField;
	private JTextField canAppNumberField;
	private JTextArea canAppDatesArea;
	private JButton canPatientEnterButton;
	private JButton canDeleteButton;
	private JScrollPane dateAreaScroll;
	
	public CancelAppointment()
	{
		super("Cancel Appointment");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		canTopPanel = new JPanel();
		canTopPanel.setBackground(Color.blue);
		canTopPanel.setPreferredSize(new Dimension(500,30));
		add(canTopPanel, BorderLayout.NORTH);
		
		canPanelLabel = new JLabel();
		canPanelLabel.setText("ESOF3050 Hospital PRS System: Cancel an Appointment");
		canPanelLabel.setForeground(Color.white);
		canTopPanel.add(canPanelLabel);		
		
		canLeftPanel = new JPanel();
		canLeftPanel.setLayout(new FlowLayout());
		canLeftPanel.setPreferredSize(new Dimension(300,400));
		canLeftPanel.setBackground(Color.white);
		add(canLeftPanel, BorderLayout.WEST);
		
		canRightPanel = new JPanel();
		canRightPanel.setLayout(new FlowLayout());
		canRightPanel.setPreferredSize(new Dimension(300,400));
		canRightPanel.setBackground(Color.white);
		add(canRightPanel, BorderLayout.EAST);
		
		canPatientUserLabel = new JLabel();
		canPatientUserLabel.setText("Enter patient's user name to see appoinments:");
		canLeftPanel.add(canPatientUserLabel);
		
		canPatientUserField = new JTextField();
		canPatientUserField.setPreferredSize(new Dimension(100,20));
		canLeftPanel.add(canPatientUserField);
		
		canPatientEnterButton = new JButton("ENTER");
		canLeftPanel.add(canPatientEnterButton);
		
		canAppNumber = new JLabel();
		canAppNumber.setText("Enter number of appoinment to remove:");
		canLeftPanel.add(canAppNumber);
		
		canAppNumberField = new JTextField();
		canAppNumberField.setPreferredSize(new Dimension(100,20));
		canLeftPanel.add(canAppNumberField);
		
		canDeleteButton = new JButton("DELETE");
		canLeftPanel.add(canDeleteButton);
		
		datesAreaPanel = new JPanel();
		datesAreaPanel.setPreferredSize(new Dimension(200,300));
		datesAreaPanel.setBorder(new TitledBorder(new EtchedBorder(), "Appoinment dates:"));
		datesAreaPanel.setBackground(Color.white);
		canAppDatesArea = new JTextArea("Check Availability\n");
		canAppDatesArea.setPreferredSize(new Dimension(190,290));
		canAppDatesArea.setEditable(true);
		dateAreaScroll = new JScrollPane(canAppDatesArea);
		dateAreaScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		datesAreaPanel.add(dateAreaScroll);
		canRightPanel.add(datesAreaPanel);

		
		DeleteHandler1 rhhandler1 = new DeleteHandler1();
		canPatientEnterButton.addActionListener(rhhandler1);
		
		DeleteHandler2 rhhandler2 = new DeleteHandler2();
		canDeleteButton.addActionListener(rhhandler2);
	}
	
	private class DeleteHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == canPatientEnterButton)
			{
				
			}
		}
	}
	
	private class DeleteHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == canDeleteButton)
			{
				
			}
		}
	}
}

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

public class ViewRecords extends JFrame
{
	private JPanel schLeftPanel;
	private JPanel schRightPanel;
	private JPanel schTopPanel;
	private JLabel schPanelLabel;
	private JLabel schPatientUserLabel;
	private JLabel schPatientRecords;
	private JTextField schPatientUserField;
	private JTextField schPatientRecordsField;
	private JButton schPatientEnterButton;
	
	public ViewRecords()
	{
		super("View Patient Records");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		schTopPanel = new JPanel();
		schTopPanel.setBackground(Color.blue);
		schTopPanel.setPreferredSize(new Dimension(500,30));
		add(schTopPanel, BorderLayout.NORTH);
		
		schPanelLabel = new JLabel();
		schPanelLabel.setText("ESOF3050 Hospital PRS System: View Patient Records");
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
		
		schPatientUserLabel = new JLabel();
		schPatientUserLabel.setText("Enter patient's user name:");
		schLeftPanel.add(schPatientUserLabel);
		
		schPatientUserField = new JTextField();
		schPatientUserField.setPreferredSize(new Dimension(100,20));
		schLeftPanel.add(schPatientUserField);
		
		schPatientEnterButton = new JButton("VIEW SCHEDULE");
		schLeftPanel.add(schPatientEnterButton);
		
		schPatientRecords = new JLabel();
		schPatientRecords.setText("Dates Working:");
		schRightPanel.add(schPatientRecords);
		
		schPatientRecordsField = new JTextField();
		schPatientRecordsField.setPreferredSize(new Dimension(200,300));
		schRightPanel.add(schPatientRecordsField);
		
		PViewHandler vhandler = new PViewHandler();
		schPatientEnterButton.addActionListener(vhandler);
	}
	
	private class PViewHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == schPatientEnterButton)
			{
				
			}
		}
	}
}

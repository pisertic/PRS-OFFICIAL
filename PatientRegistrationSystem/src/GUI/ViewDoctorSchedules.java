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

public class ViewDoctorSchedules extends JFrame
{
	private JPanel schLeftPanel;
	private JPanel schRightPanel;
	private JPanel schTopPanel;
	private JLabel schPanelLabel;
	private JLabel schDoctorUserLabel;
	private JLabel schDatesWorking;
	private JTextField schDoctorUserField;
	private JTextField schDatesWorkingField;
	private JButton schDoctorEnterButton;
	
	public ViewDoctorSchedules()
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
		
		schDoctorUserLabel = new JLabel();
		schDoctorUserLabel.setText("Enter doctor's user name:");
		schLeftPanel.add(schDoctorUserLabel);
		
		schDoctorUserField = new JTextField();
		schDoctorUserField.setPreferredSize(new Dimension(100,20));
		schLeftPanel.add(schDoctorUserField);
		
		schDoctorEnterButton = new JButton("VIEW SCHEDULE");
		schLeftPanel.add(schDoctorEnterButton);
		
		schDatesWorking = new JLabel();
		schDatesWorking.setText("Dates Working:");
		schRightPanel.add(schDatesWorking);
		
		schDatesWorkingField = new JTextField();
		schDatesWorkingField.setPreferredSize(new Dimension(200,300));
		schRightPanel.add(schDatesWorkingField);
		
		ViewHandler vhandler = new ViewHandler();
		schDoctorEnterButton.addActionListener(vhandler);
	}
	
	private class ViewHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == schDoctorEnterButton)
			{
				
			}
		}
	}
}


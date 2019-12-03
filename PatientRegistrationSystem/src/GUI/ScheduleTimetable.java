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

public class ScheduleTimetable extends JFrame
{
	private JPanel ttLeftPanel;
	private JPanel ttRightPanel;
	private JPanel ttTopPanel;
	private JLabel ttPanelLabel;
	private JLabel ttDoctorUserLabel;
	private JLabel ttDatesWorking;
	private JLabel ttAddDateLabel;
	private JLabel ttAddDurationLabel;
	private JTextField ttDoctorUserField;
	private JTextField ttDatesWorkingField;
	private JTextField ttAddDateTextField;
	private JTextField ttAddDurationTextField;
	private JButton ttDoctorEnterButton;
	private JButton ttDoctorScheduleButton;
	
	public ScheduleTimetable()
	{
		super("Schedule Doctor Timetables");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		ttTopPanel = new JPanel();
		ttTopPanel.setBackground(Color.blue);
		ttTopPanel.setPreferredSize(new Dimension(500,30));
		add(ttTopPanel, BorderLayout.NORTH);
		
		ttPanelLabel = new JLabel();
		ttPanelLabel.setText("ESOF3050 Hospital PRS System: Schedule Doctor Timetables");
		ttPanelLabel.setForeground(Color.white);
		ttTopPanel.add(ttPanelLabel);		
		
		ttLeftPanel = new JPanel();
		ttLeftPanel.setLayout(new FlowLayout());
		ttLeftPanel.setPreferredSize(new Dimension(300,400));
		ttLeftPanel.setBackground(Color.white);
		add(ttLeftPanel, BorderLayout.WEST);
		
		ttRightPanel = new JPanel();
		ttRightPanel.setLayout(new FlowLayout());
		ttRightPanel.setPreferredSize(new Dimension(300,400));
		ttRightPanel.setBackground(Color.white);
		add(ttRightPanel, BorderLayout.EAST);
		
		ttDoctorUserLabel = new JLabel();
		ttDoctorUserLabel.setText("Enter doctor's user name:");
		ttLeftPanel.add(ttDoctorUserLabel);
		
		ttDoctorUserField = new JTextField();
		ttDoctorUserField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttDoctorUserField);
		
		ttDoctorEnterButton = new JButton("ENTER");
		ttLeftPanel.add(ttDoctorEnterButton);
		
		ttAddDateLabel = new JLabel();
		ttAddDateLabel.setText("Enter Date to add:");
		ttLeftPanel.add(ttAddDateLabel);
		
		ttAddDateTextField = new JTextField();
		ttAddDateTextField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttAddDateTextField);

		ttAddDurationLabel = new JLabel();
		ttAddDurationLabel.setText("Enter Duration:");
		ttLeftPanel.add(ttAddDurationLabel);
		
		ttAddDurationTextField = new JTextField();
		ttAddDurationTextField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttAddDurationTextField);
		
		ttDoctorScheduleButton = new JButton("SCHEDULE");
		ttLeftPanel.add(ttDoctorScheduleButton);
		
		ttDatesWorking = new JLabel();
		ttDatesWorking.setText("Dates Working:");
		ttRightPanel.add(ttDatesWorking);
		
		ttDatesWorkingField = new JTextField();
		ttDatesWorkingField.setPreferredSize(new Dimension(100,300));
		ttRightPanel.add(ttDatesWorkingField);
		
		TimetableHandler1 thandler1 = new TimetableHandler1();
		ttDoctorEnterButton.addActionListener(thandler1);
		
		TimetableHandler2 thandler2 = new TimetableHandler2();
		ttDoctorScheduleButton.addActionListener(thandler2);
	}
	
	private class TimetableHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == ttDoctorEnterButton)
			{
				
			}
		}
	}
	
	private class TimetableHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == ttDoctorScheduleButton)
			{
				
			}
		}
	}
}



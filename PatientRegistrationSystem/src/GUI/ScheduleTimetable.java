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
	private JLabel ttDoctorFNameLabel;
	private JLabel ttDoctorLNameLabel;
	private JLabel ttDatesWorking;
	private JLabel ttAddDateLabel;
	private JLabel ttAddTimeLabel;
	private JLabel ttAddDurationLabel;
	private JTextField ttDoctorFTextField;
	private JTextField ttDoctorLTextField;
	private JTextField ttDatesWorkingField;
	private JTextField ttAddDateTextField;
	private JTextField ttAddTimeTextField;
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
		
		ttDoctorFNameLabel = new JLabel();
		ttDoctorFNameLabel.setText("Enter doctor's first name:");
		ttLeftPanel.add(ttDoctorFNameLabel);
		
		ttDoctorFTextField = new JTextField();
		ttDoctorFTextField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttDoctorFTextField);
		
		ttDoctorLNameLabel = new JLabel();
		ttDoctorLNameLabel.setText("Enter doctor's last name:");
		ttLeftPanel.add(ttDoctorLNameLabel);
		
		ttDoctorLTextField = new JTextField();
		ttDoctorLTextField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttDoctorLTextField);
		
		ttDoctorEnterButton = new JButton("ENTER");
		ttLeftPanel.add(ttDoctorEnterButton);
		
		ttAddDateLabel = new JLabel();
		ttAddDateLabel.setText("Enter Date to add:");
		ttLeftPanel.add(ttAddDateLabel);
		
		ttAddDateTextField = new JTextField();
		ttAddDateTextField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttAddDateTextField);
		
		ttAddTimeLabel = new JLabel();
		ttAddTimeLabel.setText("Enter Time:");
		ttLeftPanel.add(ttAddTimeLabel);
		
		ttAddTimeTextField = new JTextField();
		ttAddTimeTextField.setPreferredSize(new Dimension(100,20));
		ttLeftPanel.add(ttAddTimeTextField);
		
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
	}
}


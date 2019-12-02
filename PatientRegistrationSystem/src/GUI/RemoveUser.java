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

public class RemoveUser extends JFrame
{
	private JPanel ruLeftPanel;
	private JPanel ruRightPanel;
	private JPanel ruTopPanel;
	private JPanel removeUserPanel1;
	private JPanel removeUserPanel2;
	private JLabel ruPanelLabel;
	private JLabel removeUserLabel;
	private JTextField removeUserField;
	private JButton removeUserButton;
	
	public RemoveUser()
	{
		super("Remove User");
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		
		ruTopPanel = new JPanel();
		ruTopPanel.setBackground(Color.blue);
		ruTopPanel.setPreferredSize(new Dimension(500,30));
		add(ruTopPanel, BorderLayout.NORTH);
		
		ruPanelLabel = new JLabel();
		ruPanelLabel.setText("ESOF3050 Hospital PRS System: Remove a User");
		ruPanelLabel.setForeground(Color.white);
		ruTopPanel.add(ruPanelLabel);		
		
		ruLeftPanel = new JPanel();
		ruLeftPanel.setLayout(new FlowLayout());
		ruLeftPanel.setPreferredSize(new Dimension(300,400));
		ruLeftPanel.setBackground(Color.white);
		add(ruLeftPanel, BorderLayout.WEST);
		
		ruRightPanel = new JPanel();
		ruRightPanel.setLayout(new FlowLayout());
		ruRightPanel.setPreferredSize(new Dimension(300,400));
		ruRightPanel.setBackground(Color.white);
		add(ruRightPanel, BorderLayout.EAST);
		
		removeUserPanel1 = new JPanel();
		removeUserPanel1.setLayout(new FlowLayout());
		removeUserPanel1.setPreferredSize(new Dimension(300,30));
		removeUserPanel1.setBackground(Color.white);
		ruLeftPanel.add(removeUserPanel1);
		
		removeUserLabel = new JLabel();
		removeUserLabel.setText("Enter username of user you wish to remove from the PRS: ");
		removeUserPanel1.add(removeUserLabel);
		
		removeUserPanel2 = new JPanel();
		removeUserPanel2.setLayout(new FlowLayout());
		removeUserPanel2.setPreferredSize(new Dimension(300,30));
		removeUserPanel2.setBackground(Color.white);
		ruLeftPanel.add(removeUserPanel2);
		
		removeUserField = new JTextField();
		removeUserField.setPreferredSize(new Dimension(100,20));
		removeUserPanel2.add(removeUserField);
		
		removeUserButton = new JButton("REMOVE USER");
		ruLeftPanel.add(removeUserButton);
		
		RemoveUserHandler ruhandler = new RemoveUserHandler();
		removeUserButton.addActionListener(ruhandler);
	}
	
	private class RemoveUserHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == removeUserButton)
			{
				
			}
		}
	}
}

package GUI;

import javax.swing.JFrame;

public class TestClass 
{
	public static void main(String[] args) 
	{
		Login loginFrame = new Login();
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setSize(600, 400);
		loginFrame.setVisible(true);
	}
}
package GUI;

import javax.swing.JFrame;

public class TestClass 
{
	public static void main(String[] args) 
	{
		Signup signupFrame = new Signup();
		signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		signupFrame.setSize(600, 400);
		signupFrame.setVisible(true);
	}
}
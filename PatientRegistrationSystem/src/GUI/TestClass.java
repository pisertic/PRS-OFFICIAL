package GUI;

import javax.swing.JFrame;

public class TestClass 
{
	public static void main(String[] args) 
	{
		MakeReferral signupFrame = new MakeReferral();
		signupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		signupFrame.setSize(600, 400);
		signupFrame.setVisible(true);
	}
}
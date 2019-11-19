package GUI;

import javax.swing.JFrame;
import java.util.ArrayList;
public class LoginTestClass {

	public static void main(String[] args) 
	{
		Signup signupFrame = new Signup();
		signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signupFrame.setSize(600, 400);
		signupFrame.setVisible(true);
	}
}

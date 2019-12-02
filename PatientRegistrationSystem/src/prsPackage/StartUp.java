package prsPackage;

import OCSF.Objectinator;
import OCSF.GFG;
import java.io.IOException;

import javax.swing.JFrame;

import GUI.Login;
import GUI.Signup;
import OCSF.MyClient;
import OCSF.MyServer;

public class StartUp {

	public static void main(String[] args) {

		// startup server
		MyServer MyServer1 = new MyServer(8989); // will use port 8989
		System.out.println("MyServer: MyServer1 has been created.");
		try {
			MyServer1.listen();
			System.out.println("MyServer: Server should now be running");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// call client
		MyClient client1 = new MyClient("localhost", 8989);
		try {
			client1.openConnection();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("ERROR while attempting to open connection, exiting...");
			System.exit(1); // on error exit
		}
		// call login GUI
		Login loginFrame = new Login(client1);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setSize(600, 400);
		loginFrame.setVisible(true);

		//DONE
	}

}

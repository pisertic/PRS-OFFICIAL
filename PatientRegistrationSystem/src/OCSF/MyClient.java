package OCSF;

import java.io.IOException;
import java.util.ArrayList;

import prsPackage.Appointment;
import prsPackage.Converter;
import prsPackage.Doctor;
import prsPackage.HospitalMember;
import prsPackage.Login;
import prsPackage.Patient;
import prsPackage.Referral;
import prsPackage.Staff;

public class MyClient extends AbstractClient {
	//data lists for startUp class to access
	public ArrayList<Appointment> appData = new ArrayList<>();
	public ArrayList<Doctor> docData =  new ArrayList<>();
	public ArrayList<HospitalMember> hpData =  new ArrayList<>();
	public ArrayList<Patient> patData =  new ArrayList<>();
	public ArrayList<Referral> refData =  new ArrayList<>();
	public ArrayList<Staff> staffData =  new ArrayList<>();
	public ArrayList<Login> loginData =  new ArrayList<>();
	
	public MyClient(String host, int port) {
		super(host, port);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println("MyClient's handleMessageFromServer() triggered");
		//FIND TYPE OF RECIEVED DATA AND CONVERT FROM OBJECTINATOR TYPE TO PROPER CLASS ARRAYLIST
		Objectinator obj = (Objectinator)msg;
		
		switch (obj.getTypeIdentifier()) {
		// make arraylist of data appointment
		case 0:// appointment
			this.appData = (ArrayList)obj.getDataList();	
			break;
		// make arraylist of doctor data
		case 1:// doctor
			this.docData = (ArrayList)obj.getDataList();	
			break;
		// make arraylist of hospitalMember data
		case 2:// hospitalMember
			this.hpData = (ArrayList)obj.getDataList();	
			break;
		case 3:// patient
				// make arraylist of patient data
			this.patData = (ArrayList)obj.getDataList();	
			break;
		case 4:// referral
				// make arraylist of referral data
			this.refData = (ArrayList)obj.getDataList();	
			break;
		case 5:// staff
				// make arraylist of staff data
			this.staffData = (ArrayList)obj.getDataList();	
			break;
		case 6:// login
			// make arraylist of login data
			this.loginData = (ArrayList)obj.getDataList();	
			break;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		MyClient Client1 = new MyClient("localhost", 8989);
		try {
			Client1.openConnection();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("ERROR while attempting to open connection, exiting...");
			System.exit(1); // on error exit
		}

		try {
			// on close

			System.out.println(String.format("Attempting to send message to server from %s %s %s", Client1.getHost(),
					Client1.getInetAddress(), Client1.getPort()));
			Client1.sendToServer(clientRequest("Real Test", 1));

			System.out.println("Client sent message to server");
		} catch (IOException e) {
			System.out.println("MyClient ERROR: sending to server did not work...");
			e.printStackTrace();
		}
	}
}

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

	public MyClient(String host, int port) {
		super(host, port);
	}

	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println("MyClient's handleMessageFromServer() triggered");
		//FIND TYPE OF RECIEVED DATA AND CONVERT FROM OBJECTINATOR TYPE TO PROPER CLASS ARRAYLIST
		Objectinator obj = (Objectinator)msg;
		switch (obj.getTypeIdentifier()) {
		// Get arraylist of data appointment
		case 0:// appointment
			ArrayList<Appointment> data = new ArrayList<Appointment>();
			data = (ArrayList<Appointment>) Converter.readData(Converter.aptData);
			//WRAP DATA AS OBJECTINATOR TYPE
			client.sendToClient(data);
			break;
		// Get arraylist of doctor data
		case 1:// doctor
			ArrayList<Doctor> data1 = new ArrayList<Doctor>();
			data1 = (ArrayList<Doctor>) Converter.readData(Converter.docData);
			client.sendToClient(data1);
			break;
		// Get arraylist of hospitalMember data
		case 2:// hospitalMember
			ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
			data2 = (ArrayList<HospitalMember>) Converter.readData(Converter.hmData);
			client.sendToClient(data2);
			break;
		case 3:// patient
				// Get arraylist of patient data
			ArrayList<Patient> data3 = new ArrayList<Patient>();
			data3 = (ArrayList<Patient>) Converter.readData(Converter.patientData);
			client.sendToClient(data3);
			break;
		case 4:// referral
				// Get arraylist of referral data
			ArrayList<Referral> data4 = new ArrayList<Referral>();
			data4 = (ArrayList<Referral>) Converter.readData(Converter.refData);
			client.sendToClient(data4);
			break;
		case 5:// staff
				// Get arraylist of staff data
			ArrayList<Staff> data5 = new ArrayList<Staff>();
			data5 = (ArrayList<Staff>) Converter.readData(Converter.staffData);
			client.sendToClient(data5);
			break;
		case 6:// login
			// Get arraylist of login data
			ArrayList<Login> data6 = new ArrayList<Login>();
			data6 = (ArrayList<Login>) Converter.readData(Converter.userBase);
			client.sendToClient(data6);
			break;
		}
	}

	public Object clientRequest(String keyword, int methodIdentifier) {
		Objectinator object1 = new Objectinator(keyword, methodIdentifier);
		return object1;
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

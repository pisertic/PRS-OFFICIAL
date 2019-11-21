package OCSF;

//import theOCSF.FileHandling;
import java.io.IOException;
import java.util.ArrayList;

import prsPackage.*;

public class MyServer extends AbstractServer {

	public MyServer(int port) { // Constructor
		super(port);
	}

	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
		System.out.println("MyServer: handleMessageFromClient() RECEIVED SOMETHING FROM CLIENT");

		Objectinator obj = (Objectinator) msg;
		// determine if reading from server or writing from server
		if (obj.getWrite()) {
			findTypeAndWrite(obj, obj.getTypeIdentifier());
		} else {
			try {
				findTypeAndRead(client, obj.getTypeIdentifier());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	//////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "unchecked", "rawtypes" })

	// WRITE DATA TO SERVER
	protected void findTypeAndWrite(Objectinator obj, int classType) {
		// FIND IF WERE DEALING WITH ARRAYLIST OR SINGLE OBJECT INSTANCE
		if (obj.getDataInstance() == null) {

			switch (classType) {
			case 0:// appointment
				ArrayList<Appointment> data = new ArrayList<Appointment>();
				data = (ArrayList) obj.getDataList();
				try {
					// write data
					Converter.writeData(data, Converter.aptData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 1:// doctor
				ArrayList<Doctor> data1 = new ArrayList<Doctor>();
				data1 = (ArrayList) obj.getDataList();
				try {
					// write data
					Converter.writeData(data1, Converter.docData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:// hospitalMember
				ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
				data2 = (ArrayList) obj.getDataList();
				try {
					// write data
					Converter.writeData(data2, Converter.hmData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:// patient
				ArrayList<Patient> data3 = new ArrayList<Patient>();
				data3 = (ArrayList) obj.getDataList();
				try {
					// write data
					Converter.writeData(data3, Converter.patientData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:// referral
				ArrayList<Referral> data4 = new ArrayList<Referral>();
				data4 = (ArrayList) obj.getDataList();
				try {
					// write data
					Converter.writeData(data4, Converter.refData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:// staff
				ArrayList<Staff> data5 = new ArrayList<Staff>();
				data5 = (ArrayList) obj.getDataList();
				try {
					// write data
					Converter.writeData(data5, Converter.staffData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:// login
				ArrayList<Login> data6 = new ArrayList<Login>();
				data6 = (ArrayList) obj.getDataList();
				// write data
				try {
					Converter.writeData(data6, Converter.userBase);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		} else { // single instance of object
			switch (classType) {
			case 0:// appointment
					// take list data from server, add new element, write updated list in dataBase
				ArrayList<Appointment> data = new ArrayList<Appointment>();
				data = (ArrayList<Appointment>) Converter.readData(Converter.aptData);
				data.add((Appointment) obj.getDataInstance());
				try {
					// write data
					Converter.writeData(data, Converter.aptData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 1:// doctor
				// take list data from server, add new element, write updated list in dataBase
				ArrayList<Doctor> data1 = new ArrayList<Doctor>();
				data1 = (ArrayList<Doctor>) Converter.readData(Converter.docData);
				data1.add((Doctor) obj.getDataInstance());
				try {
					// write data
					Converter.writeData(data1, Converter.docData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:// hospitalMember
				// take list data from server, add new element, write updated list in dataBase
				ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
				data2 = (ArrayList<HospitalMember>) Converter.readData(Converter.hmData);
				data2.add((HospitalMember) obj.getDataInstance());
				try {
					// write data
					Converter.writeData(data2, Converter.hmData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:// patient
				// take list data from server, add new element, write updated list in dataBase
				ArrayList<Patient> data3 = new ArrayList<Patient>();
				data3 = (ArrayList<Patient>) Converter.readData(Converter.patientData);
				data3.add((Patient) obj.getDataInstance());
				try {
					// write data
					Converter.writeData(data3, Converter.patientData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:// referral
				// take list data from server, add new element, write updated list in dataBase
				ArrayList<Referral> data4 = new ArrayList<Referral>();
				data4 = (ArrayList<Referral>) Converter.readData(Converter.refData);
				data4.add((Referral) obj.getDataInstance());
				try {
					// write data
					Converter.writeData(data4, Converter.refData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:// staff
				// take list data from server, add new element, write updated list in dataBase
				ArrayList<Staff> data5 = new ArrayList<Staff>();
				data5 = (ArrayList<Staff>) Converter.readData(Converter.staffData);
				data5.add((Staff) obj.getDataInstance());
				try {
					// write data
					Converter.writeData(data5, Converter.staffData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:// login
				ArrayList<Login> data6 = new ArrayList<Login>();
				data6 = (ArrayList<Login>) Converter.readData(Converter.userBase);
				data6.add((Login)obj.getDataInstance());
				// write data
				try {
					Converter.writeData(data6, Converter.userBase);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
	}

	// READ DATA FROM SERVER
	@SuppressWarnings("unchecked")
	protected void findTypeAndRead(ConnectionToClient client, int classType) throws IOException {
		// WE ONLY EVER READ FULL DATABASE FILES(ArrayLists)
		switch (classType) {
		// Get arraylist of data appointment
		case 0:// appointment
			ArrayList<Appointment> data = new ArrayList<Appointment>();
			data = (ArrayList<Appointment>) Converter.readData(Converter.aptData);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj = new Objectinator(data, classType);
			client.sendToClient(obj);
			break;
		// Get arraylist of doctor data
		case 1:// doctor
			ArrayList<Doctor> data1 = new ArrayList<Doctor>();
			data1 = (ArrayList<Doctor>) Converter.readData(Converter.docData);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj1 = new Objectinator(data1, classType);
			client.sendToClient(obj1);
			break;
		// Get arraylist of hospitalMember data
		case 2:// hospitalMember
			ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
			data2 = (ArrayList<HospitalMember>) Converter.readData(Converter.hmData);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj2 = new Objectinator(data2, classType);
			client.sendToClient(obj2);
			break;
		case 3:// patient
				// Get arraylist of patient data
			ArrayList<Patient> data3 = new ArrayList<Patient>();
			data3 = (ArrayList<Patient>) Converter.readData(Converter.patientData);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj3 = new Objectinator(data3, classType);
			client.sendToClient(obj3);
			break;
		case 4:// referral
				// Get arraylist of referral data
			ArrayList<Referral> data4 = new ArrayList<Referral>();
			data4 = (ArrayList<Referral>) Converter.readData(Converter.refData);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj4 = new Objectinator(data4, classType);
			client.sendToClient(obj4);
			break;
		case 5:// staff
				// Get arraylist of staff data
			ArrayList<Staff> data5 = new ArrayList<Staff>();
			data5 = (ArrayList<Staff>) Converter.readData(Converter.staffData);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj5 = new Objectinator(data5, classType);
			client.sendToClient(obj5);
			break;
		case 6:// login
			// Get arraylist of login data
			ArrayList<Login> data6 = new ArrayList<Login>();
			data6 = (ArrayList<Login>) Converter.readData(Converter.userBase);
			//WRAP DATA AS OBJECTINATOR TYPE
			Objectinator obj6 = new Objectinator(data6, classType);
			client.sendToClient(obj6);
			break;
		}
	}

}

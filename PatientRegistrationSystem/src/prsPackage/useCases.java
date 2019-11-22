package prsPackage;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JTextArea;
import OCSF.GFG;
import OCSF.MyClient;
import OCSF.Objectinator;

public class useCases {

	private int hospMem = 2;
	private int staffMem = 5;
	private int patMem = 3;
	private int docMem = 1;
	private int refMem = 4;
	private int appMem = 0;
	private int userMem = 6;
	
	// PETER
	@SuppressWarnings("unchecked")
	public void browseDoctorSchedule() {
		// get up to date list of all doctors
		ArrayList<Doctor> docList = new ArrayList<Doctor>();
		docList = (ArrayList<Doctor>) Converter.readData(Converter.docData);
		for (int counter = 0; counter < docList.size(); counter++) {
			docList.get(counter).getSpecialty();
		}

	}



	// CHACKO //send instance
	public void reqDocApp() {
	}
	
	public void editDocApp() {
		
	}
	
	public void cancleDocApp() {
		
	}

	// CHACKO //send instance
	public void reqDocApp(HospitalMember hm) { // hospital member
		// doctors arraylist is sent from converter class

		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
		int chosen;
		for (int counter = 0; counter < doctor.size(); counter++) {
			System.out.println(
					"Last name: " + doctor.get(counter).getLName() + "First name: " + doctor.get(counter).getFName());
		}

		// From a scroll down list, user select's one doctor
		chosen = 1; // from gui
		// gui calender is open

		for (int counter = 0; counter < doctor.get(1).getDoctorSchedule().size(); counter++) {

			/* gui.highlight calender */
			doctor.get(chosen).getDoctorSchedule().get(counter).getDate(); // contains time too.
			// duration is 2 hours per appointment, so highlight that on the calendar
		}
		// patient sees doc's schedule
		// patient selects date and time of appointment
		// patient sees doc's schedule
		// patient selects date and time of appointment

	}

	// CHACKO
	public void scheduleDocTimetable() {

	}

	// patient diagnoses and Prescriptions //CHACKO //DONT WORRY ABOUT THIS TOO MUCH
	// OR HMU IF CONFUSED CAUSE WE MAY NEED TO EDIT UML FOR THIS
	public void enterRecords() {

	}

	// CHACKO //DONT WORRY ABOUT THIS TOO MUCH OR HMU IF CONFUSED CAUSE WE MAY NEED
	// TO EDIT UML FOR THIS
	public void browseRecords() {

	}

	// PETER ONLY ADMIN HAS ACCESS
	public void addMember() {
		//call signup function
	}

	// PETER  ONLY ADMIN HAS ACCESS
	//assume gui 
	public void removeMember(String user, MyClient client) {
		//pull list of hospital members from server
		
		client.sendToServer(Objectinator.createDataMsg(false, 2));
		
	}

	// CHACKO
	public void modifyApp() {

	}

	// CHACKO
	public void cancleApp() {

	}

	// PETER
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void viewRef(Patient p, MyClient client) {
		// pull referral data from server
		try {
			client.sendToServer(Objectinator.createDataMsg(false, refMem));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Referral> tempList = client.refData;
		tempList = (ArrayList) Converter.readData(Converter.refData);

		// find referrals matching patient name
		for (int i = 0; i < tempList.size(); i++) {
			if (tempList.get(i).getPatientNameF() != p.getFName() || tempList.get(i).getPatientNameL() != p.getLName())
				tempList.remove(i);
		}
		////////////////////////////////////////////
		// print data
		for (int i = 0; i < tempList.size(); i++) {
			JTextArea j = new JTextArea(); // TEMP UNTIL GUI FINISHED
			j.setText(tempList.get(i).toString());
		}
		////////////////////////////////////////////
	}

	// overload method base on user type
	public void viewRef(Staff s, String keyWord, MyClient client) {
		// pull referral data from server
		try {
			client.sendToServer(Objectinator.createDataMsg(false, refMem));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Referral> tempList = client.refData;
		tempList = (ArrayList) Converter.readData(Converter.refData);

		//////////////////////////////////////////////////////////
		// print all of the referrals
		for (int i = 0; i < tempList.size(); i++) {
			JTextArea j = new JTextArea(); // TEMP UNTIL GUI FINISHED
			j.setText(tempList.get(i).toString());
		}
		////////////////////////////////////////////////////////////
	}

	// PETER
	// must check that patient exists in iHandler before sending to method
	public void createRef(Staff s, String refDoc, Patient p, MyClient client) {
		Referral r = new Referral(refDoc, s.getFName(), s.getLName(), p.getFName(), p.getLName());
		Objectinator obj = new Objectinator(true, r, r.getClassID());
		client.sendToServer(Objectinator.createDataMsg(true, typeIdentifier));
		// DONE
	}

	public void signUp() {
		
	}
	
	public int login(String userName, String passWord, MyClient client) {
		// create temp login instance to scan match userBase
		Login log = new Login(userName, passWord);

		// encrypt the password
		try {
			log.setPassword(GFG.toHexString(GFG.getSHA(passWord)));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// send userBase pull request to server
		try {
			client.sendToServer(Objectinator.createDataMsg(false, 6));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// set list to data retrieved from server and search for match
		ArrayList<Login> list = (ArrayList) client.loginData;
		for (int i = 0; i < list.size(); i++) {
			// check username
			if (userName == list.get(i).getUserName()) {
				// check password
				if (log.getPassword() == list.get(i).getPassword()) {
					// return instance type
					return list.get(i).getClassID();
				} else {
					return -1; // incorrect password
				}
			}
		}
		// if no match is found
		return -2;
	}
}
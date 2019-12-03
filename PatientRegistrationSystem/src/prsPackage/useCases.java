package prsPackage;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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
	private int admin = 10;
	
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
	public void reqDocApp(Patient patient, MyClient client, Appointment appointment) { // hospital member
		
		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
		doctor = (ArrayList<Doctor>)Converter.readData(Converter.docData);
		
		ArrayList<Integer> editableAppointments = new ArrayList<Integer>(); //Stores location of DoctorSchedules the patient can edit
		
		String LName = "GUI", FName = "GUI";
		//Get String values from GUI
		
		Doctor selectedDoctor = null;
		int counter;
		
		for(counter = 0; counter < doctor.size(); counter++) {
			if(doctor.get(counter).getLName() == LName && doctor.get(counter).getFName() == FName) {
				selectedDoctor = doctor.get(counter);
			}			
		}
		
		for(counter = 0; counter < selectedDoctor.getDoctorSchedule().size(); counter++) {
			if (appointment.getDate() == selectedDoctor.getDoctorSchedule().get(counter).getDate()) {
				counter = -1;
				break;
			}
		}
		
		if (counter == -1)
			System.out.println("\nDoctor already has an appoinment at the selected time");
		else ;
		

		
	
//		// doctors arraylist is sent from converter class
//
//		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
//		doctor = (ArrayList<Doctor>)Converter.readData(Converter.docData);
//		int chosen;
//		for (int counter = 0; counter < doctor.size(); counter++) {
//			System.out.println(
//					"Last name: " + doctor.get(counter).getLName() + "First name: " + doctor.get(counter).getFName());
//		}
//
//		// From a scroll down list, user select's one doctor
//		chosen = 1; // from gui
//		// gui calender is open
//
//		for (int counter = 0; counter < doctor.get(chosen).getDoctorSchedule().size(); counter++) {
//
//			// gui.highlight calender */
//			doctor.get(chosen).getDoctorSchedule().get(counter).getDate(); // contains time too.
//			
//			// duration is 2 hours per appointment, so highlight that on the calendar
//		}
//		
//		// patient sees doc's schedule
//		// patient selects date and time of appointment
		

	}

	//chacko
	public void editDocApp(Patient patient, MyClient client) {
		
		//get doc schedule Arraylist from server
		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
		doctor = (ArrayList<Doctor>)Converter.readData(Converter.docData);
		
		ArrayList<Integer> editableAppointments = new ArrayList<Integer>(); //Stores location of DoctorSchedules the patient can edit
		
		String LName = "GUI", FName = "GUI";
		//Get String values from GUI
		
		Doctor selectedDoctor = null;
		
		for(int counter = 0; counter < doctor.size(); counter++) {
			if(doctor.get(counter).getLName() == LName && doctor.get(counter).getFName() == FName) {
				selectedDoctor = doctor.get(counter);
			}			
		}
		
		for(int counter = 0; counter < selectedDoctor.getDoctorSchedule().size(); counter++) {
			if(patient == selectedDoctor.getDoctorSchedule().get(counter).getPatient()) {
				editableAppointments.add(counter);
				
			}
		}
		//find the one to edit(has to be the same user for patient, staff can edit any appointment)
		//get new appointment details: date and time
		//replace the one in the Arraylist
		//done
		
	}
	
	//chacko
	public void cancleDocApp(Patient patient, MyClient client) {
		
		ArrayList<Doctor> doctor = null;
		doctor = (ArrayList<Doctor>)Converter.readData(Converter.docData);
		
		//ArrayList<Integer> editableAppointments = new ArrayList<Integer>(); //Stores location of DoctorSchedules the patient can edit
		
		String LName = "GUI", FName = "GUI";
		//Get String values from GUI
		
		Doctor selectedDoctor = null;
		int counter;
		
		for(counter = 0; counter < doctor.size(); counter++) {
			if(doctor.get(counter).getLName() == LName && doctor.get(counter).getFName() == FName) {
				selectedDoctor = new Doctor(doctor.get(counter));
			}			
		}
		
		for(counter = 0; counter < selectedDoctor.getDoctorSchedule().size(); counter++) {
			if(patient == selectedDoctor.getDoctorSchedule().get(counter).getPatient()) {
				//editableAppointments.add(counter);	
				System.out.println("Appointment " + counter + 1 + ":" + selectedDoctor.getDoctorSchedule().get(counter).getDate()); //GUI
			}
		}
		
		//Input from GUI User
		//assuming we take in appointment number from user
		//calling this input "delete-counter", it needs to be user input -1
		int deleteCounter = counter-1;
		
		selectedDoctor.getDoctorSchedule().remove(deleteCounter);
		DoctorSchedule selectedDoctorSchedule = null;
		selectedDoctorSchedule = selectedDoctor.getDoctorSchedule().get(deleteCounter);
		
		
		ArrayList<Doctor> newDoctor = new ArrayList<Doctor>(); //Creating a new arraylist without the selected appointment/doctor schedule
		newDoctor = null;
		int newCounter = 0;
		
		for(counter = 0; counter < doctor.size(); counter++) { //Go through all doctors
			if(selectedDoctor.getLoginUser() == doctor.get(counter).getLoginUser()) {
				newDoctor.add(selectedDoctor);
			}
			else if(newDoctor.get(newCounter) != doctor.get(counter)) {
				newDoctor.add(doctor.get(counter));
				if(newCounter == 0)
					continue;
				newCounter++;
			}
		}
		
		// Print and test
		
		try {
			client.sendToServer(Objectinator.createDataMsg(true, newDoctor, 1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
	
	public void editRecords() {
		
	}


	// PETER  ONLY ADMIN HAS ACCESS
	//assume gui 
	public void removeMember(String user, MyClient client) {
		//pull list of hospital members from server
		
	//	client.sendToServer(Objectinator.createDataMsg(false, 2));
		
	}


	// PETER
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void viewRef(Patient p, MyClient client) {
		// pull referral data from server
		try {
			client.sendToServer(Objectinator.createDataMsg(refMem));
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
			client.sendToServer(Objectinator.createDataMsg(refMem));
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
	public static void createRef(Staff s, String refDoc, Patient p, MyClient client) {  //DONE
		Referral r = new Referral(refDoc, s.getFName(), s.getLName(), p.getFName(), p.getLName());
		try {
			client.sendToServer(Objectinator.createDataMsg(true, r, 4));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	// DONE

	//peter
	public void removeRef() {
		
	}

	
	//peter DONE
	public static int login(String userName, String passWord, MyClient client) {
		// create temp login instance to scan match userBase
		LoginCard log = new LoginCard(userName, passWord);

		// encrypt the password
		try {
			log.setPassword(GFG.toHexString(GFG.getSHA(passWord)));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// send userBase pull request to server
		try {
			client.sendToServer(Objectinator.createDataMsg(6));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// set list to data retrieved from server and search for match
		ArrayList<LoginCard> list = (ArrayList) client.loginData;
		for (int i = 0; i < list.size(); i++) {
			// check username
		
			if (userName.contentEquals(list.get(i).getUserName())) {
				// check password
				if (log.getPassword().contentEquals(list.get(i).getPassword()) ) {
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
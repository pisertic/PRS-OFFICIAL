package prsPackage;


import java.util.ArrayList;

import javax.swing.JTextArea;

import OCSF.MyClient;

public class useCases{
	
	//PETER
	@SuppressWarnings("unchecked")
	public void browseDoctorSchedule() {
	//get up to date list of all doctors
	ArrayList <Doctor> docList = new ArrayList<Doctor>();
	docList = (ArrayList)Converter.readData(Converter.docData);
	for(int counter = 0; counter <docList.size(); counter++) {
		docList.get(counter).getSpecialty();
	}
	
	}
	
	//CHACKO
	public void reqDocApp() {
		
	}
	
	//CHACKO
	public void scheduleDocTime() {
		
	}
	
	//patient diagnoses and Prescriptions //CHACKO //DONT WORRY ABOUT THIS TOO MUCH OR HMU IF CONFUSED CAUSE WE MAY NEED TO EDIT UML FOR THIS
	public void enterRecords() {
		
	}
	 //CHACKO //DONT WORRY ABOUT THIS TOO MUCH OR HMU IF CONFUSED CAUSE WE MAY NEED TO EDIT UML FOR THIS
	public void browseRecords() {
		
	}
	
	//PETER
	public void addMember() {
		
	}
	//PETER
	public void removeMember() {
		
	}
	
	//CHACKO
	public void modifyApp() {
		
	}
	
	//CHACKO
	public void cancleApp() {
		
	}
	
	//PETER
	public void viewRef(Patient p) {
		//pull referral data from server
		ArrayList<Referral> tempList = new ArrayList<Referral>();
		tempList = (ArrayList) Converter.readData(Converter.refData);
		
		//find referrals matching patient name
		for(int i = 0; i < tempList.size() ; i++) {
			if(tempList.get(i).getPatientNameF() != p.getFName() && tempList.get(i).getPatientNameL() != p.getLName())
				tempList.remove(i);
		}
		
		//print data
		for(int i = 0; i < tempList.size(); i++) {
		JTextArea j = new JTextArea(); //TEMP UNTIL GUI FINISHED
		j.setText(tempList.get(i).toString());
		}
	}
	
	//overload method base on user type
	public void viewRef(Staff s, String keyWord) {
		//pull referral data from server
		ArrayList<Referral> tempList = new ArrayList<Referral>();
		tempList = (ArrayList) Converter.readData(Converter.refData);
			
		//print all of the referrals
		for(int i = 0; i < tempList.size(); i++) {
		JTextArea j = new JTextArea(); //TEMP UNTIL GUI FINISHED
		j.setText(tempList.get(i).toString());
		}
	}
	
	//PETER
	//must check that patient exists in iHandler before sending to method
	public void createRef(Staff s, String refDoc, Patient p) {
		Referral r = new Referral(refDoc, s.getFName(), s.getLName(), p.getFName(), p.getLName());
		//send referral to server
	//MyClient.clientRequest(keyword, methodIdentifier);
	}
	
}
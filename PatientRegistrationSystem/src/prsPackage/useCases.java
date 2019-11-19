package prsPackage;


import java.util.ArrayList;

public class useCases{
	
	//PETER
	@SuppressWarnings("unchecked")
	public void browseDoctorSchedule() {
	//get up to date list of all doctors
	ArrayList <Doctor> docList = new ArrayList<Doctor>();
	docList = (ArrayList<Doctor>)Converter.readData(Converter.docData);
	
	
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
	public void viewRef() {
		
	}
	
	//PETER
	public void createRef() {
		
	}
	
}
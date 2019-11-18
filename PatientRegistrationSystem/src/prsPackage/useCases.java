package prsPackage;


import java.util.ArrayList;

public class useCases{
	

	@SuppressWarnings("unchecked")
	public void browseDoctorSchedule() {
	//get up to date list of all doctors
	ArrayList <Doctor> docList = new ArrayList<Doctor>();
	docList = (ArrayList<Doctor>)Converter.readData(Converter.docData);
	
	
	}
	
	public void reqDocApp() {
		
	}
	
	public void scheduleDocTime() {
		
	}
	
	//patient diagnoses and Prescriptions
	public void enterRecords() {
		
	}
	
	public void browseRecords() {
		
	}
	
	public void addMember() {
		
	}
	
	public void removeMember() {
		
	}
	
	public void modifyApp() {
		
	}
	
	public void cancleApp() {
		
	}
	
	public void viewRef() {
		
	}
	
	public void createRef() {
		
	}
	
}
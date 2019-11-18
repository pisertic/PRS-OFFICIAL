package prsPackage;


import java.util.ArrayList;

public class useCases{
	

	@SuppressWarnings("unchecked")
	public void browseDoctorSchedule() {
	//get up to date list of all doctors
	ArrayList <Doctor> docList = new ArrayList<Doctor>();
	docList = (ArrayList<Doctor>)Converter.readData(Converter.docData);
	while(int counter = 0; counter < docList.size(); counter++) {
		
	}
	
	
	
	
	}
}
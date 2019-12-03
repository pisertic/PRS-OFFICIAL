package prsPackage;

import java.util.ArrayList;

public class Doctor extends Staff{
//create attributes
	private String specialty;
	private String rank;
	private float workingHours;
	private ArrayList<DoctorSchedule> doctorSchedule;
	private ArrayList<Referral> referral;
	
	//create constructor 
	public Doctor(String specialty, String rank, float workingHours,    //Doctor attributes
			String fName, String lName, String department, int empNum, String address, int SIN) {					//Staff attributes
		super(fName, lName, department, empNum,  address, SIN);
		this.specialty = specialty;
		this.rank = rank;
		this.workingHours = workingHours;
		this.doctorSchedule = null;
		this.referral = null;
	}
	
	public Doctor(Doctor doctor) {
		// TODO Auto-generated constructor stub
		super(doctor.getFName(), doctor.getLName(), doctor.getDepartment(), doctor.getEmpNum(), doctor.getAddress(), doctor.getSIN());
		this.specialty = doctor.getSpecialty();
		this.rank = doctor.getRank();
		this.workingHours = doctor.getWorkingHours();
		this.doctorSchedule = doctor.getDoctorSchedule();
		this.referral = doctor.getRefferal();
		
	}
	
	//gets/sets
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public float getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(float workingHours) {
		this.workingHours = workingHours;
	}

	public ArrayList<DoctorSchedule> getDoctorSchedule() {
		return doctorSchedule;
	}

	public void setDoctorSchedule(DoctorSchedule doctorSchedule) {
		this.doctorSchedule.add(doctorSchedule);
	}

	public ArrayList<Referral> getRefferal() {
		return referral;
	}

	public void setRefferal(ArrayList<Referral> referral) {
		this.referral = referral;
	}
	

	
}

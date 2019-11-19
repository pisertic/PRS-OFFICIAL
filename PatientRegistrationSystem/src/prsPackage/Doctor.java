package prsPackage;

import java.util.ArrayList;

public class Doctor extends Staff{
//create attributes
	private String specialty;
	private String rank;
	private float workingHours;
	private ArrayList<DoctorSchedule> doctorSchedule;
	private Referral referral;
	private int methodID;
	
	//create constructor 
	public Doctor(String specialty, String rank, float workingHours, DoctorSchedule doctorSchedule, Referral referral,  //Doctor attributes
			      String d, int num, int pass, String fName, String lName, String address, int SIN) {					//Staff attributes
		super(d, num, pass, fName, lName, address, SIN);
		this.specialty = specialty;
		this.rank = rank;
		this.workingHours = workingHours;
		this.doctorSchedule = null;
		this.referral = referral;
		methodID = 3;
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

	public Referral getRefferal() {
		return referral;
	}

	public void setRefferal(Referral referral) {
		this.referral = referral;
	}
	
	public int getMethodID() {
		return methodID;
	}

	
}

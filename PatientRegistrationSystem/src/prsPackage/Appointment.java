package prsPackage;

import java.util.Date;

public class Appointment {
//create attributes
	private Date date;
	private Date time;
	private String reason;
	private Patient patient;
	private Doctor doctor;
	
	//create constructor
	public Appointment(Date date, Date time, String reason, Patient patient, Doctor doctor){
		this.date = date;
		this.time = time;
		this.reason = reason;
		this.patient = patient;
		this.doctor = doctor;
	}
	
	//create gets/sets
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	//testing commit changes for chack
	
}

//Work on this class for the use case
package prsPackage;

import java.io.Serializable;
import java.util.Date;

public class DoctorSchedule implements Serializable {
//create attributes
	private Date date;
	private Patient patient;
	//private Date time; 
	private float duration;
	
	//create constructor
	public DoctorSchedule(Date date, float duration, Patient patient) {
		this.date = date;
		//this.time = time;
		this.patient = patient;
		this.duration = duration;
	}

	//gets/sets
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}	
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}

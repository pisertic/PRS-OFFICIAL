//Work on this class for the use case
package prsPackage;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DoctorSchedule implements Serializable {
//create attributes
	private Date date;
	private Patient patient;
	private SimpleDateFormat formatter;
	private float duration;
	
	//create constructor
	public DoctorSchedule(Date date, float duration, Patient patient) {
		this.date = date;
		//this.time = time;
		this.patient = patient;
		this.duration = duration;
		formatter = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
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
	
	public String getDetails() {
		String details = "Date:" + (String)formatter.format(getDate()) + " Duration:" + getDuration() + System.lineSeparator();
		return details;
	}

}

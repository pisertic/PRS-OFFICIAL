//Work on this class for the use case
package prsPackage;

import java.io.Serializable;
import java.util.Date;

public class DoctorSchedule implements Serializable {
//create attributes
	private Date date;
	//private Date time; 
	private float duration;
	
	//create constructor
	public DoctorSchedule(Date date, float duration) {
		this.date = date;
		//this.time = time;
		this.duration = duration;
	}

	//gets/sets
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public Date getTime() {
//		return time;
//	}
//
//	public void setTime(Date time) {
//		this.time = time;
//	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}	

}

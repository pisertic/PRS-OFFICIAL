//Work on this class for the use case
package prsPackage;

import java.io.Serializable;
import java.util.Date;

public class DoctorSchedule implements Serializable {
//create attributes
	private Date date;
	private Date time; 
	private Date duration; //You sure?
	
	//create constructor
	public DoctorSchedule(Date date, Date time, Date duration) {
		this.date = date;
		this.time = time;
		this.duration = duration;
	}

	//gets/sets
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

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}	

}

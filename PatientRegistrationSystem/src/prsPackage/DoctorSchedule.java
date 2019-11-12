package prsPackage;

import java.util.Date;

public class DoctorSchedule {
//create attributes
	private Date date;
	private Date time;
	private Date duration;
	
	//create constructor
	public DoctorSchedule() {
		// TODO Auto-generated constructor stub
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

package prsPackage;

import java.util.Date;

public class Records {
//create attributes
	private Date date;
	private String notes;
	
	//create constructor
	public Records(Date date, String notes) {
		this.date = date;
		this.notes = notes;
	}

	//gets/sets
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	
}

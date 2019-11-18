package prsPackage;

import java.io.Serializable;
import java.util.Date;

public class Records implements Serializable {
//create attributes
	private Date date;
	private String notes; 
	private int methodID;
	
	//create constructor
	public Records(Date date, String notes) {
		this.date = date;
		this.notes = notes;
		methodID = 8;
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
	
	public int getMethodID() {
		return methodID;
	}

	
}

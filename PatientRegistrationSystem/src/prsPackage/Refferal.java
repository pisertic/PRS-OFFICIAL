package prsPackage;

import java.io.Serializable;

public class Refferal implements Serializable{
//create attributes
	private String refDoc;
	private String refStaff;
	private String refPatient;
	private int methodID;
		
	//create constructor
	public Refferal() {
		// TODO Auto-generated constructor stub
		methodID = 9;
	}

	//gets/sets
	public String getRefDoc() {
		return refDoc;
	}

	public void setRefDoc(String refDoc) {
		this.refDoc = refDoc;
	}

	public String getRefStaff() {
		return refStaff;
	}

	public void setRefStaff(String refStaff) {
		this.refStaff = refStaff;
	}

	public String getRefPatient() {
		return refPatient;
	}

	public void setRefPatient(String refPatient) {
		this.refPatient = refPatient;
	}
	
	public int getMethodID() {
		return methodID;
	}

	
}

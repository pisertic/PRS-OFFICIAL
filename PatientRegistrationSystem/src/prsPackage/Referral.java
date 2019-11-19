package prsPackage;

import java.io.Serializable;

public class Referral implements Serializable{
//create attributes
	private String refDoc;
	private String refNameF;
	private String refNameL;
	private String patientNameF;
	private String patientNameL;
	private int methodID;
		
	//create constructor
	public Referral() {
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

	public String getRefNameF() {
		return refNameF;
	}

	public void setRefNameF(String refNameF) {
		this.refNameF = refNameF;
	}

	public String getRefNameL() {
		return refNameL;
	}

	public void setRefNameL(String refNameL) {
		this.refNameL = refNameL;
	}
	
	public String getPatientNameL() {
		return patientNameL;
	}

	public void setPatientNameL(String patientNameL) {
		this.patientNameL = patientNameL;
	}
	
	public String getPatientNameF() {
		return patientNameF;
	}

	public void setPatientNameF(String patientNameF) {
		this.patientNameF = patientNameF;
	}
	
	//toString
	public String toString() {
		String msg = "Refered Doctor: " + refDoc + "\nReferring Staff: " + refNameF 
					+ " " + refNameL + "\nPatient: " + patientNameF + " " + patientNameL;
		return msg;
	}
	public int getMethodID() {
		return methodID;
	}

	
}

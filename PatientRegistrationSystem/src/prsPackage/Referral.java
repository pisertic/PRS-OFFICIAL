package prsPackage;

import java.io.Serializable;


public class Referral implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -2054837507676055632L;
//create attributes
	private String refDoc;
	private String staffNameF;
	private String staffNameL;
	private String patientNameF;
	private String patientNameL;


	// create constructor
	public Referral(String rD, String rNameF, String rNameL, String pNameF, String pNameL) {
		refDoc = rD;
		staffNameF = rNameF;
		staffNameL = rNameL;
		patientNameF = pNameF;
		patientNameL = pNameL;
	}

	// gets/sets
	public String getRefDoc() {
		return refDoc;
	}

	public void setRefDoc(String refDoc) {
		this.refDoc = refDoc;
	}

	public String getRefNameF() {
		return staffNameF;
	}

	public void setRefNameF(String refNameF) {
		this.staffNameF = refNameF;
	}

	public String getRefNameL() {
		return staffNameL;
	}

	public void setRefNameL(String refNameL) {
		this.staffNameL = refNameL;
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

	// toString
	public String toString() {
		String msg = "Refered Doctor: " + refDoc + "\nReferring Staff: " + staffNameF + " " + staffNameL + "\nPatient: "
				+ patientNameF + " " + patientNameL;
		return msg;
	}

}

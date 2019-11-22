package prsPackage;

//to write objects into file
import java.io.Serializable;

public class HospitalMember implements Serializable {
	// create serializable id
	private static final long serialVersionUID = 1L;

//create attributes
	private String fName;
	private String lName;
	private Login login;

//create constructor
	public HospitalMember(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		login = null;
	}

//create gets
	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

//create sets
	public void setFName(String fName) {
		this.fName = fName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

}

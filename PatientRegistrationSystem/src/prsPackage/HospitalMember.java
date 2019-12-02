package prsPackage;

//to write objects into file
import java.io.Serializable;

public class HospitalMember implements Serializable {
	// create serializable id
	private static final long serialVersionUID = 1L;

//create attributes
	private String fName;
	private String lName;
	private LoginCard loginCard;

//create constructor
	public HospitalMember(String fName, String lName, LoginCard loginCard) {
		this.fName = fName;
		this.lName = lName;
		this.loginCard = loginCard;
	}

//create gets
	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}
	
	public String getLoginUser() {
		return loginCard.getUserName();
	}
	
	public String getLoginPass() {
		return loginCard.getPassword();
	}

//create sets
	public void setFName(String fName) {
		this.fName = fName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	
}

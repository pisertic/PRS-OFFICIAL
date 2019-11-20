package prsPackage;

//to write objects into file
import java.io.Serializable;

public class HospitalMember implements Serializable {
	//create serializable id
	private static final long serialVersionUID = 1L;
	
//create attributes
private String fName;
private String lName;
private String address;
private int SIN;
private Login login;
private int methodID;

//create constructor
public HospitalMember(String fName, String lName, String address, int SIN, String userName, String password) {
	this.fName = fName;
	this.lName = lName;
	this.address = address;
	this.SIN = SIN;
	methodID = 2;
}

//create gets
public String getFName() {
	return fName;
}

public String getLName() {
	return lName;
}

public String getAddress() {
	return address;
}

public int getSIN() {
	return SIN;
}

//create sets
public void setFName(String fName) {
	this.fName = fName;
}

public void setLName(String lName) {
	this.lName = lName;
}

public void setAddress(String address) {
	this.address = address;
}

public void setSIN(int SIN) {
	this.SIN = SIN;
}

public int getMethodID() {
	return methodID;
}

}

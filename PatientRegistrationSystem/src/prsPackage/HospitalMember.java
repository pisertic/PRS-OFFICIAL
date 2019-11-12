package prsPackage;

public class HospitalMember {
	//create attributes
private String fName;
private String lName;
private String address;
private int SIN;

//create constructor
public HospitalMember() {
	
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

}

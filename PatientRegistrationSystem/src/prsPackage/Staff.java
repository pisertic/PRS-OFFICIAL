package prsPackage;

import java.util.ArrayList;

public class Staff extends HospitalMember {
//create attributes
	private String department;
	private int empNum;
	private String address;
	private int SIN;
	private ArrayList<Appointment> appointments;

	// create constructor
	public Staff(String fName, String lName, String department, int empNum, String address, int SIN) {
		super(fName, lName);
		this.address = address;
		this.SIN = SIN;
		this.department = department;
		this.empNum = empNum;
	}
	
	public Staff() {
		
	}

	// create gets/sets
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getAddress() {
		return address;
	}

	public int getSIN() {
		return SIN;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSIN(int SIN) {
		this.SIN = SIN;
	}

}

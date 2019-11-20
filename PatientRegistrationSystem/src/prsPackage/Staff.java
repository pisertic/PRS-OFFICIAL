package prsPackage;

public class Staff extends HospitalMember{
//create attributes
	private String department;
	private int empNum;
	private int passLvl;
	private int methodID;
	
	//create constructor
	public Staff(String d, int num, int pass, String fName, String lName, String address, int SIN) {
		super(fName, lName, address, SIN);
		department = d;
		empNum = num;
		passLvl = pass;
		methodID = 5;
	}

	//create gets/sets
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

	public int getPassLvl() {
		return passLvl;
	}

	public void setPassLvl(int passLvl) {
		this.passLvl = passLvl;
	}
	
	public int getMethodID() {
		return methodID;
	}
	
	
}

package prsPackage;

public class Staff {
//create attributes
	private String department;
	private int empNum;
	private int passLvl;
	
	//create constructor
	public Staff(String d, int num, int pass) {
		department = d;
		empNum = num;
		passLvl = pass;
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
	
	
}

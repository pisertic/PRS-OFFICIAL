package prsPackage;

public class Doctor {
//create attributes
	private String specialty;
	private String rank;
	private float workingHours;
	private DoctorSchedule doctorSchedule;
	private Refferal refferal;
	
	//create constructor 
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	
	//gets/sets
	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public float getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(float workingHours) {
		this.workingHours = workingHours;
	}

	public DoctorSchedule getDoctorSchedule() {
		return doctorSchedule;
	}

	public void setDoctorSchedule(DoctorSchedule doctorSchedule) {
		this.doctorSchedule = doctorSchedule;
	}

	public Refferal getRefferal() {
		return refferal;
	}

	public void setRefferal(Refferal refferal) {
		this.refferal = refferal;
	}

	
}

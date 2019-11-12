package prsPackage;

public class Patient extends HospitalMember {
//create attributes
	private HealthCard healthCard;
	private Records records;
	
	//create constructor
	public Patient(HealthCard h, Records r, String fName, String lName, String address, int SIN) {
		super(fName, lName, address, SIN);
		healthCard = h;
		records =r;
	}

	
	//create gets/sets
	public HealthCard getHealthCard() {
		return healthCard;
	}

	public void setHealthCard(HealthCard healthCard) {
		this.healthCard = healthCard;
	}

	public Records getRecords() {
		return records;
	}

	public void setRecords(Records records) {
		this.records = records;
	}
	
	
	
}

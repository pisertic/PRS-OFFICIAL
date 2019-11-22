package prsPackage;

public class Patient extends HospitalMember {
//create attributes
	private HealthCard healthCard;
	private Records records;
	private String address;
	private int SIN;

	// create constructor
	public Patient(HealthCard h, Records r, String fName, String lName, String address, int SIN) {
		super(fName, lName);
		healthCard = h;
		records = r;
	}

	// create gets/sets
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

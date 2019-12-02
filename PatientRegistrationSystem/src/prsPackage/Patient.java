package prsPackage;

import java.util.ArrayList;

public class Patient extends HospitalMember {
//create attributes
	private HealthCard healthCard;
	private ArrayList<Records> records;
	private String address;
	private int SIN;

	// create constructor
	public Patient(HealthCard h, String fName, String lName, String address, int SIN, LoginCard card) {
		super(fName, lName, card);
		healthCard = h;
		records =  null;
	}

	// create gets/sets
	public HealthCard getHealthCard() {
		return healthCard;
	}

	public void setHealthCard(HealthCard healthCard) {
		this.healthCard = healthCard;
	}

	public ArrayList<Records> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<Records> records) {
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

package prsPackage;

import java.io.Serializable;
import java.util.Date;

public class HealthCard implements Serializable {
//create attributes
	private int cardNumber;
	private Date expDate;
	private String province;
	
	//create constructor
	public HealthCard(int cardNumber, Date expDate, String province) {
		this.cardNumber = cardNumber;
		this.expDate= expDate;
		this.province = province;
	}

	//gets/sets
	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}

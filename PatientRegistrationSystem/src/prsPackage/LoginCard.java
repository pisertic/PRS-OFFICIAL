package prsPackage;

import java.io.Serializable;

public class LoginCard implements Serializable{

	private String userName;
	private String password;
	private int classID;

	public LoginCard(String userName, String password, int classID) {
		this.userName = userName;
		this.password = password;
		this.classID = classID;
	}

	// when sending login token for check
	public LoginCard(String userName, String password) {
		this.userName = userName;
		this.password = password;
		this.classID = 0;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}
}

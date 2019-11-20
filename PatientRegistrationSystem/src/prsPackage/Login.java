package prsPackage;

public class Login {
	
	String userName;
	String password;
	int classID;
	
	public Login (String userName,String password, int classID) {
		this.userName = userName;
		this.password = password;
		this.classID = classID;
	}
	
	public String getUserName()	{
		return userName;
	}
	
	protected void setUserName(String userName)	{
		this.userName = userName;
	}
	
	public String getPassword()	{
		return password;
	}

	protected void setPassword(String password)	{
		this.password = password;
	}
	
	protected int getClassID()	{
		return classID;
	}
}

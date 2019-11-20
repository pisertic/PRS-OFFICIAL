package OCSF;

//import theOCSF.FileHandling;
import java.io.IOException;
import java.util.ArrayList;

import prsPackage.*;

public class MyServer extends AbstractServer {
 
	public MyServer(int port)   { // Constructor
		super(port); 
	}
	/* ORIGINAL/ DO NOT EDIT
	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
		System.out.println("MyServer: handleMessageFromClient() RECEIVED SOMETHING FROM CLIENT");
		try {
			Objectinator object1 = (Objectinator) msg;
			System.out.println(String.format("MyServer: Client sent following message:\nKeyword: %s\nMethod Identifier: %d" , object1.getKeyword(), object1.getMethodIdentifier()));
			System.out.println("MyServer: Trying to send it back as an echo");  
			client.sendToClient(String.format("You are client %s, I am thread %s. Your original message was: %s", 
					client.getInetAddress(), client.getId(), msg ));
		
			
			System.out.println("MyServer: Done.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("MyServer: Error while sending echo back to client");
			e.printStackTrace();
		}
	} */
	
	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) {
		System.out.println("MyServer: handleMessageFromClient() RECEIVED SOMETHING FROM CLIENT");
		
			Objectinator obj = (Objectinator) msg;
			//determine if reading from server or writing from server
			if(obj.getWrite()) {
				findTypeAndWrite(obj, obj.getTypeIdentifier());
			}else {
				findTypeAndRead(client, obj.getTypeIdentifier());
			}			
		
	} 
	
	//////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("unchecked")
	
	//WRITE DATA TO SERVER
	protected void findTypeAndWrite(Objectinator obj, int classType) {
		//FIND IF WERE DEALING WITH ARRAYLIST OR SINGLE OBJECT INSTANCE
		if(obj.getDataInstance() == null) {
		
		switch (classType) {
		  case 0://appointment
		    ArrayList<Appointment> data = new ArrayList<Appointment>();
		    data = (ArrayList)obj.getDataList();
		    try {
				Converter.writeData(data, Converter.aptData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    break;
		  case 1://doctor
			  ArrayList<Doctor> data1 = new ArrayList<Doctor>();
			    data1 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data1, Converter.docData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    break;
		  case 2://hospitalMember
			  ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
			    data2 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data2, Converter.hmData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    break;
		  case 3://patient
			  ArrayList<Patient> data3 = new ArrayList<Patient>();
			    data3 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data3, Converter.patientData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
		  case 4://referral
			  ArrayList<Referral> data4 = new ArrayList<Referral>();
			    data4 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data4, Converter.refData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
		  case 5://staff
			  ArrayList<Staff> data5 = new ArrayList<Staff>();
			    data5 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data5, Converter.staffData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
		  case 6://login
			    
			    break;
		}
		}else { //single instance of object
			switch (classType) {
			case 0://appointment
				//take list data from server, add new element, write updated list in dataBase
			    ArrayList<Appointment> data = new ArrayList<Appointment>();
			    data = (ArrayList)obj.getDataList();
			    data.add((Appointment)obj.getDataInstance());
			    try {
					Converter.writeData(data, Converter.aptData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
			  case 1://doctor
				//take list data from server, add new element, write updated list in dataBase
				  ArrayList<Doctor> data1 = new ArrayList<Doctor>();
				    data1 = (ArrayList)obj.getDataList();
				    data1.add((Doctor)obj.getDataInstance());
				    try {
						Converter.writeData(data1, Converter.docData);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    break;
			  case 2://hospitalMember
				//take list data from server, add new element, write updated list in dataBase
				  ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
				    data2 = (ArrayList)obj.getDataList();
				    data2.add((HospitalMember)obj.getDataInstance());
				    try {
						Converter.writeData(data2, Converter.hmData);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    break;
			  case 3://patient
				//take list data from server, add new element, write updated list in dataBase
				  ArrayList<Patient> data3 = new ArrayList<Patient>();
				    data3 = (ArrayList)obj.getDataList();
				    data3.add((Patient)obj.getDataInstance());
				    try {
						Converter.writeData(data3, Converter.patientData);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    break;
			  case 4://referral
				//take list data from server, add new element, write updated list in dataBase
				  ArrayList<Referral> data4 = new ArrayList<Referral>();
				    data4 = (ArrayList)obj.getDataList();
				    data4.add((Referral)obj.getDataInstance());
				    try {
						Converter.writeData(data4, Converter.refData);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    break;
			  case 5://staff
				//take list data from server, add new element, write updated list in dataBase
				  ArrayList<Staff> data5 = new ArrayList<Staff>();
				    data5 = (ArrayList)obj.getDataList();
				    data5.add((Staff)obj.getDataInstance());
				    try {
						Converter.writeData(data5, Converter.staffData);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    break;
			  case 6://login
				    
				    break;
			}	
		}
	}
	
	//READ DATA FROM SERVER
	protected void findTypeAndRead(ConnectionToClient client, int classType) {
		//WE ONLY EVER READ FULL DATABASE FILES(ArrayLists)
		switch (classType) {
		  case 0://appointment
		    ArrayList<Appointment> data = new ArrayList<Appointment>();
		    data = (ArrayList<Appointment>)Converter.readData(Converter.aptData);
		    client.sendToClient(data);
		    break;
		  case 1://doctor
			  ArrayList<Doctor> data1 = new ArrayList<Doctor>();
			    data1 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data1, Converter.docData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    break;
		  case 2://hospitalMember
			  ArrayList<HospitalMember> data2 = new ArrayList<HospitalMember>();
			    data2 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data2, Converter.hmData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    break;
		  case 3://patient
			  ArrayList<Patient> data3 = new ArrayList<Patient>();
			    data3 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data3, Converter.patientData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
		  case 4://referral
			  ArrayList<Referral> data4 = new ArrayList<Referral>();
			    data4 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data4, Converter.refData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
		  case 5://staff
			  ArrayList<Staff> data5 = new ArrayList<Staff>();
			    data5 = (ArrayList)obj.getDataList();
			    try {
					Converter.writeData(data5, Converter.staffData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    break;
		  case 6://login
			    
			    break;
		
		
		}
	}
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub 
		MyServer MyServer1 = new MyServer(8989); // will use port 8989
		System.out.println("MyServer: MyServer1 has been created.");
		try {
			MyServer1.listen();
			System.out.println("MyServer: Server should now be running");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	} 
}
//FileHandling fh = new FileHandling();
//fh.CreateFile("Test");
//fh.WriteToFile("Testing", msg);
package prsPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Converter {

	//create database file titles
	public static String hmData = "hmData.txt";
	public static String staffData = "staffData.txt";
	public static String patientData = "patientData.txt";
	public static String docData = "docData.txt";
	public static String refData = "refData.txt";
	public static String aptData = "aptData.txt";
	public static String userBase = "userBase.txt";
	
	//write object data to file 
	public static void writeData(Object data, String file)throws IOException{
	    FileOutputStream fos = new FileOutputStream(file);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(data);
	    oos.close();
	    fos.close();
	}

	//read object data from file
	
	@SuppressWarnings("rawtypes")
	public static Object readData(String file){
	   FileInputStream fin = null;
	try {
		fin = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   ObjectInputStream ois = null;
	try {
		ois = new ObjectInputStream(fin);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   Object data = null;
	try {
		data = (ArrayList<?>) ois.readObject();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		ois.close();
		fin.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return data;
	}
	
	public static void main(String[] args) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));
		DoctorSchedule docsched = new DoctorSchedule(date,date,date);
		Referral referral = new Referral("Dr.Bond", "John", "Snow", "Chacko", "Panicker");
		ArrayList<Doctor> d = new ArrayList<Doctor>();
		Doctor doc = new Doctor("Heart Surgeon", "Rank#1", 24.5f, docsched, referral, "Heart Department",
				1,101,"Bond","James","Lakehead University",123456);
		d.add(doc);
		System.out.println("Attempting to save...");
		try {
			writeData(d, docData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success!");

		System.out.println(formatter.getClass());

		useCases useless = new useCases();
		useless.browseDoctorSchedule();
		System.out.println("Success!Part2");

		

	}
	
	/*
	public static void main(String[] args) {
		ArrayList<Patient> hpData = new ArrayList<Patient>();
		Date date = new Date();
		Records rec = new Records(date, "FUck this stipud shit");
		HealthCard he = new HealthCard(123, date, "ON");
		Patient p = new Patient(he, rec, "peter", "sertic", "Lakehead", 56);
		hpData.add(p);
		/*ArrayList<HospitalMember> hpData = new ArrayList<HospitalMember>();
		HospitalMember h = new HospitalMember("peter", "sertic", "Lakehead", 56);
		HospitalMember i = new HospitalMember("john", "doe", "conCollege", 69);
		HospitalMember j = new HospitalMember("chacko", "george", "Lakehead", 99);
		HospitalMember k = new HospitalMember("gabe", "fiorot", "Lakehead", 22);
		hpData.add(h);
		hpData.add(i);
		hpData.add(j);
		hpData.add(k);
		try {
			writeData(hpData, hmData);
			System.out.print("WORKING");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("DONE");
		
		ArrayList<Patient> data = (ArrayList) readData("Test.txt");
		
		System.out.print(data.get(0).getHealthCard().getProvince() + "\n");
		
	
	}*/


}

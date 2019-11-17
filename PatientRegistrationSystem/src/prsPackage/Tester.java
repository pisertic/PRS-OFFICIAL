package prsPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tester {

	public static void serializeDataOut(Object ish)throws IOException{
	    String fileName= "Test.txt";
	    FileOutputStream fos = new FileOutputStream(fileName);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(ish);
	    oos.close();
	}

	public static Object serializeDataIn(){
	   String fileName= "Test.txt";
	   FileInputStream fin = null;
	try {
		fin = new FileInputStream(fileName);
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
	   Object iHandler = null;
	try {
		iHandler = (HospitalMember) ois.readObject();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		ois.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return iHandler;
	}
	
	public static void main(String[] args) {
		HospitalMember h = new HospitalMember("john", "doe", "Lakehead", 69);
		try {
			serializeDataOut(h);
			System.out.print("WORKING");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("DONE");
	}

}

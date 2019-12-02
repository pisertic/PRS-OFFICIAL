package OCSF;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Objectinator implements Serializable {
	private ArrayList<Object> dataList;
	private Object dataInstance;
	private boolean write;
	private int typeIdentifier;

	// specify read/write, contains arrayList and class type identifier(SEND TO SERVER ARRAYLIST)
	public Objectinator(boolean write, ArrayList dataList, int typeIdentifier) {
		this.write = write;
		this.dataList = dataList;
		this.typeIdentifier = typeIdentifier;
		dataInstance = null;
	}

	// specify read/write, contains object instance and class type identifier(SEND TO SERVER INSTANCE) 
	public Objectinator(boolean write, Object obj, int typeIdentifier) {
		this.write = write;
		this.dataList = null;
		this.typeIdentifier = typeIdentifier;
		dataInstance = obj;
	}

	// specify read/write, contains class type identifier(REQUEST DATA LIST FROM SERVER)
	public Objectinator(int typeIdentifier) {
		this.write = false;
		this.dataList = null;
		this.typeIdentifier = typeIdentifier;
		dataInstance = null;
	}

	// contains arrayList and class type identifier(FOR SERVER TO CLIENT MSG)
	public Objectinator(ArrayList dataList, int typeIdentifier) {
		this.write = false;
		this.dataList = dataList;
		this.typeIdentifier = typeIdentifier;
		dataInstance = null;
	}

	protected Object getDataInstance() {
		return dataInstance;
	}

	protected ArrayList<Object> getDataList() {
		return dataList;
	}

	protected boolean getWrite() {
		return write;
	}

	protected int getTypeIdentifier() {
		return typeIdentifier;
	}

	// quickly package objectinator for all constructor possibilities
	public static Objectinator createDataMsg(boolean write, ArrayList dataList, int typeIdentifier) {
		Objectinator msg = new Objectinator(write, dataList, typeIdentifier);
		return msg;
	}

	public static Objectinator createDataMsg(boolean write, Object obj, int typeIdentifier) {
		Objectinator msg = new Objectinator(write, obj, typeIdentifier);
		return msg;
	}

	public static Objectinator createDataMsg(int typeIdentifier) {
		Objectinator msg = new Objectinator(typeIdentifier);
		return msg;
	}

	public static Objectinator createDataMsg(ArrayList dataList, int typeIdentifier) {
		Objectinator msg = new Objectinator(dataList, typeIdentifier);
		return msg;
	}
}

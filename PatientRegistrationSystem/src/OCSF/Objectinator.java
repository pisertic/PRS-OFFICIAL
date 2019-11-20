package OCSF;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Objectinator implements Serializable{
	private ArrayList<Object> dataList;
	private Object dataInstance;
	private boolean write;
	private int typeIdentifier;
	
	public Objectinator(boolean write, ArrayList dataList , int typeIdentifier) {
		this.write = write;
		this.dataList = dataList;
		this.typeIdentifier = typeIdentifier;
		dataInstance = null;
	}
	
	public Objectinator(boolean write, Object obj, int typeIdentifier) {
		this.write = write;
		this.dataList = null;
		this.typeIdentifier = typeIdentifier;
		dataInstance = obj;
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
}

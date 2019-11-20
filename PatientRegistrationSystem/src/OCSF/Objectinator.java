package OCSF;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Objectinator implements Serializable{
	private ArrayList<Object> dataList;
	private Object dataInstance;
	private int methodIdentifier;
	private int typeIdentifier;
	
	public Objectinator(ArrayList dataList , int methodIdentifier) {
		this.dataList = dataList;
		this.methodIdentifier = methodIdentifier;
		dataInstance = null;
	}
	
	public Objectinator(Object obj, int methodIdentifier) {
		this.dataList = null;
		this.methodIdentifier = methodIdentifier;
		dataInstance = obj;
	}
	
	protected Object getDataInstance() {
		return dataInstance;
	}
	
	protected ArrayList<Object> getDataList() {
		return dataList;
	}
	
	protected int getMethodIdentifier() {
		return methodIdentifier;
	}
	
	protected int getTypeIdentifier() {
		return typeIdentifier;
	}
}

package OCSF;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Objectinator implements Serializable{
	ArrayList<Object> dataList;
	int methodIdentifier;
	Object obj; 
	
	public Objectinator(String keyword, int methodIdentifier) {
		this.keyword = keyword;
		this.methodIdentifier = methodIdentifier;
	}
	
	protected String getKeyword() {
		return methodIdentifier;
	}
	
	protected int getMethodIdentifier() {
		return methodIdentifier;
	}
	
}

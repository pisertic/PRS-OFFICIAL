package theOCSF;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Objectinator implements Serializable{
	String keyword;
	int methodIdentifier;
	
	public Objectinator(String keyword, int methodIdentifier) {
		this.keyword = keyword;
		this.methodIdentifier = methodIdentifier;
	}
	
	protected String getKeyword() {
		return keyword;
	}
	
	protected int getMethodIdentifier() {
		return methodIdentifier;
	}
	
}

package com.mia.etity;

public class passanger {
	
	String pname;
	int PRN;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPRN() {
		return PRN;
	}
	public void setPRN(int pRN) {
		PRN = pRN;
	}
	@Override
	public String toString() {
		return "passanger [pname=" + pname + ", PRN=" + PRN + "]";
	}
	
}

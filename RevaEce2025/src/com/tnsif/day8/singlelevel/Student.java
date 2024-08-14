package com.tnsif.day8.singlelevel;

public class Student extends Person {
	
	//Child Class
	
	private String srn;
	private String branch;
	
	//Default constructor if u use u need to do sy.setName (use setter methods)
	public Student() {
		super();
	}
	
	//Parametrised constructor
	public Student(String name, String address, String srn, String branch) {
		super(name, address);
		this.srn = srn;
		this.branch = branch;
	}

	public String getSrn() {
		return srn;
	}

	public void setSrn(String srn) {
		this.srn = srn;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [srn=" + srn + ", branch=" + branch + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
	

}

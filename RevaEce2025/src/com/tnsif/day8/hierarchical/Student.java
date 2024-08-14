package com.tnsif.day8.hierarchical;

//Child Class

public class Student extends Person {
	
	private String branch;
	private String srn;
	
	public Student() {
		super();
	}
	public Student(String branch, String srn, String name, String address) {
		//you only want name and address from the parent class so don't do like multilevel
		super(name, address);//type name address if u get error in this line
		this.branch = branch;
		this.srn = srn;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSrn() {
		return srn;
	}
	public void setSrn(String srn) {
		this.srn = srn;
	}
	@Override
	public String toString() {
		return "Student [branch=" + branch + ", srn=" + srn + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}

}

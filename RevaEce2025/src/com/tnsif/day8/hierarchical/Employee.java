package com.tnsif.day8.hierarchical;

//Child Class 2

public class Employee extends Person {
	
	private String dept;
	private String salary;
	
	public Employee() {
		super();
	}
	public Employee(String dept, String salary, String name, String address) {
		super(name, address);// you only want name and address feom the parent class
		this.dept = dept;
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	

}

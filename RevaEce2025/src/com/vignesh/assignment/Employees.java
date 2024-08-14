package com.vignesh.assignment;

public class Employees {
	
	private String name;
	private int employeeId;
	private float salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
}

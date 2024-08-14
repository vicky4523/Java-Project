package com.vignesh.assignment2;

public class YourDetails {
	private String name;
	private long srn;
	private char grade;
	private float percentage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSrn() {
		return srn;
	}
	public void setSrn(long srn) {
		this.srn = srn;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "YourDetails [name=" + name + ", srn=" + srn + ", grade=" + grade + ", percentage=" + percentage + "]";
	}

}

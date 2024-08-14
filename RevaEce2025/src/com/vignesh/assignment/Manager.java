package com.vignesh.assignment;

public class Manager {
	
	public String Manname;
	public int ManId;
	public float Mansalary;
	
	public String getManname() {
		return Manname;
	}
	public void setManname(String manname) {
		Manname = manname;
	}
	public int getManId() {
		return ManId;
	}
	public void setManId(int manId) {
		ManId = manId;
	}
	public float getMansalary() {
		return Mansalary;
	}
	public void setMansalary(float mansalary) {
		Mansalary = mansalary;
	}
	@Override
	public String toString() {
		return "Manager [Manname=" + Manname + ", ManId=" + ManId + ", Mansalary=" + Mansalary + "]";
	}
	
	
	
}

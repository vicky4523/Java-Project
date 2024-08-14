package com.vignesh.assignment;

public class Developer {
	
	public String Devname;
	public int DevId;
	public float DevSalary;
	
	public String getDevname() {
		return Devname;
	}
	public void setDevname(String devname) {
		Devname = devname;
	}
	public int getDevId() {
		return DevId;
	}
	public void setDevId(int devId) {
		DevId = devId;
	}
	public float getDevSalary() {
		return DevSalary;
	}
	public void setDevSalary(float devSalary) {
		DevSalary = devSalary;
	}
	@Override
	public String toString() {
		return "Developer [Devname=" + Devname + ", DevId=" + DevId + ", DevSalary=" + DevSalary + "]";
	}
	
	

}

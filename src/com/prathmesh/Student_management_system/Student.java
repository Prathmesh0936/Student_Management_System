package com.prathmesh.Student_management_system;

public class Student {
	
	private int Roll_no;
	private String First_Name;
	private String Last_Name;
	private String Department;
	private String Gender;
	
	
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Student [Roll_no=" + Roll_no + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Department=" + Department + ", Gender=" + Gender + "]";
	}
	
	
	
	

}

package com.sm.beans;

public class Student {
	private int studentNo;	
	private String firstName;
	private String lastName;
	private String classSection;
	private String cast;
	private String address;	
	
	public Student(int studentNo, String firstName, String lastName, String classSection, String cast, String address) {
		super();
		this.studentNo = studentNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.classSection = classSection;
		this.cast = cast;
		this.address = address;
	}
		
	public Student(){
		//no argument constructor
	}

	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	 
	
}

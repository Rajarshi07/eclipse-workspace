package com.springcore;

// student bean
public class Student {
	int studentId;
	String studentName;
	String studentAddress;
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student(String studentName, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting studentId");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting studentName");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting studentAddress");
		this.studentAddress = studentAddress;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}

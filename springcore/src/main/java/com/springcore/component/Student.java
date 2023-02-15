package com.springcore.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student1")
public class Student {

	@Value("Rajarshi")
	String studentName;
	@Value("Kolkata")
	String city;
	
	@Value("#{alist}")
	List<String> adresses;
	
	public Student(String studentName, String city, List<String> adresses) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.adresses = adresses;
	}

	public List<String> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<String> adresses) {
		this.adresses = adresses;
	}

	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", adresses=" + adresses + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}

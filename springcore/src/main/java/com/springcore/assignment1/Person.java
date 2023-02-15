package com.springcore.assignment1;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Person {
	@Value("101")
	int id;
	@Value("Rajarshi")
	String name;
	@Value("SDE Intern")
	String designation;
	@Value("#{contacts}")
	List<String> contactNo;
	@Value("#{projects}")
	List<String> projects;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String designation, List<String> contactNo, List<String> projects) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.contactNo = contactNo;
		this.projects = projects;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<String> getContactNo() {
		return contactNo;
	}
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", designation=" + designation + ", contactNo=" + contactNo
				+ ", projects=" + projects + "]";
	}
	
	
}

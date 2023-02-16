package com.springdemo.orm.model;

import jakarta.persistence.*;

@Entity
@Table(name="StudentTable")
public class Student {
	@Id
	int id;
	String name;
	String city;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}

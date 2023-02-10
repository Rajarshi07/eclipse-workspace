package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int employeeId;
	String employeeName;
	@ManyToMany
	@JoinTable
	(name = "emp_proj_relation",
	joinColumns = {@JoinColumn(name="eid")},
	inverseJoinColumns = {@JoinColumn(name="pid")})
	List<Project> projectList;

	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public Employee(String employeeName, List<Project> project) {
		super();
		this.employeeName = employeeName;
		this.projectList = project;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Project> getProject() {
		return projectList;
	}

	public void setProject(List<Project> project) {
		this.projectList = project;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", project=" + projectList + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}

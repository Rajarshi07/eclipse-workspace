package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int projectId;
	String projectName;
	@ManyToMany(mappedBy = "projectList")
	List<Employee> emp;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}

	public Project(String projectName, List<Employee> emp) {
		super();
		this.projectName = projectName;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", emp=" + emp + "]";
	}

	public Project() {
		// TODO Auto-generated constructor stub
	}

}

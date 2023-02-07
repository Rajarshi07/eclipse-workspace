package day4;

public class Manager extends Employee {
	String designation;

	public Manager(int empId, String empName, String designation) {
		super(empId, empName);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

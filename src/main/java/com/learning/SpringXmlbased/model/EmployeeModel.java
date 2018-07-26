package com.learning.SpringXmlbased.model;

public class EmployeeModel {

	// Attributes
	private int eId;
	private String eName;
	private int eSalary;
	private int eAge;

	// Default Constructor
	public EmployeeModel() {

	}

	// Parameterized Constructor
	public EmployeeModel(int eId, String eName, int eSalary, int eAge) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eAge = eAge;
	}

	// Getter and Setter methods
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	// override to String
	public String toString() {
		return "EmployeeModel [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eAge=" + eAge + "]";
	}

}

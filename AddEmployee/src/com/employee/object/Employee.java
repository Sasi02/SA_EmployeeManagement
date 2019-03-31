package com.employee.object;

public class Employee {
	private String firstName;
	private String secondName;
	private int age;
	private double salary;
	private String employeeType;
	
	public Employee() {}
	
	public Employee(String firstName, String secondName, int age, String employeeType) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.employeeType = employeeType;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	
}

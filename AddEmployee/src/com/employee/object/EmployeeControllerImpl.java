package com.employee.object;

import java.util.ArrayList;
import java.util.Scanner;
import employee.EmployeeController;

public class EmployeeControllerImpl implements EmployeeController{
	
	private static EmployeeControllerImpl object; 
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	  
    private EmployeeControllerImpl() {}
  
    public static synchronized EmployeeControllerImpl getInstance() 
    { 
        if (object == null) 
        	object = new EmployeeControllerImpl(); 
        
        return object; 
    }

	@Override
	public ArrayList<Employee> getEmployees() {
		return employeeList;
	} 
	
	public Employee addEmployee() {
		Scanner scanner = new Scanner(System.in);
		Employee temp = new Employee();
		
		System.out.print("Enter First Name:- ");
		temp.setFirstName(scanner.nextLine());
		
		System.out.print("Enter Second Name:- ");
		temp.setSecondName(scanner.nextLine());
		
		System.out.print("Enter First Name:- ");
		temp.setAge(scanner.nextInt());
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("\t "+ (i + 1) +". "+ EmployeeTypeConverter.intToEmployeeType(i + 1));
		}
		
		System.out.print("Enter index of the Employee Type:- ");
		temp.setEmployeeType(EmployeeTypeConverter.intToEmployeeType(scanner.nextInt()));
		
		if((temp.getFirstName().equals("") || temp.getFirstName() == null) &&
				(temp.getSecondName().equals("") || temp.getSecondName() == null) &&
				temp.getAge() <= 0  && 
				(temp.getEmployeeType().equals("") || temp.getEmployeeType() == null)){
			System.out.println("Invalid inputs!");
		}
		else {
			employeeList.add(temp);
		}
		
		return temp;
	}

	public void displayEmployeeList() {
		if(employeeList.isEmpty())
			System.out.println("Employee list is Empty!");
		else {
			int counter = 0;
			
			for(Employee i: employeeList) {
				System.out.println("\t "+ counter +". "+ i.getFirstName() +"  "+ i.getSecondName() +"  "+
						i.getAge() +"  "+ i.getEmployeeType() +"  "+ i.getSalary());
			}
		}
	}
	
	public void displayProperties() {
		System.out.println("1. FirstName");
		System.out.println("1. SecondName");
		System.out.println("1. Age");
		System.out.println("1. Employee Type");
	}

	public Employee removeEmployee() {
		Scanner scanner = new Scanner(System.in);
		int id = -1;
		
		this.displayEmployeeList();
		
		System.out.println("Enter Employee Id to Delete:- ");
		id = scanner.nextInt();
		
		if(id < 0 || id > employeeList.size()) {
			System.out.println("Invalid Inpput!");
			return null;
		}
		else {
			return employeeList.remove(id);
		}
	}

	public boolean updateEmployee() {
		Scanner scanner = new Scanner(System.in);
		boolean returnvalue = false;
		
		int empId = -1;
		int selection = -1;
		
		this.displayEmployeeList();
		
		System.out.println("Enter Employee Id to Update:- ");
		empId = scanner.nextInt();
		
		if(empId < 0 || empId > employeeList.size()) {
			System.out.println("Invalid Input!");
		}
		else {
			this.displayProperties();
			
			System.out.println("Enter property Id to Update:- ");
			selection = scanner.nextInt();
			
			switch(selection) {
				case 1:{
					System.out.println("");
				}
			}
		}
	}
}

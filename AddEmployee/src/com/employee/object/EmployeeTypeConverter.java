package com.employee.object;

public class EmployeeTypeConverter {

	public static int employeeTypeToInt(String value) {
		int returnValue = -1;
		
		switch(value) {
			case "DIRECTOR":{
				returnValue = 1;
			}
			case "MANAGER":{
				returnValue = 2;
			}
			case "STAFF":{
				returnValue = 3;
			}
			case "CLERK":{
				returnValue = 4;
			}
			case "SANITARY":{
				returnValue = 5;
			}
		}
		
		return returnValue;
	}
	
	public static String intToEmployeeType(int value) {
		String returnValue = "-";
		
		switch(value) {
			case 1:{
				returnValue = "DIRECTOR";
			}
			case 2:{
				returnValue = "MANAGER";
			}
			case 3:{
				returnValue = "STAFF";
			}
			case 4:{
				returnValue = "CLERK";
			}
			case 5:{
				returnValue = "SANITARY";
			}
		}
		
		return returnValue;
		
	}

}

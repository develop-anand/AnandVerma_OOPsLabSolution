package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.utils.Constants;

public class Driver {	

	public static void main(String[] args) {
		
		// Create a Data Model for Employee with First Name & Last Name
		// Use parameterised constructor of class Employee by making class Employee, to pass firstName, lastName
		
		Employee employee = new Employee("Anand", "Verma");
		Scanner in = new Scanner(System.in);
		CredentialService credentialService = new CredentialService();

		
		
		

		displayMenu();
		
		int userChoice = in.nextInt();
		String emailAddress = " ";
		String password =  " ";
		String department = " ";
	
		
		switch (userChoice) {
			case 1: department = Constants.TECHNICAL_DEPARTMENT;
				break;
		
			case 2:department = Constants.ADMIN_DEPARTMENT;
				break;
		
			case 3:department = Constants.HUMANRESOURCE_DEPARTMENT;
				break;
		
			case 4:department = Constants.LEGAL_DEPARTMENT;
				break;
			
			default: System.out.println("Invalid Choice");
		}
		
		// Here if we use isEmpty then when we pass wrong number like 5 or 6 then it will show invalid choice with credentials
		// That's why we have use isBlank here so that empty argument can also be satisfy with the default case. 
		
		
		if (!department.isBlank()) {
			emailAddress = CredentialService.generateEmailAddress(employee.getFirstName(),
					employee.getLastName(),department);
					password = credentialService.generateRandomPassword();
					CredentialService.showCredentials(emailAddress, password);
		}
		
	}

	
	public static void displayMenu(){
		System.out.println("Please enter the department from the following : ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		
		}
	
}

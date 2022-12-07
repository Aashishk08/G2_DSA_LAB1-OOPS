package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.interfaces.credentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServices;

public class DriverClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee ("Aashish","kumar");
		
		credentials cs = new CredentialServices();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		System.out.println("Please enter the department from the following");
		System.out.println("----------------------------------------------");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		System.out.println("----------------------------------------------");
		
		Scanner sc = new Scanner (System.in);
		int option =sc.nextInt();
		
		switch (option) {
		
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "technical");
			employee.setEmail(generatedEmail);
			generatedPassword = cs.generatePassword(8);
			employee.setPassword(generatedPassword);
			cs.showcredentials(employee);
			break;
		}
		
		case 2: {
			generatedEmail =cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			employee.setEmail(generatedEmail);
			generatedPassword = cs.generatePassword(8);
			employee.setPassword(generatedPassword);
			cs.showcredentials(employee);
			break;
		}
		
		case 3: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "humanresource");
			employee.setEmail(generatedEmail);
			generatedPassword = cs.generatePassword(8);
			employee.setPassword(generatedPassword);
			cs.showcredentials(employee);
			break;
		}
		case 4:{
		generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), "legal");
		employee.setEmail(generatedEmail);
		generatedPassword = cs.generatePassword(8);
		employee.setPassword(generatedPassword);
		cs.showcredentials(employee);
		break;
		}
		 
		default :{
			System.out.println("Enter a valid option");
			break;
		}
		
		}
	}

}

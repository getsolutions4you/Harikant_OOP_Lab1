package com.autocredential.main;
import java.util.Scanner;
import com.autocredential.model.Employee;
import com.autocredential.services.CredentialService;

public class driver {
	public static void main(String[] args) {
		
		Employee employee = new Employee("Harikant", "Kumar");
		CredentialService credentialService = new CredentialService();
		// Select department
		String deptNameString = department();
		
		if (deptNameString == "notfound") { 
			System.out.println("Selected department not found ! Try another");
		}else {
			String password = credentialService.generatePassword();
			credentialService.showCredentials(employee, deptNameString, password);
		}
	}
	
	private static String department() {
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.close();
		
		String deptName;
		
		switch (choice) {
		case 1: {
			deptName = "Technical";
			return deptName;
		}
		case 2: {
			deptName = "Admin";
			return deptName;
		}
		case 3: {
			deptName = "Human Resource";
			return deptName;
		}
		case 4: {
			deptName = "Legal";
			return deptName;
		}
		default:
			deptName = "notfound";
			return deptName;
		}
	}
}

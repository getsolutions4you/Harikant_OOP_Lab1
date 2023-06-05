package com.autocredential.services;
import java.util.Random;
import com.autocredential.interfaces.credentials;
import com.autocredential.model.Employee;

public class CredentialService implements credentials{

	private static final String companyName = "gl.com";
	@Override
	public String generateEmailAddress(Employee employee, String department) {
		String emailId = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() +
                "@" + department.toLowerCase().replaceAll("\\s", "") + "." + companyName;
        
        return emailId;
	}

	@Override
	public String generatePassword() {
		String chars = "abcdefghijklmnopqrstuvwxyz";
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMS = "1234567890";
        String SPEC = "@#$%^&+=";

        String pass = twoRandChars(chars) + twoRandChars(CHARS) + twoRandChars(NUMS) + twoRandChars(SPEC);
        return pass;
	}
	
	// Create two random character
    private String twoRandChars(String chars) {
    	Random rnd = new Random();
        int index1 = (int) (rnd.nextFloat() * chars.length());
        int index2 = (int) (rnd.nextFloat() * chars.length());
        return "" + chars.charAt(index1) + chars.charAt(index2);
	}

	@Override
	public void showCredentials(Employee employee, String department, String password) {
		String email = generateEmailAddress(employee, department);
        System.out.println("Dear "+ employee.getFirstName() + " your genrated credentials are as follows");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
		
	}

}

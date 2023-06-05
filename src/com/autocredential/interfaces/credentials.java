package com.autocredential.interfaces;
import com.autocredential.model.Employee;
public interface credentials {
	public String generateEmailAddress(Employee employee, String department);
	public String generatePassword();
	public void showCredentials(Employee employee, String department, String password);
}

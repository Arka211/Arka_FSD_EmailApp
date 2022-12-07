package com.greatlearning.interfaces;

public interface Credentials{	
	public String generatePassword();
	public String generateEmailAddress(String firstName, String lastName, String Department);
	void showCredentials(Employee employee);
}
 
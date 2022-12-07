package com.greatlearning.entities;

public class Employee {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	public Employee(String firstName, String lastName)
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	
public String toString() {
	return "Employee Details \nfirstName=" + firstName + ", \nlastName=" + lastName + ", \nemail=" + email + ", \npassword=" + password + "]";
    }
    public String getfirstName() {
	return firstName;
    }
    
    public void setfirstName(String firstName) {
    	this.firstName = firstName;
    }	
    public String getlastName() {
  	return lastName;
    }
    public void setlastName(String lastName) {
    	this.lastName = lastName;
    }		
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }	
    public String getpassword() {
    	return password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }	
    
}
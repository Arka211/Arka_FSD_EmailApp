package com.greatlearning.app;

import com.greatlearning.entities.Employee;
import com.greatlearning.interfaces.Credentials;

public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Arka", "Kundu");
		
		Credentials cred = new CredentialServices();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Technical");
		System.out.println("2. Human Resource");
		System.out.println("3. Admin");
		System.out.println("4. Legal");
		System.out.println("Select Your Department");
		int dept=scan.nextInt();
		
		switch(dept) {
		case 1:
			emp.setEmail(cred.generateEmailAddress(emp.getfirstName(), emp.getlastName(), "tech"));
			break;
		case 2:
			emp.setEmail(cred.generateEmailAddress(emp.getfirstName(), emp.getlastName(), "hr"));
			break;
		case 3:
			emp.setEmail(cred.generateEmailAddress(emp.getfirstName(), emp.getlastName(), "admin"));
			break;
		case 4:
			emp.setEmail(cred.generateEmailAddress(emp.getfirstName(), emp.getlastName(), "legal"));
			break;
			default:
				System.out.println("Invalid Department");
		}
		emp.setPassword(cred.generatePassword());
		cred.showCredentials(emp);
		scan.close();

	}

}

package com.greatlearning.services;

import com.greatlearning.interfaces.Credentials;

import java.util.Random;

import com.greatlearning.entities.Employee;

public class CredentialServices implements Credentials {
	
	public String generatePassword() {
		String caps = "QWERTYUIOPASDFGHJLKLZXCVBNM";
		String small = "qwertyuiopasdfghjklzxcvbnm";
		String nums = "0123456789";
		String special = "!@#$%^&*()";
		StringBuffer password=new StringBuffer();
		Random random = new Random();
		int rand = random.nextInt(caps.length());
		password.append(caps.charAt(rand));
		
		rand = random.nextInt(small.length());
		password.append(small.charAt(rand));
		
		rand = random.nextInt(nums.length());
		password.append(nums.charAt(rand));
		
		rand = random.nextInt(special.length());
		password.append(special.charAt(rand));
		
		for(int index=0; index<6; index++) {
			rand = random.nextInt(4);
			
			switch (rand) {
			case 0:
				rand = random.nextInt(caps.length());
				password.append(caps.charAt(rand));
				break;
			case 1:
				rand = random.nextInt(small.length());
				password.append(small.charAt(rand));
				break;
			case 2:
				rand = random.nextInt(nums.length());
				password.append(nums.charAt(rand));
				break;
			case 4:
				rand = random.nextInt(special.length());
				password.append(special.charAt(rand));
			}
		}
		
		
		return rtnValue.toString();
	}

	public String generateEmailaddress(String firstName, String lastName, String department) {
		rtnValue = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".greatlearning.com";
	}
	
	public void showCredentials(Employee emp) {
		System.out.println(emp);
	}
}

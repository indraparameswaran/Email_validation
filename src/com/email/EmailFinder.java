package com.email;

import java.util.Scanner;

public class EmailFinder {
	
	public static void main(String[] args) {
		EmailValidator emailID = new EmailValidator();
		
		emailID.addEmailID("Abi@xyz.com");
		emailID.addEmailID("Becky@xyz.com");
		emailID.addEmailID("Charlie@xyz.com");
		emailID.addEmailID("David@xyz.com");
		emailID.addEmailID("Emma@xyz.com");
		emailID.addEmailID("Fisher@xyz.com");
		emailID.addEmailID("Gargi@xyz.com");
		emailID.addEmailID("Hunt@xyz.com");
		emailID.addEmailID("Matt@xyz.com");
		emailID.addEmailID("Tammy@xyz.com");

		System.out.println("Provide a emailid to search for: ");
		Scanner scanner = new Scanner(System.in);
		String searchFor = scanner.nextLine();
		
		boolean foundMatch = emailID.foundMatch(searchFor);
		if (foundMatch) {
			System.out.println(searchFor + " is a valid email");
		} else {
			System.out.println(searchFor + " is not a valid email");
		} 
	}

}

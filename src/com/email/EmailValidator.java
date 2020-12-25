package com.email;

import java.util.ArrayList;

public class EmailValidator {
	
	ArrayList<String> emailIds = new ArrayList<String>();
	
	public void addEmailID (String email) {
		emailIds.add(email);
	}
	
	public boolean foundMatch (String input) {
		for (int i =0 ; i < emailIds.size(); i++) {
			if (emailIds.get(i).equalsIgnoreCase(input)) {
				return true;
			}
		}
		  return false;
	 
	}

}

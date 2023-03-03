package com.pratiti.traning.collection;

import java.util.HashMap;
import java.util.Map;

import com.pratiti.traning.practice.Person;

class LoginManager{
	private Map<String, String>users;
	public LoginManager() {
		users = new HashMap<>();
		users.put("rutvik","123456");
		users.put("rohit","112233");
		users.put("pratik","6543221");
	}
	boolean isValid(String username,String password) {
//		for(Map.Entry<String, String>entry : users.entrySet()) {
//			if(entry.getKey().equals(username) && entry.getValue().endsWith(password) )
//			{
//				return true;
//			}
//		}
//		return false;
		
		
		if(users.containsKey(username)) {
			if(users.get(username).equals(password)) {
				return true;
			}
		}
		return false;
		
	}
}

public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginManager mgr = new LoginManager();
		boolean isv = mgr.isValid("rohit", "123456");
		if(isv) {
			System.out.println("valid");
		}
		else {
			System.out.println("Not valid");
		}
	}

}

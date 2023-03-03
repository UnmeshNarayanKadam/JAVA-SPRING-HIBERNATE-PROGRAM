package com.pratiti.traning.collection;

import java.util.ArrayList;
import java.util.List;

class User{
	String username;
	String password;
	
	User(String username , String password){
		this.username=username;
		this.password=password;
	}
}

class UserManager {
	List<User> users;
	
	UserManager() {
		users = new ArrayList<>();
		users.add(new User("rutvik","123456"));
		users.add(new User("rohit","112233"));
		users.add(new User("pratik","6543221"));
	}
	boolean isValid(String username,String password) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).username.equals(username)) {
				if(users.get(i).password.equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
}

public class Scenario1 {
	public static void main(String[] args) {
		UserManager mgr = new UserManager();
		boolean isv = mgr.isValid("rohit", "123456");
		if(isv) {
			System.out.println("valid");
		}
		else {
			System.out.println("Not valid");
		}
	}
}

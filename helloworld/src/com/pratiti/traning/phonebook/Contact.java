package com.pratiti.traning.phonebook;

public class Contact {
	
	private String name;
	private String mobileNo;
	private String emailAddress;
	
//default constructor
	public Contact() {
		
	}
	
//Parameterized constructor
	public Contact(String name, String mobileNo, String emailAddress) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}
	
//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}

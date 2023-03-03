package com.pratiti.traning.phonebook;

public class PhoneBook {
	private String name;
	private Contact[] contacts;
	private int index;

	public PhoneBook() {
//Reusing the code by calling the constructor.
		//this.name = "My PhoneBook";
		//this.contacts = new Contact[1000];
		this("My PhoneBook",1000);
	}
	
	public PhoneBook(String name , int noOfContacts) {
		this.name = name;
		this.contacts = new Contact[noOfContacts];
	}
	
	public void add(String name ,String mobileNumber , String emailAddress) {
		Contact contact = new Contact(name, mobileNumber,emailAddress);
		add(contact);
		//this.contacts[0].setName(name);
		//this.contacts[0].setMobileNo(mobileNumber);
		//this.contacts[0].setEmailAddress(emailAddress);
	}
	
	public void add(Contact contact) {
		contacts[index++] = contact;
	}
	
	public void display() {
		System.out.println("Details of "+this.name+" PhoneBook -");
		for(int i=0;i<index;i++) {
			Contact contact = contacts[i];
			System.out.println(contact.getName()+" "+contact.getMobileNo()+" "+ contact.getEmailAddress());
		}
		System.out.println();
	}
	
	public Contact search(String name) {
		for(int i=0;i<index;i++) {
			Contact contact = contacts[i];
			if(contact.getName().equals(name))
			{
				return contact;
			}
		}
		return null;
	}
	
	public void changeMobileNumber(String name , String newMobileNumber) {
		Contact c = search(name);
		c.setMobileNo(newMobileNumber);
	}
	
}

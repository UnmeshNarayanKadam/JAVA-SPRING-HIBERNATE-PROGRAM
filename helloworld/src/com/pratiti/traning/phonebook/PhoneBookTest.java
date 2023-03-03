package com.pratiti.traning.phonebook;


public class PhoneBookTest {

	public static void main(String[] args) {
		PhoneBook phBook = new PhoneBook("Friends",10);
		
		//Insert the records
		phBook.add("Unmesh","1234567890","unmesh@gmail.com");
		phBook.add("Rutvik","1234567888","rutvik@gmail.com");
		phBook.add("Devesh","1234567999","devesh@gmail.com");
		
		Contact c = new Contact("Rohit","9876543210","rohit@gmail.com");
		phBook.add(c);
		
		//Display the details
		phBook.display();
		
		//Search the specific record
		Contact c2 = phBook.search("Rohit");
		if(c2==null) {
			System.out.println("No record found\n");
		}
		else {
			System.out.println("Search result : ");
			System.out.println(c2.getName()+" "+c2.getMobileNo()+" "+c2.getEmailAddress()+"\n");
		}
		
		//Update the mobile Number
		phBook.changeMobileNumber("Unmesh", "823999999999");
		Contact c3 = phBook.search("Unmesh");
		if(c3==null) {
			System.out.println("No record found\n");
		}
		else {
			System.out.println("Update the record : ");
			System.out.println(c3.getName()+" "+c3.getMobileNo()+" "+c3.getEmailAddress()+"\n");
		}
	}

}

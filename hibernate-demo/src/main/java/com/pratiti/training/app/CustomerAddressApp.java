package com.pratiti.training.app;

import java.time.LocalDate;
import java.util.List;

import com.pratiti.training.dao.customerAddressDao;
import com.pratiti.training.entity.Address;
import com.pratiti.training.entity.Customer;


public class CustomerAddressApp {

	public static void main(String[] args) {
		customerAddressDao dao = new customerAddressDao();
		
//Scenario: Adding Customer
//		Customer customer = new Customer();
//		customer.setName("Unmesh");
//		customer.setEmail("unmesh2001@gmail.com");
//		customer.setDateOfBirth(LocalDate.of(2001, 8, 5));
//		dao.add(customer);
		
//Scenario: Adding address of the customer
//		Customer customer = dao.fetchCustomer(19);
//		Address address = new Address();
//		address.setLine1("fgh aprtment");
//		address.setLine2("dange chowk");
//		address.setCity("pune");
//		address.setPincode(410100);
//		customer.setAddress(address);
//		dao.Update(customer);
		
//		List<Customer>list = dao.fetchCustomerByCity("pune");
//		for(Customer c : list) {
//			System.out.println(c.getName());
//		}
		List<Object[]> l = dao.fetchAllCustomerInfo();
		for(Object[] o : l) {
			for(Object q : o) {
				System.out.print(q+" ");
			}
			System.out.println();
		}
	}
	

}

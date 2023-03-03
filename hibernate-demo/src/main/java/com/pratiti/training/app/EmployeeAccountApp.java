package com.pratiti.training.app;

import com.pratiti.training.dao.EmployeeAccountDao;
import com.pratiti.training.entity.Account;
import com.pratiti.training.entity.Employee;

public class EmployeeAccountApp {
	public static void main(String[] args) {
		EmployeeAccountDao dao = new EmployeeAccountDao();
		
		//Scenario: Adding Customer
//				Employee employee = new Employee();
//				employee.setName("Unmesh");
//				employee.setEmail("unmesh2001@gmail.com");
//				dao.add(employee);
				
		//Scenario: Adding address of the customer
				Employee employee = dao.fetchCustomer(23);
				Account account = new Account();
				account.setAccountNumber("sbc12345");
				employee.setAccount(account);
				dao.Update(employee);
	}
}

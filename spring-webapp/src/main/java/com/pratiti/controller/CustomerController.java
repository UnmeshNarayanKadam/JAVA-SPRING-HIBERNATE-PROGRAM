package com.pratiti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratiti.entity.Customer;
import com.pratiti.repository.CustomerRepository;

@Controller
public class CustomerController {
	@Autowired
	private CustomerRepository custRepo;
	
	@RequestMapping("/add-customer")
	public String add(Customer customer,Map map) {
		custRepo.save(customer);
		map.put("custId", customer.getId());
		return "Confirmation.jsp";
	}
	@RequestMapping("/search-customer")
	public String search(@RequestParam("email") String email , Map mp) {
		Optional<Customer>customer = custRepo.findByEmail(email);
		if(customer.isPresent())
			mp.put("c", customer.get());
		return "searchCustomer.jsp";
	}
	
	@RequestMapping("/search-customer-id")
	public String search(@RequestParam("id") int id , Map mp) {
		Optional<Customer>customer = custRepo.findById(id);
		if(customer.isPresent())
			mp.put("c", customer.get());
		return "searchCustomerById.jsp";
	}
	
	@RequestMapping("/fetch-all-customer")
	public String search(Map mp) {
		List<Customer>list = custRepo.findAll();
		mp.put("listOfCustomer", list);
		return "searchCustomer.jsp";
	}
	
}

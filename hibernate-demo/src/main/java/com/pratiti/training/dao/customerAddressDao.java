package com.pratiti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.training.entity.Address;
import com.pratiti.training.entity.Customer;
import com.pratiti.training.entity.Product;

public class customerAddressDao {
	
//Customer adding
	public void add(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(customer); // persist will generate insert query
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}
	
//Address adding
	public void add(Address address) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(address); // persist will generate insert query
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}
	
//Fetching customer
	public Customer fetchCustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			// find method generate the select query with where PK is id
			Customer pd = em.find(Customer.class, id);
			return pd;
		} finally {
			emf.close();
		}
	}
	
//Fetching address
	public Address fetchAddress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			// find method generate the select query with where PK is id
			Address pd = em.find(Address.class, id);
			return pd;
		} finally {
			emf.close();
		}
	}
	
//Customer update
	public void Update(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.merge(customer); 
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}
	
//join to fetch the customer by name
	public List<Customer> fetchCustomerByCity(String city){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
//we have to provide the object while joining two table
			String str = "select c from Customer c join c.address a where a.city = :ct";
			Query q = em.createQuery(str);
			q.setParameter("ct", city);
			List<Customer> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}
	
//fetching the particular records from table;
	public List<Object[]> fetchAllCustomerInfo(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			String str = "select c.name,c.dateOfBirth,a.city from Customer c join c.address a";
			Query q = em.createQuery(str);
			List<Object[]> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}
}

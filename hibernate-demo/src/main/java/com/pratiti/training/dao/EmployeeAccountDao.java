package com.pratiti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pratiti.training.entity.Account;
import com.pratiti.training.entity.Employee;

public class EmployeeAccountDao {
	//Employee adding
		public void add(Employee employee) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			try {
				em.getTransaction().begin();
				em.persist(employee); // persist will generate insert query
				em.getTransaction().commit();
			} finally {
				emf.close();
			}

			emf.close();
		}
		
	//Account adding
		public void add(Account account) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			try {
				em.getTransaction().begin();
				em.persist(account); // persist will generate insert query
				em.getTransaction().commit();
			} finally {
				emf.close();
			}

			emf.close();
		}
		
	//Fetching Employee
		public Employee fetchCustomer(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			try {
				// find method generate the select query with where PK is id
				Employee pd = em.find(Employee.class, id);
				return pd;
			} finally {
				emf.close();
			}
		}
		
	//Fetching Account
		public Account fetchAddress(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			try {
				// find method generate the select query with where PK is id
				Account pd = em.find(Account.class, id);
				return pd;
			} finally {
				emf.close();
			}
		}
		
	//Employee update
		public void Update(Employee employee) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			try {
				em.getTransaction().begin();
				em.merge(employee); 
				em.getTransaction().commit();
			} finally {
				emf.close();
			}

			emf.close();
		}
}

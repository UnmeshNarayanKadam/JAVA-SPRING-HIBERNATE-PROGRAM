package com.pratiti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pratiti.training.entity.Passport;
import com.pratiti.training.entity.Person;

public class PersonPassportDao {
//passport adding
		public void add(Passport passport) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			try {
				em.getTransaction().begin();
				em.persist(passport); // persist will generate insert query
				em.getTransaction().commit();
			} finally {
				emf.close();
			}

			emf.close();
		}
		
//Person adding
		public void add(Person person) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			try {
				em.getTransaction().begin();
				em.persist(person); // persist will generate insert query
				em.getTransaction().commit();
			} finally {
				emf.close();
			}

			emf.close();
		}
		
//Fetching passport
		public Passport fetchPassport(int passportNo) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			try {
				// find method generate the select query with where PK is id
				Passport pd = em.find(Passport.class, passportNo);
				return pd;
			} finally {
				emf.close();
			}
		}
		
//Fetching Person
		public Person fetchPerson(int id) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			try {
				// find method generate the select query with where PK is id
				Person pd = em.find(Person.class, id);
				return pd;
			} finally {
				emf.close();
			}
		}
		
//Passport update
		public void Update(Passport passport) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();

			try {
				em.getTransaction().begin();
				em.merge(passport); 
				em.getTransaction().commit();
			} finally {
				emf.close();
			}

			emf.close();
		}
}

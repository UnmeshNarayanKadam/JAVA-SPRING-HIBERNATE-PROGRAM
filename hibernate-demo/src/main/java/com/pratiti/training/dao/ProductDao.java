package com.pratiti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.training.entity.Product;

//Data access object
public class ProductDao {

	public void add(Product product) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(product); // persist will generate insert query
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}

	public Product fetch(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			// find method generate the select query with where PK is id
			Product pd = em.find(Product.class, id);
			return pd;
		} finally {
			emf.close();
		}
	}

	public List<Product> fetchAll() {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select p from Product p");
			List<Product> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}

	public List<Product> fetchByPrice(double price) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select p from Product p where p.price>=:pr");
			q.setParameter("pr", price);
			List<Product> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}

	public List<Product> fetchByName(String name) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select p from Product p where p.name like :nm");
			q.setParameter("nm", name + "%");
			List<Product> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}

	public void Update(Product product) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.merge(product); 
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}
	
	public void delete(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Product pd = em.find(Product.class, id);
			em.remove(pd);
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}

}

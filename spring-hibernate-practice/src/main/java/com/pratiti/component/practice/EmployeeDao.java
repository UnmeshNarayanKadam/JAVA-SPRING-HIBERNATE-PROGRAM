package com.pratiti.component.practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("empDao")
public class EmployeeDao {
	@PersistenceContext
	private EntityManager em;

	@Transactional //for commit
	public void addnewEmployee(Employee emp) {
		em.persist(emp);
	}

	public List<Employee> getAvailableEmployee() {
		Query q = em.createQuery("select e from Employee e", Employee.class);
		List<Employee> list = q.getResultList();
		return list;
	}
}

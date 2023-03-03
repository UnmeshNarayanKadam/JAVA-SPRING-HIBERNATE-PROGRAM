package com.pratiti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pratiti.entity.Customer;

//Difference between JpaRepository and CrudRepository -
//return type of CrudRepository is iterable and
//return typr of JpaRepository is list
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	public Optional<Customer> findByEmail(String email);
	public Optional<Customer> findById(Integer id);
}

package com.pratiti.component.App;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.component.practice.Employee;
import com.pratiti.component.practice.EmployeeDao;

public class EmployeeApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		EmployeeDao employeedao = (EmployeeDao)ctx.getBean("empDao");
//		Employee emp = new Employee();
//		emp.setName("Shivam");
//		emp.setSalary(23400);
//		emp.setDateOfJoining(LocalDate.of(2020, 11, 13));
//		employeedao.addnewEmployee(emp);
		
		List<Employee>list = new ArrayList<Employee>();
		list = employeedao.getAvailableEmployee();
		for(Employee e:list) {
			System.out.println(e.getEmp_id()+" "+e.getName()+" "+e.getSalary()+" "+e.getDateOfJoining());
		}
	}

}

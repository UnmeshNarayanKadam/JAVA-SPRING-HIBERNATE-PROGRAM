package helloworld;

import java.time.LocalDate;

public class Employee {
	
	//attributes/state
	private int empno;
	private String name;
	private double salary;
	private LocalDate dateOfJoining;
	
	//Constructors
	public Employee() {
		
	}
	
	public Employee(int empno, String name, double salary, LocalDate dateOfJoining) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	
	//Getters and setteers
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
	
	
}

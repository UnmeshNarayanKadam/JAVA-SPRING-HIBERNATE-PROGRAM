package helloworld;

import java.time.LocalDate;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 =  new Employee(1001,"Unmesh Kadam",25000,LocalDate.of(2023,1,23));
		System.out.println(e1.getEmpno());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDateOfJoining());
		
		Employee e2 = new Employee();
		e2.setEmpno(1002);
		e2.setName("Shivam");
	    e2.setSalary(30000);
	    e2.setDateOfJoining(LocalDate.of(2023, 1, 24));
	    System.out.println(e2.getEmpno());
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		System.out.println(e2.getDateOfJoining());
	}
	
}

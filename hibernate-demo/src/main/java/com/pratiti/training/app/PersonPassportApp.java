package com.pratiti.training.app;

import java.time.LocalDate;

import com.pratiti.training.dao.PersonPassportDao;
import com.pratiti.training.entity.Passport;
import com.pratiti.training.entity.Person;

public class PersonPassportApp {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
//Scenario: Adding passport
//		Passport passport = new Passport();
//		passport.setIssueDate(LocalDate.of(2022, 12, 23));
//		passport.setExpirayDate(LocalDate.of(2050, 12, 23));
//		dao.add(passport);
		
		
//Scenario: Adding person having passport
		Passport passport = dao.fetchPassport(21);
		Person person = new Person();
		person.setName("Unmesh");
		person.setAge(21);		
		passport.setPerson(person);
		dao.Update(passport);
	

	}

}

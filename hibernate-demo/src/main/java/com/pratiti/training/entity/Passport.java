package com.pratiti.training.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb1_passport")
public class Passport {
	@Id
	@GeneratedValue
	private int passportNo;
	private LocalDate issueDate;
	private LocalDate ExpirayDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id") //foregin key
	private Person person;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpirayDate() {
		return ExpirayDate;
	}

	public void setExpirayDate(LocalDate expirayDate) {
		ExpirayDate = expirayDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}

package com.pratiti.taining.component.bank;

import org.springframework.stereotype.Component;

@Component
public class CitiBank implements Bank {
	public boolean isCust(int accNo) {
		if(accNo==1111) {
			return true;
		}
		return false;
	}
	public boolean canWithdraw(int atmId , int acno , double amount) {
		System.out.println("Customer of city bank wants to withdraw money...");
		return true;
	}
}

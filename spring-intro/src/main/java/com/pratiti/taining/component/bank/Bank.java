package com.pratiti.taining.component.bank;

public interface Bank {
	boolean isCust(int accNo);
	boolean canWithdraw(int atmId , int acno , double amount);
}

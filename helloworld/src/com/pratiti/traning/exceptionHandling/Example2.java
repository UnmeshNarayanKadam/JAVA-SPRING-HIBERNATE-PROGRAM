package com.pratiti.traning.exceptionHandling;

class BankAccount {
	int accno;
	double balance;
	public BankAccount(int accno, double balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	
	double withdraw(double amount) throws Exception{
		if(amount>balance) {
//			Exception e =new Exception("Insufficient balance");
//			throw e;
			AccountException e = new AccountException("Insufficient balance");
			throw e;
		}
		else {
			balance -=amount;
			return balance;
		}
		
	}
	
}

class AccountException extends Exception{
	public AccountException(String msg) {
		super(msg);
	}
}

public class Example2{
	public static void main(String[] args) {
		BankAccount acc =new BankAccount(1001, 5000);
		try {
			double balance = acc.withdraw(6000);
			System.out.println("Balance left : "+balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


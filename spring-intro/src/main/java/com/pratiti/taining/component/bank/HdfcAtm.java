package com.pratiti.taining.component.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HdfcAtm implements Atm {
	@Autowired
	private List<Bank> banks;
	public void withdraw(int accNo,double amount) {
		System.out.println("Customer of hdfc bank wants to withdraw the money");
		//bank.canWithdraw(1111, accNo, amount);
		Bank curr = null;
		for(Bank b : banks) {
			if(b.isCust(accNo)) {
				curr = b;
				break;
			}
		}
		curr.canWithdraw(1111, accNo, amount);
	}
}

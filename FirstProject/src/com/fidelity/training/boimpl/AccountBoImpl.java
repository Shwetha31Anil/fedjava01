package com.fidelity.training.boimpl;

import com.fidelity.training.model.Account;

public class AccountBoImpl {
	
	public double withdraw(double amount, Account acc){
		if(amount < 0 || (amount-acc.getBalance())<1000)
			System.out.println("invalid amount");
		else
			acc.setBalance(acc.getBalance()-amount);
		return acc.getBalance();
	}
	
	public double deposit(double amount, Account acc){
		if(amount < 0 )
			System.out.println("invalid amount");
		else
			acc.setBalance(acc.getBalance()+amount);
		return acc.getBalance();
	}

}

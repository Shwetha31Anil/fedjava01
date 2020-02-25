package com.fidelity.training.basicprograms;

import com.fidelity.training.model.Account3;

interface Account2{
	public double withdraw(int amount);
	public double deposit(int amount);
}



class SavingsAccount2 implements Account2, Account3{

	@Override
	public double withdraw(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposit(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

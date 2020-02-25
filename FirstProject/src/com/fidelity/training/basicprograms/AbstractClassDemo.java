package com.fidelity.training.basicprograms;

abstract class Account1{
	private int accNum;
	private String accname;
	protected double balance;
	
	public Account1(int accNum,double balance){
		this.accNum=accNum;
		this.balance=balance;
	}
	public Account1(double balance,int accNum){
		this.accNum=accNum;
		this.balance=balance;
	}
	public Account1(int accNum, String accnmae,double balance){
		this.accNum=accNum;
		this.accname=accnmae;
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public abstract double withdraw(int amount);
	
//	public double withdraw(int amount){
//		System.out.println("parent");
//		return this.balance-amount;
//	}
	public double deposit(int amount){
		return this.balance+amount;
	}	
}

class SavingsAccount1 extends Account1{
	private String doc;
	public SavingsAccount1(int accNum,double balance,String doc){
		super(accNum,balance);
		this.doc=doc;
	}
	
	public double withdraw(int amount){
		System.out.println("child");
		if((balance-amount)<1000 )
			System.out.println("invalid");
		else
			balance = balance-amount;
		return balance;
	}
		
}

class CurrentAccount1 extends Account1{

	public CurrentAccount1(int accNum, String accnmae, double balance) {
		super(accNum, accnmae, balance);
	}
	
	public double withdraw(int amount){
		System.out.println("child");
		if((balance-amount)<10000 )
			System.out.println("invalid");
		else
			balance = balance-amount;
		return balance;
	}
}


class LoanAccount  extends Account1{

	public LoanAccount(double balance, int accNum) {
		super(balance, accNum);
	}

	@Override
	public double withdraw(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account1 a1=new Account1(123,90879.0);
	}

}

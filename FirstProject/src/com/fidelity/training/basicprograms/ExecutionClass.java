package com.fidelity.training.basicprograms;


class Account{
	private int accNum;
	private String accname;
	protected double balance;
	
	public Account(int accNum,double balance){
		this.accNum=accNum;
		this.balance=balance;
	}
	public Account(double balance,int accNum){
		this.accNum=accNum;
		this.balance=balance;
	}
	public Account(int accNum, String accnmae,double balance){
		this.accNum=accNum;
		this.accname=accnmae;
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double withdraw(int amount){
		System.out.println("parent");
		return this.balance-amount;
	}
	public double deposit(int amount){
		return this.balance+amount;
	}	
}

class SavingsAccount extends Account{
	private String doc;
	public SavingsAccount(int accNum,double balance,String doc){
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

class CurrentAccount extends Account{

	public CurrentAccount(int accNum, String accnmae, double balance) {
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


public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account sav12=new Account(123,675756.98);
		
		Account sav=new SavingsAccount(123, 6576788, "25-02-2020");//child
		System.out.println(sav.getBalance());
		System.out.println(sav.withdraw(1000));
		sav.deposit(5678);
		
		
		Account acc=new Account(21323.0, 123);//parent
		System.out.println(acc.withdraw(1000));
	
	}

}

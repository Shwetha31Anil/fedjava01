package com.fidelity.training.basicprograms;



class Father {
	int money;
	public void setMoney(int money){
		this.money=money;
	}
	public double payMoney(){
		return money;
	}
}

interface Mother {
	public double payMoney();
}

class Child extends Father implements Mother{
	
}

public class MultipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.setMoney(100);
		System.out.println(c1.payMoney());
		
	}

}

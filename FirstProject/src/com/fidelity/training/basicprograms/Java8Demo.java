package com.fidelity.training.basicprograms;

interface Calc{
	public double add(int a,int b);
	//public double sub(int a, int b);
}
class NewCalc implements Calc{

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public double sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
		
}

public class Java8Demo {
	public static void main(String[] args) {
		Calc c1=new Calc(){
			public double add(int a,int b){
				return a+b;
			}
		};
		
		System.out.println(c1.add(123,56));
		
		Calc c2=(a,b)-> a+b;
		System.out.println(c2.add(56,78));
		
		Calc c3=(a,b)-> a*b;
		System.out.println(c3.add(67, 89));
		Calc c4= (m,n) -> {
				System.out.println("the value of m "+m);
				System.out.println("the value of n "+n);
				return m;
		};

	}

}

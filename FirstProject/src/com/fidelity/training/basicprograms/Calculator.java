package com.fidelity.training.basicprograms;

public class Calculator {
	
	public int add(int a,int b){
		System.out.println("int method");
		return a+b;
	}
	
	public float add(int a,float b){
		return a+b;
	}
	public float add(float a,float b){
		System.out.println("float method");
		return a+b;
	}
	
	public float add(float a,float b, float c){
		System.out.println("float method");
		return a+b+c;
	}
	
	public double add(double a,float b){
		System.out.println("double float method");
		return a+b;
	}
	

	public double add(double a,int b){
		System.out.println("double int method");
		return a+b;
	}
	
	public double add(float a, double b){
		return a+b;
	}
	
	public void someMethod(int a, String b){
		System.out.println("some method1 called");
	}
	
	public void someMethod(String a, int b){
		System.out.println("some methode2 Called");
	}
	
	public static void main(String args[]){
		Calculator c=new Calculator();
		System.out.println(c.add(12.0, 13));
	}

}

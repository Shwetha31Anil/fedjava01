package com.fidelity.training.basicprograms;

@FunctionalInterface
public interface Shape {
	
	public double area();
	public static void payMoney(){
		System.out.println("interafce static method");
	}
	public default void payMoney1(){
		System.out.println("interafce default method");
	}
}



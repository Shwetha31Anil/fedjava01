package com.fidelity.training.basicprograms;
interface Some{
	public  static void add(int... a){
		System.out.println("varargs");
		System.out.println(a);
	}
}

enum Status{
	ORDERED, DISPATCHED, SHIPPED,DELIVERED, COMPLETED, CANCELED	
}

enum TrafficSignal{
	RED("STOP"), ORANGE("READY"), GREEN("GO");
	private String action;
	 TrafficSignal(String action){
		this.action=action;
	}
	String getAction(){
		return action;
	}
}
public class EnumExample {
	
	
	public void add(int a,int b){
		System.out.println("two args method");
		System.out.println(a);
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		EnumExample e1=new EnumExample();
		e1.add(12,67);
		Some.add(213,767,878);
		TrafficSignal[] tf=TrafficSignal.values();
		for(TrafficSignal t:tf){
			System.out.println(t.getAction()+" "+t.name()+" "+t.ordinal());
		}
	}

}

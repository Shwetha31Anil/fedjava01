package com.fidelity.training.basicprograms;

import com.fidelity.training.model.Employee;


public class EmployeeApp{
	public static void main(String args[]){
		Employee emp=new Employee();
		emp.setEid(190);
		emp.setEname("Mohit");
		
		Employee emp1=new Employee(191,"Rohit");
		
		
		
		
		
		
		Employee e1=new Employee(12,"XYZ");
		System.out.println(e1.getEid()+" "+e1.getEname()+" "+Employee.getCompany()+" "+e1.getDEPT());
		
		Employee e2=new Employee(13,"MNV");
		Employee e3=new Employee(14,"MNr");
		Employee.setCompany("Fed In");
		
		System.out.println(e1.getEid()+" "+e1.getEname()+" "+Employee.getCompany()+" "+e1.getDEPT());
		System.out.println(e2.getEid()+" "+e2.getEname()+" "+Employee.getCompany()+" "+e1.getDEPT());
		System.out.println(e3.getEid()+" "+e3.getEname()+" "+Employee.getCompany()+" "+e1.getDEPT());
		
	}
	
	static{
		System.out.println("static block");
	}
}
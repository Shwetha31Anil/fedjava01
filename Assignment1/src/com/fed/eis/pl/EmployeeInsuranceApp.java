package com.fed.eis.pl;

import java.util.Scanner;

import com.fed.eis.bean.Employee;
import com.fed.eis.service.EmployeeService;
import com.fed.eis.service.EmployeeServiceImpl;

public class EmployeeInsuranceApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService ei=new EmployeeServiceImpl();
		System.out.println("Welcome to Insurance App");
		Employee e1=new Employee();
		System.out.println("Enter the employee details");	
		System.out.println("eid");
		e1.setEid(sc.nextInt());
		System.out.println("ename");
		e1.setName(sc.next());
		System.out.println("salary");
		e1.setSalary(sc.nextDouble());
		System.out.println("schema");
		e1.setInsuranceSchema(sc.next());
		System.out.println("designation");
		e1.setDesignation(sc.next());
		do{
			System.out.println("1. GetEmployee \n 2. FindSchema\n 3.Logout");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("employee details");
			Employee e= ei.getEmployee(e1);
			System.out.println(e);
			break;
		case 2: System.out.println("enter salary and Designation");
				String schema=ei.findInsurance(sc.nextDouble(), sc.next());
				System.out.println("Schema for the methioned Salary "+schema);
				break;
		case 3: System.out.println("Thank you");
		        System.exit(0);
		default: System.out.println("Invalid option");       
		}
		}while(true);
	}

}

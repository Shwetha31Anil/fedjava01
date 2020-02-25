package com.fidelity.training.model;


public class Employee{
	private int eid;
	private String ename;
	private static String company="fed"; 
	private final String DEPT= "POS";
	public Employee(){
		
	}
	public Employee(int empid){
		this.eid=empid;
	}	
	public Employee(int empid, String ename){
		this.eid=empid;
		this.ename=ename;
		//this.company= company;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid(){
	return eid;
	}
	public String getEname(){
		return ename;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Employee.company = company;
	}
	public String getDEPT() {
		return DEPT;
	}
	
//	public void setDEPT(String dept){
//		this.DEPT = dept;
//	}
}
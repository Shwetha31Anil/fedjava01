package com.fed.eis.bean;

public class Employee {
private int eid;
private String name;
private double salary;
private String designation;
private String insuranceSchema;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsuranceSchema() {
	return insuranceSchema;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary
			+ ", designation=" + designation + ", insuranceSchema="
			+ insuranceSchema + "]";
}
public void setInsuranceSchema(String insuranceSchema) {
	this.insuranceSchema = insuranceSchema;
}

}

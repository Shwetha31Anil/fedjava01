package com.fidelity.training.model;

public class Product {
private int pid;
private String pname;
private double cost;
private int qty;
private Brand brand=new Brand();
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost
			+ ", qty=" + qty + ", brand=" + brand + "]";
}
public int getPid() {
	return pid;
}
public Product(int pid, String pname, double cost, int qty, Brand brand) {
	this.pid = pid;
	this.pname = pname;
	this.cost = cost;
	this.qty = qty;
	this.brand = brand;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Brand getBrand() {
	return brand;
}
public void setBrand(Brand brand) {
	this.brand = brand;
}
public Product(){
	
}

}

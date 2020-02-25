package com.fidelity.training.basicprograms;

import com.fidelity.training.model.Brand;
import com.fidelity.training.model.Product;

public class HasAdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Brand b1=new Brand();
		b1.setBid(133);
		b1.setBname("Titan");
		
		Product p1=new Product();
		p1.setPid(123);
		p1.setPname("Watch");
		p1.setCost(67576);
		p1.setQty(233);
		p1.setBrand(b1);
		
		
		System.out.println("Product details");
		System.out.println(p1);

	}

}

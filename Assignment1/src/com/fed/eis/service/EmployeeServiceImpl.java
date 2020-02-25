package com.fed.eis.service;

import com.fed.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployee(Employee e) {
		// TODO Auto-generated method stub
		return e;
	}

	@Override
	public String findInsurance(double salary, String designation) {
		// TODO Auto-generated method stub
		String schema = null;
		if((salary >5000 && salary<20000) && designation.equals("SystemAssociate"))
			schema="Schema C";
		else if((salary >=20000 && salary<40000) && designation.equals("Programmer"))
			schema ="Schema B";
		else if(salary >=40000  && designation.equals("Manager"))
			schema= "Schema A";
		else
			schema="No Schema";
		return schema;
	}

}

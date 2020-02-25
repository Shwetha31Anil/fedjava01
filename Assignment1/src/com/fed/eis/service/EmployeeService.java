package com.fed.eis.service;

import com.fed.eis.bean.Employee;

public interface EmployeeService {

	public Employee getEmployee(Employee e);
	public String findInsurance(double salary, String designation);
}

package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeService {
	public Iterable<Employee> getAllEmployees();
	public String registerEmployee(Employee emp);
	public Employee getEmployeeBYNo(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int eno);

}

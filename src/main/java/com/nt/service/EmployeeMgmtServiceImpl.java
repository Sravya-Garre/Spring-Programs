package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepository;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeService {
@Autowired
private IEmployeeRepository empRepo;
	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	@Override
	public String registerEmployee(Employee emp) {
		return "employee is saved with id value:"+empRepo.save(emp).getEMPNO();
	}
	@Override
	public Employee getEmployeeBYNo(int eno) {
		Employee emp=empRepo.findById(eno).orElseThrow(()-> new IllegalArgumentException());
		return emp;
	}
	@Override
	public String updateEmployee(Employee emp) {
		
	 int i=empRepo.save(emp).getEMPNO();
		return "Employee is updated with having id value::"+i;
	}
	@Override
	public String deleteEmployeeById(int eno) {
		empRepo.deleteById(eno);
		return eno+" employee id EMPLOYEE is deleted";
	}

}

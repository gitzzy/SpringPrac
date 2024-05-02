package com.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	EmployeeRepo rep;
	
	public List<Employee> findAllEmp(){
		
		return rep.findAll();
	}
	
	public Employee FindByEmpId(int emp_id) {
		
		return rep.findById(emp_id).get();
	}
	
	public void AddEmp(Employee obj) {
		
		rep.save(obj);

	}

}

package com.capgemini.employeemanytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeemanytomany.dao.EmployeeDao;
import com.capgemini.employeemanytomany.entities.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	

	@Override
	public Set<Employee> addNew(Set<Employee> employee) {
		 dao.saveAll(employee);
		 return employee;
		 
	}


	@Override
	public Employee findByEmployeeId(int id) {
		
		Employee employee=dao.findById(id).get();
		return employee;
	}

	
	
}

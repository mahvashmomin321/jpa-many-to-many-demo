package com.capgemini.employeemanytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeemanytomany.entities.Employee;
import com.capgemini.employeemanytomany.entities.Project;
import com.capgemini.employeemanytomany.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/add")
	public Set<Employee> addEmp(){
		
		Set<Project> projects1 = new HashSet<Project>();
		
		projects1.add( new Project(1, ".net"));
		projects1.add( new Project(2, "java"));
		
		Set<Project> projects2= new HashSet<Project>();
		
		projects2.add( new Project(1, ".net"));
		projects2.add( new Project(3, "networking"));
		
		Set<Employee> employees = new HashSet<Employee>(); 
		
	employees.add( new Employee(101, "Mahi", projects1));
	employees.add(new Employee(102, "Akashta", projects2));
	
	service.addNew(employees);
		return employees;
	}
	
	@RequestMapping("/find")
	public Employee findEmployee(){
		Employee employees= service.findByEmployeeId(101);
		
		return employees;
		
	}
	
}

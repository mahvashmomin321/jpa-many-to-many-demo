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
		
		Set<Project> projects = new HashSet<Project>();
		projects.add(new Project(1, "abc"));
		projects.add(new Project(2, "cde"));
		
		Set<Employee> employees = new HashSet<Employee>(); 
		
	employees.add( new Employee(101, "Mahi", projects));
	employees.add(new Employee(102, "Akashta", projects));
	
	service.addNew(employees);
		return employees;
	}
	
}

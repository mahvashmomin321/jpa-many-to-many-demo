package com.capgemini.employeemanytomany.service;

import java.util.Set;

import com.capgemini.employeemanytomany.entities.Employee;

public interface EmployeeService {

	public Set<Employee> addNew(Set<Employee> employee);

	public Employee findByEmployeeId(int id);
}

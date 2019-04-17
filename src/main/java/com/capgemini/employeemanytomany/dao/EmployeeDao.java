package com.capgemini.employeemanytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employeemanytomany.entities.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}

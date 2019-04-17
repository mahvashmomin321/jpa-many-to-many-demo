package com.capgemini.employeemanytomany.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="emp_id")
	private int EmployeeId;
	
	@Column(name="emp_name")
	private String EmployeeName;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="Employee_Project", 
     joinColumns={@JoinColumn(name="emp_id")}, 
     inverseJoinColumns={@JoinColumn(name="project_id")})
	private Set<Project> projects;

	public Employee() {
		super();
	}
	
	

	public Employee(int employeeId, String employeeName) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
	}



	public Employee(int employeeId, String employeeName, Set<Project> projects) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		this.projects = projects;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + "]\n";
	}

}

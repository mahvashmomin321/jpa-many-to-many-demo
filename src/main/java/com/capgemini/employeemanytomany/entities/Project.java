package com.capgemini.employeemanytomany.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {

	@Id
	@Column(name="project_id")
	private int projectId;
	
	@Column(name="project_name")
	private String projectName;
	
	@ManyToMany
	private Set<Employee> employees;

	public Project() {
		super();
	}
	
	

	public Project(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}



	public Project(int projectId, String projectName, Set<Employee> employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employees = employees;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

//	public Set<Employee> getEmployees() {
//		return employees;
//	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", projectName=" + projectName + "]\n";
	}

}

package com.company.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="dept_table")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="Department_name")
	private String name;
	@Column(name="Department_head")
	private String hod;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employees=new ArrayList<Employee>();

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name, String hod, List<Employee> employees) {
		super();
		this.name = name;
		this.hod = hod;
		this.employees = employees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public String toString()
	{
		return String.valueOf(id);
	}
}

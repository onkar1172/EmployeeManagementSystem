package com.company.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp_table")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Salary")
	private int salary;
	
	
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, int salary, Department department) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}
	
	
	
	
}

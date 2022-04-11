package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp1
{
	@Id
	int salary;
	@Column
	String name;
	@Column
	String email;
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Emp1(int salary, String name, String email) {
		super();
		this.salary = salary;
		this.name = name;
		this.email = email;
	}

	public Emp1() 
	{
		super();
	}

	@Override
	public String toString() {
		return "Student [salary=" + salary + ", name=" + name + ", email=" + email + "]";
	}
}

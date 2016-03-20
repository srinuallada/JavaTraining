package com.javatraining;

public class Employee {
	private int employee_id;
	private String name;
	private float salary;

	public Employee() {
	}
	public Employee(int employee_id, String name, float salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return employee_id;
	}
	public void setId(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}

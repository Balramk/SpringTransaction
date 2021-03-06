package com.demo.transformers;

public class EmployeePojo {
	private int empId;
	private String empName;
	private float salary;
	
	public EmployeePojo(int empId, String empName, float salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Id: " + empId + ",| Employee Name: " +empName+ ", | Salary: " +salary;
	}
}

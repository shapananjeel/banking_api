package com.springSjdbc;

public class Employee {
 private int empId;
 private String empName;
 private int empSalary;
 private String empEmail;
 private String empPassword;
public Employee(int empId, String empName, int empSalary, String empEmail, String empPassword) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empEmail = empEmail;
	this.empPassword = empPassword;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
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
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public String getEmpPassword() {
	return empPassword;
}
public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empEmail=" + empEmail
			+ ", empPassword=" + empPassword + "]";
}
 
 
 
 
	
	
}

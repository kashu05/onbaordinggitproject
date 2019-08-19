package com.amdocs;

public class Employee {
	
	private String name;
	private String designation;
	private String department;
	
	
	private Address address;




	public Employee() {
		
	}
	


	public Employee(String name, String designation, String department, Address address) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", department=" + department + ", data="
				+ address + "]";
	}












	

}

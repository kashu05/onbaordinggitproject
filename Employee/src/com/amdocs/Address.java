package com.amdocs;

public class Address {
	public String doorNo;
	public String street;
	public String city;
	public String pincode;
	
	
	public Address(String doorNo, String street, String city, String pincode) {
	
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

	
	
	}
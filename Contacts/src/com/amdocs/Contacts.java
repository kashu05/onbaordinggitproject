package com.amdocs;
                      
import java.util.HashMap;

public class Contacts {

	
	private HashMap<String, String> contacts;
	
	public Contacts()
	{
		this.contacts=new HashMap<String, String>();
	}
	
	public void addContact(String name, String mobileno)
	{
		contacts.put(mobileno, name);
	}
	
	public String findContact(String mobileno)
	{
		String name=contacts.get(mobileno);          
		
		if(name==null)
		{ 	
			System.out.println("Name not found");
			return mobileno;
		}	
		else 
		{
			return name;
		}
		
		
	}
	public static void main(String[] args) 
	
	{
		Contacts c=new Contacts();
		c.addContact("Rishi", "123456");
		c.addContact("Arun", "97856748");
		
		System.out.println(c.findContact("1234562"));

	}

}

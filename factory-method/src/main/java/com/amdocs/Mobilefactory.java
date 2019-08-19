package com.amdocs;

public class Mobilefactory {
	
	
	public static Imobile getmobile(String mobilename)
	{
		Imobile mobile=null;
		
		if(mobilename.equals("Iphone4"))
			mobile = new Iphone4();
		
		else if(mobilename.equals("Iphone5"))
			mobile=new Iphone5();
		
		if(mobilename.equals("Oneplus5"))
			mobile=new Oneplus5();
		
		else 
			mobile= new NullMobile();
		
		return mobile;
	}

}

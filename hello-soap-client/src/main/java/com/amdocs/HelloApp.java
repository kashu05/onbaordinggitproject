package com.amdocs;

public class HelloApp {

	public static void main(String[] args) {
		
		HelloService service = new HelloService();
		
		Hello hello =service.getHello();  
		
		System.out.println(hello.sayHello());

	}

}

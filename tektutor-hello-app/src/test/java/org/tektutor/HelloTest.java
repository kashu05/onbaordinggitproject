package org.tektutor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testSayHello()
	{
		
		Hello hello=new Hello();
		
		String expectedResponse="Hello maven";
		String actualResponse=hello.sayHello();
		
		assertEquals (expectedResponse, actualResponse);
	}

}

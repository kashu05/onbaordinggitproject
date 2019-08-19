package com.amdocs;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestClass2 {
	
	
	@Category(SmokeTest.class)
	@Test
	public void testcase1()
	{
		System.out.println("TC1");
		
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("TC2");
		
	}

	

}

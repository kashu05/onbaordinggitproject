package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RPNCalculatorTest 
{
	private RPNCalculator rpnCalculator;
	private double actualResult, expectedResult; 
	
	@BeforeClass
	public static void initOnce()
	{
		System.out.println("Before class method");
	}
	
	@Before
	public void init()
	{
		rpnCalculator = new RPNCalculator();
		rpnCalculator=null;
		System.out.println("Before method");
	}
	
	
	
	
	@After
	public void cleanUp()
	{
		rpnCalculator=null;
		System.out.println("After method");
	}
	
	@AfterClass
	public static void tearDown()
	{
		System.out.println("After Class Method");
	}
	
	@Test
	public void testSimpleAddition()
	{
		RPNCalculator rpncalculator =new RPNCalculator();
		
		actualResult = rpncalculator.evaluate("10 15 +");
		expectedResult= 25.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpncalculator.evaluate("10 115 +");
		expectedResult= 125.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
	}
	
	
	@Test
	public void testSimpleSubtraction()
	{
		RPNCalculator rpncalculator =new RPNCalculator();
		
		actualResult = rpncalculator.evaluate("100 15 -");
		 expectedResult= 85.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpncalculator.evaluate("10 5 -");
		expectedResult= 5.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
	}
	
	public void testSimpleMultiplication()
	{
		RPNCalculator rpncalculator =new RPNCalculator();
		
		actualResult = rpncalculator.evaluate("100 15 *");
		expectedResult= 1500.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpncalculator.evaluate("10 5 *");
		expectedResult= 50.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
	}
	
	public void testSimpleDivision()
	{
		RPNCalculator rpncalculator =new RPNCalculator();
		
		actualResult = rpncalculator.evaluate("100 10 /");
		expectedResult= 10.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpncalculator.evaluate("10 5 /");
		expectedResult= 2.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
	}
	
	public void testComplexMath()
	{
		RPNCalculator rpncalculator =new RPNCalculator();
		
		double actualResult = rpncalculator.evaluate("10 10 + 100 20 / *");
		double expectedResult= 100.0;
		
		assertEquals (expectedResult, actualResult, 0.0001);
		
		
		
		
	}

	
	

}

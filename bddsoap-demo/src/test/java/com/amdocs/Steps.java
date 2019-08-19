package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	
	@Given("I had deployed the RPNCalculator SOAP api at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
	    // Write code here that turns the phrase above into concrete actions
	    soapWSDLURL=wsdlURL;
	}

	@Given("input is {string}")
	public void setInput(String rpnMathExpression) {
	    // Write code here that turns the phrase above into concrete actions
	    this.rpnMathExpression=rpnMathExpression;
	}

	@When("I invoke SOAP api")
	public void invokeRPNCalculatorSOAPAPI() {
	    // Write code here that turns the phrase above into concrete actions
	   RPNCalculatorService rpnWebService= new RPNCalculatorService();
	   
	   RPNCalculator rpncalculator = rpnWebService.getRPNCalculator();
	
	   actualResult = rpncalculator.evaluate(rpnMathExpression);
	}

	@Then("I expect response as  {string}")
	public void verify(String expectedResult) {
	    // Write code here that turns the phrase above into concrete actions
	    
	assertEquals(Double.parseDouble(expectedResult),actualResult,0.0001);
	}

}

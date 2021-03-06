package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	private Hello hello;
	private String actualResponse;
	
	@Given("I have created hello object")
	public void i_have_created_hello_object() {
	    // Write code here that turns the phrase above into concrete actions
	  hello = new Hello();
	}

	@When("I invoke the sayHello method on hello Object")
	public void i_invoke_the_sayHello_method_on_hello_Object() {
	    // Write code here that turns the phrase above into concrete actions
	  actualResponse = hello.sayHello();
	}

	@Then("I expect response as {string}")
	public void i_expect_response_as(String expectedResponse) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(expectedResponse, actualResponse);
	}

}

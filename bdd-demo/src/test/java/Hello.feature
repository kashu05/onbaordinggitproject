Feature: Develop Hello World Java Application

	Scenario: Should be able to invoke sayHello greeting method 
			Given I have created hello object
			When I invoke the sayHello method on hello Object
			Then I expect response as "Hello BDD!"
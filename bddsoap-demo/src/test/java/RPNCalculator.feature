Feature: Develop a RPN Calculator applictaion in java 
	Scenario: Simple addition
		Given I had deployed the RPNCalculator SOAP api at URL "http://localhost:8080/rpncalculator-ws/services/rpncalculator?wsdl"
		And input is "10 15 +"
		When I invoke SOAP api
		Then I expect response as  "25.0"
Feature: Track Walkins Login 

Scenario Outline: Verify the login feature with valid username and password 
	When User is on login page verify login page title 
	Given user enter"<username>"and"<password>"and clicks on the login button 
	Then Verify Homepage title 
	
	Examples: 
		| username | password |
		|demo@mailinator.com|walkins@123|
		
Scenario Outline: Verify the login feature with invalid username and password 
	When User is on login page verify login page title 
	Given user enter"<username>"and"<password>"and clicks on the login button 
	Then Verify the error message 
	
	Examples: 
		| username | password |
		|demo1@mailinator.com|walkins@123|
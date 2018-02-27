Feature:
	As a customer with valid credentials
	If I try to log into the application
	I should be allowed to signin

Scenario Outline:
	Given I go to <url>
	When I enter <username> and <password> 
	Then I should see the home page
	
	Examples:
	| username 	| password 	| url |
	| "yuvi1" 		| "yuvi1" 		| "http://newtours.demoaut.com/" |
	| "test1" 		| "test1" 		| "http://newtours.demoaut.com/" |

	
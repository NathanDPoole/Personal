Feature: 
	As a customer I have mone in my bank account
	I want to withdraw money
	So that I can spend it for movies and pop corn

#paramater are numbers
@iteration1
@iteration2
Scenario: Title of your scenario
  Given I have 200 dollars in my account
  When I try to withdraw 100 from my account
  Then I should be able to see teh remaining balance of 100 dollars
 
#example using and/but
Scenario: Eat 5 out of 12
	Given there are 12 cucumbers
	And they are in my fridge
	When I eat 5 cucumbers
	And nobody cleans my fridge in the meantime
	Then I should have 7 cucumbers left
	But if somebody cleans the fridge before dinner
	Then I'm not sure how many ar left


#Parameterizing using strings
@iteration2
Scenario: Tom posing a question in form
	Given I loged in as "Tom"
	When I try to post a Question about "TestNG and Cucumber"
	Then I should see my question posted in the form with "Conformation Message"

#give paramater as values from a table 
Scenario Outline: 
	Given there are <cukes_start> cucumbers
	When I eat <cukes_eat> cucumbers
	Then I should have <cukes_remaining> cucumbers left
	
	Examples:
		| cukes_start | cukes_eat | cukes_remaining |
		| 12 					| 5 				| 7 							|
		| 20 					| 12 				| 8 							|
		| 200 				| 150 			| 50 							|

#Provide just a table of values without a scenario		
#Background: 
#	Given there are cucumbers:
#		| cukes_start | cukes_eat | cukes_remaining |
#		| 12 					| 5 				| 7 							|
#		| 20 					| 12 				| 8 							|
#		| 200 				| 150 			| 50 							|
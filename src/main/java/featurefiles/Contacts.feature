#Author
#date
#description
@tag
Feature: 	Feature to test Create new contact

Scenario Outline: 	Create a new contact scenario

				Given user is on the login page
				When user enters username and password
				And clicks on the login button
				Then user is navigated to the home page
				Then user moves to the contact page
				When clicks on the new contact button
				Then new contact page is displayed
				And User enters contact details "<firstname>" and "<lastname>" and "<Accountname>"
				Then user clicks on the save button
		
Examples:
	|firstname  |  lastname  |  Accountname  |	
	| John		|	David    |  GlobalMedia  |
	| Kevin     |   Josh     |  Global Media |
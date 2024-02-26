#Author
#date
#description
@tag
Feature: 	Feature to test login functionality

@tag1
Scenario: Check UserMenu Dropdown is displayed

						Given user is on the login page
						When user enters username and password
						And clicks on the login button
						Then user is navigated to the home page
						When user clicks on the usermenu dropdown
						Then usermenu dropdown items should be displayed
	
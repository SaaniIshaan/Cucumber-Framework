#Author
#date
#description
@tag
Feature: 	Feature to test Create Account
@tag1
Scenario: Check login is successful with valid credentials
						Given user is on the login page
						When user enters username and password
						And clicks on the login button
						Then user is navigated to the home page
@tag2						
Scenario: Check New account page is displayed with account details
						Given user is on the home page
						When user clicks on the accounts link
						Then account page should be displayed
						When user clicks on the new button
						Then new account edit page should be displayed
						When user enters the account name
						And select type as technology partner
						And select customer priority as high
						And click on the save button
						Then New account page should be displayed 

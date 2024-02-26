Feature: Feature to test Data Driven Functionality


Scenario Outline: Login with different Username and Passwprd

Given: user on the login page
When: user enters the "<username>" and "<password>"
And: user clicks on the login button
Then: user gets the error message
Examples: 
	| username 		| password |
	|monu@gmail.com 	| ma@123    |
	|sonu@gmail.com  |sa@123     |
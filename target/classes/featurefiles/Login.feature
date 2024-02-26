#Author
#date
#description
@tag
Feature: 	Feature to test login functionality

@tag1
Scenario: Check login is successful with valid credentials

						Given user is on the login page
						When user enters username and password
						And clicks on the login button
						Then user is navigated to the home page
@tag2		
Scenario: 	Check login is successful with In-valid credentials
	
						Given user is on the login page
						When user enters in-valid username and in-valid password
						And clicks on the login button
						Then user should get a error message
@tag3						
Scenario:  Check login is successful with forget password

						Given user is on the login page
						When user clicks on the forgot password button 
						And  user enters the valid username
						When user clicks on the continue button
						Then user	should get a password reset message		
						
@tag4											
Scenario: 	Check login is successful with rememberme check box

						Given user is on the login page                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
						When user enters username and password
						And select the rememberMe check box
						And clicks on the login button
						Then user is navigate to the home page
						When user click on the usermenu button 		
						And user click on the logout button
					
						
						
						
						
						
						
							
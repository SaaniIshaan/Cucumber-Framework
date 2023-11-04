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
#@tag3
#Scenario: Check	Newely added view is displayed
					#Given user is on the home page
					#	When user clicks on the accounts link
					#	Then account page should be displayed
					#	When user click on the create new view link
					#	And user enters the view name and view unique name
					#	And clicks on the save button
					#	Then Newly added account view should be displayed
						
#@tag4
#Scenario: Check	Edit page is displayed with new information
						#Given user is on the home page
						#When user clicks on the accounts link
						#Then account page should be displayed
						#When user click on the view dropdown link
						#And user clicks on the edit link
						#Then view name edit page should be displayed
						#When user enters the view name
						#When user select the Account Name
						#And select the operator contains
						#And select the value a
						#And clicks on the save button
						#Then view page with new view name should be displayed			
						
#@tag5
#Scenario: Check	Merge accounts are displayed
						#Given user is on the home page
						#When user clicks on the accounts link
						#Then account page should be displayed
						#When user clicks on the merge accounts link
						#And enters the Account name in the text box
						#And clicks on the find Accounts button
						#When user select two accounts links in the list 
						#And clicks on the next button
						#Then Merge account page should be displayed 
						#When user clicks on the merge button
						#Then New pop up is displayed with merge confirmation
						
#@tag6
#Scenario: Check Account report is created
						#Given user is on the home page
						#When user clicks on the accounts link
						#Then account page should be displayed
						#When user clicks on the last activity>30 days link
						#Then unsaved report page should be displayed
						#When User select the created date in date fiels dropdown
						#And select todays date in from field
						#And select todays date in the To field
						#Then List of accounts should be displayed
						#When user clicks on the save button 
						#Then Pop up window should be displayed
						#When user enters the report name
						#And enters the report unique name
						#And clicks on the saveand run report button
						#Then Report page with details should be displayed
						 
						
						
						
						
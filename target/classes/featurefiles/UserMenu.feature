#Author
#date
#description
@tag
Feature: 	Feature to test login functionality

@tag1
Scenario: Check Usermenu dropdown is displayed

						Given user is on the login page
						When user enters username and password
						And clicks on the login button
						Then user is navigated to the home page
						When user clicks on the usermenu dropdown
						Then usermenu dropdown items should be displayed
#@tag2
#Scenario:		Check My Profile Option is displayed	
			
						#Given usermenu dropdown is displayed
						#When user clicks on the my profile button
						#Then profile page should be displayed
						#When user clicks on the edit profile button
						#Then edit profile page should be displayed
						#When user clicks on the about tab
						#And enters last name 
						#And clicks on the save button
						#Then changed last name should be displayed
						#When user clicks on the post link
						#And enters text in the post text area
						#And clicks on the share button
					#	Then entered should be displayed
					#	When user clicks on the file link
					#	And clicks on the upload button
					#	And clicks on the choose file button 
					#	And enters a file to upload 
					#	And clicks on the open button
					#	Then File should be posted
					#	When user clicks on add photo link
					#	And clicks on the upload photp link
					#And clicks on the choose file button 
					#	And select the image to upload
					#	Then upload photo should appear on the image.
#@tag3
#Scenario:		Check My Settings Option is displayed	
								
						#Given usermenu dropdown is displayed
					#	When user clicks on the my settings link
					#	Then my setings page should be displayed
					#	When clicks on the personal link
					#	And select Login history link
					#	Then login history should be displayed
					#	When clicks on the display and layout link
					#	And select customize my tabs link
					#	And select salesforce chatter option from custom App
					#	And select Reports tab
					#	And clicks on the Add button
					#	Then report field is added to the selected tabs
					#	When clicks on the Email link 
					#	And clicks on the email settings link
					#	And enters emailname, email address
					#	And select the Bcc radio button
					#	And clicks on the save button
					#	Then details should be displayed in mySettings page
					#	When clicks on the calendar & remainders link
					#	And clicks on the Activity remainders link
					#	And clicks on the open a test remainder button
					#	Then popup window should be displayed
#@tag4
#Scenario:		Check My Developers Console Option is displayed	
								
					#	Given usermenu dropdown is displayed
					#	When user clicks on the developers console link 
					#	Then developers console windoe should be displayed
					#	And clicks on the close button 
					#	Then Console window should be closed
#@tag5
#Scenario: Check for the logout option 
					
				#	Given usermenu dropdown is displayed					
				#	When user clicks on the logout button
				#	Then user should be logged out
						
						
Feature: Verify advanced Search
 
Scenario: Check whether the advanced search retrieves the case information correctly
	Given User Navigate to LogIn Page	
	When User logs in using the following credentials
	|UserName  |Password|
	|RCMRISA02 |rules   |
	And the user makes an advanced search from the xml file
	|XMLFile|
	|RCM_AdvancedSearchTest.xml|
	Then the user is able to fetch the required case

Feature: Verify whether the data from the pipeline is displayed correctly in the RCM system
 
Scenario: Check whether the data is displayed correctly on the RCM front end
	Given User Navigate to LogIn Page	
	When User logs in using the following credentials
	|UserName  |Password|
	|RCMCASEW51 |rules   |
	And the user makes an advanced search from the xml file
	|XMLFile|
	|RCM_CreateCase.xml|	
	And the user clicks on the case
	Then the user must be able to verify the case information

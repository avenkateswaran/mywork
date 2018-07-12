Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
	Given User Navigate to LogIn Page	
	When User enters "<UserName>" and "<Password>"
	Then the user is logged in Successfully	
Examples:
	|UserName  |Password|	
	|RCMRISA02 |rules   | 
	|RCMRISM01 |rules	|
	|RCMRISM02 |rules	|
	|RCMCASEW51|rules	|
	|RCMCASEW52|rules	|
	|RCMCASEW53|rules	|
	|RCMCASEW54|rules	|
	|RCMTEAMM51|rules	|
	|RCMTEAMM52|rules	|
	|RCMTEAMM53|rules	|
	|RCMTEAMM54|rules	|
	|RCMCASEW71|rules	|
	|RCMCASEW72|rules	|
	|RCMTEAMM71|rules	|
	|RCMTEAMM72|rules	|
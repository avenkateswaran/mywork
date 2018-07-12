Feature: Verify whether the decision is recorded correctly in the RCM system
 
Scenario Outline: Check decision making for all case type 
	Given User Navigate to LogIn Page		
	When User logs in using the following credentials
	|UserName  |Password  |
	|<UserName>|<Password>|
	And the user makes a quick search from the RCM Home page
	|CaseNumber  |
	|<CaseNumber>|	
	And the user records the decision using the following data
	|CaseType  |DecisonType  |CustomerNotes  |SchemeType  |ActionReason  |Approval_flg  |DecisonNotes  |Auth_flg  |
 	|<CaseType>|<DecisonType>|<CustomerNotes>|<SchemeType>|<ActionReason>|<Approval_flg>|<DecisonNotes>|<Auth_flg>|  	
	Then the appropriate confirmation message should be displayed.
Examples:
 		|UserName   |Password|CaseNumber|CaseType|DecisonType           |CustomerNotes|SchemeType|ActionReason            |Approval_flg|DecisonNotes|Auth_flg|
 		|RCMCASEW71	|rules	|TVC-585	|TAVC	|ApproveWithNoAmendment	|notes		  |			 |            			  |			   |			|	N	 |
		|RCMCASEW71	|rules	|TVC-585	|TAVC	|ApproveWithNoAmendment	|notes		  |			 |            			  |			   |			|	Y	 |
		|RCMCASEW71	|rules	|TVC-585	|TAVC	|ApproveWithAmendment	|notes		  |EIS	     |Insufficient information|	Y		   |			|	N	 |
		|RCMCASEW71	|rules	|TVC-585	|TAVC	|ApproveWithAmendment	|notes		  |SEIS	     |Insufficient information|	N	       |			|   Y	 |
		|RCMCASEW71	|rules	|TVC-585	|TAVC	|Reject					|notes		  |          |Insufficient information|		       |Rejected	|	Y	 |
		|RCMCASEW51	|rules	|MLR-1950	|AMLS	|Approve				|			  |          |						  |	           |			|   N	 |
		|RCMCASEW51	|rules	|MLR-1950	|AMLS	|ApproveWithConditions	|notes	 	  |			 |						  |            |			|   Y	 |
		|RCMCASEW51	|rules	|MLR-1950	|AMLS	|Reject					|notes		  |          |Insufficient information|	           |Rejected	|	Y	 |
		|RCMCASEW51	|rules	|MLR-1950	|AMLS	|Revoke					|notes		  |          |Insufficient evidence	  |	           |Revoked		|	N	 |
		|RCMCASEW51	|rules	|MLR-1950	|AMLS	|Withdrawal				|			  |          |						  |            |			|   Y	 |
		|RCMCASEW51	|rules	|MLR-1950	|AMLS	|De-registration		|			  |          |						  |            |			|   N	 |
		|RCMRISA02	|rules	|AWR-924	|AWRS	|Approve				|			  |          |						  |            |			|	N	 |
		|RCMRISA02	|rules	|AWR-924	|AWRS	|ApproveWithConditions	|notes		  |  		 |						  |            |notes		|		 |
		|RCMRISA02	|rules	|AWR-924	|AWRS	|Reject					|notes		  |          |Insufficient information|	           |Rejected	|	Y	 |
		|RCMRISA02	|rules	|AWR-924	|AWRS	|Revoke					|notes		  |          |Insufficient evidence   |	           |Revoked		|	N	 |
 		
 		
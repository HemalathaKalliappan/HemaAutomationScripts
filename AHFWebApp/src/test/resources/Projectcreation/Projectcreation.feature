Feature: Login and project creation functionality 
I want to login the application

@login
Scenario: verify login functionality
   Given Open the browser
   When Navigate to the Url
   When Enter username and password
   Then validate the outcomes

@Acquisition
Scenario Outline: Acquisition project creation
   Given Open the browser
   When Navigate to the Url
   When Enter username and password
   When Click on Acquisition
   When Enter all the required fields "<Dealname>" and "<AHF Lead>" and "<Bureau>" and "<Project Type>" and "<Deal Overview>"and "<Playbook Stage>" and "<12-Month Census Impact>" and "<Priority>" and "<Status>" and "<Status Explanation>" and "<Other Comments>" 
   When Click on save
   
   Examples: 
  
   |Dealname		  	 | AHF Lead 		 | Bureau   | Project Type  |Deal Overview																						| Playbook Stage        |12-Month Census Impact |Closing Date | Priority| Status	| Status Explanation 													 	  | Other Comments												|
   |Acquistions Pro1			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro2			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro3			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro4			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro5			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro6			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro7			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro8			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro9			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro10			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro11			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro12			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro13			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro14			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro15			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro16			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro17			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro18			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro19			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
   |Acquistions Pro20			| Asif Iqbal		 | Northern |	Pharmacy    |AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit providerfor HIV patients	| Prospecting           |<250					|			  |High		|Open		|AIDS Healthcare Foundation (AHF) is a Los Angeles-based global nonprofit	  | As members of the inaugural AIDS Hospice Committee			|
  
 
Feature: Special and Investment task creation 
Scenario Outline: Special task creation
   Given Open the browser
   When Navigate to the Url
   When Enter username and password
   When Click on special
   When Click on Special project link
   When Enter all required fields for Special task "<Task Name>" and "<Assigned To>" 
   When Click on save
 Examples: 
 
	|Task Name		 |Assigned To	|
	|Special task	 |Nachiyar Nambi| 
     

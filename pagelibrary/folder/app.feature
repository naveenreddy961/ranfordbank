Feature: login & branch creation
Scenario: validate the login functionality with valid
Given launch the site
When enter the username with "Admin" and password with "M1ndqLp" and click on login
Then Branches should be display
And close the site  

Scenario Outline: new branch creation with excel data
Given launch the site
When enter the username with "Admin" and password with "M1ndqLp" and click on login
Then Branches should be display
Then newbranch btn will be displayed
When click on newbranch btn and create new branch with "<BranchName>" and "<Address1>" and "<Address2>" and "<Address3>" and "<Area>" and "<Zipcode>" and "<Country>" and "<State>" and "<City>"  and click on submit 
Then branch will created sucessfully
And close the site
Examples: 
|BranchName|Address1|Address2|Address3|Area|Zipcode|Country|State|City|
|btm|ctr|ctr|ctr|ydr|21450|INDIA|GOA|GOA|
|ydr|ctr|ctr|ctr|ydr|21450|INDIA|GOA|GOA|
|ydr|ydr|ctr|ydr|ydr|51420|INDIA|GOA|GOA|



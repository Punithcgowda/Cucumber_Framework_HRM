Feature: HRM HR_Head 

Background:
Given Lounch the chrome browser and pass the URL

@Resgression
Scenario: create corporate as hr_head edit corporate as another hr_Head



#Then Login page should be displayed

When Enter the valid username and password
And Click on the user dropdown and Click on the hr_head option
And click on the Login button and Accept the popup

Then hr_head Dashboard page should be displayed

Given click corpotare button and click on Add Corporate button

Then Corporate page should be displyed

When Click on Add Corpoarate button

Then Add Corporate Page should be Displayed

When Click on Corporate TextField and Enter the corporate name
And Click on Save button
Then insert succefffully popUp should be Displayed

When Click on profile button andClvck on logout button

Then Successfully logout pop Should be Displayed

When Switch to popup and accept the popup

Then Login page should be Displayed 

@Smoke
Scenario: login as HR-Officer and delete the created corporate

#Then Login page should be displayed

When Enter the valid username and password
And Click on the user dropdown and Click on the hr_head option
And click on the Login button and Accept the popup

Then hr_head Dashboard page should be displayed

Given click Admin button and click on Add Admin button

Then Add Admin page should be displyed

Given click on AddAdmin button

Given Enter valid companyid FirstName LastName MiddleName Contact Position Emailid Password
And Click on  Save button

Then Added Sussessfully popup will be Displayed 

When Accept the popup

Then AddAdmin page should be displayed

When Click on profile button andClvck on logout button

Then Successfully logout pop Should be Displayed

When Switch to popup and accept the popup

Then Login page should be Displayed

@Resgression @Smoke
Scenario: Login with new credentials and delete the corporate

When Enter the newly created valid username and password
And Click on the user dropdown and Click on the hr_head option
And click on the Login button and Accept the popup

Then hr_head Dashboard page should be displayed

Given click corpotare button and click on Add Corporate button

Then Corporate page should be displyed 

When click on search button and pass the value

Then List of all value record should be displayed

When Delete all the records

















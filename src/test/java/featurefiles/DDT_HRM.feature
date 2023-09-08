Feature: HRM HR_Head_DDT

Background:
Given Lounch the chrome browser and pass the URL

@Regression
Scenario Outline: login as HR-Head and create new HRHead

Then Login page should be displayed

When Enter the valid "<Username1>" and "<password1>"

And Click on the user dropdown and Click on the hr_head option
And click on the Login button and Accept the popup

Then hr_head Dashboard page should be displayed

Given click Admin button and click on Add Admin button

Then Add Admin page should be displyed

Given click on AddAdmin button



When Enter valid "<companyid>" "<FirstName>" "<LastName>" "<MiddleName>" "<Contact>" "<Position>" "<Emailid>" "<Password>"

And Click on  Save button

Then Added Sussessfully popup will be Displayed 

When Accept the popup

Then AddAdmin page should be displayed

When Click on profile button andClvck on logout button

Then Successfully logout pop Should be Displayed

When Switch to popup and accept the popup

Then Login page should be Displayed

Examples:
| Username1 |password1 | companyid | FirstName | LastName | MiddleName | Contact | Position | Emailid | Password |
| hrhead@gmail.com |hrhead@123 | CMP_01 | FN_01 | LN_01 | MN_01 | 98765432101 | → HR Head | em@gmail.com | 1234 |
Feature: HRM HR_Head_DDT and POM implimented

#Background:
#Given Lounch the chrome browser and pass the URL

Scenario Outline: login as HR-Head and create new Emploiyee

When Enter the valid Username and password and HRType
     #Click on the user dropdown and Click on the hr_head option 
     #click on the Login button and Accept the popup
| Username | password | HRType |
| hrhead@gmail.com | hrhead@123 | → HR Head |
| hrofficer@gmail.com | hrofficer@123 | → HR Officer |
| hrassistant@gmail.com |hrassistant@123 | → HR Assistant |


When  Create Employeee
      #click Employee button and click on Add Employee button
      #click on AddAdmin button
      #Enter valid companyid FirstName LastName MiddleName Contact Position Emailid Password8
      #Click on  Save button
      # Added Sussessfully popup will be Displayed Accept the popup




When Logout from the application
     #Click on profile button and Clvck on logout button 
     #Switch to popup and accept the popup
     #Login page should be Displayed




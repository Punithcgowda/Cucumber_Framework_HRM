package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import Object_Repository.HRM_Head_Dashboardpage;
import Object_Repository.HRM_Head_Employee;
import Object_Repository.HR_Head_Loginpage;
import io.cucumber.java.en.When;

public class C_HRM_CreateEmp_UsngPOM
{
	WebDriver driver;
	@When("Enter the valid Username and password and")
	public void enter_the_valid_username_and_password_and(io.cucumber.datatable.DataTable dataTable) 
	{
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		String usn=data.get(0).get("Username");
		String pwd=data.get(0).get("password");
		String hrt=data.get(0).get("HRType");
		
		HR_Head_Loginpage log =new HR_Head_Loginpage(driver);
		log.loginToApp(usn, pwd, hrt, driver);
		
	   
	}

	@When("Create Employeee")
	public void create_employeee() 
	{
		HRM_Head_Employee emp=new HRM_Head_Employee(driver);
		emp.createEmployeeMethod(driver, "Pid", "Punith", "Kumar", "MC", "01-09-2023", "02-09-2023", "Developement", "Rajajinagar", "ded","sqvxghw", "sjchj", "shxw", "ajbxkj", "bsjkbwx", "sbn", "img");
	   
	}

	@When("Logout from the application")
	public void logout_from_the_application() 
	{
		HRM_Head_Dashboardpage dash= new HRM_Head_Dashboardpage(driver);
				dash.logout(driver);
	
	}


}

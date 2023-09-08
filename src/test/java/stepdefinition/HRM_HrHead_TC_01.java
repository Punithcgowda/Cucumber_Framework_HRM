package stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Generic_Utilities.FileUtility;
import Generic_Utilities.IPathConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM_HrHead_TC_01 
{
	FileUtility f_Ut=new FileUtility();
	public WebDriver driver;

	@Then("hr_head Dashboard page should be displayed")
	public void hr_head_dashboard_page_should_be_displayed() 
	{
		String dashboard_title=driver.getTitle();
	  System.out.println("The title of the Dashboard page is----->"+dashboard_title);
	}
	
	@Given("Lounch the chrome browser and pass the URL")
	public void lounch_the_chrome_browser_and_pass_the_url() throws IOException 
	{
		String BROUSER=f_Ut.getPropertyKeyValue("browser");
		if(BROUSER.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IPathConstants.implicitWaitDuration));
	    driver.manage().window().maximize();
		}
	   String URL= f_Ut.getPropertyKeyValue("url");
	    driver.get(URL);
	}

	@When("Enter the valid username and password")
	public void enter_the_valid_username_and_password() 
	{
		 driver.findElement(By.xpath("//input[@name='hr_email']")).sendKeys("hrhead@gmail.com");
		 driver.findElement(By.xpath("//input[@name='hr_password']")).sendKeys("hrhead@123");
	}

	@When("Click on the user dropdown and Click on the hr_head option")
	public void click_on_the_user_dropdown_and_click_on_the_hr_head_option()
	{
		 driver.findElement(By.xpath("//select[@name='hr_type']")).click();
		 WebElement ele=driver.findElement(By.xpath("//select[@name='hr_type']"));
		 Select s= new Select(ele);
		 s.selectByVisibleText("→ HR Head");
	}

	@When("click on the Login button and Accept the popup")
	public void click_on_the_login_button_and_accept_the_popup() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	}

     // Snippets for 2nd Scenario
	
	
	@Given("click corpotare button and click on Add Corporate button")
	public void click_corpotare_button_and_click_on_add_corporate_button() 
	{
		 driver.findElement(By.xpath("//p[contains(.,'CORPORATE')]")).click();
		 driver.findElement(By.xpath("//p[contains(.,'Add Corporate')]")).click();
	}
	@Then("Corporate page should be displyed")
	public void corporate_page_should_be_displyed() 
	{
	  String s= driver.getTitle();
	  System.out.println("Corporate page title------>"+s);
	}
	@When("Click on Add Corpoarate button")
	public void click_on_add_corpoarate_button() 
	{
	  driver.findElement(By.xpath("//button[contains(.,'Add Corporate')]")).click();
	}
	@Then("Add Corporate Page should be Displayed")
	public void add_corporate_page_should_be_displayed() 
	{
    String AddcorpSmalpage= driver.getTitle();
   System.out.println("Add Corporate small page popup---->"+AddcorpSmalpage);
	}
	@When("Click on Corporate TextField and Enter the corporate name") 
	public void click_on_corporate_text_field_and_enter_the_corporate_name() 
	{
	driver.findElement(By.xpath("//input[@placeholder='Corporate Name']")).sendKeys("PrasannaReddy");
	}
	@When("Click on Save button")
	public void click_on_save_button() 
	{
     driver.findElement(By.xpath("//descendant::button[.='Save']")).click(); 
	}
	@Then("insert succefffully popUp should be Displayed")
	public void insert_succefffully_pop_up_should_be_displayed() 
	{
	  driver.switchTo().alert().accept();
	}
	
	@When("Click on profile button andClvck on logout button")
	public void click_on_profile_button_and_clvck_on_logout_button() 
	{
	driver.findElement(By.xpath("//b[.='Welcome!,']")).click();
	driver.findElement(By.xpath("//a[contains(.,'Log Out')]")).click();
	}
	@Then("Successfully logout pop Should be Displayed")
	public void successfully_logout_pop_should_be_displayed() 
	{
		String alertText=driver.switchTo().alert().getText();
		System.out.println("The text of aler poup is------>"+alertText);
		
      
	}
	@When("Switch to popup and accept the popup")
	public void switch_to_popup_and_accept_the_popup() 
	{
		driver.switchTo().alert().accept();
	}
	@Then("Login page should be Displayed")
	public void login_page_should_be_displayed1() 
	{
	   String loginpagetitle=driver.getTitle();
	   System.out.println(loginpagetitle);
	   driver.close();	
	   }
	
	@Given("click Admin button and click on Add Admin button") 
	public void click_admin_button_and_click_on_add_admin_button() 
	{
		driver.findElement(By.xpath("//p[contains(.,'ADMIN')]")).click();
		driver.findElement(By.xpath("//p[contains(.,'Add Admin')]")).click();
	}
	@Then("Add Admin page should be displyed")
	public void add_admin_page_should_be_displyed() 
	{
	   String addadminTitle=driver.getTitle();
	   System.out.println("Add admin pagetitle will be----->"+addadminTitle);
	}
	
	@Given("click on AddAdmin button")
	public void click_on_add_admin_button() 
	{
		driver.findElement(By.xpath("//button[contains(.,'Add Admin')]")).click();
	}
	@Given("Enter valid companyid FirstName LastName MiddleName Contact Position Emailid Password")
	public void enter_valid_companyid_first_name_last_name_middle_name_contact_position_emailid_password() 
	{
		
		driver.findElement(By.xpath("//input[contains(@name,'hr_companyid')]")).sendKeys("Company_01");
		driver.findElement(By.xpath("//input[contains(@name,'hr_firstname')]")).sendKeys("Frst_name_01");
		driver.findElement(By.xpath("//input[contains(@name,'hr_lastname')]")).sendKeys("Last_Name-01");
		driver.findElement(By.xpath("//input[contains(@name,'hr_middlename')]")).sendKeys("Mddle_name_01");
		driver.findElement(By.xpath("//input[contains(@name,'hr_contactno')]")).sendKeys("99686045682");
		
		WebElement hrtype_Dropdown=driver.findElement(By.xpath("//select[contains(@name,'hr_type')]"));
		Select s1= new Select(hrtype_Dropdown);
		s1.selectByVisibleText("→ HR Head");
		driver.findElement(By.xpath("//input[contains(@name,'hr_email')]")).sendKeys("prasanakumar@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'hr_password')]")).sendKeys("1234");
	}
	@Given("Click on  Save button")  
	public void click_on_save_button1() 
	{
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	}
	@Then("Added Sussessfully popup will be Displayed")
	public void added_sussessfully_popup_will_be_displayed() 
	{
	    System.out.println("HR_Head Succefully created popup");
	}
	@When("Accept the popup")
	public void accept_the_popup() 
	{
	   driver.switchTo().alert().accept();
	}
	@Then("AddAdmin page should be displayed")
	public void add_admin_page_should_be_displayed() 
	{
	  System.out.println("Now we are in the addadmin page");
	}
	
	//Here we have logged out as HR_Head and agan we heve logged as new hr_head using old snippets
	
	@When("Enter the newly created valid username and password")
	public void enter_the_newly_created_valid_username_and_password() 
	{
		 driver.findElement(By.xpath("//input[@name='hr_email']")).sendKeys("prasanakumar@gmail.com");
		 driver.findElement(By.xpath("//input[@name='hr_password']")).sendKeys("1234");
	}
	
	// here we have selected the HR_Head and clicked on the login button using the same old snippets
	//Here we got Dashboard page and clicked on addCorporate using same old snippets
	
	//input[@type='search']
	//table/tbody/tr/td[4]/button[.='Delete']
	//div[@class='modal-content']/descendant::input[@value='PrasannaReddy']
	//h4[.='Delete Corporate']/ancestor::div[@class='modal-content']/descendant::input[@value='PrasannaReddy']/ancestor::div[@class='modal-content']//button[.='Delete']
	
	@When("click on search button and pass the value")
	public void click_on_search_button_and_pass_the_value() 
	{
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("PrasannaReddy");
	}
	@Then("List of all value record should be displayed")
	public void list_of_all_value_record_should_be_displayed()
	{
		List<WebElement> noOfRecords=driver.findElements(By.xpath("//table/tbody/tr[*]"));
		System.out.println("Total number of prasanna records are----->"+noOfRecords.size());
	}
	@When("Delete all the records")
	public void delete_all_the_records() 
	{
		
		List<WebElement> noOfRecords1=driver.findElements(By.xpath("//table/tbody/tr/td[4]/button[.='Delete']"));
		int n=noOfRecords1.size();
		System.out.println(n);
//		for(WebElement ele: noOfRecords1)
//		{
//			ele.click();
//			
//			driver.findElement(By.xpath("(//h4[.='Delete Corporate']/ancestor::div[@class='modal-content']/descendant::input[@value='PrasannaReddy']/ancestor::div[@class='modal-content']//button[.='Delete'])["+n+"]")).click();
//			driver.switchTo().alert().accept();
//			n--;
//		}
	}
	
	//Data Driven Testing
	
	@When("Enter the valid {string} and {string}")
	public void enter_the_valid_and(String username, String password) 
	{
		
	
		driver.findElement(By.xpath("//input[@name='hr_email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='hr_password']")).sendKeys(password);
	    
	}
	
	@When("Enter valid {string} {string} {string} {string} {string} {string} {string} {string}")
	public void enter_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) 
	{
		driver.findElement(By.xpath("//input[contains(@name,'hr_companyid')]")).sendKeys(string);
		driver.findElement(By.xpath("//input[contains(@name,'hr_firstname')]")).sendKeys(string2);
		driver.findElement(By.xpath("//input[contains(@name,'hr_lastname')]")).sendKeys(string3);
		driver.findElement(By.xpath("//input[contains(@name,'hr_middlename')]")).sendKeys(string4);
		driver.findElement(By.xpath("//input[contains(@name,'hr_contactno')]")).sendKeys(string5);
		
		WebElement hrtype_Dropdown=driver.findElement(By.xpath("//select[contains(@name,'hr_type')]"));
		Select s1= new Select(hrtype_Dropdown);
		s1.selectByVisibleText(string6);
		driver.findElement(By.xpath("//input[contains(@name,'hr_email')]")).sendKeys(string7);
		driver.findElement(By.xpath("//input[contains(@name,'hr_password')]")).sendKeys(string8);
	}

	
	

}

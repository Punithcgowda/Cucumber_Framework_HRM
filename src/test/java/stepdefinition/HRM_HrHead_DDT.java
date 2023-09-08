package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM_HrHead_DDT 
{
//	@Gpasswordven("Lounch the chrome browser")
//	public void lounch_the_chrome_browser() 
//	{
//		WebDriverManager.chromedriver().setup();
//	    driver=new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.manage().window().maximize();
//	    
//	    
//	}
//
//	@Given("Lounch the URL")
//	public void lounch_the_url() 
//	{
//	   driver.get("http://rmgtestingserver/domain/HRM_System/");
//	}
//
//	@Then("Login page should be displayed")
//	public void login_page_should_be_displayed() 
//	{
//	   String title=driver.getTitle();
//	   System.out.println("This is the login page title---->"+title);
//	}
//
//	@When("Enter the valid username")
//	public void enter_the_valid_username()
//	{
//	    driver.findElement(By.xpath("//input[@name='hr_email']")).sendKeys("hrhead@gmail.com");
//	    
//	}
//
//	@When("Enter the valid password")
//	public void enter_the_valid_password() 
//	{
//		driver.findElement(By.xpath("//input[@name='hr_password']")).sendKeys("hrhead@123");
//	}
//
//	@When("Click on the user dropdown")
//	public void click_on_the_user_dropdown() 
//	{
//     driver.findElement(By.xpath("//select[@name='hr_type']")).click();
//	 
//	}
//
//	@When("Click on the hr_head option the in the dropdown")
//	public void click_on_the_hr_head_option_the_in_the_dropdown() 
//	{
//		WebElement ele=driver.findElement(By.xpath("//select[@name='hr_type']"));
//		 Select s= new Select(ele);
//		 s.selectByVisibleText("→ HR Head");
//	}
//
//	@When("click on the Login button")
//	public void click_on_the_login_button() 
//	{
//		driver.findElement(By.xpath("//button[.='Sign In']")).click();
//	}
//
//	@When("Accept the popup")
//	public void accept_the_popup() 
//	{
//
//	    driver.switchTo().alert().accept();
//	}
//
	
//	Examples:
//		| Username1 |password1 |
//		| hrhead@gmail.com |hrhead@123 |

	
}

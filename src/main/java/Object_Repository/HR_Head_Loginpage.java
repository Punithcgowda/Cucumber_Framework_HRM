package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.WebdriverUtility;

/**
 * 
 * @author NETHRADHANU
 *
 */

public class HR_Head_Loginpage 
{
	//Utitility class objects
	 WebdriverUtility web_Utlil = new WebdriverUtility();
  //Declaration
	@FindBy(xpath ="//input[@name='hr_email']")
	private WebElement usernameTxtEdt;
	
	@FindBy(xpath ="//input[@name='hr_password']")
	private WebElement passwordTxtEdt;
	
	@FindBy(xpath = "//button[.='Sign In']")
	private WebElement submitBtnClk;
	
	@FindBy(xpath = "//select[@name='hr_type']")
	private WebElement selectDropdown;
	
	//initializaton
	public HR_Head_Loginpage(WebDriver driver)  //Constructor
	{
		PageFactory.initElements(driver, this);
	}
	//utilization provivde getters and setters and busines libraries

	public WebElement getUsernameTxtEdt() 
	{
		return usernameTxtEdt;
	}

	public WebElement getPasswordTxtEdt() 
	{
		return passwordTxtEdt;
	}
	public WebElement getselectDropdown()
	{
		return selectDropdown;
	}

	public WebElement getSubmitBtnClk() 
	{
		return submitBtnClk;
	}
	
	//create a method for login
	public void loginToApp(String username, String password, String account,WebDriver driver)
	{
		//send value for username textfild
	 usernameTxtEdt.sendKeys(username);
	 
	    //send value for password textfild
	 passwordTxtEdt.sendKeys(password);
	 
	    //select account from dropdown
	 WebdriverUtility web_Util = new WebdriverUtility();
	 web_Util.selectElementInDropdown(account,selectDropdown);
	 
	    //click on login button
	 submitBtnClk.click();
	 System.out.println("clicked on submit button----login page");
	 
	 //handle popUp after login to account
	 web_Util.waitForAlertPopup(driver);
	
	 web_Utlil.switchToAlertPopupAndAccept(driver,"Su");
	 
}
	
}

package stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.FileUtility;
import Generic_Utilities.IPathConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Hooks 
{
//	FileUtility f_Ut=new FileUtility();
//	public WebDriver driver;
//	
//	@Before
//	public void setUp() throws IOException
//	{
//		String BROUSER=f_Ut.getPropertyKeyValue("browser");
//		if(BROUSER.equalsIgnoreCase("chrome"))
//		{
//		WebDriverManager.chromedriver().setup();
//	    driver=new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IPathConstants.implicitWaitDuration));
//	    driver.manage().window().maximize();
//		}
//	   String URL= f_Ut.getPropertyKeyValue("url");
//	    driver.get(URL);
//	   
//	    
//	}
//	
//	@After
//	public void tearDown()
//	{
//		driver.close();
//		
//	}

}

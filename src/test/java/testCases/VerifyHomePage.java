package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import applicationPages.Homepage;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class VerifyHomePage {
	WebDriver driver;
	@BeforeMethod
	  
	  public void openBrowser() {
		
		driver= BrowserFactory.getBrowser("Firefox");	
		
		 driver.get(DataProviderFactory.getConfig().getURL());
		  
	  }
	
  @Test
  public void verifyHomePage()
  {
	  Homepage home=PageFactory.initElements(driver, Homepage.class);
	  String title = home.getApplicationTitle();
	  //Assert.assertEquals("Avactis Demo Store",title,"not matched");
	  AssertJUnit.assertEquals("Avactis Demo Store", title);
	  
	  System.out.println("Test Print");
}
  

  @AfterMethod
  public  void closeBrowser()
	
	{
		driver.close();
		
	}
}

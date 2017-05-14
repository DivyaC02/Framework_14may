package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import applicationPages.Homepage;
import applicationPages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class VerifyLoginPage {
	
	WebDriver driver;
	
  @Test
  public void verifyLoginPage() throws InterruptedException {
	  
	  Homepage home=PageFactory.initElements(driver, Homepage.class);
	  String title = home.getApplicationTitle();
	  AssertJUnit.assertTrue(title.contains("Avactis Demo Store"));
		
		home.login1();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.loginApplication(DataProviderFactory.getExcel().getData(0, 1, 0),DataProviderFactory.getExcel().getData(0, 1, 1));
		
		login.verifyDashboardTitle();
	  
  }
  
  @BeforeMethod
  public void openBrowser() {
	  
	  driver=BrowserFactory.getBrowser("Firefox");
	  driver.get(DataProviderFactory.getConfig().getURL());
	  
  }

  @AfterMethod
  public void closeBrowser() {
	
			BrowserFactory.closeBrowser(driver);
		}
  }



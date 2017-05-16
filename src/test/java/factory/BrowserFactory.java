package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserFactory {

	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("Firefox")){
			 driver=new FirefoxDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getChromePath());        
	          driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
				
	}
	
	public static void closeBrowser(WebDriver ldriver)
	
	{
		ldriver.close();
		
	}

}


package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
    WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		
		this.driver = ldriver;
		
	}
	
	@FindBy(id="account_sign_in_form_email_id")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="account_sign_in_form_passwd_id")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div/div[4]/div/div[2]/form/div[3]/input")
	@CacheLookup
	WebElement login2;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/div[1]/div[3]")
	WebElement dashboardtitle;
	
	public void loginApplication(String uname, String pass) throws InterruptedException{
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		Thread.sleep(2000L);
		login2.click();
	}

	public void verifyDashboardTitle(){
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement verify = wait.until(ExpectedConditions.visibilityOf(dashboardtitle));
		
		String text = verify.getText();
		
		System.out.println("Entered the dasboard verification");
		Assert.assertEquals(text, "Account Dashboard View","Dashboard title not verified properly.");
	}
}

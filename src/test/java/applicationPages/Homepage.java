package applicationPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage{

	WebDriver driver;
	 
	 
	public Homepage(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	 
		
	@FindBy(how=How.XPATH,using="(//span[text()='Home'])[1]")
	@CacheLookup
	WebElement home;
	
	
	@FindBy(how=How.XPATH,using="(//span[text()='My Account']")
	@CacheLookup
	WebElement myAccount;
	
	@FindBy(how=How.XPATH,using="(//span[text()='My Cart']")
	@CacheLookup
	WebElement myCart;
	
	@FindBy(how=How.XPATH,using="(//span[text()='Wishlist']")
	@CacheLookup
	WebElement wishlist;
	
	@FindBy(how=How.XPATH,using="html/body/header/div[1]/div/div/div/ul/li[5]/a/span")
	@CacheLookup
	WebElement login;
			
	public void Home() 
	{
		home.click();
	}
	
	public void Myaccount() 
	{
		myAccount.click();
	}
	
	public void Mycart() 
	{
		myCart.click();
	}
	
	public void Wishlist()
	{
	  wishlist.click();
		
	}
	
	public void login1()
	{
		login.click();
	}
	
	
	public String getApplicationTitle()
	{
	
		return(driver.getTitle());
		
	}
}
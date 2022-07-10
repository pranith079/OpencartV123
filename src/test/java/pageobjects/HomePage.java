package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(how=How.LINK_TEXT,using="Register") 
	WebElement lnkregister;
	
	@FindBy(linkText="Login") 
	WebElement lnklogin;
	
	
	public void clickMyAccount()
	{
		lnkmyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkregister.click();
	}
	
	public void clicklogin()
	{
		lnklogin.click();
	}
}

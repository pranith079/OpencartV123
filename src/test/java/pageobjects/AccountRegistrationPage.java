package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage 
{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	WebElement txtfirstname;
	
	@FindBy(name="lastname")
	WebElement txtlastname;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement pwd;
	
	@FindBy(id="input-confirm")
	WebElement cnfpwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement cnftext;
	
	public void setfirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setemail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void settelephone(String phone)
	{
		telephone.sendKeys(phone);
	}
	
	public void setpwd(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void setcnfpwd(String cnfpassword)
	{
		cnfpwd.sendKeys(cnfpassword);
	}
	
	public void setprivacy()
	{
		privacy.click();
	}
	
	public void clickcontinue()
	{
		submit.click();
	}
	
	public String cnfmsg()
	{
		try
		{
			return (cnftext.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
}

	
	
	
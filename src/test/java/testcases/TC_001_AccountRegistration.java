package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass
{
	
	@Test(groups= {"master","sanity"})
	public void testregistration()
	{
		try
		{
			logger.info("TC_001_AccountRegistration Started");
			logger.info("Launched URL of application");
			driver.get(rb.getString("appurl"));
			logger.info("Home page is displayed");
			
			HomePage hp=new HomePage(driver);
			
			logger.info("click on my Account");
	
			hp.clickMyAccount();
			
			logger.info("click on Register");
			hp.clickRegister();
			
			logger.info("Registration Page is displayed");
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			
			logger.info("Passed Registration details");
			regpage.setfirstname("milan");
			regpage.setlastname("chennai");
			regpage.setemail(randomstring()+"@gmail.com");
			regpage.settelephone("656566");
			regpage.setpwd("xyz@123");
			regpage.setcnfpwd("xyz@123");
			regpage.setprivacy();
			
			logger.info("Submitted the details for Registration");
			regpage.clickcontinue();
			
			logger.info("Capturing confirmation text");
			String confirmation=regpage.cnfmsg();
			
			if(confirmation.equals("Your Account Has Been Created!"))
			{
				logger.info("Test case Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Test case Failed");
				capturesreen(driver,"testregistration");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			logger.fatal("test case failed");
			Assert.fail();
		}
	}	
}	
		


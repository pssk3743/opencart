package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Headernfooterpage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_010_HeadernFooter extends BaseClass{
	
	@Test
	public void test_Login()
	{
		logger.info(" Starting TC_002_Login ");
		
		try
		{
			driver.get(rb.getString("url"));
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			Headernfooterpage sp=new Headernfooterpage(driver);
			
			sp.headers();
			
			Thread.sleep(1000);
			
			sp.footers();
			
			sp.canon();
			
			
		}	
		catch(Exception e)
		{
			logger.fatal("Login Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_002_Login ");
		
	}
	
	
}

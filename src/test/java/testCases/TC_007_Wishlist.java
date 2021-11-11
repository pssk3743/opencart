package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addtocartpage;
import pageObjects.LoginPage;
import pageObjects.Productcomparepage;
import pageObjects.Wishlist;
import testBase.BaseClass;

public class TC_007_Wishlist extends BaseClass{
	
	@Test
	public void productcomparison() {
		
		logger.info("Testcase 7 has started");
		
try {
	
driver.get(rb.getString("url"));
driver.manage().window().maximize();

Wishlist sp =new Wishlist(driver);

sp.searchbar("Mac book");


sp.wishlistbtn();

sp.wishlist();

LoginPage lp=new LoginPage(driver);

Thread.sleep(3000);

lp.enteremail("abcd@gmails.com");

lp.enterpassword("admin");

lp.clickLogin();

boolean s= sp.msgcon();

if(s) {
	
	logger.info("test case is passed, the product has been added to the wish list");
	Assert.assertTrue(true);
	
} else {
	
	logger.info("product was not added to wish list table");
	Assert.assertTrue(false);
}
	
	
}
catch(Exception e) {
	
	logger.fatal("test case has failed");
	Assert.assertTrue(false);
	
}

		
}
	
	
}

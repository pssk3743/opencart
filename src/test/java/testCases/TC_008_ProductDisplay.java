package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addtocartpage;
import pageObjects.LoginPage;
import pageObjects.ProductDisplayPage;
import pageObjects.Productcomparepage;
import pageObjects.Wishlist;
import testBase.BaseClass;

public class TC_008_ProductDisplay extends BaseClass{
	
	@Test
	public void productcomparison() {
		
		logger.info("Testcase 8 has started");
		
try {
	
driver.get(rb.getString("url"));
driver.manage().window().maximize();

ProductDisplayPage sp =new ProductDisplayPage(driver);

sp.searchbar("Mac book");


sp.imagedisp();

sp.productreview();

boolean s=sp.confmsg();


if(s) {
	
	logger.info("test case is passed, the product display page works good");
	Assert.assertTrue(true);
	
} else {
	
	logger.info("Not able to navigate to review page");
	Assert.assertTrue(false);
}
	
	
}
catch(Exception e) {
	
	logger.fatal("test case has failed");
	Assert.fail();
	
}

		
}
	
	
}
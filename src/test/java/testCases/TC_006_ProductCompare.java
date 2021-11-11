package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addtocartpage;
import pageObjects.Productcomparepage;
import testBase.BaseClass;

public class TC_006_ProductCompare extends BaseClass{
	
	@Test
	public void productcomparison() {
		
		logger.info("Testcase 6 has started");
		
try {
	
driver.get(rb.getString("url"));
driver.manage().window().maximize();

Productcomparepage sp =new Productcomparepage(driver);

sp.searchbar("Mac book");
sp.compare();

Thread.sleep(2000);

boolean s= sp.confmsg();

if(s) {
	
	logger.info("test case is passed, the product has been added to the comparison list");
	Assert.assertTrue(true);
	
} else {
	
	logger.info("product was not added to comparison table");
	Assert.assertTrue(false);
}
	
	
}
catch(Exception e) {
	
	logger.fatal("test case has failed");
	Assert.assertTrue(false);
	
}

		
}
	
	
}

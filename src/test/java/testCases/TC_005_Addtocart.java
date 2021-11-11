package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Addtocartpage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_005_Addtocart extends BaseClass{
	
	@Test
	public void  Add_to_cart() {
		
		logger.info("Test Case 5 has started");
		
		try {
			driver.get(rb.getString("url"));
        	driver.manage().window().maximize();
        	
            Addtocartpage sp =new Addtocartpage(driver);
            
            sp.searchbar("Mac book");
            
            sp.addtocart();
            
            sp.viewcart();
            
          String s=  sp.confmsg();
          
          logger.info(s);
          
          if(s.equals("MacBook")) {
        	  logger.info("item has been added to the cart");
        	  Assert.assertTrue(true);
          }else {
        	  
        	  logger.info("item was not added to cart");
        	  capturescreen(driver,"addtocart");
          }
            
            
		}
		catch(Exception e) {
			logger.fatal("test case failed");
			Assert.assertTrue(false);
			e.getStackTrace();
		}
	}
	
	
}
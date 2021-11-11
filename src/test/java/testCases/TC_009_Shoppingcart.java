package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
import pageObjects.Shoppingcart;
import testBase.BaseClass;

public class TC_009_Shoppingcart extends BaseClass {
	
	@Test
	public void searchitem() {
		
		logger.info("TestCase 4 has begun");
		
        try{
        	driver.get(rb.getString("url"));
        	driver.manage().window().maximize();
        	
            Shoppingcart sp =new Shoppingcart(driver);
            
            sp.searchbar("iMac");
            
            sp.addtocart();
            
            sp.viewcart();
            
          
            sp.shippingandtaxes();
            
            sp.selectcountryandstate();
            
            sp.postcode("b3n2c5");
            
            sp.shippingmethod();
            
           Thread.sleep(1000);
     
          boolean c=  sp.continueshopping();
          
          if(c) {
          	Assert.assertTrue(true);
          	
          	logger.info("shipping estimate has been applied");
          	 
          	
          }else {
          	
         logger.info("shipping estimate was not applied");
         capturescreen(driver,"SearchTest");
          }
            
            Thread.sleep(1000);
            
            String b=sp.continueshoppingmsg();
            
            logger.info(b);
            
            if(b.equals("Your Store")) {
            	
            	logger.info("test case has passed and you are on home page");
            	Assert.assertTrue(true);
            }else {
            	
                    logger.info("you are not on the home page");
            }
         
 
        }
        catch(Exception e){
        	logger.fatal("Search test has failed");
        	Assert.fail();
        }
	}
	}



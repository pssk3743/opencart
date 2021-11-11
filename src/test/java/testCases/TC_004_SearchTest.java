package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_SearchTest extends BaseClass {
	
	@Test
	public void searchitem() {
		
		logger.info("TestCase 4 has begun");
		
        try{
        	driver.get(rb.getString("url"));
        	driver.manage().window().maximize();
        	
            SearchPage sp =new SearchPage(driver);
            
            sp.searchbar("MacBookdfsfdh");
            
        Boolean val=  sp.msgconf();
        
        if(val) {
        	Assert.assertTrue(true);
        	capturescreen(driver,"SearchTest");
        	logger.info("no matched product found");
        	 
        	
        }else {
        	
       logger.info("product found--check the description");
       capturescreen(driver,"SearchTest");
        }
        	
        	
        }
        catch(Exception e){
        	logger.fatal("Search test has failed");
        	Assert.fail();
        }
	}

}

package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
      @FindBy(name="search")
      WebElement Searchbar;
      
     
      @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
      WebElement Searchicon;
      
      @FindBy(xpath="//*[@id=\"content\"]/p[2]")
      WebElement confmsg;
      
       public void searchbar(String product) throws InterruptedException {
    	   Searchbar.sendKeys(product);
    	   Thread.sleep(3000);
    	   Searchicon.click();
    	   Thread.sleep(3000);
    }
       
       public boolean msgconf() {
    	           JavascriptExecutor jse=(JavascriptExecutor)driver;
    	           jse.executeScript("window.scrollBy(0,1000)");
    			   return(confmsg.isDisplayed());
    	 
       }
       
       
       
       
       
       
       
       
}

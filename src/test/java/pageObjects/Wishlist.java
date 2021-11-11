package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	
	WebDriver driver;
	
	public Wishlist(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
      @FindBy(name="search")
      WebElement Searchbar;
      
     
      @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
  WebElement Searchicon;
      
      @FindBy(xpath="//button[@data-original-title='Add to Wish List']")
      WebElement wishlistbtn;
      
      @FindBy(xpath="//*[@id=\"product-search\"]/div[1]/a[4]")
      WebElement wishlistclick;
    
      
      @FindBy(xpath="//*[@id=\"content\"]/h2")
      WebElement confmsg;
      
      public void searchbar(String product) throws InterruptedException {
   	   Searchbar.sendKeys(product);
   	   Thread.sleep(3000);
   	   Searchicon.click();
   	   Thread.sleep(3000);
   }
      
      public void wishlistbtn() throws InterruptedException {
    	  wishlistbtn.click();
    	  Thread.sleep(2000);
      }
      
      public void wishlist() {
    	  wishlistclick.click();
    	 
      }
      
      public boolean msgcon() {
      
      return(confmsg.isDisplayed());
      
      }    
      
}
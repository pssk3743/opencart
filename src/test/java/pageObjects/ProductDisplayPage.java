package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
	
WebDriver driver;
	
	public ProductDisplayPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
      @FindBy(name="search")
      WebElement Searchbar;
      
     
      @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
      WebElement Searchicon;
    

      @FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div[1]/a/img")
      WebElement product_img;
      
      @FindBy(xpath="//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a/img")
      WebElement product_img2;
      
      @FindBy(xpath="/html/body/div[2]/div/button[2]")
      WebElement rightarrow;
      
      @FindBy(xpath="/html/body/div[2]/div/div[1]/div/button")
      WebElement cross;
      
      @FindBy(xpath="//*[@id=\"content\"]/div/div[1]/ul[2]/li[3]/a")
      WebElement review;
      
      @FindBy(xpath="//*[@id=\"form-review\"]/h2")
      WebElement confmsg;
      
      public void searchbar(String product) throws InterruptedException {
   	   Searchbar.sendKeys(product);
   	   Thread.sleep(3000);
   	   Searchicon.click();
   	   Thread.sleep(3000);
   }
      
      public void imagedisp() throws InterruptedException {
    	  product_img.click();
    	  
    	 Thread.sleep(1000);
    	 
    	 product_img2.click();
    	 
    	 Thread.sleep(1000);
    	 
    	 rightarrow.click();
    	
    	 
    	 Thread.sleep(1000);
    	 
    	 cross.click();
    	 
    	 Thread.sleep(2000);
      }
      
      public void productreview() throws InterruptedException {
    	  review.click();
    	  
    	  Thread.sleep(1000);
      }
      
      public boolean confmsg() {
    	  
    	  return(confmsg.isDisplayed());
      }
      

}

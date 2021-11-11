package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	
	WebDriver driver;
	
	public Addtocartpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
      @FindBy(name="search")
      WebElement Searchbar;
      
     
      @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
      WebElement Searchicon;
      
      @FindBy(xpath="//span[normalize-space()='Add to Cart']")
      WebElement addtocart;
      
      @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']/a[2]")
      WebElement viewcart;
      
      @FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
      WebElement confmsg;
    
      
      
       public void searchbar(String product) throws InterruptedException {
    	   Searchbar.sendKeys(product);
    	   Thread.sleep(3000);
    	   Searchicon.click();
    	   Thread.sleep(3000);
    	  
    }
       public void addtocart() throws InterruptedException {
    	   addtocart.click();
    	   Thread.sleep(2000);
       }
      public void viewcart() throws InterruptedException {
    	  viewcart.click();
    	  Thread.sleep(2000);
      }
      
      public String confmsg() {
    	  
    	 try {
    		 return(confmsg.getText());
    	 }
    	 catch(Exception e) {
    		 return(e.getMessage());
    	 }
      }
       
       
       
       
       
       
       
}

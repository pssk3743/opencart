package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productcomparepage {
	
	WebDriver driver;
	
	public Productcomparepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
      @FindBy(name="search")
      WebElement Searchbar;
      
     
      @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
      WebElement Searchicon;
      
      @FindBy(xpath="//button[@data-original-title='Compare this Product']")
      WebElement p_compare;
      
      @FindBy(xpath="//*[@id='product-search']/div[1]/a[2]")
      WebElement compare_click;
   
      
      @FindBy(xpath="//*[@id=\"content\"]/h1")
      WebElement confmsg;
      
      
      
       public void searchbar(String product) throws InterruptedException {
    	   Searchbar.sendKeys(product);
    	   Thread.sleep(3000);
    	   Searchicon.click();
    	   Thread.sleep(3000);
    }
       public void compare() throws InterruptedException {
    	   p_compare.click();
    	   Thread.sleep(3000);
    	   compare_click.click();
       }
       
       public boolean confmsg() {
    	   return(confmsg.isDisplayed());
       }
       
}
       

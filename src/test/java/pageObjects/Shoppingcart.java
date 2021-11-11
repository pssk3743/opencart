package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcart {
	
	WebDriver driver;
	
	public Shoppingcart(WebDriver driver) {
		
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
      
      @FindBy(xpath="//a[text()='Estimate Shipping & Taxes ']")
      WebElement shipping;
      
      @FindBy(xpath="//*[@name='postcode']")
      WebElement postcode;
      
      @FindBy(xpath="//*[@id='button-quote']")
      WebElement quotebutton;
      
      @FindBy(xpath="//*[@name='shipping_method']")
      WebElement shippingmethod;
      
      @FindBy(xpath="//*[@id='button-shipping']")
      WebElement shippingbutton;
      
      @FindBy(xpath="//*[@id=\"checkout-cart\"]/div[1]")
      WebElement congmsg;
      
      
      @FindBy(xpath="//a[normalize-space()='Continue Shopping']")
  	WebElement con_button;
      
    
      @FindBy(xpath="//*[@id=\"logo\"]/h1/a")
      WebElement messageconf;
      
      
      
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
      
      
      public void shippingandtaxes() {
    	  shipping.click();
      }
      
      public void selectcountryandstate() throws InterruptedException {
    	  Select s = new Select(driver.findElement(By.id("input-country")));
    	  s.selectByValue("38");
    	  
    	  Thread.sleep(2000);
    	  
    	  Select x = new Select(driver.findElement(By.id("input-zone")));
    	  x.selectByValue("608");
    	  
    	 
    	  
    	  }
      
      public void postcode(String pc) {
    	  
    	  postcode.sendKeys(pc);
    	  quotebutton.click();
    	  
      }
      
      public void shippingmethod() throws InterruptedException {
    	  
    	  shippingmethod.click();
    	  
    	  Thread.sleep(1000);
    	  
    	 shippingbutton.click();
      }
      
    
      
      public boolean continueshopping() {
    	 return(congmsg.isDisplayed());
        
    	 
    	 
      }
      public String continueshoppingmsg() {
    	  con_button.click();
    	  return(driver.getTitle());
      }
}
   

















       
       
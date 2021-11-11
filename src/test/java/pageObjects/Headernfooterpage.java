package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headernfooterpage {
	WebDriver driver;
	public Headernfooterpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Brands']")
    WebElement brands;
    @FindBy(xpath="//a[text()='Canon']")
    WebElement canon;
	
	public void headers() throws InterruptedException {
		List<WebElement> hd=driver.findElements(By.xpath("//*[@id=\"top-links\"]/ul/li"));
		System.out.println(hd.size());
	
	}
	
	public void footers() throws InterruptedException {
		
List<WebElement> ft=driver.findElements(By.xpath("/html/body/footer/div/div"));
System.out.println(ft.size());
		for(WebElement a:ft) {
			System.out.println(a.getText());
		}
		
		/*for(WebElement a:ft) {
			if(a.getText().equals("Brands")) {
		    a.click();
	        Thread.sleep(1000);
		     System.out.println(driver.getTitle());
	         break;
	}
		}*/
		
		brands.click();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		}
	
         public void canon() throws InterruptedException {
        	 canon.click();
        	 System.out.println(driver.getTitle());
        	 Thread.sleep(1000);
         }
		
	}
	
	
	
	
	
	
	
	
	
	


package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath {
    public static void main(String[] args) throws Throwable {
    	// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  //to open the browser
		  driver.get("https://www.facebook.com/");
		  
		  // address of email text fiels using xpath method
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vikas");
		  
		  //address of password textfeild using xpath contain attribute
		  driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("sachin");
		  Thread.sleep(2000);
		  
		  //address of forgetten password with xpath text
		  driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		  
		  //address of forgetten password with xpath text contains
		  //driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		  
		  
	}
}

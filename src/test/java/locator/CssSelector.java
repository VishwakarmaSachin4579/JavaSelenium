package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  //to open the browser
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sachin");
		  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vikas");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}

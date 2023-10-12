package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_traversing {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  // to open the browser 
		  driver.get("https://www.amazon.com/");
		  driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon\"]")).sendKeys("poco phone");
		  driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		 WebElement value = driver.findElement(By.xpath("//span[@id=\"productTitle\"]/../../../..//span[@aria-hidden=\"true\"]"));
		System.out.println(value.getText()); 
	}

}

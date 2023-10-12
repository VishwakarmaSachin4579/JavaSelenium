package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Following_Sibiling {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  //to open the browser
		  driver.get("https://www.amazon.in/");
		  driver.findElement(By.xpath("//a[text()='Sell']/following -sibiling::2")).click();

	}

}

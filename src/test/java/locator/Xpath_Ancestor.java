package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Ancestor {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  //to open the browser
		  driver.get("https://www.amazon.in/Lenovo-IdeaPad-12450H-Backlit-83BG000PIN/dp/B0CFF42RJ6/ref=sr_1_1_sspa?crid=\"10WHNXCIDU01&keywords=lenovo+laptops&qid=1695458165&sprefix=len 2Caps%2C202&sr=8-1-spons&sp_csd-d2 \"2V0TmFtZT1zcF9hdGY&psc=1\");");
         
		
		  WebElement price = driver.findElement(By.xpath(" (//span[contains(text(),'Lenovo IdeaPad Slim 5 Intel Core i5 12450H 16')])[3]/ancestor::div[@id='centerCol']//span[@class='a-price-whole']"));
		  System.out.println(price.getText());
	}	
}
		  		



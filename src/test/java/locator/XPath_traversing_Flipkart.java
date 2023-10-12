package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_traversing_Flipkart {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  // to open the browser 
		  driver.get("https://www.flipkart.com/poco-m6-pro-5g-forest-green-128-gb/p/itmdd5c70c99f5b2?pid=MOBGRNZ3534YGMDR&lid=LSTMOBGRNZ3534YGMDRKLKLEM&marketplace=FLIPKART&q=pocophone&store=tyy%2F4io&srno=s_1_9&otracker=search&otracker1=search&fm=organic&iid=210abcd7-1d2a-4af2-8c9c-3c4996bfd189.MOBGRNZ3534YGMDR.SEARCH&ppt=hp&ppn=homepage&ssid=eoufhimdds0000001695689639747&qH=f3cb29f62cf7cfb1");
		  JavascriptExecutor js=(JavascriptExecutor) driver;
			
			//scrolling by pixel
			js.executeScript("window.scrollBy(0,1000)", "");
		  WebElement value = driver.findElement(By.xpath("//span[text()='POCO M6 Pro 5G (Forest Green, 128 GB)']/../../../../../..//div[@class='_30jeq3 _16Jk6d']"));
			System.out.println(value.getText()); 
	}

}

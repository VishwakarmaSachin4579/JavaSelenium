package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_traversing2 {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement value = driver.findElement(By.xpath("//span[contains(text(),'        SAMSUNG Galaxy A14 (128GB, 4GB) 6.6\", Android 13, 5000mAh Battery, 50MP Triple Camera, Dual SIM 4G Volte GSM Unlocked International Model A145M/DS (w/ 256GB SD, Black)       ')]/../../../..//span[@aria-hidden=\"true\"]"));
		System.out.println(value.getText());

	}

}

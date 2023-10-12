package TestNG_FallingPurpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
   @Test
   public void fb() {
	// driver related statement
			WebDriverManager.edgedriver().setup();
			//open the  empty browser
			WebDriver driver =new EdgeDriver();
			// maximize web page
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			// to open the browser
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("sachin");
   }
}

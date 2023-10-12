package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;  
      @Test
      public void Fb() {
    	// driver related statement
  		WebDriverManager.edgedriver().setup();
  		//open the  empty browser
  		  driver = new EdgeDriver();
  		// Maximise web page
  		driver.manage().window().maximize();
  		// implicit wait
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		//to open the browser
  		driver.get("https://www.facebook.com/");
  		String title = driver.getTitle();
  		//Hard Assert
  		//Assert.assertEquals(title, "sachin");
  		
  		//Soft Assert
  		SoftAssert a = new SoftAssert();
  		a.assertEquals(title, "vikas");
  		System.out.println(driver.getCurrentUrl());
      }
      @Test
      public void closing() throws Throwable {
    	  Thread.sleep(3000);
    	  driver.close();
      }
}

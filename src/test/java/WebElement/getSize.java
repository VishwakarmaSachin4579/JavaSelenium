package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getSize {

	public static void main(String[] args) {
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
		  WebElement email=driver.findElement(By.id("email"));
		  Dimension size = email.getSize();
          int h = size.getHeight();
          int w=size.getWidth();
          System.out.println(h);
          System.out.println(w);
	}

}

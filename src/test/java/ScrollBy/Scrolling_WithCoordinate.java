package ScrollBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithCoordinate {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		  // maximize web page
		  driver.manage().window().maximize();
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  // to open the browser
		  driver.get("https://www.amazon.in/");
		  WebElement career= driver.findElement(By.xpath("//a[text()='Careers']"));
		  Thread.sleep(3000);
		 Point coordinate = career.getLocation();
		 int x =coordinate.getX();
		 int y = coordinate.getY();
		  //downcasting
		  JavascriptExecutor js=(JavascriptExecutor) driver;
	      js.executeScript("Window.scrollBy, ("+ x +","+y+")");
	      Thread.sleep(9000);
	      career.click();
	    //  js.executeScript("arguments[0].click();", career);
		  
		  
		  

	}

}

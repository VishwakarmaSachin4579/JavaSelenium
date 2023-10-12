package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  //implicit statement
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  //to open the browser
		  driver.get("https://demoapp.skillrary.com/product.php?product=java");
		  // addresss of plus icon 
		 WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		 Thread.sleep(6000);
		 Actions a = new Actions(driver);
		 a.doubleClick(plus).perform();
		 Thread.sleep(6000);
		 // address of add to cart
		 driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();

	}

}

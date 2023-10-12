package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
    public static void main(String[] args) throws Throwable {
    	// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		  // Maximise web page
		  driver.manage().window().maximize();
		// implicit wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //to open the browser
		  driver.get("https://snapdeal.com/");
	      WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		  // creatig an object for action class
		  Actions a = new Actions(driver);
		  a.moveToElement(signIn).perform();
		  Thread.sleep(3000);
		  //Address of Register 
		  driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		  // handling Frame
		  driver.switchTo().frame("loginIframe");
		  // address of mobile number text field
		  driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("sachin");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		  //Shifting Control to normal webpage
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("vikas");
	}
}

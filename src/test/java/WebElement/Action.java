package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
//open amazon and type computer and clear the data
public class Action {
	public static void main(String[] args) throws Throwable  {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	WebElement textField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	textField.sendKeys("computers");
	Thread.sleep(5000);
	textField.clear();
	Thread.sleep(5000);
	driver.close();
	
	}
}

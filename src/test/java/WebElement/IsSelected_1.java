package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected_1 {
	public static void main(String[] args) 
	{
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
	// maximizing the browser
	driver.manage().window().maximize();
	// implicitwait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// entering the url
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	// address of female radio button
	WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
	radio.click();
	if (radio.isSelected()) {
	System.out.println("pass");
	} else {
	System.out.println("fail");
	}
	}
}


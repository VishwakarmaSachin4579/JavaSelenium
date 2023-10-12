package ScreenShoot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_Screenshot {

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
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		// creating an object for action class
		Actions a= new Actions(driver);
		a.moveToElement(signIn).perform();
		//address of register
		driver.findElement(By.xpath("(//span[text()='register'])[1]")).click();
		Thread.sleep(3000);
		//downcasting
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshots/snapdeal.png");
		FileUtils.copyFile(src, dest);

	}

}

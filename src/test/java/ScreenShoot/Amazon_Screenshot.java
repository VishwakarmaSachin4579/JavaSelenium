package ScreenShoot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Screenshot {
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
		// downcasting
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshots/amazon.jpg");
		FileUtils.copyFile(src, dest);

	}
}

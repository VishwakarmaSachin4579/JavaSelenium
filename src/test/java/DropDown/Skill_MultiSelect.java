package DropDown;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Skill_MultiSelect {
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
		  driver.get("https://demoapp.skillrary.com/");
		WebElement dD = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(dD);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue ("199");
		Thread.sleep(3000);
		s.selectByVisibleText ("INR 300 INR 399 ( 1 ) ");
		Thread.sleep(3000);
		s.deselectByIndex (0);
		s.deselectByValue ("199");
		s.deselectByVisibleText ("INR 300 INR 399 ( 1 ) ");
           java.util.List<WebElement> values = s.getAllSelectedOptions();
	
		for (WebElement b: values) {

		System.out.println (b.getText());

		}
       
	}
}

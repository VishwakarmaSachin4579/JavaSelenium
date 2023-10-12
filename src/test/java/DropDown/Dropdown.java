package DropDown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) throws Throwable  { 
		 WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		  // Maximise web page
		  driver.manage().window().maximize();
		// implicit wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	driver.get("https://www.amazon.com/"); 
	
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox")); 
	Select s = new Select(dropdown); 
	s.selectByIndex(7); 
	Thread.sleep(3000); 
	s.selectByValue("search-alias=deals-intl-ship"); 
	Thread.sleep(3000); 
	s.selectByVisibleText("Digital Music"); 
	Thread.sleep(3000); 
	// s.deselectByIndex(1); 
	// Thread.sleep(3000); 
	// s.deselectByValue("199"); 
	// Thread.sleep(3000); 
	// s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) "); 
	List<WebElement> optn = s.getOptions(); 
	System.out.println(optn.size()); 
	for(WebElement allopt:optn) 
	{ 
	System.out.println(allopt.getText()); 
	} 
	Thread.sleep(3000); 
	driver.close();
  }
}
package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Dropdown {
	public static void main(String[] args) throws Throwable {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		// maximizing the browser
		driver.manage() .window().maximize();
		// implicit statement
		driver.manage().timeouts ().implicitlyWait (10, TimeUnit. SECONDS);
		driver.get("https://www.amazon.in/");
		// address of dropdown
		WebElement dD = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		// Handling drop down
		Select s = new Select(dD);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Car & Motorbike");
		System.out.println(s.isMultiple());
		List<WebElement> value = s.getOptions();
		System.out.println(value.size());
		for(WebElement b : value) {
			System.out.println(b.getText());
		}
		
		
	}

}

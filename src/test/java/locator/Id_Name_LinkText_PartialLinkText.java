package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_PartialLinkText {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  //to open the browser
		  driver.get("https://www.facebook.com/");
		  
		  //address of email text feild
		  driver.findElement(By.id("email")).sendKeys("sachin");
		  //address of password text feild
		  driver.findElement(By.name("pass")).sendKeys("vishwakarma");
		  // address of login button
		  //driver.findElement(By.name("login")).click();
		  //address of forgetten password link
		  //driver.findElement(By.linkText("Forgotten password?")).click();
		  driver.findElement(By.partialLinkText("Forgotten" )).click();

	}

}

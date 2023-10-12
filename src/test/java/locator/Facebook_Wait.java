package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Wait {

	public static void main(String[] args) {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		 //implicitly wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //to open the browser
		  driver.get("https://www.facebook.com/");

	}

}

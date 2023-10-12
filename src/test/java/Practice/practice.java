package Practice;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
   public static void main(String[] args) {
	// driver related statement
 		WebDriverManager.edgedriver().setup();
 		//open the  empty browser
 		  EdgeDriver driver = new EdgeDriver();
 		// Maximise web page
 		driver.manage().window().maximize();
 		// implicit wait
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		//to open the browser
 		driver.get("https://www.facebook.in/");
 		//to get all the link in webpage
		 
 		
   }
}

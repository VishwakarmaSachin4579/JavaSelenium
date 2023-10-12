package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		  Thread.sleep(3000);
		  // maximize web page
		  driver.manage().window().maximize();
		  
		  //to open the browser
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(3000);
		  driver.navigate().to("https://www.facebook.com/");
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  driver.quit();

	}

}

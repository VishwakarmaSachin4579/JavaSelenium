package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
    public static void main(String[] args) throws Throwable {
    	// driver related statement
  	  WebDriverManager.chromedriver().setup();
  	  //open the  empty browser
  	  WebDriver driver =new ChromeDriver();
  	  Thread.sleep(3000);
  	  // maximize web page
  	  driver.manage().window().maximize();
	}
}

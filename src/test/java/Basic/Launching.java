package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching {

	public static void main(String[] args) throws Throwable {
		// driver related statement
	  WebDriverManager.edgedriver().setup();
	  //open the  empty browser
	  WebDriver driver =new EdgeDriver();
	  Thread.sleep(3000);
	  // maximize web page
	  driver.manage().window().maximize();
	}

}

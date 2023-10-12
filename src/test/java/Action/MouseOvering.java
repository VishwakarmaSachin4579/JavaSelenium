package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOvering {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anamika Computer\\eclipse-workspace\\JavaSelenium\\src\\main\\resources\\chromedriver.exe" );
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		  // Maximise web page
		  driver.manage().window().maximize();
		// implicit wait
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //to open the browser
		  driver.get("https://snapdeal.com/");
		 WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		  //create an object for action class
		  Actions a=new Actions (driver);
		  a.moveToElement(signIn).perform();
		  Thread.sleep(3000);
		  //address of register
		  driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
	}
}

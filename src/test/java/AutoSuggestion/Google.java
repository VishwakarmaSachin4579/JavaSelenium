package AutoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

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
		  driver.get("https://www.google.com/");
		  driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		  Thread.sleep(2000);
		 List<WebElement> allvalue = driver.findElements(By.xpath("//li[@data-view-type='1']"));
        Thread.sleep(2000);
        for(WebElement b:allvalue) {
        	System.out.println(b.getText());
        }
        Thread.sleep(2000);
        driver.quit();
	}
}
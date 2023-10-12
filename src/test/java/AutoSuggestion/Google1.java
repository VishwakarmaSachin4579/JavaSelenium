package AutoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google1 {
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
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("phone");
	Thread.sleep(5000);
	List<WebElement> value = driver.findElements(By.xpath("//li[@data-viewtype='1']"));
	for(WebElement b:value) {
	System.out.println(b.getText());
	}
	driver.close();
	}
}



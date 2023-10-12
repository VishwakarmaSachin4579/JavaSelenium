package ScrollBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollby {

	public static void main(String[] args) {
		// driver related statement
				WebDriverManager.edgedriver().setup();
				//open the  empty browser
				WebDriver driver =new EdgeDriver();
				// Maximise web page
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//to open the browser
				driver.get("https://www.amazon.com.au/");
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				//scrolling by pixel
			//	js.executeScript("window.scrollBy(0,1000)", ""); -200 goes up
				
				//Scrolling page till find the element
			WebElement toy = driver.findElement(By.xpath("(//h2[text()='Save on Toys']"));
			js.executeScript("arguments[0].scrollIntowView(true)",toy);
	}

}

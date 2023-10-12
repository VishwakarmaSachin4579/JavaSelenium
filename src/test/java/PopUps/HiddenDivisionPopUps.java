package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopUps {

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
		  driver.get("https://www.redbus.in/");
		  driver.findElement(By.xpath("//span[text()='Date']")).click();
		  driver.findElement(By.xpath("//div[text()='Sep']/../../../..//span[@class='DayTiles_CalenderDaysSpan-sc-1xumO2u-1 bwoYtA']")).click();

	}

}

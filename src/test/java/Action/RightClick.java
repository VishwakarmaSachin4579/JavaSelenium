package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

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
		  driver.get("https://www.amazon.in/");
		 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		  Actions a = new Actions(driver);
		a.contextClick(search).perform();
			  

	}

}

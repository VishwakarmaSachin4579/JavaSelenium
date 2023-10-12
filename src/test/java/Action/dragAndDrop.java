package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {

	public static void main(String[] args) throws Throwable {
		// driver related statement
		  WebDriverManager.edgedriver().setup();
		  //open the  empty browser
		  WebDriver driver =new EdgeDriver();
		 
		  // maximize web page
		  driver.manage().window().maximize();
		  //implicit statement
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  //to open the browser
		  driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		  Thread.sleep(3000);
		
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(block1, block4).perform();	

	}

}

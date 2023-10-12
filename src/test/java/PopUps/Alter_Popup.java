package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Labaries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

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
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		// addresss of plus icon 
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		// address of add to cart
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		// switching the control
		 Alert al = driver.switchTo().alert();
		 Thread.sleep(3000);
		 System.out.println(al.getText());
		//al.accept();
		 al.dismiss();
	//	WebDriverUtilities utl = new WebDriverUtilities();
	//	utl.alter(driver);
	}

}

package ScrollBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Without {
	public static void main(String[] args) throws Throwable {
	WebDriverManager.edgedriver().setup();
	// opening chrome browser
	WebDriver driver =new EdgeDriver();
	// maximizing the browser
	driver.manage () .window () .maximize();
	// implicit statement
	driver.manage().timeouts ().implicitlyWait (10, TimeUnit.SECONDS); driver.get("https://www.amazon.in/");
	WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
	// doowncasting
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript ("arguments[0].scrollIntoView();", career);
	Thread.sleep(3000);
	career.click();
}
}

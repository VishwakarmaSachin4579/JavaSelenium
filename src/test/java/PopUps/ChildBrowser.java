package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser {

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
		driver.get("https://skillrary.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b : child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.id("mytext")).sendKeys("Sachin");
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

	}

}

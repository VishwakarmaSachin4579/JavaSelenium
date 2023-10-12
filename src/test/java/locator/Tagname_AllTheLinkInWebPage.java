package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname_AllTheLinkInWebPage {
	public static void main(String[] args) {
		// driver related statement
		WebDriverManager.edgedriver().setup();
		//open the  empty browser
		WebDriver driver =new EdgeDriver();

		// maximize web page
		driver.manage().window().maximize();

		//to open the browser
		driver.get("https://www.facebook.com/");

		//to get all the link in webpage
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		for (WebElement b:alllink) {
			System.out.println(b.getText());
		}

	}
}

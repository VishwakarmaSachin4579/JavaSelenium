package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.awt.SunHints.Value;

public class Assignment1 {
	 public static void main(String[] args)  {
			// driver related statement
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Anamika Computer\\eclipse-workspace\\JavaSelenium\\src\\main\\resources\\chromedriver.exe");
					//open the  empty browser
					WebDriver driver =new ChromeDriver();
					// Maximise web page
					driver.manage().window().maximize();
					// implicit wait
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//to open the browser
					driver.get("https://www.amazon.in/");
					driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phone");
					driver.findElement(By.id("nav-search-submit-button")).click();
					driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
					WebElement value = driver.findElement(By.xpath("(//span[@class='a-size-large product-title-word-break']/../../../../..//span[@class='a-price-whole'])[5]"));
					System.out.println(value.getText());
		 }
		}

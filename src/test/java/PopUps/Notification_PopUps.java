package PopUps;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_PopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anamika Computer\\eclipse-workspace\\JavaSelenium\\src\\main\\resources\\chromedriver.exe" );
		// WebDriverManager.edgedriver().setup();
		//open the  empty browser
		WebDriver driver =new ChromeDriver();
		// Maximise web page
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to open the browser
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	}

}

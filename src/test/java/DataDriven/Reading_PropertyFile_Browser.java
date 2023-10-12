package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_PropertyFile_Browser {

	public static void main(String[] args) throws Throwable {
		Properties p = new Properties();
		FileInputStream  fis=  new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String urlApp = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		String browser = p.getProperty("browser");
		WebDriver driver;
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anamika Computer\\eclipse-workspace\\JavaSelenium\\src\\main\\resources\\chromedriver.exe");
			driver = new EdgeDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(urlApp);
		 driver.findElement(By.id("email")).sendKeys(user);
		 driver.findElement(By.id("pass")).sendKeys(password);
		 
	}

}

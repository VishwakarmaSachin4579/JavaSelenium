package Generic_Labaries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
      
	

	//1.Mouse Overing
	public void mouseover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//2.double clicking 
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//3.Right Click
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//4.Drag and drop
	public void dragAndDrop(WebDriver driver, WebElement ele1,WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	
	//5.handling Alter popup clicking on ok 
	 public void alter(WebDriver driver) {
		 driver.switchTo().alert().accept();
	 }
	 
	//6.handling Alter popup clicking on cancel 
		 public void alterCancel(WebDriver driver) {
			 driver.switchTo().alert().dismiss();
		 }
		 
	 //7. Child Browser
	 public void chlidBrowser (WebDriver driver) {
		 Set<String> child = driver.getWindowHandles();
		 for(String b:child) {
			 driver.switchTo().window(b);
		 }
	 }
	 //8.Parent Browser
	 public void parent (WebDriver driver) {
		 driver.getWindowHandle();
	 }
	 
	 // 9.implicit method
	 public void ImplicitlyWait(WebDriver driver,int num) {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 }
	 
	 //10.explicitly method 
	 public void ExplicitlyWait(WebDriver driver, int t,WebElement ele) {
		 WebDriverWait Wait = new WebDriverWait(driver,10);
	 }
	 
	 //.Right Click
	 public void RightClick(WebDriver driver,WebElement ele) {
		 Actions a = new Actions (driver);
		 a.contextClick(ele); 
	 }
	 
	 
}

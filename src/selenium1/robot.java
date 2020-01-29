package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

public class robot {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Pradap\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		
		
	 WebElement eml = driver.findElement(By.id("email"));
	 
	 eml.sendKeys("pradhap");
	 
	 Actions acc = new Actions(driver);
	 
	 acc.doubleClick(eml).perform();
	 
	 acc.contextClick(eml).perform();
	 
	 Robot r = new Robot();
	 
	 for (int i = 0; i <= 0; i++) {
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		WebElement pass = driver.findElement(By.id("pass"));
		pass.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.quit();
		
	}
	 
	 
	 
		
	 
		
	}

}

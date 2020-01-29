package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Pradap"
				+ "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement txtuser = driver.findElement(By.id("src"));
		
		txtuser.sendKeys("chennai");
		
		WebElement txtto= driver.findElement(By.id("dest"));
		
		txtto.sendKeys("pattukkottai");
		
		
	}

}

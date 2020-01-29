package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Pradap"
				+ "\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtuser = driver.findElement(By.id ("email"));
		txtuser.sendKeys("pradhapranjan@gmail.com");
		
		WebElement txtpass = driver.findElement(By.name("pass"));
		txtpass.sendKeys("985645611");
	}

}

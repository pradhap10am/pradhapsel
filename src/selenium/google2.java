package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google2 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Pradap"
				+ "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement name=driver.findElement(By.id ("AuthenticationFG.USER_PRINCIPAL"));
		name.sendKeys("pradhap");
		
		WebElement pass= driver.findElement(By.id ("AuthenticationFG.ACCESS_CODE"));
		
		pass.sendKeys("bibuhio");
	}
}

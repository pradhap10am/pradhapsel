package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chome.driver", "C:\\Users\\user\\eclipse-workspace\\Pradap\\driver\\chromedriver.exe"
				);
		WebDriver driver = new ChromeDriver();
		
		//launch browser
		
		driver.get(" https://www.facebook.com/ ");
		
		
	}

}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class coursedetails {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "Pradap\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" http://greenstech.in/selenium-course-content.html\r\n" + 
				"");
		
		
		
		
	}

}
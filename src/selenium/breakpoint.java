package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class breakpoint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "Pradap\\driver\\chromedriver.exe");
		
		//to configure browser
		
		WebDriver d= new ChromeDriver();
		
		//to launch browser
		
		d.get("https://www.snapdeal.com/ ");
		
		
	}

}

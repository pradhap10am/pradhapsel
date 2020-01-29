package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user"
				+ "\\eclipse-workspace\\Pradap\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//LAUNCH web page
		driver.get("https://www.facebook.com/");
		// TO GET TITLE OF THE CURRENT WEB PAGE
		String title=driver.getTitle();
		System.out.println(title);
		// to get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// to close the browser
		driver.quit();
		
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
   public static void main (String [] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace"
	   		+ "\\Pradap\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   // to launch Url
	   driver.get("http://www.greenstechnologys.com/");
	   
	   // to get title
	   
	  System.out.println(driver.getTitle());
	    // to get current url
	  
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 driver.quit();
   }
}

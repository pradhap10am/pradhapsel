package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Pradap"
				+ "\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	JavascriptExecutor is=(JavascriptExecutor)driver;
	
	WebElement e1 = driver.findElement(By.id("email"));
	Thread.sleep(3000);
	
	is.executeScript("arguments[0].setAttribute('value','pradhap@gmail.com')", e1);
	
	WebElement e2 = driver.findElement(By.xpath("//a[@href='/games/']"));
	
	is.executeScript("arguments[0].scrollIntoView(true)", e2);
	
	
	}

}

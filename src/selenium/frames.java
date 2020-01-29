package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "Pradap\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://paytm.com/");
		
		Thread.sleep(5000);
		
		WebElement f1 = d.findElement(By.xpath("//div[@class='_3ac-']"));
		f1.click();
		
		WebElement f2 = d.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		
		d.switchTo().frame(f2);
		Thread.sleep(3000);
		WebElement f3 = d.findElement(By.xpath("//span[@user-actions='login_clicked']"));
		
		f3.click();
		
		WebElement f4 = d.findElement(By.name("username"));
		
		f4.sendKeys("pradhap");
		
		WebElement f5 = d.findElement(By.name("password"));
		
		f5.sendKeys("5487453");
		Thread.sleep(3000);
		d.switchTo().parentFrame();
		WebElement f6 = d.findElement(By.xpath("//a[@title='Close']"));
		f6.click();
		
		
		
		
	}

	
}

package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Pradap\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement desc = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions acc= new Actions(driver);
		acc.dragAndDrop(src, desc).perform();
		
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement des1= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		acc.dragAndDrop(src1, des1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		Thread.sleep(5000);
		WebElement desc2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		acc.dragAndDrop(src2, desc2).perform();
		
		
		
	}

}
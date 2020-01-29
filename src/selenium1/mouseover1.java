package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "Pradap\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("http://greenstech.in/selenium-course-content.html\r\n" + 
				"");
		
		WebElement mse = d.findElement(By.xpath("//a[@href='courses.html']"));
		
		Actions acc = new Actions(d);
		
		acc.moveToElement(mse).perform();
		Thread.sleep(3000);
		
		WebElement sft= d.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		
		acc.moveToElement(sft).perform();
		
		WebElement sel = d.findElement(By.xpath("//span[text()='Selenium Training']"));
		
		sel.click();
		
	
		
	}
	

}

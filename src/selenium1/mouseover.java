package selenium1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseover {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "Pradap\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.iN");
		
		WebElement mse = driver.findElement(By.id("nav-hamburger-menu"));
		
		mse.click();
		
		WebElement mse1 = driver.findElement(By.xpath("//a[@data-menu-id='7']"));
		
		mse1.click();
		
		WebElement mse2 = driver.findElement(By.xpath("//a[@class='hmenu-item'][1]"));
		
		mse2.click();
		

	}

}

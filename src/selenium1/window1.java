package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace"
				+ "\\Pradap\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphones 7");
		
Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		
		for (String x : allid) {
			if (!parentid.equals(x)) {
				driver.switchTo().window(x);
				
				driver.findElement(By.id("add-cart-button-id")).click();
				Thread.sleep(3000);
				
			WebElement amt = driver.findElement(By.xpath("(//span[text()='Rs. 39,899'])[2]"));
			
			String amt1 = amt.getText();
			System.out.println(amt1);
			
				
				
				
				
				
			}
			
		}
		
		
		
	}

	private static boolean parentid(String x) {
		// TODO Auto-generated method stub
		return false;
	}

}

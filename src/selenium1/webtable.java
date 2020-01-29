package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "Pradap\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get( "http://toolsqa.com/automation-practice-table/");
		
		WebElement table = d.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
		String txt = table.getText();
		System.out.println(txt);

}
}

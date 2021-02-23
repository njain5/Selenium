import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlinksinpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// Get Link Count of the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Get Link count of footer of the page
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // Limiting the scope to footer only
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// Get Link of first Column in footer
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		// Click on each link in column and check if pages are working.
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
		}//Clicks on each link.
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}//Navigate to different window and grabs title names.

	}

}

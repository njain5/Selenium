import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// expected product to add to cart. Best way is to declare array first.
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Pumpkin" };
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); Implicit Wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItem(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit Wait
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		

	}

//Setting method static, I can access method without creating object of the class.
	public static void addItem(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// Format the name that we got

			// Convert array into arraylist

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			// if (name.contains("Cucumber"))

			if (itemsNeededList.contains(formattedName)) {
				j++;

				// Never depend on text. If we have dynamic text, we should not use. Not a
				// suggested locator.
				// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break; if we are going with single item
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}

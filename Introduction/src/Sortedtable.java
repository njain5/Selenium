import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortedtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		// Capture the text from the list.
		List<String> originalList = elementlist.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			// scan the name and print the price of vegetable
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceveggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getPriceveggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}

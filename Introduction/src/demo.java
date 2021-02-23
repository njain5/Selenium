import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Driver Object for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");  //Launch Url
		System.out.println(driver.getTitle());  //Validate Title of Page
		System.out.println(driver.getCurrentUrl()); //validate URL is the same as provided
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.close(); //Closes Current browser. Closes window in focus.
		driver.quit(); //Closes all the browser and tabs
		
	}

}

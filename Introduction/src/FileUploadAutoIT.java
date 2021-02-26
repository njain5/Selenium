import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Resume\\PDFUploadAutoIT.exe");
		WebDriverWait wait  = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*=''medium]")));
		driver.findElement(By.cssSelector("button[class*=''medium]"));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click();
		File f = new File("C:\\Downloads\\converted.zip");
		if(f.exists()) {
			System.out.println("File Exists");
		}
	}

}

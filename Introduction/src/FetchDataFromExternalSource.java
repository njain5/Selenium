import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromExternalSource {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\Nikhil Jain\\eclipse-workspace\\Introduction\\src\\env.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Nikhil Jain\\eclipse-workspace\\Introduction\\src\\env.properties");
		prop.store(fos, null);
				

	}

}

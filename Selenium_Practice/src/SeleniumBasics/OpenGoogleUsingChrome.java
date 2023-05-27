package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleUsingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize Window
		driver.manage().window().maximize();

		// 1.open gooogle
		driver.get("https://www.google.com/");

		// quit browser
		driver.quit();
	}

}

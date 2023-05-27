package SeleniumConceptsHandsON;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		
		// using ChromeOptions
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");

		// using Maximize Window
		// driver.manage().window().maximize();

		// using Dimension
//		Dimension dimension = new Dimension(1366, 768);
//		driver.manage().window().setSize(dimension);

		

		// quit browser
		driver.quit();
	}

}

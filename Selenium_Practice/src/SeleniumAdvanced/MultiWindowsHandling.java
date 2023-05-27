package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");

		// Maximize Window
		driver.manage().window().maximize();

		// Click on the Muiltiple windows button
		WebElement multiple = driver.findElement(By.id("multi"));
		multiple.click();

		// Print all the window title
		Set<String> allMultiWindows = driver.getWindowHandles();
		for (String allTitle : allMultiWindows) {
			driver.switchTo().window(allTitle);
			String driverUrl = driver.getCurrentUrl();
			System.out.println("Print all the window title: " + driverUrl);
		}

		// Close all the windows
		driver.quit();
	}

}

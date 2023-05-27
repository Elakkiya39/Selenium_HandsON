package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");

		// Maximize Window
		driver.manage().window().maximize();

		// using getWindowHandle to store the parent window
		String parentWindow = driver.getWindowHandle();

		// Click on the home button
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();

		// using getWindowHandles to store the all windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		// Goto the newly opened tab
		for (String newWindow : allWindows) {
			driver.switchTo().window(newWindow);
			System.out.println("new window " + newWindow);
		}

		// Print the title of the page
		String title = driver.getTitle();
		System.out.println("Title is:  " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL is:  " + url);

		// Close the parent window
		for (String parent : allWindows) {
			if (parent.equals(parentWindow)) {
				driver.switchTo().window(parent);
				driver.close();
			}
		}

		// Close the child window
		for (String parent : allWindows) {
			if (!parent.equals(parentWindow)) {
				driver.switchTo().window(parent);
				driver.close();
			}
		}

		// quit browser
		driver.quit();
	}

}

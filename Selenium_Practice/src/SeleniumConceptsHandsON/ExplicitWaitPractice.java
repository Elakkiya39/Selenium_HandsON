package SeleniumConceptsHandsON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Explicit Wait Practice
		WebDriverWait driverWait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement userName = driverWait1.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		userName.sendKeys("Admin");

		// Explicit Wait Practice
		WebDriverWait driverWait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement passWord = driverWait2.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		passWord.sendKeys("admin123");

		// Explicit Wait Practice
		WebDriverWait driverWait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement loginBtn = driverWait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginBtn.click();

		// quit browser
		driver.quit();
	}

}

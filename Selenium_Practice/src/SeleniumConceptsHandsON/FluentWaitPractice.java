package SeleniumConceptsHandsON;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Maximize Window
		driver.manage().window().maximize();

		// Explicit Wait Practice
		WebDriverWait driverWait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement userName = driverWait1.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		userName.sendKeys("Admin");

		// Explicit Wait Practice
		WebDriverWait driverWait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement passWord = driverWait2.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		passWord.sendKeys("admin123");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		WebElement loginBtn = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//button[@type='submit']"));

			}
		});

		loginBtn.click();

		// quit browser
		driver.quit();
	}

}

package SeleniumBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Duplication;

public class WebElementInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize Window
		driver.manage().window().maximize();

		// 1.open gooogle
		driver.get("https://www.google.com/");

		// 2.enter a search term
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Selenium" + Keys.ENTER);

		// quit browser
		driver.quit();

	}

}

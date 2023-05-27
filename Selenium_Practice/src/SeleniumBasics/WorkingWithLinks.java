package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class WorkingWithLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// Maximize Window
		driver.manage().window().maximize();

		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Selenium" + Keys.ENTER);

		WebElement linkText = driver.findElement(By.partialLinkText("Selenium: Definition,"));
		linkText.click();

		// quit browser
		driver.quit();
	}

}

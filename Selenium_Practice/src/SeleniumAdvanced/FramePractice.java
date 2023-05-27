package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");

		// Maximize Window
		driver.manage().window().maximize();

		// Enter First Name in frame
		driver.switchTo().frame("firstFr");
		WebElement firstName = driver.findElement(By.name("fname"));
		firstName.sendKeys("Elakkiya");

		// switch to original page
		driver.switchTo().defaultContent();

		// Enter Last Name in frame
		driver.switchTo().frame("firstFr");
		WebElement lastName = driver.findElement(By.name("lname"));
		lastName.sendKeys("M");

		driver.switchTo().defaultContent();

		// nested frame
		driver.switchTo().frame("firstFr");
		WebElement nestedFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(nestedFrame);
		WebElement email = driver.findElement(By.name("email"));
		// Enter Email
		email.sendKeys("elakkiya@gmail.com" + Keys.ENTER);

		driver.switchTo().defaultContent();

		// quit browser
		driver.quit();
	}

}

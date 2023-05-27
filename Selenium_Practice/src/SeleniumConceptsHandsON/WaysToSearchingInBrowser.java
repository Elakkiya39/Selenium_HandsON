package SeleniumConceptsHandsON;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class WaysToSearchingInBrowser {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement searchBox = driver.findElement(By.name("q"));
		//1.using sendKeys
		searchBox.sendKeys("Selenium" + Keys.ENTER);

		// 2.using submit() method
		// searchBox.sendKeys("Selenium");
//		searchBox.submit();

		// 3.using Robot Class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

		//4. using activeElement
//		driver.switchTo().activeElement().sendKeys("Selenium" + Keys.ENTER);

		//5. using \n
		 searchBox.sendKeys("Selenium \n");

		driver.quit();
	}

}

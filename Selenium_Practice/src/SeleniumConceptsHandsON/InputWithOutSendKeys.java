package SeleniumConceptsHandsON;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithOutSendKeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement searchBox = driver.findElement(By.name("q"));

		// using JavascriptExecutor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("document.getElementsByName('q')[0].value= 'Selenium' ", "");
		executor.executeScript("arguments[0].value= 'Selenium' ", searchBox);

		// using Robot Class
//		driver.switchTo().activeElement();
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_J);
//		robot.keyRelease(KeyEvent.VK_J);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_R);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
	}

}

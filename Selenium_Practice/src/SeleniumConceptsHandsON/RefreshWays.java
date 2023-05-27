package SeleniumConceptsHandsON;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWays {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize Window
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Selenium");
		
		//using navigate()
//		driver.navigate().refresh(); 
		
		//using getCurrentUrl()
//		driver.get(driver.getCurrentUrl());
		
		//using JavascriptExecutor
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("location.reload()"); //history.go(0) location.reload()
		
		//using Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		// quit browser
		driver.quit();
	}

}

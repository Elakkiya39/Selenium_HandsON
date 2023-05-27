package SeleniumConceptsHandsON;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");

		// Maximize Window
		driver.manage().window().maximize();

//		// Take a Screenshot here using ---> TakesScreenshot
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//		File destination = new File("D://screenshot.png");
//		FileHandler.copy(source, destination);
		
		// click the Alert
		WebElement accept = driver.findElement(By.id("accept"));
		accept.click();
		
		// Take a Screenshot here using ---> Robot class
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage  sourceFile = robot.createScreenCapture(rectangle);
		File destinationFile = new File("D://RobotSnap.png");
		ImageIO.write(sourceFile, "png", destinationFile);

		// Accept the Alert
		Alert acceptAlert = driver.switchTo().alert();
		acceptAlert.accept();

		// quit browser
		driver.quit();
	}

}

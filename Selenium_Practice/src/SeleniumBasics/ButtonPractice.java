package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ButtonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/buttons");

		// Goto Home and come back here using driver command
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		driver.navigate().back();

		// Get the X & Y co-ordinates
		WebElement getLocation = driver.findElement(By.id("position"));
		Point buttonLocation = getLocation.getLocation();
		int xPoint = buttonLocation.getX();
		int yPoint = buttonLocation.getY();
		System.out.println("x value is " + xPoint + " y value is " + yPoint);

		// Find the color of the button
		WebElement color = driver.findElement(By.id("color"));
		String buttonColor = color.getCssValue("background-color");
		System.out.println(buttonColor);

		// Find the height & width of the button
		WebElement heightWidth = driver.findElement(By.id("property"));
		int height = heightWidth.getSize().getHeight();
		int width = heightWidth.getSize().getWidth();
		System.out.println("height is " + height + " width is " + width);

		// Confirm button is disabled
		WebElement disabled = driver.findElement(By.id("isDisabled"));
		boolean disabledBox = disabled.isEnabled();
		System.out.println(disabledBox);

		// Click and Hold Button
		WebElement button = driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(button);
		actions.build().perform();

		// quit browser
		driver.quit();
	}

}

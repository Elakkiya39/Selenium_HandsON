package SeleniumConceptsHandsON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement beforeHover = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		System.out.println("Before Hovering " + beforeHover.getCssValue("text-decoration"));

		Actions actions = new Actions(driver);
		actions.moveToElement(beforeHover);
		actions.perform();

		WebElement afterHover = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		System.out.println("After Hovering " + afterHover.getCssValue("text-decoration"));

		driver.quit();
	}

}

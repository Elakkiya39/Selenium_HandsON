package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// window maximize
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/dropable");

		// Drag the source box with in the target box
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
		actions.build().perform();

		// Another way to Drag the source box with in the target box
//		WebElement source1 = driver.findElement(By.id("draggable"));
//		WebElement target1 = driver.findElement(By.id("droppable"));
//		Actions actions1 = new Actions(driver);
//		actions1.clickAndHold(source1).moveToElement(target1).release(target1).build().perform();

		// quit browser
		driver.quit();

	}

}

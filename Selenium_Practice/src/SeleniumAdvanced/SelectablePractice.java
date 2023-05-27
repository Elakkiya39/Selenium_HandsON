package SeleniumAdvanced;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/selectable");

		// Maximize Window
		driver.manage().window().maximize();

		// select all
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"container\"]/div"));
		System.out.println(selectable.size());
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		actions.click(selectable.get(0));
		actions.click(selectable.get(1));
		actions.click(selectable.get(2));
		actions.click(selectable.get(3));
		actions.click(selectable.get(4));
		actions.click(selectable.get(5));
		actions.click(selectable.get(6));
		actions.click(selectable.get(7));
		actions.click(selectable.get(8));
		actions.build().perform();
		
		// quit browser
		driver.quit();

	}

}

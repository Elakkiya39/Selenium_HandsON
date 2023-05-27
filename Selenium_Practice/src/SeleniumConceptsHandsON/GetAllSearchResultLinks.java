package SeleniumConceptsHandsON;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllSearchResultLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement links : allLinks) {
			String text = links.getAttribute("href");
			System.out.println(text);
		}
		driver.quit();
	}

}

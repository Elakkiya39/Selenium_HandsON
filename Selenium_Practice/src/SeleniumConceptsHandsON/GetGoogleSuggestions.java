package SeleniumConceptsHandsON;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> allSuggestions= driver.findElements(By.xpath("//ul[@role='listbox']/li"));

				for (WebElement webElement : allSuggestions) {
					String text= webElement.getText();
					System.out.println(text);
				}
		driver.quit();
	}

}

package SeleniumConceptsHandsON;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleSuggestionsPositionBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		int position = 0;
		for (WebElement webElement : allSuggestions) {
			position++;
			if (position == 4) {
				webElement.click();
				break;
			}
		}
		
	}

	
}

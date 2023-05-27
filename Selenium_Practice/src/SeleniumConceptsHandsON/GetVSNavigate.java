package SeleniumConceptsHandsON;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVSNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");--------->GET
		driver.navigate().to("https://www.google.com");//-------->NAVIGATE

		// Maximize Window
		driver.manage().window().maximize();

		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Selenium" + Keys.ENTER);
		driver.navigate().back();//-------->NAVIGATE Back
		driver.navigate().forward();//-------->NAVIGATE Forward
		driver.navigate().refresh();//-------->NAVIGATE Refresh

		// quit browser
		driver.quit();
	}

}

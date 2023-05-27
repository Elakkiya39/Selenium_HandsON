package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/dropdowns");

		// Maximize Window
		driver.manage().window().maximize();

		// Select the apple using visible text
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		select.selectByVisibleText("Apple");

		// Select your super hero's
		WebElement multiSelect = driver.findElement(By.id("superheros"));
		Select multiSelecBox = new Select(multiSelect);
		multiSelecBox.selectByVisibleText("Ant-Man");
		multiSelecBox.selectByVisibleText("Aquaman");
		multiSelecBox.selectByVisibleText("The Avengers");
		multiSelecBox.selectByVisibleText("Batman");
		multiSelecBox.selectByVisibleText("Captain America");
		multiSelecBox.selectByVisibleText("Spider-Man");
		multiSelecBox.selectByVisibleText("Supergirl");
		multiSelecBox.selectByVisibleText("Wonder Woman");

		// Select the last programming language
		WebElement language = driver.findElement(By.id("lang"));
		Select languageSelect = new Select(language);
		languageSelect.selectByValue("sharp");

		// print all the options
		List<WebElement> getAllOptions = languageSelect.getOptions();
		int optionsSize = getAllOptions.size();
		System.out.println("options size is " + optionsSize);

		for (WebElement allOptions : getAllOptions) {
			System.out.println(allOptions.getText());
		}

		// Select India using value
		WebElement country = driver.findElement(By.id("country"));
		Select countrySelect = new Select(country);
		countrySelect.selectByValue("India");

		// quit browser
		driver.quit();
	}

}

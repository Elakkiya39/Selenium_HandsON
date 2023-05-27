package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");

		// Maximize Window
		driver.manage().window().maximize();

		// Enter your full Name
		WebElement textBox = driver.findElement(By.id("fullName"));
		textBox.sendKeys("Elakkiya M");

		// Append a text and press keyboard tab
		WebElement append = driver.findElement(By.id("join"));
		append.sendKeys(" person" + Keys.TAB);

		// What is inside the text box
		WebElement getText = driver.findElement(By.id("getMe"));
		String getTextEntered = getText.getAttribute("value");
		System.out.println("The Value is " + getTextEntered);

		// Clear the text
		WebElement clear = driver.findElement(By.id("clearMe"));
		clear.clear();

		// Confirm edit field is disabled
		WebElement enabled = driver.findElement(By.id("noEdit"));
		boolean enabledBox = enabled.isEnabled();
		System.out.println(enabledBox);

		// Confirm text is readonly
		WebElement readOnlyText = driver.findElement(By.id("dontwrite"));
		String isReadOnly = readOnlyText.getAttribute("readonly");
		System.out.println(isReadOnly);

		// quit browser
		driver.quit();
	}

}

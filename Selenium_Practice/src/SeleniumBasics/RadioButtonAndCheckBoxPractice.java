package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBoxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");

		// Maximize Window
		driver.manage().window().maximize();

		// Select any one - yes
		WebElement yesButton = driver.findElement(By.id("yes"));
		yesButton.click();

		// Cofirm you can select only one radio button
		WebElement noButton = driver.findElement(By.id("two"));
		noButton.click();
		boolean radioButton = noButton.isSelected();
		System.out.println("selected " + radioButton);

		// Find the bug
		WebElement firstRadio = driver.findElement(By.id("nobug"));
		WebElement secondRadio = driver.findElement(By.id("nobug"));
		String nobug = firstRadio.getAttribute("name");
		String bug = secondRadio.getAttribute("name");
		if (nobug.equals(bug)) {
			System.out.println("both radio buttons names are equal. This is not a radio button");
		} else {
			System.out.println("both radio buttons names are NOT equal. This is a radio button");
		}

		// Find which one is selected Foo or Bar
		WebElement firstElement = driver.findElement(By.id("foo"));
		boolean first = firstElement.isSelected();
		System.out.println("foo " + first);

		WebElement secondElement = driver.findElement(By.id("notfoo"));
		boolean second = secondElement.isSelected();
		System.out.println("bar " + second);

		// Confirm last field is disabled
		WebElement disabled = driver.findElement(By.id("maybe"));
		System.out.println("last field enabled is " + disabled.isEnabled() + ". disabled last field.");

		// Find if the checkbox is selected?
		WebElement checkBox = driver.findElement(By.xpath("//label[@class='checkbox']/input"));
		System.out.println("isSelected " + checkBox.isSelected());

		// Accept the T&C
		WebElement acceptBox = driver.findElement(By.xpath("//label[text()='Accept the T&C']//following::input"));
		acceptBox.click();

		// quit browser
		driver.quit();
	}

}

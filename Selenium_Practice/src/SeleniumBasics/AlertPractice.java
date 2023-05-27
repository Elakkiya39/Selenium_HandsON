package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//Maximize Window
		driver.manage().window().maximize();

		//click the Alert
		WebElement accept = driver.findElement(By.id("accept"));
		accept.click();
		
		//Accept the Alert
		Alert acceptAlert = driver.switchTo().alert();
		acceptAlert.accept();
		
		//click the Alert
		WebElement dismiss = driver.findElement(By.id("confirm"));
		dismiss.click();
		
		//Dismiss the Alert & print the alert text
		Alert dismissAlert = driver.switchTo().alert();
		String string = dismissAlert.getText();
		System.out.println(string);
		dismissAlert.dismiss();
		
		//click the Alert
		WebElement prompt = driver.findElement(By.id("prompt"));
		prompt.click();
		
		//Type your name & accept
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Elakkiya M");
		promptAlert.accept();

		// quit browser
		driver.quit();

	}

}

package SeleniumAdvanced;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/file");
		// Maximize Window
		driver.manage().window().maximize();

		// download a file
		WebElement download = driver.findElement(By.id("pdf"));
		download.click();

		File fileLocation = new File("C:\\Users\\praga\\Downloads\\");

		File[] allFiles = fileLocation.listFiles();
		
		for (File filePrint : allFiles) {
			System.out.println(filePrint);
		}
		Thread.sleep(3000);
		for (File file : allFiles) {
			String fileName= file.getName();
			System.out.println(fileName);
		}
		
		for (File file : allFiles) {
			if (file.getName().equalsIgnoreCase("sample.pdf")) {
				System.out.println("The file is downloaded");
				break;
			} else {
				System.out.println("The file is NOT downloaded");
				break;
			}
		}

	}

}

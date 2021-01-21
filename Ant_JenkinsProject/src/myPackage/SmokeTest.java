package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

}

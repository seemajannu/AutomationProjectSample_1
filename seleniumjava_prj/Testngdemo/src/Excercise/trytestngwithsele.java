package Excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class trytestngwithsele {
	

@Test
	public void launchbrowser() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\itscm\\SeleniumLearning\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(200);
				
	}
}

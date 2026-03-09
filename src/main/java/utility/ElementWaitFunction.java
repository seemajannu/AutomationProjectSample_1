package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWaitFunction {
	
	public static void waitforuivisibility(WebDriver driver,WebElement ele)
	{
      WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void waitforuiInvisibility(WebDriver driver,WebElement ele)
	{
      WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.invisibilityOf(ele));
	}

}

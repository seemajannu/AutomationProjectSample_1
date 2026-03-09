package baseModel;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import utility.Reporting;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public void openpage()
	{
		 LocalDateTime nowtime = LocalDateTime.now();
		  DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd_mm_yy_hhmmss");
		 String st = nowtime.format(pattern);
		 driver=new ChromeDriver();
		driver.get("https://devsite.testometer.co.in/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Reporting.reportcreation(st);
		}	
}

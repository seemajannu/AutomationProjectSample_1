package selenium26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//clicking on Date picker calendar box
		driver.findElement(By.xpath("//input[@type='text' and (@id='datepicker2')]")).click();
		
		//prev id: By.linktext() or xpath : //div[@class='datepick-nav']/a[@title='Show the previous month']
		//January //select[@class='datepick-month-year' and (@title='Change the month')]
		//2026 //select[@class='datepick-month-year' and (@title='Change the year')]
		//next //a[@title='Show the next month']
		//By.LinkText('13')
		
	
		Select smonth=new Select(driver.findElement(By.xpath("//select[@class='datepick-month-year' and (@title='Change the month')]")));
		smonth.selectByIndex(2);
		
		Select syear=new Select(driver.findElement(By.xpath("//select[@class='datepick-month-year' and (@title='Change the year')]")));
		syear.selectByIndex(3);
		
	//above syear didnt work with select by value("2023") or visible text
		
	  driver.findElement(By.xpath("//a[text()='19']")).click();
	  Thread.sleep(3000);
		

	}

}

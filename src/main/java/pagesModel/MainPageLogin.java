
package pagesModel;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Reporting;



public class MainPageLogin {
	
	WebDriver driver;
	private  final String  emailboxxpath="//input[@type='text' and @class='form-control form-control-lg username']";
	private final String passwordboxxpath="//input[@type='password' and @class='form-control form-control-lg password']";
	private final String loginbuttonxpath="//button[@type='submit']";
	
	
	@FindBy(xpath=emailboxxpath)
	WebElement emailbox;
	
	@FindBy(xpath=passwordboxxpath)
	WebElement passwordbox;
	
	@FindBy(xpath=loginbuttonxpath)
	WebElement loginbutton;
	
	public MainPageLogin(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException
	{
		
		try {
			//String data=Readerfunction.propertyreaderfunction("Username");
			  emailbox.sendKeys("itscmahere@gmail.com");  // emailbox.sendKeys(Readerfunction.propertyreaderfunction("Username"));
			 passwordbox.sendKeys("test@123");  //passwordbox.sendKeys(Readerfunction.propertyreaderfunction("password"));
			 loginbutton.click();
			 Reporting.testcasepass("login passed");
		}
		catch (Exception e)
		  {
			System.out.println("Exception in login page "+e.getMessage());
			Reporting.testcaseinfo("Exception in login page "+e.getMessage());
	    	}
		 
	}
	
	
	

}

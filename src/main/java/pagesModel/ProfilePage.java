package pagesModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ElementWaitFunction;
import utility.Reporting;

public class ProfilePage {
	
	WebDriver driver;
	
	//Constructor
	
	public ProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Variables on Profile main menu
private final String profilenamexpath="//span[@key='t-henry']";
//"//span[@class='d-none d-xl-inline-block ms-1']";
private final String profilexpath="//span[@key='t-profile' and text()='Profile']";
private final String profileChangePwdXpath="//span[@key='t-profile' and text()='Change Password']";
private final String profileLogoutXpath="//span[@key='t-logout' and text()='Logout']";

//Variables on Profile sub menu

private final String firstnamexpath="//input[@name='fname']";
private final String lastnamexpath="//input[@name='lname']";
private final String mobiledpdownxpath="//select[@name='phonecode']";
private final String mobileTestboxxpath="//input[@name='mobile']";
private final String profileImagexpath="//input[@name='attachment']";
private final String updateBtnXpath="//button[@type='submit' and (@fdprocessedid='b2gudr3') and text()='Update']";

//Variables on Change Password window popup
private final String passwordBoxxpath="//input[@name='password']";
private final String confirmPasswordBoxxpath="//input[@name='confirm_pass']";
private final String updatebtnxpath="//input[@name='id']//following-sibling::button[@class='btn btn-primary' and text()='Update']";
private final String successMsgxpath="//span[text()='Success!']";

@FindBy(xpath=profilenamexpath)
WebElement profilename;

@FindBy(xpath=profileChangePwdXpath)
WebElement profileChangePwd;

@FindBy(xpath=passwordBoxxpath)
WebElement passwordBox;

@FindBy(xpath=confirmPasswordBoxxpath)
WebElement confirmPasswordBox;

@FindBy(xpath=updatebtnxpath)
WebElement updatebtn;

@FindBy(xpath=successMsgxpath)
WebElement successMsg;


//changing password functionality
public boolean changePasswordMthd() throws Exception
       {
	   boolean testresult=false;
	   try {
		ElementWaitFunction.waitforuivisibility(driver,profilename );
		profilename.click();
		profileChangePwd.click();
		ElementWaitFunction.waitforuivisibility(driver,passwordBox );
		passwordBox.sendKeys("test@123");
		confirmPasswordBox.sendKeys("test@123");
		updatebtn.click();
		 ElementWaitFunction.waitforuivisibility(driver,successMsg );
		System.out.println("The text  displayed is *******"+successMsg.getText());
		      if(successMsg.getText().contains("Success!"))
		         {
			      testresult=true;
                  System.out.println("The password is updated");
                  Reporting.testcasepass("The password is updated");
		          }
		      else
		      {
		    	  Reporting.testcasefail("The password didnt update");
		      }
		       } 
	catch (Exception e) 
	   {
		System.out.println("Exception in changepassword mthd of profile page"+e.getMessage());
		testresult=false;
		Reporting.testcaseinfo("Exception in changepassword mthd of profile page"+e.getMessage());
     	}
	   return testresult;
      }


}

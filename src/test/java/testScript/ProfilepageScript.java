package testScript;

import org.openqa.selenium.WebDriver;

import pagesModel.MainPageLogin;
import pagesModel.ProfilePage;

public class ProfilepageScript {
	WebDriver driver;
	
	//constructor
	public ProfilepageScript(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean  changepasswordScriptmthd() throws Exception
	{
		boolean b=false;
		
		MainPageLogin loginobject=new MainPageLogin(driver);
		ProfilePage pf=new ProfilePage(driver);
		loginobject.login();
		b=pf.changePasswordMthd();
		System.out.println("Test result is"+b);
		return b;
		
	}

}

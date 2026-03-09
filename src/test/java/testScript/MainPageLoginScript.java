package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pagesModel.MainPageLogin;

public class MainPageLoginScript {
	
	WebDriver driver;
	public MainPageLoginScript(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void loginscript() throws IOException
{
	MainPageLogin loginobject=new MainPageLogin(driver);
	loginobject.login();
}

}

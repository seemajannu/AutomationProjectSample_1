package testSuite;



import java.io.IOException;


import org.testng.annotations.Test;

import baseModel.BaseClass;
import testScript.MainPageLoginScript;

public class MainPageLoginSuite extends BaseClass{
	

	@Test
	public void loginsuite() throws IOException
	{
		MainPageLoginScript scriptobj=new MainPageLoginScript(driver);
		scriptobj.loginscript();
	}
	

}

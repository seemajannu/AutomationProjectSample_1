package testSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseModel.BaseClass;
import testScript.ProfilepageScript;
import utility.Reporting;

public class ProfilePageSuite extends BaseClass {
	
	@Test
	public void changePasswordSuitemthd() throws Exception
	{
		 Reporting.testcasecreation();
		 ProfilepageScript pg=new ProfilepageScript(driver);
		 Assert.assertTrue( pg.changepasswordScriptmthd());
			// pg.changepasswordScriptmthd();
		 Reporting.updatereportfinal();
	}

}
                  
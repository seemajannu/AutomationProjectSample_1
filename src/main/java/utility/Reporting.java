package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {
	
	private static ExtentReports ext;
	private  static ExtentSparkReporter spk;
	private static ExtentTest testcase ;
	
	public  static void reportcreation(String patterntime)
	{
	 String path="C:\\Users\\itscm\\SeleniumLearning\\ReportFiles\\TestReport_"+patterntime+".html";
     ext=new ExtentReports();
     spk=new ExtentSparkReporter(path);
     ext.attachReporter(spk);
	}
	public static void testcasecreation()
	{
    testcase = ext.createTest("Testcase_1");
	}
	public static void testcasepass(String msg)
	{
    testcase.log(Status.PASS, msg);
	}
	public static void testcasefail(String msg)
	{
    testcase.log(Status.FAIL, msg);
	}
	public static void testcaseinfo(String msg)
	{
     testcase.log(Status.INFO, msg);
	}
	public static void updatereportfinal()
	{
      ext.flush();
	}
	
  
}

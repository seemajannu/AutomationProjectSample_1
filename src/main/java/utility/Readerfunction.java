package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readerfunction {

	public static String propertyreaderfunction(String pname) throws IOException
	{
		String path="C:\\Users\\itscm\\OneDrive\\Desktop\\Seema\\Testometer\\Automation\\PomDesign\\src\\utility\\config.properties";
		FileInputStream fp=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fp);
		String data=prop.getProperty(pname);
		return data;
	}

}

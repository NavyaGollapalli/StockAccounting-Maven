package Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class propertyFileUtil {
public static String getValueForKey(String key) throws Throwable, IOException
{
	Properties config = new Properties();
	config.load(new FileInputStream("C:\\Users\\navya\\eclipse-selenium\\ERP_Maven\\PropertyFile\\environment.properties"));
	return config.getProperty(key);
}
}

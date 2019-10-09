package _7_文件._3_properties操作;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class All_PropertiesOperate {
	private static final String PFILE = System.getProperty("user.dir") + "/resources/";
	
	public static String getConfigValue(String key) throws FileNotFoundException, IOException{
		Properties props = new Properties();
		props.load(new FileInputStream(PFILE + "test_config.properties"));
		return props.getProperty(key);
	}
}

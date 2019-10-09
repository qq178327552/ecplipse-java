package _7_文件._3_properties操作;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 获得Properties文件中，key对应的值
 * @author zheng
 *
 */
public class GetConfigValueUtil {
	private static final String PFILE = System.getProperty("user.dir") + "/resource/";
	/**
	 * 获得Properties文件中，key对应的值
	 * @param key 要查询的键
	 * @param file Properties文件所在的全路径
	 * @return String类 输入键在Properties中对应的值
	 */
	public static String getConfigValue(String key, String file) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(file));
		return props.getProperty(key);
	}
}

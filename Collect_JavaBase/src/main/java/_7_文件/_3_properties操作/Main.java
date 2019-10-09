package _7_文件._3_properties操作;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String value=All_PropertiesOperate.getConfigValue("test1");
		System.out.println(value);
	}
}

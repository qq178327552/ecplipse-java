package _7_文件._4_txt操作;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * 从指定url路径中读取txt文件
 * @author zheng
 */
public class ReadTxtUtil {
	/**
	 * 从指定url路径中读取txt文件到String中返回
	 * @param url 文件的全路径
	 * @return String类  返回将文件内容
	 */
	public static String readTxt(String url) throws IOException {
		File file = new File(url);
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		StringBuilder builder = new StringBuilder();
		String lineString = null;
		while ((lineString = bufferedReader.readLine()) != null) {
			builder.append(lineString);
		}
		bufferedReader.close();
		return builder.toString();
	}
	/**
	 * 用Scanner从文件中读取内容并打印<br/>
	 * 		适用于文件过大时使用,占用的内存仅150M左右<br/>
	 * 		将文件内容打印到控制台
	 * @param url 文件的全路径
	 */
	public static void readLongTxt(String url) throws IOException{
		FileInputStream inputStream = new FileInputStream(url);
		Scanner sc = new Scanner(inputStream, "UTF-8");
		while (sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		if (sc.ioException() != null) throw sc.ioException();
		if (inputStream != null) inputStream.close();
		if (sc != null) sc.close();
	}
}

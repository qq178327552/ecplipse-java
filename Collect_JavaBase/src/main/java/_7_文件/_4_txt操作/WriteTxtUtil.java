package _7_文件._4_txt操作;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 通过传入文件路径和字符串写文件
 * @author zheng
 */
public class WriteTxtUtil {
	/**
	 * 以字节读取文件并写入指定文件路径中
	 * @param url 传入文件的全路径
	 * @param conent 写入的内容
	 */
	public static void writeTxt1(String url, String conent) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(url, true);
		OutputStreamWriter outputStreamWriter =new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		bufferedWriter.write(conent);
		if (bufferedWriter != null)
			bufferedWriter.close();
	}
	/**
	 * 以字符读取文件写入文件中，若文件不存在则创建文件
	 * @param url 传入文件的全路径
	 * @param content 写入的内容
	 */
	public static void writeTxt2(String url, String content) throws IOException {
		StringBuilder builder = new StringBuilder();
		builder.append(content);

		File file = new File(url);
		if (file.exists()) {
			System.out.print("文件存在");
		} else {
			System.out.print("文件不存在");
			file.createNewFile();
		}
		FileWriter fileWriter = new FileWriter(file,true);
		BufferedWriter output = new BufferedWriter(fileWriter);
		output.write(builder.toString());
		output.close();
	}
}

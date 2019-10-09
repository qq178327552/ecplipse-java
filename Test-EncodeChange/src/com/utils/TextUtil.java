package com.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;
import info.monitorenter.cpdetector.io.UnicodeDetector;

public class TextUtil {
	/**
	 * 获取传入文件的编码方式(ISO_8859_1和UTF-8)
	 * 
	 * @param fileUrl 文件的全路径
	 * @return 编码方式
	 */
	public static String getFileEncode(String fileUrl) {
		CodepageDetectorProxy detector = CodepageDetectorProxy.getInstance();
		detector.add(new ParsingDetector(false));
		detector.add(JChardetFacade.getInstance());
		detector.add(ASCIIDetector.getInstance());
		detector.add(UnicodeDetector.getInstance());
		Charset charset = null;
		File file = new File(fileUrl);
		try {
			charset = detector.detectCodepage(file.toURI().toURL());
		} catch (Exception e) {
		}
		String charsetName = "GBK";
		if (charset != null) {
			if (charset.name().equals("US-ASCII")) {
				charsetName = "ISO_8859_1";
			} else if (charset.name().startsWith("UTF")) {
				charsetName = charset.name();
			}
		}
		return charsetName;
	}

	/**
	 * 将文件内容加载到String字符串并返回
	 * 
	 * @param fileUrl 文件的全路径
	 * @return 文件中的内容
	 */
	public static String readTxt(String fileUrl) throws IOException {
		File file = new File(fileUrl);
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("GBK"));
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		StringBuilder builder = new StringBuilder();
		String lineString = null;
		while ((lineString = bufferedReader.readLine()) != null) {
			builder.append(lineString + "\r\n");
		}
		bufferedReader.close();
		return builder.toString();
	}

	/**
	 * 覆盖式讲传入的字符串写入传入文件全路径文件中
	 * 
	 * @param fileUrl 文件的全路径
	 * @param conent 需要写入并覆盖文件的内容
	 */
	public static void overwriteTxt(String fileUrl, String conent) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileUrl);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		bufferedWriter.write(conent);
		if (bufferedWriter != null)
			bufferedWriter.close();
	}
}

package com.main;

import java.io.IOException;
import java.util.List;

import com.utils.FileUtil;
import com.utils.GetUTF8Util;
import com.utils.TextUtil;


public class Main {
	public static void main(String[] args) throws IOException {
		List<String> fileList = FileUtil.getJavaFileList("E:\\Works\\ecplipse-work\\Test-JVM");
		for(String file : fileList){
			String fileEncode = TextUtil.getFileEncode(file);
			if(fileEncode.equals("GBK")){
				String text = TextUtil.readTxt(file);
				GetUTF8Util.gbk2UTF8(text);
				TextUtil.overwriteTxt(file, text);
			}
		}
	}
}

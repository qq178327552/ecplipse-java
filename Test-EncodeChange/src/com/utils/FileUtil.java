package com.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	private static List<String> lists = new ArrayList<String>();
	private static final String fileWnd = "java";

	/**
	 * 获取传入的文件夹中所有的java文件的全路径
	 * 
	 * @param strPath 文件的url全路径
	 * @return
	 */
	public static List<String> getJavaFileList(String strPath) {
		File dir = new File(strPath);
		File[] files = dir.listFiles(); // 该文件目录下文件全部放入数组
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				String fileName = files[i].getName();
				if (files[i].isDirectory()) { // 判断是文件还是文件夹
					getJavaFileList(files[i].getAbsolutePath()); // 获取文件绝对路径
				} else if (fileName.endsWith(fileWnd)) { // 判断文件名是否以.java结尾
					String strFileName = files[i].getAbsolutePath();
					lists.add(strFileName);
				} else {
					continue;
				}
			}
		}
		return lists;
	}
	
	public static List<String> getFileList(String fileUrl, int depth, String parentsName){
		List<String> list = new ArrayList<String>();
		if(depth == 0) return null;
		File dir = new File(fileUrl);
		File[] files = dir.listFiles();
		if (files == null) return null;
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			list.add(fileUrl+"\\"+fileName);
			List<String> childFileList = getFileList(fileUrl+"\\"+fileName, depth-1, fileName);
			if(childFileList == null) continue;
			list.addAll(childFileList);
		}
		return list;
	}
	
	public static long getFileSize(String fileUrl){
		File file = new File(fileUrl);
		if(!file.isDirectory()) return file.length();
		long size = 0;
		File[] fileList = file.listFiles();
		if(fileList == null) return 0;
		for (int i = 0; i < fileList.length; i++){
			if (fileList[i].isDirectory()){
				size = size + getFileSize(fileList[i].getPath());
			}else{
				size = size + fileList[i].length();
			}
		}
		return size;
	}
	
	public static String formetFileSize(long size){
		String fileSizeString="";
		DecimalFormat df = new DecimalFormat("#.00");
		if (size < 1024) {
			fileSizeString = df.format((double) size) + "B";
		} else if (size < 1048576) {
			fileSizeString = df.format((double) size / 1024) + "K";
		} else if (size < 1073741824) {
			fileSizeString = df.format((double) size / 1048576) + "M";
		} else {
			fileSizeString = df.format((double) size / 1073741824) + "G";
		}
		return fileSizeString;
	}
	
	
	public static void writeTxt(String url, String conent) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(url, true);
		OutputStreamWriter outputStreamWriter =new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		bufferedWriter.write(conent);
		if (bufferedWriter != null)
			bufferedWriter.close();
	}
	
	public static void main(String[] args) throws IOException {
		List<String> fileList = FileUtil.getFileList("F:\\", 3, null);
		for(String fileUrl : fileList){
			long fileSize = getFileSize(fileUrl);
			String formetFileSize = formetFileSize(fileSize);
			writeTxt("E:\\list.txt",fileUrl+":"+formetFileSize+"\r\n");
		}
	}
}

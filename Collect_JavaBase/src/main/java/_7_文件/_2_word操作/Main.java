package _7_文件._2_word操作;

import java.io.IOException;

import freemarker.template.TemplateException;

public class Main {
	public static void main(String[] args) {
		ExportWord word=new ExportWord();
		try {
			
			word.create();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}

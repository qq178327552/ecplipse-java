package _7_文件._2_word操作;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.TemplateException;

public class ExportWord {
	private static final String outputLocat="output/out.doc";
	private static final String FILEPATH=System.getProperty("user.dir")+"/resource/";
	private static final String inpunLocat="test.xml";
	public void create() throws IOException, TemplateException{
		Map<String,Object> map=new HashMap<String, Object>();
		WordUtil handler = new WordUtil();
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILEPATH+outputLocat), "UTF-8"));
		handler.write(FILEPATH, inpunLocat, map, out);
	}
}







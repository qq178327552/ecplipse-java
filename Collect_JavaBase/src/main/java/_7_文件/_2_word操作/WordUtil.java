package _7_文件._2_word操作;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class WordUtil {
	private static Configuration configuration=null;
	static{
		try{
			configuration=new Configuration();
			configuration.setDefaultEncoding("utf-8");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void write(String templatePath,String templateName,Map<String, Object> map,Writer out) throws IOException, TemplateException{
		Template t=getTemplate(templatePath, templateName);
		t.process(map, out);
		out.close();
		System.out.println("完成");
	}
	private Template getTemplate(String templatePath,String templateName) throws IOException{
        configuration.setDirectoryForTemplateLoading(new File(templatePath));
		Template t=configuration.getTemplate(templateName);
		t.setEncoding("utf-8");
		return t;
	}
}

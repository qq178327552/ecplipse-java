package _a13_url;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL 
 * 	URL组成：[协议]://[域名]:[端口(http默认80端口)]/[资源]#[锚点]?[参数]
 * 
 * 1.创建URL
 * 	1).绝对路径构建url
 * 		a).获取URL对象中的封装信息
 * 2.获取URL中的资源(解码时用编译器默认解码,URL获取的网络流中默认是utf-8编码)
 * 3.URL中的资源输出到文件(用文件流输出到baidu2.html)
 * 
 * @author zheng
 *
 */
public class _2_Uri {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com"); // 主页 默认资源
	}

	/* 1.创建URL */
	public void createURL() throws MalformedURLException {
		/* 1).绝对路径构建url */
		URL url = new URL("http://www.baidu.com/index.html#aa?name=zheng");
		/* a).获取URL对象中的封装信息 */
		System.out.println("协议:" + url.getProtocol());
		System.out.println("域名:" + url.getHost());
		System.out.println("端口:" + url.getPort());
		System.out.println("资源:" + url.getFile());
		System.out.println("相对路径:" + url.getPath());
		System.out.println("锚点:" + url.getRef()); // 锚点
		System.out.println("参数:" + url.getQuery());// ?参数 :存在锚点 返回null ,不存在，返回正确
		/* 2).相对路径构建url */
		url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url, "b.txt"); // 相对路径
		System.out.println(url.toString());
	}
	
	/*2.获取URL中的资源(解码时用编译器默认解码,URL获取的网络流中默认是utf-8编码)*/
	public void getURLResourcesNoCode(URL url) throws IOException{
		InputStream is = url.openStream();
		byte[] flush = new byte[1024];
		int len = 0;
		while (-1 != (len = is.read(flush))) {
			System.out.println(new String(flush, 0, len));
		}
		is.close();
	}
	
	/*2.获取URL中的资源(以utf-8解码)*/
	public void getURLResources(URL url) throws IOException{
		BufferedReader  br = 
				new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		String msg =null;
		while((msg=br.readLine())!=null){
			System.out.println(msg);
		}
		br.close();
	}
	
	/*3.URL中的资源输出到文件(用文件流输出到baidu2.html)*/
	public void getURLResourcesFile(URL url) throws IOException{
		BufferedReader  br = 
				new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu2.html"),"utf-8"));
		String msg =null;
		while((msg=br.readLine())!=null){
			bw.append(msg);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

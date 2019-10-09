package _a21_传输格式处理._3_md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class All_MD5Operate {
	public static  String getMD5Str(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {  
		MessageDigest messageDigest = null;// 创建信息摘要算法功能类
		messageDigest = MessageDigest.getInstance("MD5");// 返回实现指定的MD5加密算法算法
		messageDigest.reset();// 重置摘要
		messageDigest.update(str.getBytes("UTF-8"));// 使用指定的字节更新摘要
		byte[] byteArray = messageDigest.digest();
		StringBuffer md5StrBuff = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
				md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
			else
				md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
		}
		return md5StrBuff.toString();  
    } 
}

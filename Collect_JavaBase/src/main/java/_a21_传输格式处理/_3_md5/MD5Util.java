package _a21_传输格式处理._3_md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 将传入的字符串进行MD5加密后输出
 * @author zheng
 *
 */
public class MD5Util {
	/**
	 * 将传入的字符串进行MD5加密后输出
	 * @param str 传入的字符串
	 * @return String类 输出加密后的字符串
	 */
	public static  String getMD5Str(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {  
		MessageDigest messageDigest = null;
		messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.reset();
		messageDigest.update(str.getBytes("UTF-8"));
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

package _a21_传输格式处理._3_md5;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {
	private static String md5_pattern = "^([a-fA-F0-9]{32})$";
	public static void main(String[] args) {
		String originalText  = "asdf";
		String cipherText = null;
		try {
			cipherText = originalText.matches(md5_pattern) ?  originalText :  All_MD5Operate.getMD5Str(originalText);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(cipherText);
	}
}

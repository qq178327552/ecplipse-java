package com.utils;

import java.io.UnsupportedEncodingException;

public class GetUTF8Util {
	/**
	 * 将传入的GBK字符串转换成UTF-8编码输出
	 * 
	 * @param gbkStr 以GBK编码的字符串
	 * @return 以utf-8编码的字符串
	 */
	public static String gbk2UTF8(String gbkStr) {
		try {
			return new String(gbk2UTF8Bytes(gbkStr), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new InternalError();
		}
	}

	/**
	 * 将传入的GBK字符串转换成UTF-8编码的字节数组输出
	 * 
	 * @param gbkStr 以GBK编码的字符串
	 * @return 以utf-8编码的字节数组
	 */
	public static byte[] gbk2UTF8Bytes(String gbkStr) {
		int n = gbkStr.length();
		byte[] utfBytes = new byte[3 * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			int m = gbkStr.charAt(i);
			if (m < 128 && m >= 0) {
				utfBytes[k++] = (byte) m;
				continue;
			}
			utfBytes[k++] = (byte) (0xe0 | (m >> 12));
			utfBytes[k++] = (byte) (0x80 | ((m >> 6) & 0x3f));
			utfBytes[k++] = (byte) (0x80 | (m & 0x3f));
		}
		if (k < utfBytes.length) {
			byte[] tmp = new byte[k];
			System.arraycopy(utfBytes, 0, tmp, 0, k);
			return tmp;
		}
		return utfBytes;
	}
}

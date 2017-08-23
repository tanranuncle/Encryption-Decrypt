package test_for_test;

import java.io.UnsupportedEncodingException;
//测试中文字符的
//字节数组和字符串的相互转换
public class JiaMiTest2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String ss = "50.48.-95.-94.97.112.112.108.101.32.73.68";
		String [] strArr = ss.split("\\.");
		byte [] bb = new byte[strArr.length];
		for(int i=0;i<strArr.length;i++){
			bb[i] = Byte.parseByte(strArr[i]);
		}
		String s = new String(bb,"GBK");
		System.out.println(s);
	}
}

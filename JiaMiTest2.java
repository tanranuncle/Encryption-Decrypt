package test_for_test;

import java.io.UnsupportedEncodingException;
//���������ַ���
//�ֽ�������ַ������໥ת��
public class JiaMiTest2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String ss = "52.64.-97.-94.78.69";
		String [] strArr = ss.split("\\.");
		byte [] bb = new byte[strArr.length];
		for(int i=0;i<strArr.length;i++){
			bb[i] = Byte.parseByte(strArr[i]);
		}
		String s = new String(bb,"GBK");
		System.out.println(s);
	}
}

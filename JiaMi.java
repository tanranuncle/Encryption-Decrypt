package test_for_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class JiaMi {

	public static void main(String[] args) throws IOException {
		//加密
		jiami();
		//解密
//		jiemi();
		
	}
	public static void jiami() throws FileNotFoundException{
		//这里的路径是待加密的源文件，请选择自己待加密的文件路径
		Scanner sc = new Scanner(new FileInputStream("D:\\jiami.txt"));
		String s = null;
		int a = 0;
		//加密
		for(int i = 0;i<74;i++){
			a++;
			s = sc.nextLine();
			byte [] arr = s.getBytes();
			for(byte b :arr)
				System.out.print(b+".");
			System.out.println();
		}
	}
	
	public static void jiemi() throws IOException{
		//这里的路径是加密后的数据保存在这个文件里
		Scanner sc = new Scanner(new FileInputStream("D:\\password.txt"));
		String s = null;
		//解密后的数据写到这个文件里
		FileWriter fw = new FileWriter("d://jiemi.txt");
		for(int i = 0;i<71;i++){
			//读取一行
			s = sc.nextLine();
			//分割字符串数组
			String [] strArr = s.split("\\.");
			//创建字节数组，与字符串数组长度相等。
			byte [] bb = new byte[strArr.length];
			//将字符串数组中的元素依次转为字节元素，并存入字节数组
			for(int k=0;k<strArr.length;k++){
				bb[k] = Byte.parseByte(strArr[k]);
			}
			//重新定义一个字符串，在构造方法中传入字节数组，并指定编码，以解决中文乱码问题
			String ss = new String(bb,"GBK");
			//输出字符串
			System.out.println(ss);
			fw.write(ss+"\r\n");
			fw.flush();
			
		}
		fw.close();
	}

}

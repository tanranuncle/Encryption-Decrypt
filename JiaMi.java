package test_for_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class JiaMi {

	public static void main(String[] args) throws IOException {
		//����
		jiami();
		//����
//		jiemi();
		
	}
	public static void jiami() throws FileNotFoundException{
		//�����·���Ǵ����ܵ�Դ�ļ�����ѡ���Լ������ܵ��ļ�·��
		Scanner sc = new Scanner(new FileInputStream("D:\\jiami.txt"));
		String s = null;
		int a = 0;
		//����
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
		//�����·���Ǽ��ܺ�����ݱ���������ļ���
		Scanner sc = new Scanner(new FileInputStream("D:\\password.txt"));
		String s = null;
		//���ܺ������д������ļ���
		FileWriter fw = new FileWriter("d://jiemi.txt");
		for(int i = 0;i<71;i++){
			//��ȡһ��
			s = sc.nextLine();
			//�ָ��ַ�������
			String [] strArr = s.split("\\.");
			//�����ֽ����飬���ַ������鳤����ȡ�
			byte [] bb = new byte[strArr.length];
			//���ַ��������е�Ԫ������תΪ�ֽ�Ԫ�أ��������ֽ�����
			for(int k=0;k<strArr.length;k++){
				bb[k] = Byte.parseByte(strArr[k]);
			}
			//���¶���һ���ַ������ڹ��췽���д����ֽ����飬��ָ�����룬�Խ��������������
			String ss = new String(bb,"GBK");
			//����ַ���
			System.out.println(ss);
			fw.write(ss+"\r\n");
			fw.flush();
			
		}
		fw.close();
	}

}

package cn.bjsxt.testexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testio2 {
	public static void main(String[] args) {
		String str = new Testio2().openFile();
		System.out.println(str);

	}
	String openFile(){
		try {
			System.out.println("aaa");
			FileInputStream fis = new FileInputStream("d:/workspace/javase/a.txt");
			int a = fis.read();
			System.out.println("bbb");
			return "step1";//���һ����������step1
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block]
			System.out.println("catching");
			e.printStackTrace();
			return "step2";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "step3";
		}finally {
			System.out.println("finally!!!");
//			return "fff"; //��Ҫ��finally��ʹ��return
		}
		
		//ִ��try��catch��������ֵ��ֵ
		//ִ��finally
		//return
		
		
		
	}
	
}
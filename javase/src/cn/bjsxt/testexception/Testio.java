package cn.bjsxt.testexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testio {
	public static void main(String[] args) {
		FileReader reader = null;
		try{
			reader = new FileReader("d:/workspace/javase/a.txt");
			char temp = (char)reader.read();//��һ���ַ�
			char temp2 = (char)reader.read();//��һ���ַ�
			System.out.println("����������"+temp+temp2);
		}catch(FileNotFoundException e){
			System.out.println("�ļ�û���ҵ�");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("��ȡ�ļ�����");//FileNotFoundException��IOException�����࣬��������棬������ʾ������
		}finally {
			System.out.println("�����쳣����ִ��");
			//�رճ�����Ѵ򿪵���Դ�����ļ�����������
			try{
				reader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

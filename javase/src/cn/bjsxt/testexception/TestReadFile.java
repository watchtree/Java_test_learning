package cn.bjsxt.testexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
	public static void main(String[] args) {
		try {
			String str = new TestReadFile().openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�Զ����쳣
		File f = new File("d:/workspace/javase/a.txt");
		if(!f.exists()){
			try{
				throw new FileNotFoundException("�ļ������ҵ�");
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		
		
	}
	
	String openFile() throws IOException{//�쳣���������׳�����һ��
		FileReader reader = new FileReader("d:/workspace/javase/a.txt");
		char c = (char)reader.read();
		System.out.println(c);
		return "";//������
		
	}
	
	//�����쳣�ķ�Χ���ܳ�������
}

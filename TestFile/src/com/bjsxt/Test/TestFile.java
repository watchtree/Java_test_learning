package com.bjsxt.Test;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("D:/workspace/Mypro02/src/Main.java");
		File f2 = new File("D:/workspace/Mypro02/src");
		File f3 = new File(f2,"Main.java");
		
		if(f.isFile()){
			System.out.println("��һ���ļ�");
		}
		if(f2.isDirectory()){
			System.out.println("��һ��Ŀ¼");
		}
		
		//�����ļ���Ŀ¼
		File f4 = new File("D:/workspace/TestFile/src/TestFile2.java");
		
		f4.delete();//ɾ���ļ�
//		try {
//			f4.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File f5 = new File("D:/workspace/TestFile/src/aa");
		f5.mkdir();//ֻ�ܴ���һ���ļ�
		File f6 = new File("D:/workspace/TestFile/src/aa/bb/d/sa");
		f6.mkdirs();//�Զ���������ļ���
	}
}
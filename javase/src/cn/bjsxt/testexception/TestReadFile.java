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
		
		//自定义异常
		File f = new File("d:/workspace/javase/a.txt");
		if(!f.exists()){
			try{
				throw new FileNotFoundException("文件不能找到");
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		
		
	}
	
	String openFile() throws IOException{//异常处理，将其抛出给上一层
		FileReader reader = new FileReader("d:/workspace/javase/a.txt");
		char c = (char)reader.read();
		System.out.println(c);
		return "";//若存在
		
	}
	
	//子类异常的范围不能超过父类
}

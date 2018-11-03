package cn.bjsxt.testexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testio {
	public static void main(String[] args) {
		FileReader reader = null;
		try{
			reader = new FileReader("d:/workspace/javase/a.txt");
			char temp = (char)reader.read();//读一个字符
			char temp2 = (char)reader.read();//读一个字符
			System.out.println("读出的内容"+temp+temp2);
		}catch(FileNotFoundException e){
			System.out.println("文件没有找到");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("读取文件错误");//FileNotFoundException是IOException的子类，父类放下面，便于显示出问题
		}finally {
			System.out.println("有无异常都会执行");
			//关闭程序块已打开的资源，如文件流，数据流
			try{
				reader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

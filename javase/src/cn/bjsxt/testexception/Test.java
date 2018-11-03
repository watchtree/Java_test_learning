package cn.bjsxt.testexception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		//处理runtimeexpection的解决方法
		int b = 0;
		if(b!=0){
			int i = 1/b;//unchecked 异常
		}else{
			System.out.println("不能用0整数");
		}
		
		//checkedexception的异常添加
		try {
			Thread.sleep(3000);//暂停三秒钟
			//checked已经被编译器检查过了
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Computer c = null;
		if(c!=null){//遇到空指针加判断
			c.start();
			//java.lang.NullPointerException空指针
			//对象是空的，调用对象的方法和属性
		}
		
		//数组异常ArrayIndexOutBoundsException
		
		//数字格式异常NumberFormatException
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();//加入输入一些字母java.util.InputMismatchException
//		System.out.println(a);
//		
		String str = "123abc";
		Integer i = new Integer(str);//java.lang.NumberFormatException:
		
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();//打印错误对象的轨迹
		}finally {
			System.out.println("aaa");
		}
				
	}
	
	//类型转化异常ClassCastException
	void test2(Object obj){
		if(obj instanceof Man){//如果对象是类的一个实例
			Man man = (Man) obj;
		}
	}
	
}


class Computer{
	void start(){
		System.out.println("计算机启动");
	}
}

class Man{
	int hithg = 10;
}

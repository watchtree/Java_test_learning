package cn.bjsxt.testexception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		//����runtimeexpection�Ľ������
		int b = 0;
		if(b!=0){
			int i = 1/b;//unchecked �쳣
		}else{
			System.out.println("������0����");
		}
		
		//checkedexception���쳣����
		try {
			Thread.sleep(3000);//��ͣ������
			//checked�Ѿ���������������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Computer c = null;
		if(c!=null){//������ָ����ж�
			c.start();
			//java.lang.NullPointerException��ָ��
			//�����ǿյģ����ö���ķ���������
		}
		
		//�����쳣ArrayIndexOutBoundsException
		
		//���ָ�ʽ�쳣NumberFormatException
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();//��������һЩ��ĸjava.util.InputMismatchException
//		System.out.println(a);
//		
		String str = "123abc";
		Integer i = new Integer(str);//java.lang.NumberFormatException:
		
		
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();//��ӡ�������Ĺ켣
		}finally {
			System.out.println("aaa");
		}
				
	}
	
	//����ת���쳣ClassCastException
	void test2(Object obj){
		if(obj instanceof Man){//������������һ��ʵ��
			Man man = (Man) obj;
		}
	}
	
}


class Computer{
	void start(){
		System.out.println("���������");
	}
}

class Man{
	int hithg = 10;
}
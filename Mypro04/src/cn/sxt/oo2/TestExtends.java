package cn.sxt.oo2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

/**
 * 
 * @author tree
 *
 */

public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "wtt";
		stu.height = 180;
		stu.rest();
		
		Student stu2 = new Student("tree", 181, "wttree");
		
		//����Ƕ����ұ����ࣻ�����������������������������ʱ������true�����򣬷���false
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person /*extends ObjectĬ�ϸ���java.lang.Object*/{
	String name;
	int height;
	
	public void rest(){
		System.out.println("��Ϣһ��");
		
	}
	
}

//class Student{
//	String name;
//	int height;
//	String major;
//	
//	public void study(){
//		System.out.println("ѧϰ");
//		
//	}
//	
//	public void rest(){
//		System.out.println("��Ϣһ��");
//	}
//	
//}

//�̳з���
class Student extends Person{
	//ʹ��ctol+T�鿴�̳����ṹ
	//java�Ľӿڿ��Զ�̳У� ��ֻ�ܵ��̳�
	String major;
	
	public void study(){
		System.out.println("ѧϰ��Сʱ");
	}
	
	public Student(String name, int height, String major){
		this.name = name;
		this.height = height;
		this.major = major;
		
	}
	
	public Student(){
		
	}
}
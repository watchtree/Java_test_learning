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
		
		//左边是对象，右边是类；当对象是右面类或子类所创建对象时，返回true；否则，返回false
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person /*extends Object默认父类java.lang.Object*/{
	String name;
	int height;
	
	public void rest(){
		System.out.println("休息一会");
		
	}
	
}

//class Student{
//	String name;
//	int height;
//	String major;
//	
//	public void study(){
//		System.out.println("学习");
//		
//	}
//	
//	public void rest(){
//		System.out.println("休息一会");
//	}
//	
//}

//继承方法
class Student extends Person{
	//使用ctol+T查看继承树结构
	//java的接口可以多继承， 类只能单继承
	String major;
	
	public void study(){
		System.out.println("学习两小时");
	}
	
	public Student(String name, int height, String major){
		this.name = name;
		this.height = height;
		this.major = major;
		
	}
	
	public Student(){
		
	}
}
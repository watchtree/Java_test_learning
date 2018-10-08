package cn.sxt.oo2;

public class TestSuper02{
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象。。。");
		new ChildClass2();
	}
	
}

class FatherClass2{
	public FatherClass2(){
		//super();
		System.out.println("创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2{
	public ChildClass2(){
		//super();//构造方法第一句默认为super();自动加上。先调用父类的构造方法
		System.out.println("创建ChildClass");
	}
}


package cn.sxt.oo2;

public class TestSuper01{
	public static void main(String[] args) {
		new ChildClass().f();
	}
	
}

class FatherClass{
	public int value;
	public void f(){
		value = 100;
		System.out.println("value = " + value);
		
	}
	
}

class ChildClass extends FatherClass{
	public int value;
	public void f(){
		super.f();//调用父类对象的普通方法
		value = 200;
		System.out.println("c.value" + value);
		System.out.println(value);
		System.out.println(super.value);//调用父类的成员变量
	}
}


package cn.sxt.oo2;

public class Human{
	private int age;//私有属性，自身可见，自类可用，子类不可用
	
	String name; //同一个包可用
	
	protected int height;
	
	void sayAge(){
		System.out.println(age);
	}
}

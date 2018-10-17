package cn.bjsxt.oop.polymorphism;

public class Test {
	
	public static void testAnimalVoice(Animal c){
		c.voice();
		if(c instanceof Cat){
			((Cat) c).catchMouse();
		}
	}
	
	/*
	public static void testAnimalVoice(Dog c){
		c.voice();
	}
	
	public static void testAnimalVoice(Pig c){
		c.voice();
	}*/

	
//	java Test 加载执行

	public static void main(String[] args) {
		Animal a = new Cat();
//		首先加载test类，找main方法执行
//		加载animal相关类，a变量 加载cat类，创建对象，调用构造器，，将地址给a
		Cat a2 = (Cat)a;
//		将对象地址给a2
		testAnimalVoice(a);

//		a2.catchMouse();

//		Animal b = new Dog();
//		Animal c = new Tiger();
//		testAnimalVoice(b);
//		testAnimalVoice(c);
		
	}
}

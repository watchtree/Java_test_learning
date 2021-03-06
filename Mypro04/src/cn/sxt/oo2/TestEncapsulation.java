package cn.sxt.oo2;

/**
 * 测试封装
 * @author tree
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;//此时不能改动age
		h.name = "wtt";
		h.height = 239;
		
		Person4Encapsulation p4 = new Person4Encapsulation();
//		p4.age = 14;//错误方式，无法调用私有属性
		p4.setAge(-14);//正确方法，方便对输入进行处理
		p4.setAge(13);//正确方法，方便对输入进行处理
		System.out.println(p4.getAge());

	}
}

class Human2{ //
	private int age;//私有属性，自身可见，自类可用，子类不可用 private
	
	String name; //同一个包可用，在外就不可用，默认default
	void sayAge(){
		System.out.println(age);
	}
}

class Boy extends Human2{
	void sayHello(){
//		System.out.println(age);//包含父类属性但是不可用私有属性
	}
}
package cn.sxt.oo2;

public class TestObject {
	public static void main(String[] args) {
		Object obj;
		
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 p2 = new Person2("Wttt", 18);
		System.out.println(p2.toString());
	}
	
	//÷ÿ–¥toString£®£©
	public String toString(){
		return "≤‚ ‘";
	}
}

class Person2{
	String name;
	int age;

	public String toString(){
		return name+", ƒÍ¡‰" +age;
	}
	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
}
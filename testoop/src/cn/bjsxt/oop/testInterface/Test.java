package cn.bjsxt.oop.testInterface;

public class Test {
	public static void main(String[] args) {
//		Flyable f = new Flyable();//
		Flyable f = new Stone();//
//		f.weight() //因为Flyable类，所以只认识Flyable中存在的变量
		f.fly();
	
	}
}

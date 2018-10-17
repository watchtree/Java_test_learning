package cn.bjsxt.oop.abstractClass;
 
public abstract/*包含抽象方法必须是抽象类*/ class Animal {
	//可以对类进行设计，具体需要自类去完成，
	//意义在将方法的设计与实现分离了 ，便于分工作业
	//当假如说每一个自类都需要重写，干脆就不给run（）定义
	public abstract void run();//抽象方法，没有实现，只有定义
	
	//也可以定义普通方法和属性
	public void breath(){
		System.out.println("呼吸！");
	}
	
	public Animal(){
		System.out.println("创建一个动物");
	}//作为构造 方法可以调用，但是不能实例化
	
	String str;
}

//abstract class Cat extends Animal{
//	
//}
//改成抽象类


//相当于提供一种规范，必须重写自类的相应方法
class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("猫跑");
	}//创立子类时必须设定抽象方法
	
}
class Dog extends Animal{
	
	public void run(){
		System.out.println("狗跑");
	}
}

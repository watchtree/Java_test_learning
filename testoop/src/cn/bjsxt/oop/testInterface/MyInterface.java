package cn.bjsxt.oop.testInterface;

public interface MyInterface {
	//接口中只有常量和抽象方法(不容易发生改变)
	//接口支持多继承
	public static final String MAX_GREAD = "BOSS";//定义常量通常默认为（写与不写）public static final
	int MAX_SPEED = 120;
	
	public abstract void test01(); //描述不能用private ,其必然是public abstract（写与不写）
	public int test02(int a, int b);
}

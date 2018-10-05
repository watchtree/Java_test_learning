package cn.sxt.oo2;
/**
 * 覆盖重写
 * @author tree
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle{
	public void run(){
		System.out.println("跑。。。");
		
	}
	
	public void stop(){
		System.out.println("静止。。。");
	}
	
	public Person whoIsPsg(){
		//void 无返回值。 person有返回值并于return对应
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run(){
		System.out.println("得得得");
	}
	//方法重写
//	public Person whoIsPsg(){
//		return new Person();
//	}//可以使用
	public Student whoIsPsg(){//返回值类型小于等于父类的类型
		return new Student();
	}////可以使用
//	public Object whoIsPsg(){
//		return new Object();
//	}//重写的类大于原类
}

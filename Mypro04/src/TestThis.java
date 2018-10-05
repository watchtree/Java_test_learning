/**
 * 
 * @author tree
 *
 */
public class TestThis {
	int a, b, c;
	
	TestThis() {
		System.out.println("正在初始化一个对象");
	}
	
	TestThis(int a, int b){
		//TestThis();//这样无法调用构造方法、
		this();//调用无参的构造方法并且必须位于第一行
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c){
//		this.a = a;
//		this.b = b;
		this(a, b);//调用带参数的构造器，且必须放在构造方法的第一步
		//this不能用于static方法中
		this.c = c;
	}
	
	void sing(){
		
	}
	
	void eat(){
		this.sing();
		System.out.println("test wttree");
	}
	
	public static void main(String[] args) {
		TestThis hi = new TestThis(2, 3);
		hi.eat();
		//this不能在此处使用，因为没有对象
	}
}

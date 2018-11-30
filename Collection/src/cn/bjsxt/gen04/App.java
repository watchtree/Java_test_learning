package cn.bjsxt.gen04;
/**
 * 泛型没有多态
 * @author tree
 *
 */
public class App {
	public static void main(String[] args) {
//		A<Ftuit> f = new A<Apple>();
		A<Ftuit> f = new A<Ftuit>();
//		test(new A<Apple>);
		
	}
	//形参 使用多态
	public static void test(A<Ftuit> f){
		
	}
	//返回类型使用多态
	public static A<Ftuit> test2(){
//		return (A<Ftuit>)(new A<Apple>());
		return null;
	}
}

package cn.bjsxt.gen02;
/**
 * 泛型方法<>
 * @author tree
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		test("a");
	}
	//泛型方法
	public static <T> void test(T a){
		System.out.println(a);
	}
}

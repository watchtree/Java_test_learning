package cn.bjsxt.gen02;
/**
 * ���ͷ���<>
 * @author tree
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		test("a");
	}
	//���ͷ���
	public static <T> void test(T a){
		System.out.println(a);
	}
}

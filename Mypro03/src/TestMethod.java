import java.util.function.IntConsumer;

/**
 * 		
 * @author tree
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法 ,新建一个TestMethod的对象进行调用
		TestMethod tm = new TestMethod();
		tm.printSxt();
		tm.printSxt();
		int c = tm.add(10, 30, 40)+100;
		System.out.println(c);
	}
	void printSxt(){
		System.out.println("Wtt");
		System.out.println("tree");
	}
	
	int add(int a, int b, int c){
		int sum = a+b+c;
		System.out.println(sum);
		return sum;//返回值void必须与返回值类型一致int
		
	}
}

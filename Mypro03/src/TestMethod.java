import java.util.function.IntConsumer;

/**
 * 		
 * @author tree
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//ͨ�����������ͨ���� ,�½�һ��TestMethod�Ķ�����е���
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
		return sum;//����ֵvoid�����뷵��ֵ����һ��int
		
	}
}
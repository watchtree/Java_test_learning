/**
 * 
 * @author tree
 *
 */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 23, 3));
		System.out.println(add(3.2, 1));
		System.out.println(add(1, 3.3));
	}
	
	public static int add(int n1, int n2){
		int sum = n1+n2;
		return sum;
	}
	//参数数量不同重载
	public static int add(int n1, int n2, int n3){
		int sum = n1+n2+n3;
		return sum;
	}
	//参数类型不同重载
	public static double add(double n1, int n2){
		double sum = n1+n2;
		return sum;
	}
	//参数顺序不同重载
	public static double add(int n1, double n2){
		double sum = n1+n2;
		return sum;
	}
	//int add(int n2, int n1)不构成重载，因为只有参数名称不同
	//double add(int n1, int n2)不构成重载，只有返回值类型不同
}

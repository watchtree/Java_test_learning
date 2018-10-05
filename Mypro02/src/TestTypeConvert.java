/**
 * 
 * @author tree
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
/*
		int a = 324;
		long b = a;
		double d = b;
//		a = b;
//		long e = 3.23;
		float f = 234324L;
		
		//特例
		byte b2 = 123;
*/		
		//强制类型转化
		double x = 3.14;
		int nx = (int)x;
		char c = 'a';
		int d = c+1;
		System.out.println(nx);
		System.out.println(d);
		System.out.println((char)d);
	}
}

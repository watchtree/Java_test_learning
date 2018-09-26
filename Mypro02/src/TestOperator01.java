/**
 * 
 * @author tree
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
/*
 		byte a = 1;

		int b = 2;
		long b2 = 3;
		//byte c = a+b;
		//int c2 = b2+b;
		float f1 = 3.14F;
		double d = b+b2;
		//表述范围较大可以自动转换
*/		
		//float d2 = f1+6.2;
		
		System.out.println(-9%5);
		
		//测试自增和自减
		int a = 3;
		int b = a++; //a先赋值给b再进行b自增+1=4
		System.out.println("a=" + a + "\nb=" +b);
		a = 3;
		b = ++a;//先a自增加在赋值给b
		System.out.println("a=" + a + "\nc=" +b);
	}
	
}

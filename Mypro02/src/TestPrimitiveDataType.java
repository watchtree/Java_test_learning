
public class TestPrimitiveDataType {
	public static void main(String[] args){
		//测试整形变量
		int a = 15;
		int b = 015; //八进制
		int c = 0x15; // 十六进制
		int d = 0b1101; //二进制
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte age = 30;
		short salary = 30000;
		int population = 300000000; //整型常量默认是int类型
		long globalPopution = 7400000000L; //后面加L就是这个long类型的常量
		
		
	}
}

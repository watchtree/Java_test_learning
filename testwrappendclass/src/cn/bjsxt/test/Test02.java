package cn.bjsxt.test;
/**
 * 测试自动转向和拆箱
 * @author tree
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;//jdk5.0之后，在编译时进行判定自动装箱Integer a = new Integer(1000)
		Integer b = 2000;
		
		int c = new Integer(1500);//编译器改进：new Integer(1500).intValue()
		int d = b;//编译器改进b.intValue();
		System.out.println(d);
		
		Integer f = 1234;
		Integer f2 = 1234;
		System.out.println(f==f2);
		System.out.println(f.equals(f2));
		
		System.out.println("#############");
		Integer f3 = -129; //[-129,127]之间的数，仍然当作基本数据类型处理
		Integer f4 = -129;
		System.out.println(f3==f4);
		System.out.println(f3.equals(f4));
		
	}
}

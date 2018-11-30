package cn.bjsxt.gen04;
/**
 * ？的使用，通配符
 * 声明类型或者声明方法上，不能声明类或使用时
 * ? extend<= 上限
 * ？super 》= 下限，指定类型为自身或者父类
 * @author tree
 *
 */
public class Student<T> {
	T score;
	public static void main(String[] args) {
		Student<?> stu = new Student<String>();//声明时类型不定，使用时设定类型
		test(new Student<Integer>());
		
		test2(new Student<Apple>());
//		test3(new Student<Apple>());//泛型没有多态
//		test4(new Student<Apple>());
		test4(new Student<Object>());
		test4(new Student<Ftuit>());
//		Student<?> stu = null;
		stu = new Student<Ftuit>();
//		test4(stu);
		
	}
	public static void test(Student<?> stu){
		
	}
	public static void test2(Student<? extends Ftuit> stu){
		
	}
	public static void test3(Student<Ftuit> stu){
		
	}
	public static void test4(Student<? super Ftuit> stu){
		
	}
}

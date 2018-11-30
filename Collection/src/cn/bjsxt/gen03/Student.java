package cn.bjsxt.gen03;

/**
 * 泛型的擦书
 * 继承实现声明不指定类的新
 * 使用时不指定类型,
 * 统一object对待，问题在于object警告
 * 使用object不完全等同于object
 * T Type表示类型
 * K V分别表示键值中的key和value
 * E代表Element
 * 字母泛型声明不能使用静态属性/静态方法
 * @author tree
 *
 * @param <T>
 */

public class Student<T> {
	private T javaScore;
	private T oracleScore;
	
//	private static T1 test;
	public T getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(T javaScore) {
		this.javaScore = javaScore;
	}
	public T getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(T oracleScore) {
		this.oracleScore = oracleScore;
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student();
//		stu.javaScore //object类型
//		stu.setJavaScore(javaScore);//以object对待
		Student<Object> stu2 = new Student<Object>();
		test(stu1);//stu1相当于object但是不完全等同于object
		//擦除，不会类型检查
		test(stu2);
		test1(stu1);
		test1(stu2);
	}
	
	public static void test(Student<Integer > a){
		
	}
	public static void test1(Student<?> a){
		
	}
}

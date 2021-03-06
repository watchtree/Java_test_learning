package cn.bjsxt.gen02;

/**
 * 泛型
 * T Type表示类型
 * K V分别表示键值中的key和value
 * E代表Element
 * 字母泛型声明不能使用静态属性/静态方法
 * @author tree
 *
 * @param <T>
 */

public class Student<T1, T2> {
	private T1 javaScore;
	private T2 oracleScore;
	
//	private static T1 test;
	public T1 getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}
	public T2 getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}
	
	public static void main(String[] args) {
		//使用时指定类型（引用类型）
		Student<String, Integer> stu = new Student<String, Integer>();
		//安全性：类型自动检测
		stu.setJavaScore("优秀");
		//省心：类型转化
		int it = stu.getOracleScore();//自动拆箱
	}
	
}

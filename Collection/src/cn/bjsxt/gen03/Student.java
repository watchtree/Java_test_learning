package cn.bjsxt.gen03;

/**
 * ���͵Ĳ���
 * �̳�ʵ��������ָ�������
 * ʹ��ʱ��ָ������,
 * ͳһobject�Դ�����������object����
 * ʹ��object����ȫ��ͬ��object
 * T Type��ʾ����
 * K V�ֱ��ʾ��ֵ�е�key��value
 * E����Element
 * ��ĸ������������ʹ�þ�̬����/��̬����
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
//		stu.javaScore //object����
//		stu.setJavaScore(javaScore);//��object�Դ�
		Student<Object> stu2 = new Student<Object>();
		test(stu1);//stu1�൱��object���ǲ���ȫ��ͬ��object
		//�������������ͼ��
		test(stu2);
		test1(stu1);
		test1(stu2);
	}
	
	public static void test(Student<Integer > a){
		
	}
	public static void test1(Student<?> a){
		
	}
}

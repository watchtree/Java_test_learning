package cn.bjsxt.gen04;
/**
 * ����ʹ�ã�ͨ���
 * �������ͻ������������ϣ������������ʹ��ʱ
 * ? extend<= ����
 * ��super ��= ���ޣ�ָ������Ϊ������߸���
 * @author tree
 *
 */
public class Student<T> {
	T score;
	public static void main(String[] args) {
		Student<?> stu = new Student<String>();//����ʱ���Ͳ�����ʹ��ʱ�趨����
		test(new Student<Integer>());
		
		test2(new Student<Apple>());
//		test3(new Student<Apple>());//����û�ж�̬
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

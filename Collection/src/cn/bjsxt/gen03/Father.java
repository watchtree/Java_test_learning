package cn.bjsxt.gen03;
/**
 * ����Ϊ������
 * ����
 * ����
 * 
 * Ҫ��ͬʱ������Ҫô������ڸ��������
 * ����������������෺��
 * 1/�������� 
 * �������游�ඨ
 * �����������ඨ 
 * 2/������д�游�����
 * @author tree
 *
 * @param <T>
 */
public abstract class Father<T, T1> {
	T name;
	public abstract void test(T t);
}
/**
 * ��������ʱָ����������
 * ��������Ϊ��������
 * ����ͬ��
 * @author tree
 *
 */
class Child extends Father<String, Integer>{
	String t2;
	public void test(String t){
		this.name = "wtt";
		
	}
}
/**
 * ����Ϊ������,������ʹ��ʱȷ��
 * @author tree
 *
 */
class Child2<T, T1> extends Father<T, T1>{
	T1 t2;
	public void test1(T1 t){
		
	}
	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}
//����̳и���
class Child3<T, T1> extends Father<T, T1>{
	T1 t2;

	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}


//����Ϊ�����࣬���಻ָ������,���͵Ĳ�����ʹ��object�滻
class Child4<T1, T2> extends Father{
	T2 name2;
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		this.name = "12";
		this.name2 = (T2) "2131";
	}
	
}

//�����븸��ͬʱ����
class Child5 extends Father{
	String name2;//�Լ��趨����
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		this.name =" 12";//object����
	}
	
}
//
////�����������������ʹ�÷���
//class Child6 extends Father<T, T1>{
//	
//}


//Ҫ��ͬʱ����Ҫ���������
 
package cn.bjsxt.gen04;

import java.util.ArrayList;

/**
 * û�з�������
 * ��������ʹ�õ��Ǵ���ʧ��
 * @author tree
 *
 */
public class Array {
	
	
	public static void main(String[] args) {
		Integer[] arr = new Integer[4];
//		Student<String> arr2 = new Student<String>[10];//���ܴ�����������
		Student<?>[] arr2 = new Student[10];
		
		MyArrayList<String> strList = new MyArrayList<String>();
		strList.add(0, "a");
		String elem = strList.getElem(0);
		System.out.println(elem);
//		ArrayList<E>
	}
}
//�ӵ����������ǿ������ת��
class MyArrayList<E>{
//	E[] cap = new E[10];//û�з�������
	Object[] cap = new Object[10];
	
	public void add(int idx, E e){
		cap[idx]= e; 
	}
	
	
	@SuppressWarnings("unchecked")
	public E[] getALL(){
		return (E[]) cap;
	}
	@SuppressWarnings("unchecked")
	public E getElem(int idx){
		return (E) cap[idx];
	}
}
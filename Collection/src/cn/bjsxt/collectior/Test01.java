package cn.bjsxt.collectior;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		//ArrayList �ײ�ʵ�������飬�̲߳���ȫ��Ч�ʸߡ���ѯ�죬�޸Ĳ���ɾ����
		//LinkedList �ײ�ʵ�������������̲߳���ȫ��Ч�ʸߡ���ѯ�����޸Ĳ���ɾ����
		//Vector �̰߳�ȫ��Ч�ʵ�
		list.add("aaa");
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);//��װ��ģ��Զ�װ��
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		
		list.remove(1);//hashcode ��equals
//		System.out.println(list.size());
//		
		ArrayList list2 = new ArrayList();
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		String str = (String)list.get(0);
		System.out.println(str);
		
		list.set(1, "asdsa");
	}
}
class Dog{
	int di;
}
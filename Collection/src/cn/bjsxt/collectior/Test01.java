package cn.bjsxt.collectior;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		//ArrayList 底层实现是数组，线程不安全，效率高。查询快，修改插入删除慢
		//LinkedList 底层实现是链表，所以线程不安全，效率高、查询慢，修改插入删除块
		//Vector 线程安全、效率低
		list.add("aaa");
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);//包装类的，自动装箱
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		
		list.remove(1);//hashcode 和equals
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
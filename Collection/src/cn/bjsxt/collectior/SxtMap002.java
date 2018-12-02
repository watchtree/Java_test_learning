package cn.bjsxt.collectior;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *�Զ���map�����棬��߲�ѯ��Ч��
 * @author tree
 *
 */

/*
 * map�ײ�ʵ��
 */
public class SxtMap002 {
	LinkedList[] arr = new LinkedList[999];//�趨һ������+������Ϊ�洢�ռ�
	int size;
	
	public void put(Object key, Object value){
		SxtEntry e = new SxtEntry(key, value);
//		System.out.println(key.hashCode());//����һ�������Ӧһ��hashcode 
		int hash= key.hashCode();
		hash = hash<0?-hash:hash;//���׺����ж�
		int a = hash%arr.length;
		//hashCode()�ܹ����ٶ�λ�洢��λ��
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a]= list;  
			list.add(e);
		}else{
			LinkedList list = arr[a];
			//�ٽ��б���������ж�
			for(int i=0;i<list.size();i++){
				SxtEntry e2 = (SxtEntry) list.get(i);
				if(e2.key.equals(key)){
					e2.value = value;//��ֵ�ظ�ֱ�Ӹ���
					return;
				}
			}
			arr[a].add(e);
		}
	}
	
	public Object get(Object key){
		int a = key.hashCode()%arr.length;
		if(arr[a]!=null){
			LinkedList list = arr[a];
			for(int i=0;i<list.size();i++){
				SxtEntry e = (SxtEntry) list.get(i);
				if(e.key.equals(key)){
					return e.value;
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		SxtMap002 map = new SxtMap002();//hashMap��hashtable
		map.put("123", new Wife("zqc"));
		map.put("123", new Wife("hzy"));
		Wife w = (Wife) map.get("123");
		System.out.println(w.name);
		
		SxtMap002 map1 = new SxtMap002();//hashMap��hashtable
		map.put("123", new Wife("zqc"));
		SxtMap002 map2 = new SxtMap002();//hashMap��hashtable
		map.put("123", new Wife("zqc"));
		System.out.println(map1.hashCode());
		System.out.println(map2.hashCode());//������ͬ�����hash����һ�µ�
		
		Object a = "123";
		Object b = "123";
		System.out.println(a.hashCode());//Ĭ�ϵ��ñ��ط��������ڴ��ַ��� 
		System.out.println(b.hashCode());//������ͬ�����hash����һ�µ�
		//����������ͬ�Ķ���Ӧ�þ�����ͬ��hashcode
	}
}
package cn.bjsxt.collectior;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *自定义map升级版，提高查询的效率
 * @author tree
 *
 */

/*
 * map底层实现
 */
public class SxtMap002 {
	LinkedList[] arr = new LinkedList[999];//设定一个数组+链表作为存储空间
	int size;
	
	public void put(Object key, Object value){
		SxtEntry e = new SxtEntry(key, value);
//		System.out.println(key.hashCode());//任意一个对象对应一个hashcode 
		int hash= key.hashCode();
		hash = hash<0?-hash:hash;//简易函数判定
		int a = hash%arr.length;
		//hashCode()能够快速定位存储的位置
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a]= list;  
			list.add(e);
		}else{
			LinkedList list = arr[a];
			//再进行遍历的相等判定
			for(int i=0;i<list.size();i++){
				SxtEntry e2 = (SxtEntry) list.get(i);
				if(e2.key.equals(key)){
					e2.value = value;//键值重复直接覆盖
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
		SxtMap002 map = new SxtMap002();//hashMap和hashtable
		map.put("123", new Wife("zqc"));
		map.put("123", new Wife("hzy"));
		Wife w = (Wife) map.get("123");
		System.out.println(w.name);
		
		SxtMap002 map1 = new SxtMap002();//hashMap和hashtable
		map.put("123", new Wife("zqc"));
		SxtMap002 map2 = new SxtMap002();//hashMap和hashtable
		map.put("123", new Wife("zqc"));
		System.out.println(map1.hashCode());
		System.out.println(map2.hashCode());//对于相同对象的hash码是一致的
		
		Object a = "123";
		Object b = "123";
		System.out.println(a.hashCode());//默认调用本地方法，和内存地址相关 
		System.out.println(b.hashCode());//对于相同对象的hash码是一致的
		//两个内容相同的对象应该具有相同的hashcode
	}
}

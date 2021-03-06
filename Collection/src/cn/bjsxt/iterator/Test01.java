package cn.bjsxt.iterator;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
		}
		
		for(Iterator iter3 = list.iterator();iter3.hasNext();){//.hasNext(判断元素有没有被遍历
			String str = (String) iter3.next();
			//返回游标当前位置的元素并将游标移动到下一个位置
//			System.out.println(str);
			iter3.remove();
//			iter3.remove();//删除完之后游标会到-1，无法再次删除
		}
		System.out.println(list.size());
		
		
		Set set = new HashSet();
		set.add("wtt1");
		set.add("wtt2");
		set.add("wtt3");
		
		//迭代器
		Iterator iter = set.iterator();
		while(iter.hasNext()){//有没有下一个元素
			String str = (String) iter.next();
//			System.out.println(str);
		}
		//for循环
		for(Iterator iter2 = set.iterator();iter2.hasNext();){//.hasNext(判断元素有没有被遍历
			String str = (String) iter2.next();
			//返回游标当前位置的元素并将游标移动到下一个位置
//			System.out.println(str);
		}
		//void remove();删除游标左面的元素，在执行完next之后，该操作只能执行一次
		
		//map遍历
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(100, "aa");
		map1.put(200, "bb");
		map1.put(300, "cc");
		
		Set<java.util.Map.Entry<Integer, String>> ss = map1.entrySet();
		for(Iterator iter4=ss.iterator();iter4.hasNext();){
			java.util.Map.Entry<Integer, String> temp = (java.util.Map.Entry<Integer, String>) iter4.next();
//			System.out.println(temp.getKey()+temp.getValue());
			
			
		}
		Set<Integer> ss1 = map1.keySet();
		for(Iterator<Integer> iterator2 = ss1.iterator();iterator2.hasNext();){
			Integer key = iterator2.next();
			System.out.println(key+map1.get(key));
		}
		
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("A", "高淇");
//        map.put("B", "高小七");
//        Set<String> ss2 = map.keySet();
//        for (Iterator<String> iterator = ss2.iterator(); iterator.hasNext();) {
//            String key = iterator.next();
//            System.out.println(key + "--" + map.get(key));
//        }
	}
}

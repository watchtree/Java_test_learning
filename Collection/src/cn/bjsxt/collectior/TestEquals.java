package cn.bjsxt.collectior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestEquals {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		String s1 = new String("aaa");
//		String s2 = new String("aaa");
//		list.add(s1);
//		list.add(s2);
//		System.out.println(list.size());
//		
//		
//		Map map = new HashMap();
//		//键不能重复
//		map.put(s1, "AAAA");
//		map.put(s2, "sadf");
//		System.out.println(map.get("aaa"));
		List list = new ArrayList();
		Integer s1 = new Integer(243);
		Integer s2 = new Integer(243);
		list.add(s1);
		list.add(s2);
		System.out.println(list.size());
		
		
		Map map = new HashMap();
		//键不能重复,依赖于equal ，如果重复，则map中会重置
		map.put(s1, "AAAA");
		map.put(s2, "sadf");
		System.out.println(map.get(243));

		
	}
}

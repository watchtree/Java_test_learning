package cn.bjsxt.collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("id", 0301);
		map.put("name", "wtt1");
		map.put("salary", 3050);
		map.put("hireDate", "2004-10");
		
		Map map2 = new HashMap();
		map2.put("id", 0301);
		map2.put("name", "wtt2");
		map2.put("salary", 3050);
		map2 .put("hireDate", "2004-10");
		
		Map map3 = new HashMap();
		map3.put("id", 0301);
		map3.put("name", "wtt3");
		map3.put("salary", 3050);
		map3 .put("hireDate", "2004-10");
		
		List<Map> list = new ArrayList<Map>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		printEmpName(list);
	}
	
	public static void printEmpName(List<Map> list){
		for(int i=0;i<list.size();i++){
			Map tempMap = list.get(i);
			System.out.println(tempMap.get("name"));
		}
		
	
	}
}

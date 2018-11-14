package cn.bjsxt.collectior;

import java.util.HashMap;
import java.util.Map;

/**\
 *测试map基本用法
 * @author tree
 *
 */
public class testMap {
	public static void main(String[] args) {
		Map map = new HashMap();//hashMap和hashtable
		map.put("123", new Wife("zqc"));
		map.put("234", new Wife("hzy"));
		
		Wife w = (Wife) map.get("123");
		System.out.println(w.name);
		
		map.remove("123");
		
		map.containsKey("123");//检验key是否存在
		Wife w2 = (Wife) map.get("123");
//		System.out.println(w2.name);//删除之后无法取出
	}
}
class Wife{
	String name;
	public Wife(String name){
		this.name = name;
	}
}
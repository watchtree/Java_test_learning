package cn.bjsxt.collectior;

import java.util.HashMap;
import java.util.Map;

/**\
 *����map�����÷�
 * @author tree
 *
 */
public class testMap {
	public static void main(String[] args) {
		Map map = new HashMap();//hashMap��hashtable
		map.put("123", new Wife("zqc"));
		map.put("234", new Wife("hzy"));
		
		Wife w = (Wife) map.get("123");
		System.out.println(w.name);
		
		map.remove("123");
		
		map.containsKey("123");//����key�Ƿ����
		Wife w2 = (Wife) map.get("123");
//		System.out.println(w2.name);//ɾ��֮���޷�ȡ��
	}
}
class Wife{
	String name;
	public Wife(String name){
		this.name = name;
	}
}
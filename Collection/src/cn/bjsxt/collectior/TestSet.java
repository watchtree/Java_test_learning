package cn.bjsxt.collectior;

import java.util.HashSet;
import java.util.Set;

/**
 * ����set�����ظ���˳�򣩵ĳ��÷���
 * @author tree
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));//����ĻḲ��ǰ��ģ�
		System.out.println(set.size());
		System.out.println(set.contains("aaa"));
		set.remove("aaa");
	}
} 

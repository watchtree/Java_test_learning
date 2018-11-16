package cn.bjsxt.collectior;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试set（可重复无顺序）的常用方法
 * @author tree
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));//后面的会覆盖前面的，
		System.out.println(set.size());
		System.out.println(set.contains("aaa"));
		set.remove("aaa");
	}
} 

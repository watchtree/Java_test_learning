package cn.sort.innerType;
/**
 * 使用collections对容器的比较
 * public static <T> void sort (List<T> list, Compatator<? super T> c)
 * public static <T extends Compatable<? super T>> void sort(List<T> list)
 */
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Demo05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Collections.sort(list, new StringComp());
		System.out.println(list);
		
		list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Collections.sort(list);
		System.out.println(list);
		
		
	}
}

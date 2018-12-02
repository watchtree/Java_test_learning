package cn.sort.innerType;

import java.util.ArrayList;
import javax.tools.JavaCompiler;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import cn.sort.innerType.StringComp;

public class Demo04 {

	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis()-1000*60*60);
		arr[2] = new Date(System.currentTimeMillis()+1000*60*60);
//		Utils.sort(arr);
		
		String[] arr2 = {"a", "abcd", "abc", "def"};
		Utils.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Utils.sort(list);
		System.out.println(list);
		
		System.out.println("=========ʹ��comparator���������");
		arr2 = new String[]{"a", "abcd", "abc", "def"};
		Utils.sort(arr2, new StringComp());
		System.out.println(arr2);
		
		System.out.println("=========ʹ��list�Ƚ������������");
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("abcd");
		list2.add("abc");
		list2.add("def");
		Utils.sort(list2, new StringComp());
		System.out.println(list2);
	}


}
package cn.bjsxt.array2;

import java.util.Arrays;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class TestArray {
	public static void main(String[] args) {
		int[] a = {1,2,323,23,543,12,59};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));//��ӡ����
		
		
		for(int i:a){
			System.out.println(i);
		}
	}
}
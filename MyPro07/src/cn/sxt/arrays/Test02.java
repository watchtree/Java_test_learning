package cn.sxt.arrays;

public class Test02 {
	public static void main(String[] args) {
		
		//静态初始化
		int[] a = {2,3,4,5};
		User[] b = {new User(1001, "wtt"), 
					new User(1002, "wtt1"), 
					new User(1003, "wtt3")};
		
		//默认初始化
//		int[] b = new int[3];//默认给数组元素进行赋值，赋值的规则和成员变量默认赋值规则一致
		
		//动态初始化， 直接通过下标进行赋值
		int[] c = new int[2];
		c[0] = 1;
		c[1] = 2;
	}
}

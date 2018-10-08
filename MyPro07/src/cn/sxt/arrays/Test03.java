package cn.sxt.arrays;

public class Test03 {
	public static void main(String[] args) {
		int[] a = new int[4];
		for(int i=0;i<a.length;i++){
			a[i]= 100*i;	
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("################");
		
		//foreach循环用于读取数组元素的值，不能修改
		for(int m:a){//循环变量数组将每个元素取出之后放入m当中
			System.out.println(m);
		}
		
		String[] ss = {"aa", "bbb", "ccc", "ddd"};
		for(String temp:ss){
			System.out.println(temp);
		}
	}
}
